package com.bogankovalenko.firsttask.domain;

public enum Figure {
    STONE("stone", 0), PAPER("paper", 1), SCISSORS("scissors", 2);


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
