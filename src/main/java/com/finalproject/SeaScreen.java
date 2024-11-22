/*
 * Anika Krieger
 * Nov 21
 * Screen Class
 * Description: Represents the sea-themed screen in the application. This class handles setting up the screen
 *              by loading a specific background image, displaying interactive buttons, and managing user interactions
 *              such as mouse presses. Buttons on this screen navigate to different paths within the DreamTree structure.
 */

package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public class SeaScreen extends Screen {

    //constructor
    SeaScreen(PApplet main, AllButtons buttons) {
            super(main, buttons); //call to super
        }

        //setup method - load bg img and set loaded bg img for screen
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

        //handles keypressed
        @Override
        public void keyPressed() {}

        //mousepressed- delegates interaction to button manager and passes mouse coordinates
        @Override
        void mousePressed(float mx, float my) {
            allButtons.mousePressed(mx, my); //call mousePressed on the buttons, passing mouse position
        }   

}
