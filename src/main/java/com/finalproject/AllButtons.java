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

    //constants to identify specific buttons by index numbers
    //this sets the index numbers:
    public static final int airButton = 0; //declare button for air
    public static final int  seaButton = 1; //declare button for sea
    public static final int  boatButton = 2; //declare button for boat
    public static final int  inWaterButton = 3; //declare button for InWater
    public static final int  islandButton = 4; //declare button for island
    public static final int  fallingButton = 5; //declare button for falling
    public static final int  flyingButton = 6; //declare button for flying
    public static final int  drowningButton = 7; //declare button for drowning
    public static final int  swimmingButton = 8; //declare button for swimming
    public static final int  strandedButton = 9; //declare stranded button
    public static final int vacayButton = 10; //delcare vacation button
    public static final int choppyButton = 11; //declare choppy waters button
    public static final int calmButton = 12; //declare calm waters button
    public static final  int backButton = 13; //declare back button

    //list to store all button instances
    ArrayList<NodeButton> allButtons; 

    //constructor
    AllButtons(Main main, float centerX, float centerY, float buttonWidth, float buttonHeight, int color) {
        float buttonSpacing = 50; //set button spacing
        
        //initialize all buttons with positions, dimensions, and labels
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
            new NodeButton(main, "Vacation", centerX + buttonSpacing + 50, centerY - 270, buttonWidth * 2, buttonHeight + 20, color),

            new NodeButton(main, "Choppy Waters", centerX - buttonSpacing - 150, centerY - 270, buttonWidth * 2, buttonHeight + 20, color),
            new NodeButton(main, "Calm Waters", centerX + buttonSpacing + 150, centerY - 270, buttonWidth * 2, buttonHeight + 20, color),
        
            new NodeButton(main, "Back to Start", 100, 1000, buttonWidth, buttonHeight, 0)    }; 

            //store all buttons in an arraylist
            allButtons = new ArrayList<>(Arrays.asList(buttons));
     

    }

    //links a button to a dream node and the dream tree for interaction/handling
    public void setupButton(DreamTree tree, DreamNode node, int i)
    {
        allButtons.get(i).setNodeAndTree(node, tree); //associate button with corresponding node and place in the tree
        
    }

    //handle mousepressed for all buttons
    public void mousePressed(float mouseX, float mouseY) {
        //call mousepressed on all buttons
        for (NodeButton button : allButtons) {
            button.mousePressed(mouseX, mouseY);
        }

    }

    //get specific button by its index
    public NodeButton getButton(int i) {
        return allButtons.get(i); //return button via index
    }


}