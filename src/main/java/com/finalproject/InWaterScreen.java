/*
 * Anika Krieger
 * Nov 21
 * InWaterScreen Class
 * Description: Represents the InWaterScreen of the application. Displays a background image and buttons.
 * Responsibilities:
 * - Loads and sets a background image for the screen.
 * - Draws the background and buttons on the screen.
 * - Handles mouse interactions to detect when buttons are clicked.
 * - Ensures smooth integration with the overall screen navigation system.
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class InWaterScreen extends Screen {
 
    
     //constructor
     InWaterScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
         //allButtons = buttons;
     }

        //setup: load and set the bg image
        @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/inwaterscreen.png");
            setBackground(bg);

        }
 
        //draw: draw the background image and draw the buttons
        @Override
        public void draw() {
            drawBackground();
            allButtons.getButton(AllButtons.swimmingButton).draw();
            allButtons.getButton(AllButtons.drowningButton).draw();

        }

        //keypressed (no input)
        @Override
        void keyPressed() {
            
        }

        //handle mousepressed/check if buttons have been clicked
        @Override
        public void mousePressed(float mx, float my) {
            allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position

    }
 

}