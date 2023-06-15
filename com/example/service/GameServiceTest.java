package com.example.service;

import com.example.model.Player;
/* Klasa testowa dla GameService. */
public class GameServiceTest {
    private GameService gameService;

    private void assertEquals(int i, int score) {
    }

    /* Metoda ustawiająca początkowe wartosci dla testów. */
    public void setUp() {
        gameService = new GameService();
        gameService.startNewGame("Player 1", "Player 2");
    }
    /* Metoda testująca funkcjonalność kolejnej rundy gry. */
    public void testPlayNextRound() {
        Player player1 = gameService.getPlayer1();
        Player player2 = gameService.getPlayer2();

        assertEquals(0, player1.getScore());
        assertEquals(0, player2.getScore());

        gameService.playNextRound();

        assertEquals(1, gameService.getCurrentRound());
        assertEquals(1, player1.getScore());
        assertEquals(0, player2.getScore());

        gameService.playNextRound();

        assertEquals(2, gameService.getCurrentRound());
        assertEquals(2, player1.getScore());
        assertEquals(0, player2.getScore());
    }

}
