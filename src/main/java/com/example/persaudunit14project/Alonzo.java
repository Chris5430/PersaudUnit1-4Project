package com.example.persaudunit14project;

import javafx.scene.control.Label;

/**
 * The Alonzo class changes Alonzo and the background according to the difficulty
 */
public class Alonzo {

    private int difficulty;
    private boolean dayOrNight;
    private int x;
    private int y;


    /**
     * Constructor for Alonzo
     * @param difficulty Determines Alonzo's size
     * @param day Determines whether it will be day or night
     */
    public Alonzo(int difficulty, boolean day){
        this.difficulty = difficulty;
        dayOrNight = day;
        x = 225/difficulty;
        y = 225/difficulty;
    }

    /**
     * Constructor for Alonzo with no parameters, sets difficulty to 2, and dayOrNight to true
     */
    public Alonzo(){
        difficulty = 2;
        dayOrNight = true;
        x = 225/difficulty;
        y = 225/difficulty;
    }

    /**
     *
     * @return Returns the difficulty
     */
    public int getDifficulty(){
        return difficulty;
    }

    /**
     *
     * @return Returns whether it is day or night as a boolean, true for day and false for night
     */
    public boolean getDayOrNight(){
        return dayOrNight;
    }

    /**
     *
     * @return Returns Alonzo's width
     */
    public int getX(){
        return x;
}

    /**
     *
     * @return Returns Alonzo's height
     */
    public int getY(){
        return y;
}

    /**
     * toString method for Alonzo
     * @return Returns a string showing the difficulty, whether it is day or night, Alonzo's width and height
     */
    public String toString(){
        return "Difficulty: " + difficulty + "\nDay or Night: " + dayOrNight + "\nWidth: " + x + "\nHeight: " + y;
}




}
