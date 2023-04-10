# GuessingGame
This project is a simple guessing game that you can build using your knowledge of Java, OOPS, and collections. In this game, the computer generates a random number between a specified range, and the player has to guess the number. The player has a limited number of attempts to guess the correct number, and the game provides feedback after each guess.


## Table of Contents

- [Requirements](#requirements)

- [Features](#features)
- [Usage](#usage)
- [Code Explanation](#code-explanation)
- [Future Improvements](#future-improvements)
- [Contributions](#contributions)
- [Credits](#credits)

## Requirements

- Java Development Kit (JDK) 8 or higher.
- An integrated development environment (IDE) such as Eclipse, IntelliJ IDEA, or NetBeans.
- A basic understanding of Java programming concepts such as classes, objects, collections and methods.

## Features

- The computer generates a random number between a specified range.
- The player has a limited number of attempts to guess the correct number.
- The game provides feedback after each guess.
- The game keeps track of the player's score and displays it at the end of each game.
- The game allows the player to play multiple rounds.

## Usage

- Clone the repository to your local machine.
- Open the project in your preferred IDE.
- Run the game by executing the main method in the Game class.
- Follow the on-screen instructions to play the game.

## Code Explanation

- The GuessingGame class is defined with a private int field called randomNumber and a public method play().

- The generateRandomNumber() method generates a random number between 1 and 100 using the Random class and sets the randomNumber field to that value.

- The checkGuess(int guess) method checks if the guess is correct by comparing it to the randomNumber.
- If the guess is correct, it returns true. If the guess is incorrect, it returns false and provides a hint to the user whether the actual number is higher or lower than the guess.

- The play() method is the main method of the game. It prompts the user to enter a guess, checks the guess using the checkGuess() method, and provides appropriate feedback to the user based on whether the guess is correct or not. The game continues until the user guesses the correct number.

- The main() method creates an instance of the GuessingGame class and calls its play() method to start the game.


## Future improvements
- Add a timer to limit the time taken by the player to make a guess.
- Implement a graphical user interface (GUI) to enhance the user experience.
- Add a multiplayer mode where multiple players can play together.

## Contributions

Contributions are welcome! If you find a bug or want to suggest a new feature, please create a new issue or submit a pull request.

## Credits

This Gueessing Game was developed by Irfan Ansari as a programming exercise.
