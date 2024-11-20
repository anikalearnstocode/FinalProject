package com.finalproject;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class DreamTree {
    PApplet main;
    DreamNode root;
    DreamNode currentNode;
    Screen currentScreen;

    //constructor
    public DreamTree(PApplet main, Screen currentScreen, AllButtons buttons) {
        this.main = main;
        createTree(buttons);
        this.currentScreen = currentScreen;
    }

    //initialize tree with sea and air categories for now
    private void createTree(AllButtons buttons) {
        //create initial nodes:

        //DreamNode titleNode = new DreamNode(main, "Title", 1);  
        DreamNode firstChoiceNode = new DreamNode(main, "FirstChoice", 2, null, buttons);

        DreamNode seaNode = new DreamNode(main, "Sea", 3, "FirstChoice", buttons);
        buttons.setupButton(this,  seaNode, AllButtons.seaButton);

        DreamNode airNode = new DreamNode(main, "Air", 2, "FirstChoice", buttons);
        buttons.setupButton(this,  airNode, AllButtons.airButton);

        DreamNode boatNode = new DreamNode(main, "Boat", 2, "Sea", buttons);
        buttons.setupButton(this,  boatNode, AllButtons.boatButton);

        DreamNode waterNode = new DreamNode(main, "InTheWater", 2, "Sea", buttons);
        buttons.setupButton(this,  waterNode, AllButtons.inWaterButton);

        DreamNode islandNode = new DreamNode(main, "Island", 2, "Sea", buttons);
        buttons.setupButton(this,  islandNode, AllButtons.islandButton);

        DreamNode flyingNode = new DreamNode(main, "Flying", 2, "Air", buttons);
        buttons.setupButton(this,  flyingNode, AllButtons.flyingButton);

        DreamNode fallingNode = new DreamNode(main, "Falling", 2, "Air", buttons);
        buttons.setupButton(this,  fallingNode, AllButtons.fallingButton);

        DreamNode swimmingNode = new DreamNode(main, "Swimming", 2, "Water", buttons);
        buttons.setupButton(this,  swimmingNode, AllButtons.swimmingButton);

        DreamNode drowningNode = new DreamNode(main, "Drowning", 2, "Water", buttons);
        buttons.setupButton(this,  drowningNode, AllButtons.drowningButton);

        DreamNode strandedNode = new DreamNode(main, "Stranded", 2, "Island", buttons);
        buttons.setupButton(this,  strandedNode, AllButtons.strandedButton);

        DreamNode vacationNode = new DreamNode(main, "Vacation", 2, "Island", buttons);
        buttons.setupButton(this, vacationNode, AllButtons.vacayButton);



        //add nodes to a list:
        ArrayList<DreamNode> nodesToAdd = new ArrayList<>();
        nodesToAdd.add(seaNode);
        nodesToAdd.add(airNode);
        nodesToAdd.add(boatNode);
        nodesToAdd.add(waterNode);
        nodesToAdd.add(islandNode);
        nodesToAdd.add(flyingNode);
        nodesToAdd.add(fallingNode);
        nodesToAdd.add(swimmingNode);
        nodesToAdd.add(drowningNode);
        nodesToAdd.add(vacationNode);
        nodesToAdd.add(strandedNode);



        //set up tree structure:
        root = firstChoiceNode;
        root.addNextNodes(nodesToAdd);
        currentNode = seaNode;
        //currentScreen = currentNode.getScreen();  // This updates the screen to the parent node's screen


        //load images for end nodes:
        loadNodeImages(fallingNode, "src/main/resources/data/fallingscreenbg.png");
        loadNodeImages(flyingNode, "src/main/resources/data/flyingscreenbg.png");
        loadNodeImages(drowningNode, "src/main/resources/data/drowningscreenbg.png");
        loadNodeImages(swimmingNode, "src/main/resources/data/swimmingscreenbg.png");

    }

    //load images into each node (will be used for end nodes that contain text)
    private void loadNodeImages (DreamNode node, String imagePath) {
        PImage img = main.loadImage(imagePath);
        if (img == null) {
            System.out.println("Error loading image for node: " + node.name + " with path: " + imagePath);
        } else {
            node.setImage(img);
            System.out.println("Loaded image for node: " + node.name);  // Print to check image loading
        }
    }

    //set up the back button to travel through the tree!
    public void keyPressed() {
        if (main.key == 'p' || main.key == 'P') {
            if (currentNode != null && currentNode.getParent() != null) {
                currentNode = currentNode.getParent(); //move to parent node
                currentScreen = currentNode.getScreen(); //move to parent node's screen
                //pass in a main somewhere -- then setCurrentScreen 
                
                System.out.println("Going back to: " + currentScreen.getClass().getSimpleName());  // Print current node after back
            } else {
                System.out.println("No parent node found to go back to or you're at the root."); // Print if there is no parent
            }
        }
    }

    //get the current screen
    public Screen getCurrentScreen() {
        return currentNode.getScreen();
    }

    //display the current node's image as the background - once this works im going to take the backgrounds out of the screen classes of Falling, Flying, Drowning, and Swimming - all the ones that are the end of the line
    public void displayCurrentNode() {
        currentNode.displayImage();
    }

   
    public void setCurrentNode(String name) {
        currentNode = currentNode.getNextNode(name);
    }

}
