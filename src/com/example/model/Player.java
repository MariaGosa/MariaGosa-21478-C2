package com.example.model;
/* Klasa która reprezentuje gracza. */
public class Player {
    private String name;
    private int score;
    /* Tworzy nowego gracza. */
    public Player(String name){
        this.name = name;
        this.score = 0;
    }
    /* Zwraca nazwę gracza. */
    public String getName(){
        return name;
    }
    /* Zwraca wynik gracza. */
    public int getScore(){
        return score;
    }
    /* Zwiększa wynik gracza o 1. */
    public void increaseScore(){
        score++;
    }
}
