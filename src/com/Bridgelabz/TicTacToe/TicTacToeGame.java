package com.Bridgelabz.TicTacToe;


import java.util.Scanner;

public class TicTacToeGame {

    public static char[] board = new char[10];
    public static Scanner sc1 = new Scanner(System.in);
    static char computerChoice;


    public static void main(String[] args) {
        createBoard();
        showBoard();
        characterChoice();
    }
    public static void createBoard(){
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
    public static void showBoard(){
        System.out.println("Displaying board for the Game.\n");
        System.out.println(board[1]+"  | "+board[2]+"| "+board[3]);
        System.out.println("---+--+---");
        System.out.println(board[4]+"  | "+board[5]+"| "+board[6]);
        System.out.println("---+--+---");
        System.out.println(board[7]+"  | "+board[8]+"| "+board[9]);
    }
    public static void characterChoice() {
        System.out.println("\nSelect Any Character X or O ");
        char playerChoice = sc1.next().toUpperCase().charAt(0);
        if (playerChoice == 'X') {
            computerChoice = 'O';
            System.out.println("Player chose X so the computer choice is O");
        } else if ( playerChoice == 'O') {
            computerChoice = 'X';
            System.out.println("Player chose O so the computer choice is X");
        }
    }
}


