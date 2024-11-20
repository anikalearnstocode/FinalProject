/*
 * Anika Krieger
 * Nov 11
 * FirstChoiceScreen Class
 * Description: Represents first choice screen with Air and Sea buttons, sets background, handles button presses
 */

package com.finalproject;

import processing.core.PApplet;
//import java.util.ArrayList;
import processing.core.PImage;

public class FirstChoiceScreen extends Screen {    
    //private AirButton airButton; //declare air button
    //private SeaButton seaButton; //declare sea button

    //constructor
    public FirstChoiceScreen(PApplet main, AllButtons buttons) {
        super(main, buttons); //call superclass constructor
        //initialize both FirstChoice buttons
        //airButton = new AirButton(main, "Air", main.width / 2 - 100, main.height / 2, 200, 50, main.color(100, 150, 255));
        //seaButton = new SeaButton(main, "Sea", main.width / 2 + 100, main.height / 2, 200, 50, main.color(100, 150, 255));
    }

    //set screen properties
    @Override
    void setup() {
        //load and set background
        PImage bg = main.loadImage("src/main/resources/data/firstchoicebg.jpg");
        setBackground(bg);


    }
    
    //draw method to draw both buttons and background
    @Override
    void draw() {
        drawBackground();
        allButtons.getButton(AllButtons.airButton).draw();
        allButtons.getButton(AllButtons.seaButton).draw();
    }


    @Override
    void keyPressed() {
        
    }

    //handle mousepressed/check if air and sea buttons have been clicked
    @Override
    public void mousePressed(float mx, float my) {
        allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position

    }
}
