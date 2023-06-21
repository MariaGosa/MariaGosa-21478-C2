package com.example.service;

import com.example.game.Game;
import com.example.model.Player;
/* Klasa obsługująca grę i jej logikę.*/
public class GameService {
    private Game game;
    /* Rozpoczyna nową grę miedzy dwoma graczami. */
    public void startNewGame(String name1, String name2) {
        game = new Game(name1, name2);
    }
    /* Przeprowadza kolejną rundę gry. */
    public void playNextRound() {
        game.playRound();
    }
    /* Zwraca pierwszego gracza. */
    public Player getPlayer1() {
        return game.getPlayer1();
    }
    /* Zwraca drugiego gracza. */
    public Player getPlayer2() {
        return game.getPlayer2();
    }
    /* Zwraca numer aktualnej rundy. */
    public int getCurrentRound() {
        return game.getRound();
    }
}
