/*
 * Anika Krieger
 * Nov 21
 * DreamNode class
 * Description: Represents a node in the DreamTree structure. Each node corresponds to a distinct scene or 
 *              decision point in the application. Nodes can have a parent-child relationship, a unique screen, 
 *              and associated imagery or descriptions. The class provides functionality to set screens, 
 *              manage child nodes, and traverse the tree structure.
 */

package com.finalproject;
import processing.core.PImage;

import java.util.ArrayList;

import processing.core.PApplet;

public class DreamNode {
    //variables
    PApplet main; //reference to main
    DreamNode parentNode; //parent node of this dreamnode
    ArrayList<DreamNode> childNodes; //list of child nodes tonnected to node
    String name; //name identifying the nodes
    PImage image; //background img associated with node
    String parentName = "FirstChoice"; //name of parent node
    Screen screen;  //screen associated with node

    //constructor
    public DreamNode(PApplet main, String name, int childCount, String parent_, AllButtons buttons) {
        this.main = main; //assign main processing reference
        this.name = name; //assign name of this node
        this.childNodes = new ArrayList<>(); //initialize child node list
        parentName = parent_; //assign pareent node's name

        //assign specific screens to nodes based on node name
        //these all create the screens for the nodes!!!!
        switch (name) {
            case "Swimming":
            this.screen = new SwimmingScreen(main, buttons);
            break;

            case "Falling":
            this.screen = new FallingScreen(main, buttons);
            break;

            case "Flying":
            this.screen = new FlyingScreen(main, buttons);
            break;

            case "Drowning":
            this.screen = new DrowningScreen(main, buttons);
            break;

            case "FirstChoice":
            this.screen = new FirstChoiceScreen(main, buttons);
            break;

            case "InTheWater":
            this.screen = new InWaterScreen(main, buttons);
            break;

            case "Sea" :
            this.screen = new SeaScreen(main, buttons);
            break;

            case "Air":
            this.screen = new AirScreen(main, buttons);
            break;

            case "Boat":
            this.screen = new BoatScreen(main, buttons);
            break;

            case "Island":
            this.screen = new IslandScreen(main, buttons);
            break;

            case "Stranded":
            this.screen = new StrandedScreen(main, buttons);
            break;

            case "Vacation":
            this.screen = new VacationScreen(main, buttons);
            break;

            case "Choppy Waters":
            this.screen = new ChoppyWatersScreen(main, buttons);
            break;

            case "Calm Waters":
            this.screen = new CalmWatersScreen(main, buttons);
            break;

            default: System.out.println(name+" is null") ; // Log a message if the node name is invalid

            
        } 

    }

    //load image for this node
    public void setImage(PImage img) {
        this.image = img; //assign given image to this node

    }

    //display image if available
    public void displayImage() {
        if (image != null) { //icheck if an image is set
            main.imageMode(PApplet.CORNER); //set image node to corner alignment
            main.image(image, 0, 0, main.width, main.height); //draw image to fill the screen
        }
    }

    //returns the name of the parent node
    public String getParentName() {
        return parentName;
    }

    //adds child nodes to this node by linking nodes from the list
    public void addNextNodes(ArrayList<DreamNode> nodesToAdd) {
        //loop through the list of nodes in reverse order
        for (int i = nodesToAdd.size()-1; i >=0 ; i--) {
            DreamNode node = nodesToAdd.get(i); //get current node

            //check if this node is the parent of the current node
            if (this.name.equals (node.getParentName())) {
                childNodes.add(node); //add node to this node's children
                nodesToAdd.remove(node); //remove node from the input list
                node.parentNode = this; //set node as parent of the current node
                System.out.println("Added " + node.name + " to " + this.name); //log it so i can double check its been added
            }
        }

        //if there are no more nodes to add, return
        if(nodesToAdd.size() <= 0)
        {
            return;
        }

        //recursively call addNextNodes for each child node
        for (DreamNode child : childNodes) {
                child.addNextNodes(nodesToAdd);
        }
    }

    //retrieves a child node by its name
    public DreamNode getNextNode(String name) {
        //loop thru all child nodes
        for (DreamNode child : childNodes) {
            if (child.name.equals(name)) {
                return child; //return matching child node if the child's name matches the input
            }
        }
        System.out.println("Node with name " + name + " not found among children of " + this.name);
        return null; // Return null if no child with the specified name is found
    }

    // Returns the parent node of this node
    public DreamNode getParent() {
        return parentNode;
    }

    //getter to retrieve screen associated with node
    public Screen getScreen() {
        return screen;
    }

    //retrieves the name of this node
    public String getName() {
        return name;
    }

}