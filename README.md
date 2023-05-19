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

To run the Project3TicTacToeWithAI-1.0-SNAPSHOT.jar file, perform the following steps:

1. Download the JAR file.
2. Open a terminal or command prompt: Navigate to the directory where the JAR file is located.
3. Run the JAR file: Enter the following command to execute the JAR file:
```shell
java -jar Project3TicTacToeWithAI-1.0-SNAPSHOT.jar
```
4. Follow the on-screen instructions: The program will display a menu with different options. Enter the corresponding number to perform the desired action.

## Feedback
During the development of the Tic-Tac-Toe with AI project, I acquired valuable knowledge and skills in planning and implementing a complex program from scratch. This project allowed me to gain proficiency in utilizing classes and methods effectively, handling errors, and processing user input. Furthermore, I was able to grasp the principles of Object-Oriented Programming (OOP) and apply them in practice.

One of the major challenges I encountered was designing and implementing the AI player's logic to provide a challenging and intelligent opponent. Overcoming this obstacle required careful consideration of game strategies and decision-making algorithms. Through iterative testing and refinement, I was able to create an AI player that offered engaging gameplay.

The project also provided me with a deeper understanding of the game mechanics and strategies of Tic-Tac-Toe. I learned to anticipate and handle various scenarios, ensuring a fair and enjoyable gaming experience for both human and AI players.

By completing this project, I not only enhanced my programming abilities but also developed problem-solving skills and the ability to manage and organize a complex software project. This experience has further solidified my understanding of OOP principles and their application in real-world scenarios.

In summary, the Tic-Tac-Toe with AI project was a rewarding learning experience that allowed me to apply my knowledge of classes, methods, error handling, and user input processing. It deepened my understanding of OOP and improved my problem-solving skills, enabling me to develop a well-designed and functional program.

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