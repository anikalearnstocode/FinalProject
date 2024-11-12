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
    Screen currentScreen;
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
        //allButtons = null;
        allButtons = new AllButtons(this, width / 2, height / 2, 150, 50, color(0, 0, 255)); // Create buttons
        currentScreen.setup();

        //allButtons = new AirButton(this, "Air Button", 100, 100, 200, 50, color(255, 0, 0));  // Air button example
        //allButtons = new SeaButton(this, "Sea Button", 100, 100, 200, 50, color(255, 0, 0));  // Air button example

    }

    public void draw() {
        currentScreen.draw();
    
    }

    public void keyPressed() {
        currentScreen.keyPressed();

    }


    public void mousePressed() {
       //currentScreen.mousePressed(X, Y);
       if (currentScreen != null) {
        currentScreen.mousePressed(X, Y);
       }

       if (allButtons != null) {
        allButtons.mousePressed(mouseX, mouseY);
       }

    }

    public void setCurrentScreen(Screen newScreen) {
        currentScreen = newScreen;
        currentScreen.setup();
    }
}


