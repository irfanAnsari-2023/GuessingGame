package com.guessingGame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 100;
	private static final int MAX_TRIES = 5;
	private static final int SCORE_THRESHOLD = 3;
	private static final int SCORE_INCREMENT = 10;
	
	private int secretNumber;
	private int numTries;
	private int score;
	private boolean gameOver;
	private ArrayList<Integer> guesses;
	private Scanner scanner;
	
	public GuessingGame() {
		this.secretNumber = generateRandomNumber();
		this.numTries = 0;
		this.score = 0;
		this.gameOver = false;
		this.guesses = new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}
	
	public void play() {
		System.out.println("Welcome to the Guessing Game!");
		System.out.println("You have " + MAX_TRIES + " tries to guess a number between "
				+ MIN_NUMBER + " and " + MAX_NUMBER + " .");
		System.out.println("For each correctguess, you'll earn " +
				SCORE_INCREMENT + " points.");
		System.out.println("If you earn at least " + SCORE_THRESHOLD + " points, you win the game.");
		System.out.println("Let's get started!\n ");
		
		
		while(!gameOver) {
			System.out.println("Guess # " + (numTries + 1) + " : ");
			try {
				int guess = scanner.nextInt();
				checkGuess(guess);
			}
			catch(InputMismatchException e ) {
				System.out.println("Invalid input. Please enter an integer.");
				scanner.nextLine();
			}
		}
		System.out.println("\n Game over! Your score is " + score + ".");
		if(score>= SCORE_THRESHOLD * SCORE_INCREMENT) {
			System.out.println("Congratulations, you win!");
		}
		else {
			System.out.println("Sorry, you lose. The secret number was " + 
		secretNumber + ".");
		}
		scanner.close();
	}
	

	private void checkGuess(int guess) {
		numTries++;
		guesses.add(guess);
		
		if(guess == secretNumber) {
			score += SCORE_INCREMENT;
			System.out.println("Congratulations, you guessed the secret number!");
			gameOver = true;
			
		}
		else if(numTries == MAX_TRIES) {
			System.out.println("Sorry, you've run out of tries. The secret number was "
					+ secretNumber + ".");
			gameOver = true;
			
		}
		else {
			String hint = guess < secretNumber ? " higher " : " lower ";
			System.out.println("Incorrect guess. Try guessing " + hint + ".");
			
		}
		System.out.println("Guesses so far: " + guesses);
		System.out.println("Score: " + score + "\n");
		
	}

	private int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
	}

	public static void main(String[] args) {
		GuessingGame game = new GuessingGame();
		game.play();
	}

}



