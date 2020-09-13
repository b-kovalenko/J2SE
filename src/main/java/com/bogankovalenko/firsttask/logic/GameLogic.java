package com.bogankovalenko.firsttask.logic;

import com.bogankovalenko.firsttask.domain.*;

import java.util.Scanner;

public class GameLogic {

    public void startGame() {

        Scanner scanner = new Scanner(System.in);

        String initialMessage = String.format("Chose a figure: 0 - %s, 1 - %s, 2 - %s%n", Figure.STONE.getName(),Figure.PAPER.getName(),Figure.SCISSORS.getName());

        Figure[] figures = initializeFigures();


        while(true){

            System.out.println(initialMessage);

            int userNumberInput = scanner.nextInt();


            if(isValid(userNumberInput, figures)) {

                Figure userFigure = determineChose(userNumberInput, "User’s", figures);

                int computerInput = (int)(Math.random() * 3);

                Figure computerFigure = determineChose(computerInput, "Computer’s", figures);
                if(userFigure != null && computerFigure != null){
                    Field field = new Field(userFigure, computerFigure);
                    field.determine();
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


    private Figure[] initializeFigures() {
        return new Figure[]{Figure.STONE, Figure.PAPER, Figure.SCISSORS};
    }

    private boolean isValid(int userNumberInput, Figure[] figures){
        return userNumberInput >= 0 && userNumberInput <= figures.length;
    }
}