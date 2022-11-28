package com.example.persaudunit14project;

public class Alonzo {

    private int difficulty;
    private boolean dayOrNight;
    private int x;
    private int y;

    public Alonzo(int difficulty, boolean day){
        this.difficulty = difficulty;
        dayOrNight = day;
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



}
