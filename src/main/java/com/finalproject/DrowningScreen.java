/*
 * Anika Krieger
 * Nov 21
 * DrowningScreen Class
 * Description: Represents the final destination of the "drowning" path in the dream tree. This class handles the setup and rendering of the screen, including loading and displaying a background image.
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class DrowningScreen extends Screen {
 

    
     //constructor
     DrowningScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
     }

    //setup: load and set the bg imag4
     @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/drowningscreenbg.png");
            setBackground(bg);
        }
 
    //draw: draw the background image
     @Override
        public void draw() {
            drawBackground();
            allButtons.getButton(AllButtons.backButton).draw();

        }

        //keypressed (no input needed)
        @Override
        public void keyPressed() {}

        //mousepressed (no input needed)
        @Override
        void mousePressed(float mx, float my) {
        }
 

}