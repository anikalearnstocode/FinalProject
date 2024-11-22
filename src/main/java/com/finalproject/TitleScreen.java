/*
 * Anika Krieger
 * Nov 21
 * Title Screen Class
 * Description: Represents the title screen of the application. Handles background setup, display, and navigation to the next screen based on user input.
 */

package com.finalproject;

import processing.core.PImage;

public class TitleScreen extends Screen {
    Main main; //reference to main application instance

    //constructor
    public TitleScreen(Main main, AllButtons buttons) {
        super(main, buttons); //call superclass constructor
        this.main = main; //assign Main instance to the local variable
    }

    //set up method for title screen, load title screen bg img, set bg img for title screen as bg
    @Override
    void setup() {
            PImage bg = main.loadImage("titlepagebg.jpg"); //load the bg image
            setBackground(bg);  // Only set the background if the image is loaded
       
    }

    void draw() {
        drawBackground(); //draw bg img

    }

    //key pressed
    @Override
    void keyPressed() {
        //if B is pressed, navigates to firstchoicescreen
        if (main.key == 'b' || main.key == 'B') {
            // Change the current screen to FirstChoiceScreen
            main.setCurrentScreen(new FirstChoiceScreen(main, allButtons));
 
        }
    }

    //mousepressed - empty currently
    @Override
    void mousePressed(float mx, float my) {
       
    }

}
