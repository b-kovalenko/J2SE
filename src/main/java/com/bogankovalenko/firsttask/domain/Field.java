package com.bogankovalenko.firsttask.domain;

import com.bogankovalenko.firsttask.logic.GameLogic;

public class Field {
    private Figure figureUser;
    private Figure figureComputer;


    public Field(Figure figureUser, Figure figureComputer) {
        this.figureUser = figureUser;
        this.figureComputer = figureComputer;
    }

    public void determine(){
        if (figureUser.getIndex() == 0 && figureComputer.getIndex() == 1) {
            System.out.println("You Lose");

        } else if (figureUser.getIndex() == 0 && figureComputer.getIndex() == 2) {
            System.out.println("You Win");

        } else if (figureUser.getIndex() == 0 && figureComputer.getIndex() == 0) {
            System.out.println("Draw");

        } else if (figureUser.getIndex() == 1 && figureComputer.getIndex() == 0) {
            System.out.println("You Win");

        } else if (figureUser.getIndex() == 1 && figureComputer.getIndex() == 1) {
            System.out.println("Draw");

        } else if (figureUser.getIndex() == 1 && figureComputer.getIndex() == 2) {
            System.out.println("You Lose");

        } else if (figureUser.getIndex() == 2 && figureComputer.getIndex() == 0) {
            System.out.println("You Lose");

        } else if (figureUser.getIndex() == 2 && figureComputer.getIndex() == 1) {
            System.out.println("You Win");

        } else if (figureUser.getIndex() == 2 && figureComputer.getIndex() == 2) {
            System.out.println("Draw");

        }
        System.out.println("\n" + "------------------------------------------------");
    }


    public Figure getFigureUser() {
        return figureUser;
    }

    public Figure getFigureComputer() {
        return figureComputer;
    }
}