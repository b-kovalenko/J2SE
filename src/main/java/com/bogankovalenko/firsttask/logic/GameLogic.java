package com.bogankovalenko.firsttask.logic;

import com.bogankovalenko.firsttask.domain.*;

import java.util.Scanner;


public class GameLogic {
    public void checkWinner(Field field){
        if(field.getFigureUser().getIndex() == field.getFigureComputer().getIndex()){
            System.out.println("Its a tie");
        }
        else if (field.getFigureUser().getIndex() == 0 && field.getFigureComputer().getIndex() == 1) {
            System.out.println("You Lose");

        } else if (field.getFigureUser().getIndex() == 0 && field.getFigureComputer().getIndex() == 2) {
            System.out.println("You Win");

        } else if (field.getFigureUser().getIndex() == 1 && field.getFigureComputer().getIndex() == 0) {
            System.out.println("You Win");

        }  else if (field.getFigureUser().getIndex() == 1 && field.getFigureComputer().getIndex() == 2) {
            System.out.println("You Lose");

        } else if (field.getFigureUser().getIndex() == 2 && field.getFigureComputer().getIndex() == 0) {
            System.out.println("You Lose");

        } else if (field.getFigureUser().getIndex() == 2 && field.getFigureComputer().getIndex() == 1) {
            System.out.println("You Win");
        }

        System.out.println("\n" + "------------------------------------------------");
    }


    public void startGame() {


        Scanner scanner = new Scanner(System.in);

        String initialMessage = String.format("Chose a figure: 0 - %s, 1 - %s, 2 - %s%n", Figure.STONE.getName(),Figure.PAPER.getName(),Figure.SCISSORS.getName());


        while(true){

            System.out.println(initialMessage);

            int userNumberInput = scanner.nextInt();


            if(isValid(userNumberInput)) {

                Figure userFigure = Figure.getByNumber(userNumberInput);
                System.out.println("HUMAN chose " + Figure.getByNumber(userNumberInput));

                int computerInput = (int)(Math.random() * Figure.values().length);

                Figure computerFigure = Figure.getByNumber(computerInput);
                System.out.println("PC chose " + Figure.getByNumber(computerInput));
                if(userFigure != null && computerFigure != null){
                    checkWinner( new Field(userFigure, computerFigure));
                }
            } else{
                System.out.println("Please enter number from 0 to " + Figure.values().length);
            }
        }

    }

    private boolean isValid(int userNumberInput){
        return userNumberInput >= 0 && userNumberInput <= Figure.values().length;
    }
}