/*
 * Anika Krieger
 * Nov 11
 * Main Class
 * Description: Main app class that initializes screen and handles events
 */

package com.finalproject;

import processing.core.PApplet;
//import java.util.ArrayList;
//import processing.core.PImage;

public class Main extends PApplet {
    Screen currentScreen; //instance variable to store current screen
    AllButtons allButtons; //instance variable to store all buttons
    DreamTree dreamTree;
    public static void main(String[] args) {
        PApplet.main("com.finalproject.Main");
    }

    public void settings() {
        size(810,600); //window size
    }

    public void setup() {        
        currentScreen = new TitleScreen(this); //start with the title screen
        System.out.println("TitleScreen initialized: " + currentScreen); //log screen initialization
        allButtons = new AllButtons(this, width / 2, height / 2, 150, 50, color(0, 0, 255)); // Create buttons
        currentScreen.setup(); //call setup on current screen to initialize its contents

        //new additions
        dreamTree = new DreamTree(this);
    }

    public void draw() {
        currentScreen.draw(); //call draw on current screen to update screen content
    
    }

    public void keyPressed() {
        currentScreen.keyPressed(); //call keypressed on current screen to handle keyboard input

    }


    public void mousePressed() {
        //check if there is a screen, and if so, call mousepressed on the buttons, passing mouse position
        if (currentScreen != null) {
            currentScreen.mousePressed(X, Y);
        }

        //if all buttons are not null and exist, then call mousepressed on the buttons, passing mouse position
       if (allButtons != null) {
        allButtons.mousePressed(mouseX, mouseY);
        }

    }

    public void setCurrentScreen(Screen newScreen) {
        //set new screen as current screen and then initialize new screen by calling its setup method
        currentScreen = newScreen;
        currentScreen.setup();
    }
}


