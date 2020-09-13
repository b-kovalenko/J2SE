package com.bogankovalenko.firsttask.domain;

public enum Figure {
    STONE("STONE", 0), PAPER("PAPER", 1), SCISSORS("SCISSORS", 2);


    private String name;
    private int index;


    Figure(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
