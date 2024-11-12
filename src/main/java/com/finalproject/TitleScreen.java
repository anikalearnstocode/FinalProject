/*
 * Anika Krieger
 * Nov 9
 * Screen Class
 * Description:
 */

package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public class TitleScreen extends Screen {
    Main main;
    //PImage background;


    public TitleScreen(Main main) {
        super(main);
        this.main = main;
    }

    @Override
    void setup() {
            PImage bg = main.loadImage("title.jpg");
            setBackground(bg);  // Only set the background if the image is loaded
       
    }

    void draw() {
        drawBackground();

        main.textAlign(main.CENTER, main.CENTER);
        main.fill(255);
        main.textSize(80);
        main.text("Dream Navigator", main.width / 2, main.height / 2 - 50);
        main.textSize(40);
        main.text("Press B to Begin Your Exploration!", main.width / 2, main.height /2 + 50);
        //System.out.println("TitleScreen draw() is executing"); // Add this line

    }

    @Override
    void keyPressed() {
        if (main.key == 'b' || main.key == 'B') {
            main.setCurrentScreen(new FirstChoiceScreen(main));
        }
        
    }

    @Override
    void mousePressed(float mx, float my) {
       
    }

}
