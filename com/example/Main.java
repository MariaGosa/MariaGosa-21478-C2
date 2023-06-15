package com.example;

import com.example.service.GameService;
/* Główna klasa. */
public class Main {
    public static void main(String[] args){
        GameService gameService = new GameService();

        gameService.startNewGame("Player1", "Player2");
        gameService.playNextRound();
        /* Wyświetla wyniki na konsoli */
        System.out.println("Round: " + gameService.getCurrentRound());
        System.out.println("Player 1: " + gameService.getPlayer1().getScore());
        System.out.println("Player 2: " + gameService.getPlayer2().getScore());
    }
}
