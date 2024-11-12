package com.finalproject;

import processing.core.PApplet;
import processing.core.PImage;

public class SeaScreen extends Screen {

    AllButtons allButtons;

    SeaScreen(PApplet main) {
            super(main);
        }

        @Override
        public void setup() {
            PImage bg = main.loadImage("src/main/resources/data/seascreenbg.png");
            setBackground(bg);

            allButtons = new AllButtons(main, main.width/2, main.height/2, 150, 50, main.color(0,0,50));
        }

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
            allButtons.mousePressed(mx, my);
        }   

}
