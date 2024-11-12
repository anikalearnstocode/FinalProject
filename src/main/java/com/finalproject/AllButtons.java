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
    public BoatButton boatButton;
    public InWaterButton inWaterButton;
    public IslandButton islandButton;

    AllButtons(PApplet main, float centerX, float centerY, float buttonWidth, float buttonHeight, int color) {
        float buttonSpacing = 50;
        
        airButton = new AirButton(main, "Air", centerX - buttonSpacing*2, centerY, buttonWidth, buttonHeight, color);
        seaButton = new SeaButton(main, "Sea", centerX + buttonSpacing*2, centerY, buttonWidth, buttonHeight, color);
        boatButton = new BoatButton(main, "Boat", centerX - 220 - buttonSpacing, centerY + 200, buttonWidth, buttonHeight, color);
        inWaterButton = new InWaterButton(main, "In The Water", centerX + 50 - buttonSpacing, centerY + 200, buttonWidth, buttonHeight, color);
        islandButton = new IslandButton(main, "Island", centerX + 220 + buttonSpacing, centerY + 200, buttonWidth, buttonHeight, color);

    }

    public void mousePressed(float mouseX, float mouseY) {
        airButton.mousePressed(mouseX, mouseY);
        seaButton.mousePressed(mouseX, mouseY);
        boatButton.mousePressed(mouseX, mouseY);
        inWaterButton.mousePressed(mouseX, mouseY);
        islandButton.mousePressed(mouseX, mouseY);

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
       Main mainApp = (Main) main;
       mainApp.setCurrentScreen(new SeaScreen(main));  // Switch to SeaScreen

    }
}

class BoatButton extends Button {

    BoatButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color);
    }

    @Override
    public void onPress() {
       System.out.println("Boat button clicked");
       Main mainApp = (Main) main;
       //mainApp.setCurrentScreen(new BoatScreen(main)); // Switch to SeaScreen

    }
}

class InWaterButton extends Button {

    InWaterButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color);
    }

    @Override
    public void onPress() {
       System.out.println("InWater button clicked");
       Main mainApp = (Main) main;
       //mainApp.setCurrentScreen(new InWaterScreen(main)); // Switch to SeaScreen

    }
}

class IslandButton extends Button {

    IslandButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color);
    }

    @Override
    public void onPress() {
       System.out.println("Island button clicked");
       Main mainApp = (Main) main;
       //mainApp.setCurrentScreen(new IslandScreen(main)); // Switch to SeaScreen

    }
}
