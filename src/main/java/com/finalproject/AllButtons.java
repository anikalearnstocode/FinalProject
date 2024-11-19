/*
 * Anika Krieger
 * Nov 11
 * Button Class
 * Description: Manages all buttons in the UI, creates buttons with specified positioning and dimensions, handles mousePressed events for all buttons
 */

 package com.finalproject;
 import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;


public class AllButtons {
    //define AllButtons class variables

    public static final int airButton = 0; //declare button for air
    public static final int  seaButton = 1; //declare button for sea
    public static final int  boatButton = 2; //declare button for boat
    public static final int  inWaterButton = 3; //declare button for InWater
    public static final int  islandButton = 4; //declare button for island
    public static final int  fallingButton = 5; //declare button for falling
    public static final int  flyingButton = 6; //declare button for flying
    public static final int  drowningButton = 7; 
    public static final int  swimmingButton = 8;
    public static final int  strandedButton = 9;
    public static final int vacayButton = 10;

    ArrayList<NodeButton> allButtons;

    //constructor
    AllButtons(PApplet main, float centerX, float centerY, float buttonWidth, float buttonHeight, int color) {
        float buttonSpacing = 50; //set button spacing
        
        //initialize all buttons
        NodeButton[] buttons =
        {   new NodeButton(main, "Air", centerX - buttonSpacing*2, centerY, buttonWidth, buttonHeight, color),
            new NodeButton(main, "Sea", centerX + buttonSpacing*2, centerY, buttonWidth, buttonHeight, color),
        
            new NodeButton(main, "Boat", centerX - 525 - buttonSpacing, centerY + 450, buttonWidth * 2, buttonHeight * 2, color),
            new NodeButton(main, "In The Water", centerX + 60 - buttonSpacing, centerY + 450, buttonWidth * 2, buttonHeight * 2, color),
            new NodeButton(main, "Island", centerX + 515 + buttonSpacing, centerY + 450, buttonWidth * 2, buttonHeight * 2, color),

            new NodeButton(main, "Falling", centerX - buttonSpacing - 540, centerY - 200, buttonWidth*2, buttonHeight*2, color),
            new NodeButton(main, "Flying", centerX + buttonSpacing*2 + 220, centerY + 140, buttonWidth*2, buttonHeight*2, color),

            new NodeButton(main, "Swimming", centerX - buttonSpacing - 380, centerY - 250, buttonWidth + 20, buttonHeight + 20, color),
            new NodeButton(main, "Drowning", centerX + buttonSpacing*2 + 330, centerY + 250, buttonWidth + 20, buttonHeight + 20, color),

            new NodeButton(main, "Stranded", centerX - buttonSpacing - 50, centerY - 270, buttonWidth * 2, buttonHeight + 20, color),
            new NodeButton(main, "Vacation", centerX + buttonSpacing + 50, centerY - 270, buttonWidth * 2, buttonHeight + 20, color) };

            allButtons = new ArrayList<>(Arrays.asList(buttons));
     

    }

    public void setupButton(DreamTree tree, DreamNode node, int i)
    {
        allButtons.get(i).setNodeAndTree(node, tree);
    }

    //handle mousepressed for all buttons
    public void mousePressed(float mouseX, float mouseY) {
        //call mousepressed on all buttons
        airButton.mousePressed(mouseX, mouseY);
        seaButton.mousePressed(mouseX, mouseY);
        boatButton.mousePressed(mouseX, mouseY);
        inWaterButton.mousePressed(mouseX, mouseY);
        islandButton.mousePressed(mouseX, mouseY);
        fallingButton.mousePressed(mouseX, mouseY);
        flyingButton.mousePressed(mouseX, mouseY);
        drowningButton.mousePressed(mouseX, mouseY);
        swimmingButton.mousePressed(mouseX, mouseY);
        vacayButton.mousePressed(mouseX, mouseY);
        strandedButton.mousePressed(mouseX, mouseY);


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
       Main mainApp = (Main) main;
       mainApp.setCurrentScreen(new InWaterScreen(main)); // Switch to SeaScreen

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
       Main mainApp = (Main) main;
       mainApp.setCurrentScreen(new IslandScreen(main)); // Switch to SeaScreen

    }
}

class FallingButton extends Button {

    FallingButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("Falling button clicked");
        Main mainApp = (Main) main;
        mainApp.setCurrentScreen(new FallingScreen(main)); // Switch to SeaScreen

    }
}


class FlyingButton extends Button {

    FlyingButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
        System.out.println("Flying button clicked");
        Main mainApp = (Main) main;
        mainApp.setCurrentScreen(new FlyingScreen(main)); // Switch to FlyingScreen

    }
}

//define button subclass
class DrowningButton extends Button {

    DrowningButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("Drowning button clicked");
       Main mainApp = (Main) main;
       mainApp.setCurrentScreen(new DrowningScreen(main)); // Switch to SeaScreen

    }
}

//define button subclass
class SwimmingButton extends Button {

    SwimmingButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("Swimming button clicked");
       Main mainApp = (Main) main;
       mainApp.setCurrentScreen(new SwimmingScreen(main)); // Switch to SeaScreen

    }
}

//define button subclass
class StrandedButton extends Button {

    StrandedButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("Stranded button clicked");
       Main mainApp = (Main) main;
       mainApp.setCurrentScreen(new StrandedScreen(main)); // Switch to SeaScreen

    }
}

//define button subclass
class VacayButton extends Button {

    VacayButton(PApplet main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call superclass constructor
    }

    @Override
    public void onPress() {
       System.out.println("Vacation button clicked");
       Main mainApp = (Main) main;
       mainApp.setCurrentScreen(new VacationScreen(main)); // Switch to SeaScreen

    }
}