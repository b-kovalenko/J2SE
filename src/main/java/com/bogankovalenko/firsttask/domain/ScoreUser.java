package com.bogankovalenko.firsttask.domain;

public class ScoreUser {
    private int score;

    public ScoreUser(){
        this.score = 0;
    }
    public int getScore(){
        return score;
    }
    public void incrementScore(){
        this.score++;
    }
}
