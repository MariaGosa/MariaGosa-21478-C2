package com.example.game;

import com.example.model.Player;

import java.util.Random;
public class Game {
    private Player player1;
    private Player player2;
    private int round;

    public Game(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        round = 1;
    }

    public void playRound() {
        Random random = new Random();
        int player1Score = random.nextInt(10) + 1; // losowanie liczby od 1 do 10
        int player2Score = random.nextInt(10) + 1;

        if (player1Score > player2Score) {
            player1.increaseScore();
        } else if (player2Score > player1Score) {
            player2.increaseScore();
        }

        round++;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getRound() {
        return round;
    }
}
