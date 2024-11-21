/*
 * Anika Krieger
 * Nov 11
 * Screen Class
 * Description: Sets background and other stuff for the title
 */

package com.finalproject;

//import processing.core.PApplet;
import processing.core.PImage;

public class TitleScreen extends Screen {
    Main main;
    //PImage background;

    //constructor
    public TitleScreen(Main main, AllButtons buttons) {
        super(main, buttons);
        this.main = main; //assign Main instance to the local variable
    }

    //set up method for title screen, load title screen bg img, set bg img for title screen as bg
    @Override
    void setup() {
            PImage bg = main.loadImage("titlepagebg.jpg");
            setBackground(bg);  // Only set the background if the image is loaded
       
    }

    void draw() {
        drawBackground(); //draw bg img

    }

    @Override
    void keyPressed() {
        if (main.key == 'b' || main.key == 'B') {
            // Change the current screen to FirstChoiceScreen
            main.setCurrentScreen(new FirstChoiceScreen(main, allButtons));
 
        }
    }

    @Override
    void mousePressed(float mx, float my) {
       
    }

}
