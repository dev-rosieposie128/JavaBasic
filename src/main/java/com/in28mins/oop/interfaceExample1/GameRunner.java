package com.in28mins.oop.interfaceExample1;

public class GameRunner {

    public static void main(String[] args){
        //MarioGame marioGame = new MarioGame();
        //ChessGame chessGame = new ChessGame();

        GamingConsole marioGame = new MarioGame();
        GamingConsole chessGame = new ChessGame();

        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
        System.out.println("--------------");
        chessGame.up();
        chessGame.down();
        chessGame.left();
        chessGame.right();
    }
}
