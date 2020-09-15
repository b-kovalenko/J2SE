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
    public static Figure getByNumber(int input){
        for(Figure figure: Figure.values()){
            if(figure.getIndex() == input){
                switch(input) {
                    case 0:
                    case 1:
                    case 2:
                       return figure;
                }
            }
        }
        return null;
    }
}
