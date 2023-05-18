# Tic-Tac-Toe with AI (Java)
```html
https://hyperskill.org/projects/81?category=2&track=12
```

## Table of Contents
- [Description](#description)
- [Features](#features)
- [Usage](#usage)
- [Feedback](#feedback)
- [Contributing](#contributing)
- [Dependencies](#dependencies)
- [Contact Information](#contact-information)

## Description
This project is an implementation of the classic game Tic-Tac-Toe, also known as Noughts and crosses or Xs and Os, in Java. The program allows users to play against each other or against a computer opponent with varying difficulty levels.

## Features

- Multiple game modes: play against another player or against the computer with different levels of difficulty.
- User input validation: the code checks for valid user inputs, and informs the player if the input is incorrect.
- Game board display: the current state of the game board is displayed after each move, including the X and O moves
  count.
- Win, draw, and continue playing: the code checks the state of the game and returns the result, whether X or O wins,
  the game is a draw, or the game continues.
- Reset game: the code allows you to reset the game to start over after each round.

## Usage

To start the Tic-Tac-Toe game, run the main method in the TicTacToe class:
```java
public class TicTacToe {
    public static void main(String[] args) {
        PlayGame.playGame();
    }
}
```
The program will prompt you to enter a command. Valid commands are of the format start player1 player2, where player1 and player2 can be "user," "easy," "medium," or "hard." For example, to start a game between a user and a computer opponent with hard difficulty, enter:
```java
Input command: > start user hard
```
The game board will be displayed, and you can take turns by entering the coordinates of the cell you want to mark. Coordinates should be entered as two space-separated numbers between 1 and 3. For example, to mark the cell at row 2, column 3, enter:
```java
Enter the coordinates: > 2 3
```
The game will continue until there is a winner or a draw. You can exit the game at any time by entering "exit" as the command.

## Feedback

1. DisplayBoard: This class provides a method displayBoard() that displays the current state of the game board, including the X and O moves count. The board is represented as a 3x3 array.
2. PlayGame: The playGame() method in this class handles the game options, parses the input command, and starts the game if the input is valid. It determines the game mode (user vs user, user vs computer, or computer vs computer) and initializes the necessary variables. The game mode options include "easy," "medium," and "hard" difficulty levels for the computer opponent.
3. PlayRound: This class contains the playRound() method, which checks the state of the Tic-Tac-Toe game and returns the result (win, draw, or continue playing). It checks for X or O wins in rows, columns, and diagonals. If there is no win or draw, it proceeds to the next move by calling the appropriate method based on the player type.
4. CheckInput: The checkInput() method in this class verifies if a cell is already occupied and takes the appropriate action. If the cell is occupied, it prompts the user to choose another one. It also includes methods to check if a cell is occupied, redo the previous move, make a move, and reset the game.
5. IsXNext: This class provides the isXNext() method, which checks if it is X's turn to play based on the number of X and O moves.
6. PlayUser: This class implements the user's move by accepting input coordinates and validating them. It ensures that the coordinates are within the valid range of 1 to 3 and checks if the input is numeric.
7. PlayHard: The playHard() method in this class implements the computer's move with the hard difficulty level. It uses the minimax algorithm to calculate the best move for the computer player. The algorithm evaluates the current state of the game and assigns scores to different outcomes to determine the optimal move.

## Contributing

Contributions to this project are welcome. If you would like to contribute, please follow these guidelines:
1. Fork the repository and create a new branch for your contribution.
2. Make your changes, ensuring adherence to the project's coding style and guidelines.
3. Write appropriate tests for your changes, if applicable.
4. Commit and push your changes to your forked repository.
5. Submit a pull request, explaining the purpose and details of your contribution.
Please note that all contributions will be reviewed and subject to approval.

## Dependencies
This project has no external dependencies. It is written in Java and utilizes only standard libraries and classes available in the Java Development Kit (JDK).

## Contact Information
For any questions, issues, or feedback regarding this project, please contact the project maintainer:
- Name: ```Daulet Toganbayev```
- Email: ```daulet.toganbayev@gmail.com```