/*
 * Anika Krieger
 * Nov 21
 * FirstChoiceScreen Class
 * Description: Represents the first choice screen of the application. Displays Air and Sea buttons, sets the background, and handles user interaction.
 */

package com.finalproject;

import processing.core.PApplet;

import processing.core.PImage;

public class FirstChoiceScreen extends Screen {    

    //constructor
    public FirstChoiceScreen(PApplet main, AllButtons buttons) {
        super(main, buttons); //call superclass constructor
    }

    //set screen properties
    @Override
    void setup() {
        PImage bg = main.loadImage("src/main/resources/data/firstchoicebg.jpg"); //load bg img
        setBackground(bg); //set loaded img as bg

    }
    
    //draw method to draw both buttons and background
    @Override
    void draw() {
        drawBackground(); //draw bg img
        allButtons.getButton(AllButtons.airButton).draw(); //draw air button
        allButtons.getButton(AllButtons.seaButton).draw(); //draw sea button
        allButtons.getButton(AllButtons.backButton).draw();

    }


    //keypressed (no input)
    @Override
    void keyPressed() {
        
    }

    //handle mousepressed/check if air and sea buttons have been clicked
    @Override
    public void mousePressed(float mx, float my) {
        allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position

    }
}
