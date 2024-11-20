/*
 * Anika Krieger
 * Nov 11
 * Screen Class
 * Description: Represents sea screen with buttons, sets background and handles button presses for all buttons
 */

package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public class SeaScreen extends Screen {

    //constructor
    SeaScreen(PApplet main, AllButtons buttons) {
            super(main, buttons);
        }

        //load bg img and set loaded bg img for screen
        @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/seascreenbg.jpg");
            setBackground(bg);
        }

        //draw bg and all buttons
        @Override
        public void draw() {
            drawBackground();
            allButtons.getButton(AllButtons.boatButton).draw();
            allButtons.getButton(AllButtons.inWaterButton).draw();
            allButtons.getButton(AllButtons.islandButton).draw();
        }

        @Override
        public void keyPressed() {}

        @Override
        void mousePressed(float mx, float my) {
            allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position
        }   

}
