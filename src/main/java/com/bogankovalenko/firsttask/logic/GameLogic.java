package com.bogankovalenko.firsttask.logic;

import com.bogankovalenko.firsttask.domain.*;

import java.util.Scanner;

public class GameLogic {
    public void determine(int userInput, int computerInput){
        if (userInput == 0 && computerInput == 1) {
            System.out.println("You Lose");

        } else if (userInput == 0 && computerInput == 2) {
            System.out.println("You Win");

        } else if (userInput == 0 && computerInput == 0) {
            System.out.println("Draw");

        } else if (userInput == 1 && computerInput == 0) {
            System.out.println("You Win");

        } else if (userInput == 1 && computerInput == 1) {
            System.out.println("Draw");

        } else if (userInput == 1 && computerInput == 2) {
            System.out.println("You Lose");

        } else if (userInput == 2 && computerInput == 0) {
            System.out.println("You Lose");

        } else if (userInput == 2 && computerInput == 1) {
            System.out.println("You Win");

        } else if (userInput == 2 && computerInput == 2) {
            System.out.println("Draw");

        }
        System.out.println("\n" + "------------------------------------------------");
    }

    public void startGame() {

        Scanner scanner = new Scanner(System.in);

        String initialMessage = String.format("Chose a figure: 0 - %s, 1 - %s, 2 - %s%n", Figure.STONE.getName(),Figure.PAPER.getName(),Figure.SCISSORS.getName());

        Field[] fields = initializeFigures();

        while(true){
            System.out.println(initialMessage);

            int userNumberInput = scanner.nextInt();

            if(isValid(userNumberInput, fields)) {

                determineChose(userNumberInput, "User’s", fields);

                int computerInput = (int)(Math.random() * 3);

                determineChose(computerInput, "Computer’s", fields);

                determine(userNumberInput,computerInput);
            } else{
                System.out.println("Please enter number from 0 to " + fields.length);
            }
        }

    }

    private void determineChose(int input, String who, Field[] fields){
        for(Field field: fields){
            if(field != null && field.getFigure().getIndex() == input){
                System.out.println(who + " chose " + field.getFigure().getName());
            }
        }
    }

    private Field[] initializeFigures() {
        return new Field[]{new Field(Figure.STONE), new Field(Figure.PAPER), new Field(Figure.SCISSORS)};
    }

    private boolean isValid(int userNumberInput, Field[] fields){
        return userNumberInput >= 0 && userNumberInput <= fields.length;
    }
}
