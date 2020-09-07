package com.bogankovalenko.firsttask.domain;

public class ScoreDeterminer {
    public void determine(int userInput, int computerInput, ScoreComputer scoreComputer, ScoreUser scoreUser) {

        if (userInput == 0 && computerInput == 1) {
            System.out.println("You Lose");
            scoreComputer.incrementScore();

        } else if (userInput == 0 && computerInput == 2) {
            System.out.println("You Win");
            scoreUser.incrementScore();

        } else if (userInput == 0 && computerInput == 0) {
            System.out.println("Draw");

        } else if (userInput == 1 && computerInput == 0) {
            System.out.println("You Win");
            scoreUser.incrementScore();

        } else if (userInput == 1 && computerInput == 1) {
            System.out.println("Draw");

        } else if (userInput == 1 && computerInput == 2) {
            System.out.println("You Lose");
            scoreComputer.incrementScore();

        } else if (userInput == 2 && computerInput == 0) {
            System.out.println("You Lose");
            scoreComputer.incrementScore();

        } else if (userInput == 2 && computerInput == 1) {
            System.out.println("You Win");
            scoreUser.incrementScore();

        } else if (userInput == 2 && computerInput == 2) {
            System.out.println("Draw");

        }
        System.out.println("Your score - " + scoreUser.getScore() + " : " + "Comp Score" + scoreComputer.getScore());
        System.out.println("\n" + "------------------------------------------------");
    }
}
