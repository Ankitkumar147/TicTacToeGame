package com.Bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {

    public static char[] board = new char[10];
    public static Scanner sc1 = new Scanner(System.in);
    static char computerChoice;
    static char playerChoice;

    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToe Game.");
        createBoard();
        characterChoice();
        tossResult();
        showBoard();
        movePosition();
    }

    public static void createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void characterChoice() {
        System.out.println("\nSelect Any Character X or O ");
        char playerChoice = sc1.next().toUpperCase().charAt(0);
        if (playerChoice == 'X') {
            computerChoice = 'O';
            playerChoice = 'X';
            System.out.println("\nPlayer chose X so the computer choice is O");
        } else if (playerChoice == 'O') {
            computerChoice = 'X';
            playerChoice = 'O';
            System.out.println("\nPlayer chose O so the computer choice is X");
        } else {
            System.out.println("\nChoose Valid Character either X or O");
        }
    }

    public static void showBoard() {
        System.out.println("Displaying board for the Game.\n");
        System.out.println(board[1] + " | " + board[2] + "| " + board[3]);
        System.out.println("--+--+--");
        System.out.println(board[4] + " | " + board[5] + "| " + board[6]);
        System.out.println("--+--+--");
        System.out.println(board[7] + " | " + board[8] + "| " + board[9]);
    }

    public static void movePosition() {
        System.out.println("Enter the position you want to move");
        int userPosition = sc1.nextInt();
        if (userPosition < 10 && userPosition > 0) {
            if (board[userPosition] == ' ') {
                board[userPosition] = playerChoice;
            } else {
                System.out.println("Invalid Choice. Choose between 1 & 9");
            }
        }
        showBoard();
    }
    public static void tossResult(){
        double tossResult = Math.floor(Math.random()*10%2);
        System.out.println("\nChoose 1 for Heads and 2 for Tails.");
        int userChoice = sc1.nextInt();
        if (userChoice == tossResult){
            System.out.println("\nPlayer won the toss ! Player Start The Game\n" );
        } else {
            System.out.println("\nComputer won the Toss ! Computer Start The Game.\n");
        }
    }
}

