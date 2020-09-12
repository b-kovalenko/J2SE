package com.bogankovalenko.firsttask.domain;

import com.bogankovalenko.firsttask.logic.GameLogic;

public class Field {
        private Figure figure;

    public Field(Figure figure) {
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }
}