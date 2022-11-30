package com.example.persaudunit14project;

import javafx.scene.control.Label;

public class Alonzo {

    private int difficulty;
    private boolean dayOrNight;
    private int x;
    private int y;

    private Label score;

    public Alonzo(int difficulty, boolean day, Label score){
        this.difficulty = difficulty;
        dayOrNight = day;
        this.score = score;
        x = 225/difficulty;
        y = 225/difficulty;
    }

    public Alonzo(){
        difficulty = 2;
        dayOrNight = true;
        x = 225/difficulty;
        y = 225/difficulty;
    }

    public int getDifficulty(){
        return difficulty;
    }

    public boolean getDayOrNight(){
        return dayOrNight;
    }

public int getX(){
        return x;
}

public int getY(){
        return y;
}




}
