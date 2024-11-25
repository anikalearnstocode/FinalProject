/*
 * Anika Krieger
 * Nov 21
 * Main Class
 * Description: Entry point for the application, responsible for initializing the screens, managing the event loop, and handling user input.
 */

package com.finalproject;

import processing.core.PApplet;

public class Main extends PApplet {
    Screen currentScreen; //instance variable to store current screen
    AllButtons allButtons; //instance variable to store all buttons
    DreamTree dreamTree; //instance variable for managing the decision tree

    //constructor
    public static void main(String[] args) {
        PApplet.main("com.finalproject.Main"); //specify main processing class
    }

    public void settings() {
        fullScreen(); //window size
    }

    public void setup() {        
        allButtons = new AllButtons(this, width / 2, height / 2, 150, 50, color(0, 0, 255)); // Create buttons
        currentScreen = new TitleScreen(this, allButtons); // Pass 'this' for 'Main' to the TitleScreen, set initial screen to titlescreen
        System.out.println("TitleScreen initialized: " + currentScreen); // Log screen initialization
        currentScreen.setup(); // Call setup on current screen to initialize its contents

        //initialize the tree
        dreamTree = new DreamTree(this, currentScreen, allButtons );
    }

    public void draw() {
        currentScreen.draw(); //call draw on current screen to update screen content

        if (dreamTree != null) {
            dreamTree.getCurrentScreen().draw();
        }
    
    }

    public void keyPressed() {
        currentScreen.keyPressed(); //call keypressed on current screen to handle keyboard input

        //call backbutton from dreamtree (not currently functional)
        dreamTree.keyPressed();

        //reset to first choice screen - feels like the simplest reset option
        if (key == 'r' || key == 'R') {
            currentScreen = new FirstChoiceScreen(this, allButtons);
            //FirstChoiceScreen.draw();
        }
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


