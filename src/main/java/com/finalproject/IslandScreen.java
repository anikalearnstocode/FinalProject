/*
 * Anika Krieger
 * Nov 11
 * BoatScreen Class
 * Description: Represents the boat screen, contains methods for setting up, drawing, and handling interaction
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class IslandScreen extends Screen {
 
    AllButtons allButtons; //instance variable for all buttons in sea screen

    
     //constructor
     IslandScreen(PApplet main) {
         super(main); //call superclass constructor
     }

     @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/islandscreenbg.png");
            setBackground(bg);

            //create buttons for the boat screen
            allButtons = new AllButtons(main, main.width/2, main.height/2, 150, 50, main.color(0,0,50));
        }
 
     @Override
        public void draw() {
            drawBackground();
            allButtons.strandedButton.draw();
            allButtons.vacayButton.draw();

        }

        @Override
        public void keyPressed() {}

        @Override
        void mousePressed(float mx, float my) {
            allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position
        }
 

}