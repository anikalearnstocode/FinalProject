/*
 * Anika Krieger
 * Nov 21
 * AirScreen Class
 * Description: Represents the air screen, manages the background, buttons, and interactions specific to the air-themed gameplay screen.
 */

package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public class AirScreen extends Screen {

    //constructor for air screen
    AirScreen(PApplet main, AllButtons buttons) {
        super(main, buttons); //call superclass constructor
        PImage bg = main.loadImage("src/main/resources/data/airscreenbg.jpg"); //call the image that will be the background
        setBackground(bg); //set background image that was loaded in the last line

    }

    //setup method for airscreen called once when screen is initializsed
    @Override
    public void setup() {

    }

    //draw method for air screen
    @Override
    public void draw() {
        drawBackground(); //draw background
        // Ensure that allButtons is properly initialized before accessing it
        assert( allButtons != null );

        //draw specific buttons for this screen
        allButtons.getButton(AllButtons.flyingButton).draw();
        allButtons.getButton(AllButtons.fallingButton).draw();
        //allButtons.getButton(AllButtons.backButton).draw();


    }

    //key pressed for airscreen
    @Override
    public void keyPressed() {

    }

    //mousepressed for air screen, passes mouse coordinates to the button handler, delegates mouse press handling to the buttons
    @Override
    void mousePressed(float mx, float my) {
        allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position

    }

}
