/*
 * Anika Krieger
 * Nov 9
 * Button Class
 * Description:
 */

package com.finalproject;
import processing.core.PApplet;

public abstract class Button {
    PApplet main;
    String label;
    int color;
    float x, y, width, height;

    Button(PApplet main, String label, float x, float y, float width, float height, int color) {
        this.main = main;
        this.label = label;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    Button(PApplet main, String label, float x, float y, float width, float height) {
        this(main, label, x, y, width, height, main.color(23, 50, 155));
    }

    public void draw() {
        main.fill(color);
        main.rectMode(PApplet.CENTER);
        main.rect(x, y, width, height);

        main.fill(255);
        main.strokeWeight(0);
        main.textAlign(PApplet.CENTER, PApplet.CENTER);
        main.textSize(20);
        main.text(label, x, y);
    }

    public void mousePressed(float mx, float my) {
        if (mx > x - width / 2 && mx < x + width / 2 && my > y - height / 2 && my < y + height / 2) {
            onPress();
        }
    }

    public abstract void onPress();
}
