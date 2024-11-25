/*
 * Anika Krieger
 * Nov 21
 * BoatScreen Class
 * Description: Represents the BoatScreen of the application. Displays a background image and two buttons—Choppy Waters and Calm Waters—that allow the user to select the next screen.
 * Responsibilities:
 * - Loads and sets a background image for the screen.
 * - Draws the background and buttons on the screen.
 * - Handles mouse interactions to detect when buttons are clicked.
 * - Ensures smooth integration with the overall screen navigation system.
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class BoatScreen extends Screen {

    
     //constructor
    BoatScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
    }

        //setuo: load and set the bg image
         @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/boatscreenbg.png");
            setBackground(bg);
        
        }
 
        //draw: draw the background image and draw the buttons
        @Override
        public void draw() {
            drawBackground();
            allButtons.getButton(AllButtons.choppyButton).draw();
            allButtons.getButton(AllButtons.calmButton).draw();
            //allButtons.getButton(AllButtons.backButton).draw();

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