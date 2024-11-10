package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public class SeaScreen extends Screen {

    SeaScreen(PApplet main) {
            super(main);
        }

        @Override
        public void setup() {
            PImage bg = main.loadImage("src/main/resources/data/seascreenbg.png");
            setBackground(bg);
        }

        @Override
        public void draw() {
            drawBackground();
        }

        @Override
        public void keyPressed() {}

        @Override
        void mousePressed(float mx, float my) {
    
        }   

}
