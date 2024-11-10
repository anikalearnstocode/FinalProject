/*
 * Anika Krieger
 * Nov 9
 * Main Class
 * Description:
 */

package com.finalproject;

import processing.core.PApplet;
//import java.util.ArrayList;
//import processing.core.PImage;

public class Main extends PApplet {
    //PImage background;
    int background;
    Screen currentScreen;
    //TitleScreen titleScreen;
    //FirstChoiceScreen firstChoiceScreen;
    // AirScreen airScreen;
    // SeaScreen seaScreen;
    AllButtons allButtons;
    public static void main(String[] args) {
        PApplet.main("com.finalproject.Main");
    }

    public void settings() {
        size(810,600);
    }

    public void setup() {        
       // background = loadImage("background.png");
       // background.resize(width, height);  // Resize to screen dimensions
        //background(int);
        
        currentScreen = new TitleScreen(this); //start with the title screen
        System.out.println("TitleScreen initialized: " + currentScreen);
        allButtons = null;

        //allButtons = new AirButton(this, "Air Button", 100, 100, 200, 50, color(255, 0, 0));  // Air button example
        //allButtons = new SeaButton(this, "Sea Button", 100, 100, 200, 50, color(255, 0, 0));  // Air button example

    }

    public void draw() {
        currentScreen.draw();

        //keep if this fails:
        // if (currentScreen instanceof FirstChoiceScreen) {
        //     allButtons.draw();
        // }
    }

    public void keyPressed() {
        currentScreen.keyPressed();

                //keep if this fails:

        // if (currentScreen instanceof TitleScreen) {
        //     // Switch to FirstChoiceScreen if 'B' is pressed
        //     if (key == 'b' || key == 'B') {
        //         currentScreen = new FirstChoiceScreen(this);
        //     }
        // }
    }


    public void mousePressed() {
       currentScreen.mousePressed(X, Y);

               //keep if this fails:

        // if (currentScreen instanceof FirstChoiceScreen) {
        //     allButtons.mousePressed(mouseX, mouseY);
        // }


    }

    public void setCurrentScreen(Screen newScreen) {
        currentScreen = newScreen;
    }
}


