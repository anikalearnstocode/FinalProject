/*
 * Anika Krieger
 * Nov 11
 * BoatScreen Class
 * Description: Represents the boat screen, contains methods for setting up, drawing, and handling interaction
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class InWaterScreen extends Screen {
 
    
     //constructor
     InWaterScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
         allButtons = buttons;
     }

     @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/inwaterscreen.png");
            setBackground(bg);

            //create buttons for the boat screen
        }
 
     @Override
        public void draw() {
            drawBackground();
            allButtons.getButton(AllButtons.swimmingButton).draw();
            allButtons.getButton(AllButtons.drowningButton).draw();

        }

        @Override
        public void keyPressed() {}

        @Override
        void mousePressed(float mx, float my) {
            allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position
        }
 

}