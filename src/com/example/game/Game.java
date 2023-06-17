package com.example.game;

import com.example.model.Player;

import java.util.Random;

/* Klasa reprezentująca grę. */
public class Game {
    private Player player1;
    private Player player2;
    private int round;

    /* Tworzy nową grę między dwoma graczami */
    public Game(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        round = 1;
    }
    /* Przeprowadza rundę w grze, generuje losowe wyniki dla graczy */

    public void playRound() {
        Random random = new Random();
        int player1Score = random.nextInt(10) + 1; // losuje liczbe od 1 do 10
        int player2Score = random.nextInt(10) + 1;

        if (player1Score > player2Score) {
            player1.increaseScore();
        } else if (player2Score > player1Score) {
            player2.increaseScore();
        }

        round++;
    }
    /* Zwraca pierwszego gracza */
    public Player getPlayer1() {
        return player1;
    }
    /* Zwraca drugiego gracza */
    public Player getPlayer2() {
        return player2;
    }
    /* Zwraca numer aktualnej rundy */
    public int getRound() {
        return round;
    }
}
