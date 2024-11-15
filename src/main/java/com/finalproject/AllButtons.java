/*
 * Anika Krieger
 * Nov 11
 * Button Class
 * Description: Manages all buttons in the UI, creates buttons with specified positioning and dimensions, handles mousePressed events for all buttons
 */

 package com.finalproject;
 import processing.core.PApplet;


public class AllButtons {
    //define AllButtons class variables

    public AirButton airButton; //declare button for air
    public SeaButton seaButton; //declare button for sea
    public BoatButton boatButton; //declare button for boat
    public InWaterButton inWaterButton; //declare button for InWater
    public IslandButton islandButton; //declare button for island

    //constructor
    AllButtons(PApplet main, float centerX, float centerY, float buttonWidth, float buttonHeight, int color) {
        float buttonSpacing = 50; //set button spacing
        
        //initialize all buttons
        airButton = new AirButton(main, "Air", centerX - buttonSpacing*2, centerY, buttonWidth, buttonHeight, color);
        seaButton = new SeaButton(main, "Sea", centerX + buttonSpacing*2, centerY, buttonWidth, buttonHeight, color);
        boatButton = new BoatButton(main, "Boat", centerX - 525 - buttonSpacing, centerY + 450, buttonWidth * 2, buttonHeight * 2, color);
        inWaterButton = new InWaterButton(main, "In The Water", centerX + 60 - buttonSpacing, centerY + 450, buttonWidth * 2, buttonHeight * 2, color);
        islandButton = new IslandButton(main, "Island", centerX + 515 + buttonSpacing, centerY + 450, buttonWidth * 2, buttonHeight * 2, color);

    }

    //handle mousepressed for all buttons
    public void mousePressed(float mouseX, float mouseY) {
        //call mousepressed on all buttons
        airButton.mousePressed(mouseX, mouseY);
        seaButton.mousePressed(mouseX, mouseY);
        boatButton.mousePressed(mouseX, mouseY);
        inWaterButton.mousePressed(mouseX, mouseY);
        islandButton.mousePressed(mouseX, mouseY);

    }
}

//define button subclass
class AirButton extends Button {

    //airbutton class constructor
    AirButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass construcor
    }

    @Override
    public void onPress() {
        System.out.println("Air button clicked"); //print message to test
        Main mainApp = (Main) main; //cast main to Main
        mainApp.setCurrentScreen(new AirScreen(main));  //switch to SeaScreen when clicked
    }
}

//define button subclass
class SeaButton extends Button {

    //seabutton class constructor
    SeaButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("Sea button clicked"); //tester line
       Main mainApp = (Main) main; //cast main to Main
       mainApp.setCurrentScreen(new SeaScreen(main));  //switch to SeaScreen when clicked

    }
}

//define button subclass
class BoatButton extends Button {

    BoatButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("Boat button clicked");
        Main mainApp = (Main) main;
        mainApp.setCurrentScreen(new BoatScreen(main)); // Switch to SeaScreen

    }
}

//define button subclass
class InWaterButton extends Button {

    InWaterButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("InWater button clicked");

       //these are commented out bc i havent made the InWaterScreen yet:

       //Main mainApp = (Main) main;
       //mainApp.setCurrentScreen(new InWaterScreen(main)); // Switch to SeaScreen

    }
}

//define button subclass
class IslandButton extends Button {

    IslandButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("Island button clicked");

       //these are commented out bc i havent made the IslandScreen yet:

       //Main mainApp = (Main) main;
       //mainApp.setCurrentScreen(new IslandScreen(main)); // Switch to SeaScreen

    }
}

// class FallingButton extends Button {

//     FallingButton(PApplet main, String label, float x, float y, float width, float height, int color) {
//         super(main, label, x, y, width, height, color); //call superclass constructor
//     }

//     @Override
//     public void onPress() {
//        System.out.println("Falling button clicked");
//         Main mainApp = (Main) main;
//         mainApp.setCurrentScreen(new FallingScreen(main)); // Switch to SeaScreen

//     }
// }
