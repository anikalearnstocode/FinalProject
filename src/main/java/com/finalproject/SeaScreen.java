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

    AllButtons allButtons; //instance variable for all buttons in sea screen

    //constructor
    SeaScreen(PApplet main) {
            super(main);
        }

        //load bg img and set loaded bg img for screen
        @Override
        public void setup() { 
            PImage bg = main.loadImage("src/main/resources/data/seascreenbg.jpg");
            setBackground(bg);

            //create buttons for the sea screen
            allButtons = new AllButtons(main, main.width/2, main.height/2, 150, 50, main.color(0,0,50));
        }

        //draw bg and all buttons
        @Override
        public void draw() {
            drawBackground();
            allButtons.boatButton.draw();
            allButtons.inWaterButton.draw();
            allButtons.islandButton.draw();
        }

        @Override
        public void keyPressed() {}

        @Override
        void mousePressed(float mx, float my) {
            allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position
        }   

}
