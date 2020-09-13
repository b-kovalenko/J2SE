package com.bogankovalenko.firsttask.domain;

import com.bogankovalenko.firsttask.logic.GameLogic;

public class Field {
    private Figure figureUser;
    private Figure figureComputer;


    public Field(Figure figureUser, Figure figureComputer) {
        this.figureUser = figureUser;
        this.figureComputer = figureComputer;
    }

    public Figure getFigureUser() {
        return figureUser;
    }

    public Figure getFigureComputer() {
        return figureComputer;
    }
}