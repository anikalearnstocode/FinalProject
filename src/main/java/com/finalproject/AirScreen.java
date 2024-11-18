/*
 * Anika Krieger
 * Nov 11
 * AirScreen Class
 * Description: Represents the air screen, contains methods for setting up, drawing, and handling interaction
 */

package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public class AirScreen extends Screen {

    AllButtons allButtons; //instance variable for all buttons in sea screen

    //constructor
    AirScreen(PApplet main) {
        super(main); //call superclass constructor
        PImage bg = main.loadImage("src/main/resources/data/airscreenbg.jpg");
        setBackground(bg);

        allButtons = new AllButtons(main, main.width/2, main.height/2, 150, 50, main.color(0,0,50));

    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawBackground();
        allButtons.flyingButton.draw();
        allButtons.fallingButton.draw();

    }

    @Override
    public void keyPressed() {

    }

    @Override
    void mousePressed(float mx, float my) {
        allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position
    }

}
