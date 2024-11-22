/*
 * Anika Krieger
 * Nov 21
 * VacationScreen Class
 * Description: Represents the final destination of the "vacation" path in the dream tree. This class handles the setup and rendering of the vacation screen, including loading and displaying a background image.
 */

 package com.finalproject;

 import processing.core.PApplet;
 import processing.core.PImage;
 
 public class VacationScreen extends Screen {
    
     //constructor
     VacationScreen(PApplet main, AllButtons buttons) {
         super(main, buttons); //call superclass constructor
        }

    //setup: load and set the bg image
     @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/vacayscreenbg.png");
            setBackground(bg);
        }
 
    //draw: draw the background image
     @Override
        public void draw() {
            drawBackground();
        }

        //keypressed (no input needed)    
        @Override
        public void keyPressed() {}

        //mouseclicked (no input needed)
        @Override
        void mousePressed(float mx, float my) { }
 

}