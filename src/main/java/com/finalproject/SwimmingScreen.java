/*
 * Anika Krieger
 * Nov 21
 * SwimmingScreen Class
 * Description: Represents the final destination of the "swimming" path in the dream tree. This class handles the setup and rendering of the swimming screen, including loading and displaying a background image.
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class SwimmingScreen extends Screen {
 
    
     //constructor
     SwimmingScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
        }

    //setup: load and set the bg image
     @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/swimmingscreenbg.png");
            setBackground(bg);
        }
 
    //draw: draw the background image
     @Override
        public void draw() {
            drawBackground();
            //allButtons.getButton(AllButtons.backButton).draw();

        }
        
        //keypressed (no input needed)
        @Override
        public void keyPressed() {}

        //mousepressed (no input needed)
        @Override
        void mousePressed(float mx, float my) { }
 

}