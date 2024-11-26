/*
 * Anika Krieger
 * Nov 21
 * Dream Tree class
 * Description: Manages the structure of the dream tree. It connects DreamNode objects, handles the tree navigation, loads images for specific nodes, and manages the transitions between nodes and screens based on user input.
 */

package com.finalproject;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class DreamTree {
    //PApplet main; //reference to main app
    Main main;
    DreamNode root; //root node of the tree
    DreamNode currentNode; //current active node in the tree
    Screen currentScreen; //current screen associated with current node

    //constructor
    public DreamTree(Main main, Screen currentScreen, AllButtons buttons) {
        this.main = main; //assign main processing app
        createTree(buttons); //initialize the tree with buttons
        this.currentScreen = currentScreen; //set the current screen
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

        DreamNode swimmingNode = new DreamNode(main, "Swimming", 2, "InTheWater", buttons);
        buttons.setupButton(this,  swimmingNode, AllButtons.swimmingButton);

        DreamNode drowningNode = new DreamNode(main, "Drowning", 2, "InTheWater", buttons);
        buttons.setupButton(this,  drowningNode, AllButtons.drowningButton);

        DreamNode strandedNode = new DreamNode(main, "Stranded", 2, "Island", buttons);
        buttons.setupButton(this,  strandedNode, AllButtons.strandedButton);

        DreamNode vacationNode = new DreamNode(main, "Vacation", 2, "Island", buttons);
        buttons.setupButton(this, vacationNode, AllButtons.vacayButton);

        DreamNode choppyWaters = new DreamNode(main, "Choppy Waters", 2, "Boat", buttons);
        buttons.setupButton(this, choppyWaters, AllButtons.choppyButton);

        DreamNode calmWaters = new DreamNode(main, "Calm Waters", 2, "Boat", buttons);
        buttons.setupButton(this, calmWaters, AllButtons.calmButton);



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
        nodesToAdd.add(choppyWaters);
        nodesToAdd.add(calmWaters);


        //set up tree structure:
        root = firstChoiceNode; //set root to first choice node
        root.addNextNodes(nodesToAdd); //add all nodes to the tree
        currentNode = firstChoiceNode; //set current node to the root
        

        //load images for end nodes:
        loadNodeImages(fallingNode, "src/main/resources/data/fallingscreenbg.png");
        loadNodeImages(flyingNode, "src/main/resources/data/flyingscreenbg.png");
        loadNodeImages(drowningNode, "src/main/resources/data/drowningscreenbg.png");
        loadNodeImages(swimmingNode, "src/main/resources/data/swimmingscreenbg.png");
        loadNodeImages(swimmingNode, "src/main/resources/data/choppyboatscreen.png");
        loadNodeImages(swimmingNode, "src/main/resources/data/calmboatscreen.png");
        loadNodeImages(swimmingNode, "src/main/resources/data/strandedscreenbg.png");
        loadNodeImages(swimmingNode, "src/main/resources/data/vacayscreenbg.png");


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

    //set up the back button to travel through the tree! currently not working
    public void keyPressed() {
        if (main.key == 'p' || main.key == 'P') {
            if (currentNode != null && currentNode.getParent() != null) {
                currentNode = currentNode.getParent(); //move to parent node
                currentScreen = currentNode.getScreen(); //move to parent node's screen
                main.setCurrentScreen(currentScreen); 
                
                //figure out whether or not its working
                System.out.println("Going back to: " + currentScreen.getClass().getSimpleName());  // Print current node after back
            } else {
                System.out.println("No parent node found to go back to or you're at the root."); // Print if there is no parent
            }
        }

        // if (main.key == 'p' || main.key == 'P') {
        //     Screen previousScreen = dreamTree.getPreviousScreen();
        //     if (previousScreen != null) {
        //         dreamTree.setScreen(previousScreen);
        //     }
        // }
    }

    //get the current screen
    public Screen getCurrentScreen() {
        return currentNode.getScreen(); //return current screen
    }

    // public void setScreen(Screen screen) {
    //     currentScreen = currentNode.getScreen();
    //     main.setCurrentScreen(screen);
    // }

    //display the current node's image as the background - once this works im going to take the backgrounds out of the screen classes of Falling, Flying, Drowning, and Swimming - all the ones that are the end of the line
    public void displayCurrentNode() {
        currentNode.displayImage(); //displayimage at current node
    }

   
    //set current node
    public void setCurrentNode(String name) {
        currentNode = currentNode.getNextNode(name); //find the child node with the given name and set it as the current node
    }

}
