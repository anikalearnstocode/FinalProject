/*
 * Anika Krieger
 * Nov 21
 * Button Class
 * Description: Abstract class representing a generic button
 */

package com.finalproject;
import processing.core.PApplet;

public abstract class Button {
    PApplet main; //declare PApplet ref for processing
    String label; //declare label for button text
    int color; //declare color for buttons
    int hoverColor; //declare color for when mouse is hovering over button
    float x, y, width, height; //declare position and size

    //constructor
    Button(PApplet main, String label, float x, float y, float width, float height, int color) {
        this.main = main; //initialize main reference
        this.label = label; //initialize label
        //initialize position width height and color:
        this.x = x; 
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.hoverColor = main.color(255, 173, 135);
    }

    //overrided constructor
    Button(PApplet main, String label, float x, float y, float width, float height) { //overloaded constructor without color
        this(main, label, x, y, width, height, main.color(33, 123, 150)); //default color is set to blue
    }

    //draw method
    public void draw() {
        float left = x - width / 2;
        float right = x + width / 2;
        float top = y - height / 2;
        float bottom = y + height / 2;

        boolean isHovered = main.mouseX > left && main.mouseX < right && main.mouseY > top && main.mouseY < bottom;

        //check if mouse is over the button

        if (isHovered) {
            main.fill(hoverColor);
        } else {
            main.fill(color);
        }

        main.rectMode(PApplet.CENTER); //set rectangle mode to center
        main.rect(x, y, width, height); //draw button rectangle
        main.fill(255); //set text fill color to white
        main.strokeWeight(0); //make stroke weight = 0
        main.textAlign(PApplet.CENTER, PApplet.CENTER); //align text to center
        main.textSize(20); //set text size
        main.text(label, x, y); //draw button label text
    }

    //mousepressed method
    public void mousePressed(float mx, float my) { //method to handle mouse press on button
        if (mx > x - width / 2 && mx < x + width / 2 && my > y - height / 2 && my < y + height / 2) {
            onPress(); //call on press if within bounds
        }
    }

    public abstract void onPress();
}
