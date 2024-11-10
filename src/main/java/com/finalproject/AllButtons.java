/*
 * Anika Krieger
 * Nov 9
 * Button Class
 * Description:
 */

 package com.finalproject;
 import processing.core.PApplet;


public class AllButtons {

    public AirButton airButton;
    public SeaButton seaButton;

    // AllButtons(PApplet main_, float x_, float y_, float width_, float height_, int color_) {
    //     super(main_, "", width_/2, height_/2, 200, 50, color_);
    //     float buttonSpacing = 50;
    //     airButton = new AirButton(main_, "Air", width_/2-buttonSpacing, height_/2, 150, 50, color_);
    //     seaButton = new SeaButton(main_, "Air", width_/2+buttonSpacing, height_/2, 150, 50, color_);

    // }

    AllButtons(PApplet main, float centerX, float centerY, float buttonWidth, float buttonHeight, int color) {
        float buttonSpacing = 150;
        airButton = new AirButton(main, "Air", centerX - buttonSpacing, centerY, buttonWidth, buttonHeight, color);
        seaButton = new SeaButton(main, "Sea", centerX + buttonSpacing, centerY, buttonWidth, buttonHeight, color);
    }

    public void mousePressed(float mouseX, float mouseY) {
        airButton.mousePressed(mouseX, mouseY);
        seaButton.mousePressed(mouseX, mouseY);
    }
}

class AirButton extends Button {

    AirButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color);
    }

    @Override
    public void onPress() {
       // main = new AirScreen(main);
       System.out.println("Air button clicked");
    }
}

class SeaButton extends Button {

    SeaButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color);
    }

    @Override
    public void onPress() {
       // main = new SeaScreen(main);
       System.out.println("Sea button clicked");

    }
}
