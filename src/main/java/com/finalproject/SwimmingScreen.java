/*
 * Anika Krieger
 * Nov 11
 * BoatScreen Class
 * Description: Represents the boat screen, contains methods for setting up, drawing, and handling interaction
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class SwimmingScreen extends Screen {
 
    AllButtons allButtons; //instance variable for all buttons in sea screen

    
     //constructor
     SwimmingScreen(PApplet main) {
         super(main); //call superclass constructor
        }

     @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/swimmingscreenbg.png");
            setBackground(bg);
        }
 
     @Override
        public void draw() {
            drawBackground();
        }

        @Override
        public void keyPressed() {}

        @Override
        void mousePressed(float mx, float my) { }
 

}