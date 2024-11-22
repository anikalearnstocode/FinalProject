/*
 * Anika Krieger
 * Nov 21
 * Screen Class
 * Description: Parent Abstract class for screen management, handles background drawing and defines setup, draw, keyPressed, etc.
 */


package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Screen {
    PApplet main; //reference
    PImage background; //background image for the screen
    AllButtons allButtons;

    //constructor
    Screen(PApplet main, AllButtons buttons) {
        this.main = main; 
        allButtons = buttons;
    }

    abstract void setup();

    //sets backgrounf img, assigns passed image to instance variable
    void setBackground(PImage bg) {
        this.background = bg;
    }

    void drawBackground() { //draws bg img on screen
        if (background != null) { //check if bg img exists
            main.image(background, 0, 0, main.width, main.height); //if so, draw bg img scaled to the window size
        } 
    }

    abstract void draw();

    abstract void keyPressed();

    abstract void mousePressed(float mx, float my);

}


