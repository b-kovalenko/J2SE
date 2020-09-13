package com.bogankovalenko.firsttask.logic;

import com.bogankovalenko.firsttask.domain.*;

import java.util.Scanner;

public class GameLogic {
    public void determine(Field field){
        if (field.getFigureUser().getIndex() == 0 && field.getFigureComputer().getIndex() == 1) {
            System.out.println("You Lose");

        } else if (field.getFigureUser().getIndex() == 0 && field.getFigureComputer().getIndex() == 2) {
            System.out.println("You Win");

        } else if (field.getFigureUser().getIndex() == 0 && field.getFigureComputer().getIndex() == 0) {
            System.out.println("Draw");

        } else if (field.getFigureUser().getIndex() == 1 && field.getFigureComputer().getIndex() == 0) {
            System.out.println("You Win");

        } else if (field.getFigureUser().getIndex() == 1 && field.getFigureComputer().getIndex() == 1) {
            System.out.println("Draw");

        } else if (field.getFigureUser().getIndex() == 1 && field.getFigureComputer().getIndex() == 2) {
            System.out.println("You Lose");

        } else if (field.getFigureUser().getIndex() == 2 && field.getFigureComputer().getIndex() == 0) {
            System.out.println("You Lose");

        } else if (field.getFigureUser().getIndex() == 2 && field.getFigureComputer().getIndex() == 1) {
            System.out.println("You Win");

        } else if (field.getFigureUser().getIndex() == 2 && field.getFigureComputer().getIndex() == 2) {
            System.out.println("Draw");

        }
        System.out.println("\n" + "------------------------------------------------");
    }


    public void startGame() {
        final String PC = "PC";
        final String HUMAN = "HUMAN";

        Scanner scanner = new Scanner(System.in);

        String initialMessage = String.format("Chose a figure: 0 - %s, 1 - %s, 2 - %s%n", Figure.STONE.getName(),Figure.PAPER.getName(),Figure.SCISSORS.getName());

        Figure[] figures = {Figure.STONE, Figure.PAPER, Figure.SCISSORS};


        while(true){

            System.out.println(initialMessage);

            int userNumberInput = scanner.nextInt();


            if(isValid(userNumberInput, figures)) {

                Figure userFigure = determineChose(userNumberInput, HUMAN, figures);

                int computerInput = (int)(Math.random() * figures.length);

                Figure computerFigure = determineChose(computerInput, PC, figures);
                if(userFigure != null && computerFigure != null){
                    determine( new Field(userFigure, computerFigure));
                }
            } else{
                System.out.println("Please enter number from 0 to " + figures.length);
            }
        }

    }

    private Figure determineChose(int input, String who, Figure[] figures){
        for(Figure figure: figures){
            if(figure != null && figure.getIndex() == input){
                System.out.println(who + " chose " + figure.getName());
                return figure;
            }
        }
        return null;
    }



    private boolean isValid(int userNumberInput, Figure[] figures){
        return userNumberInput >= 0 && userNumberInput <= figures.length;
    }
}