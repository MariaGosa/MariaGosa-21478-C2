package com.example.service;

import com.example.game.Game;
import com.example.model.Player;
public class GameService {
    private Game game;

    public void startNewGame(String name1, String name2) {
        game = new Game(name1, name2);
    }

    public void playNextRound() {
        game.playRound();
    }

    public Player getPlayer1() {
        return game.getPlayer1();
    }

    public Player getPlayer2() {
        return game.getPlayer2();
    }

    public int getCurrentRound() {
        return game.getRound();
    }
}
