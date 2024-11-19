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
    public TitleScreen(Main main) {
        super(main);
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

        // main.textAlign(main.CENTER, main.CENTER); //align text to center of screen
        // main.fill(255); //set text color to white
        // main.textSize(80); //set text size for title
        // main.text("Dream Navigator", main.width / 2, main.height / 2 - 50); //draw project title
        // main.textSize(40); //set text size for instructions
        // main.text("Press B to Begin Your Exploration!", main.width / 2, main.height /2 + 50); //display instruction text

    }

    @Override
    void keyPressed() {
        //if B is pressed, change currentScreen from TitleScreen to FirstChoiceScreen
        if (main.key == 'b' || main.key == 'B') {
            main.setCurrentScreen(new FirstChoiceScreen(main));
        }
        
    }

    @Override
    void mousePressed(float mx, float my) {
       
    }

}
