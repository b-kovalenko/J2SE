package com.bogankovalenko.firsttask.logic;

import com.bogankovalenko.firsttask.domain.*;

import java.util.Scanner;

public class GameLogic {
    public void startGame()

    {
        Field stoneField = new Field();
        Field paperField = new Field();
        Field scissorsField = new Field();

        ScoreComputer scoreComputer = new ScoreComputer();
        ScoreUser scoreUser = new ScoreUser();

        Scanner scanner = new Scanner(System.in);

        ScoreDeterminer scoreDeterminer = new ScoreDeterminer();

        String stone = Figure.STONE.getValue();
        String paper = Figure.PAPER.getValue();
        String scissors = Figure.SCISSORS.getValue();

        String initialMessage = String.format("Chose a figure 0 - %s, 1 - %s, 2 - %s%n", stone, paper, scissors);

        stoneField.setIndex(0);
        paperField.setIndex(1);
        scissorsField.setIndex(2);

        stoneField.setMessage(stone);
        paperField.setMessage(paper);
        scissorsField.setMessage(scissors);

        Field[] fields= {stoneField, paperField, scissorsField};

        while(true){
            System.out.println(initialMessage);

            int userNumberInput;
            String userInput = scanner.next();

            if(isNumber(userInput)) {
                userNumberInput = Integer.parseInt(userInput);

                for(Field userField: fields){
                    if(userField != null && userField.getIndex() == userNumberInput){
                        System.out.println("Your chose " + userField.getMessage());
                    }
                }
                int computerInput = (int)(Math.random() * 3);
                for( Field computerField : fields){
                    if(computerField != null && computerField.getIndex() == computerInput){
                        System.out.println("Computer choose " + computerField.getMessage());
                    }
                }
                scoreDeterminer.determine(userNumberInput,computerInput, scoreComputer, scoreUser);

            }
        }
    }
            private boolean isNumber(String userInput){
                try {
                    if(Integer.parseInt(userInput)==0){
                        return true;
                    }else if(Integer.parseInt(userInput)== 1){
                        return true;
                    }else return Integer.parseInt(userInput)==2;
                } catch (Exception e){
                    System.out.println("Invalid user input, try again");
                }
                return false;
            }
}
