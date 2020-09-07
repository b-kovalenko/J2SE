package com.bogankovalenko.firsttask.domain;

public enum Figure {
    STONE("stone"), PAPER("paper"), SCISSORS("scissors");

    private final String value;

    Figure(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
