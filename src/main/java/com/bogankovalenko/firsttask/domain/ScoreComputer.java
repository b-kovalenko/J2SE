package com.bogankovalenko.firsttask.domain;

public class ScoreComputer {
    private int score;

    public ScoreComputer(){
        this.score = 0;
    }

    public int getScore() {
        return score;
    }
    public void incrementScore(){
        this.score++;
    }
}
