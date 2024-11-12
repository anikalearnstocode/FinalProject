/*
 * Anika Krieger
 * Nov 9
 * Screen Class
 * Description:
 */


package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Screen {
    PApplet main;
    PImage background;

    Screen(PApplet main) {
        this.main = main;
    }

    abstract void setup();

    void setBackground(PImage bg) {
        this.background = bg;
    }

    void drawBackground() {
        if (background != null) {
            main.image(background, 0, 0, main.width, main.height);
        } else {
            System.out.println("ERROR: Images not loading properly");
            //main.background(255);
        }
    }

    abstract void draw();

    abstract void keyPressed();

    abstract void mousePressed(float mx, float my);

}


