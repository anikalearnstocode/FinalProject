/*
 * Anika Krieger
 * Nov 21
 * StrandedScreen Class
 * Description: Represents the final destination of the "stranded" path in the dream tree. This class handles the setup and rendering of the screen, including loading and displaying a background image.
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class StrandedScreen extends Screen {
 
    
     //constructor
    StrandedScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
     }

        //setup: load and set the bg image
        @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/strandedscreenbg.png");
            setBackground(bg);
        }
 
        //draw: draw the background image
        @Override
        public void draw() {
            drawBackground();
        }

        @Override         //keypressed (no input needed)
        public void keyPressed() {}

        @Override        //mousepressed (no input needed)
        void mousePressed(float mx, float my) {
        }
 

}