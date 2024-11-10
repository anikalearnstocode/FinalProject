/*
 * Anika Krieger
 * Nov 9
 * FirstChoiceScreen Class
 * Description:
 */

package com.finalproject;

import processing.core.PApplet;
//import java.util.ArrayList;
import processing.core.PImage;

public class FirstChoiceScreen extends Screen {    
    private AirButton airButton;
    private SeaButton seaButton;

    public FirstChoiceScreen(PApplet main) {
        super(main);
        airButton = new AirButton(main, "Air", main.width / 2 - 100, main.height / 2, 200, 50, main.color(100, 150, 255));
        seaButton = new SeaButton(main, "Sea", main.width / 2 + 100, main.height / 2, 200, 50, main.color(100, 150, 255));
    }

    @Override
    void setup() {
        PImage bg = main.loadImage("src/main/resources/data/firstchoicebg.png");
        setBackground(bg);
    }
    
    @Override
    void draw() {
        drawBackground();
        airButton.draw();
        seaButton.draw();
    }

    @Override
    void keyPressed() {
        
    }

    @Override
    public void mousePressed(float mx, float my) {
        airButton.mousePressed(mx, my);
        seaButton.mousePressed(mx, my);
    }
}
