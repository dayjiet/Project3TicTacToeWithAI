# Tic-Tac-Toe with AI

This Java code implements the Tic-Tac-Toe game with various game modes. It allows you to play against another player or
against the computer. The game has three levels of difficulty for computer players: easy, medium, and hard.

## Features

- Multiple game modes: play against another player or against the computer with different levels of difficulty.
- User input validation: the code checks for valid user inputs, and informs the player if the input is incorrect.
- Game board display: the current state of the game board is displayed after each move, including the X and O moves
  count.
- Win, draw, and continue playing: the code checks the state of the game and returns the result, whether X or O wins,
  the game is a draw, or the game continues.
- Reset game: the code allows you to reset the game to start over after each round.

## Usage

1. To start the game, you need to enter a command in the following format: `start <player1> <player2>`.
    - `<player1>`: either `user` or `easy`, `medium`, or `hard` for computer players.
    - `<player2>`: either `user` or `easy`, `medium`, or `hard` for computer players.
2. The game board is displayed after each move.
3. To exit the game, you can type the exit command.
4. The game will inform you of the result (win, draw, or continue playing) and reset the game after each round.

## Gameplay

1. X starts first, and then O takes their turn.
2. The game continues until one of the players wins or the game is a draw.
3. The game will automatically reset after each round.
4. You can exit the game at any time by typing the `exit` command.