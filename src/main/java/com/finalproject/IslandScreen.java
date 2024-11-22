/*
 * Anika Krieger
 * Nov 21
 * IslandScreen Class
 * Description: Represents the island screen, contains methods for setting up, drawing, and handling interactions.
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class IslandScreen extends Screen {
    
     //constructor
     IslandScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
     }

     //setup method
     @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/islandscreenbg.png"); //load bg image for the island screen
            setBackground(bg); //set loaded image as bg of screen
        }
 
     //draw method for rendering elements on screen
     @Override
        public void draw() {
            drawBackground(); //draw bg img that was set in setup method
            //draw buttons on the screen
            allButtons.getButton(AllButtons.strandedButton).draw();
            allButtons.getButton(AllButtons.vacayButton).draw();

        }

        //key pressed method
        @Override
        public void keyPressed() {}

        //mousepressed method that calls mousepressed method of allbuttons and passes the current mouse positions
        @Override
        void mousePressed(float mx, float my) {
            allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position
        }
 

}