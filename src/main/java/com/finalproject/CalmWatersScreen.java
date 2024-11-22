/*
 * Anika Krieger
 * Nov 21
 * CalmWatersScreen Class
 * Description: Represents the final destination of the "calm waters (boat) (sea)" path in the dream tree. This class handles the setup and rendering of the screen, including loading and displaying a background image.
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class CalmWatersScreen extends Screen {
 
    
     //constructor
     CalmWatersScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
     }

     //setup: load and set the bg imag
     @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/calmboatscreen.png");
            setBackground(bg);
        }
 
        //draw: draw the background image
        @Override
        public void draw() {
            drawBackground();
        }

        @Override        //keypressed (no input needed)
        public void keyPressed() {}

        @Override        //mousepressed (no input needed)
        void mousePressed(float mx, float my) {
        }
 

}