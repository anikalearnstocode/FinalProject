package com.finalproject;
import java.util.ArrayList;

import processing.core.PApplet;

public class DreamTree {
    PApplet main;
    DreamNode root;
    DreamNode currentNode;

    //constructor
    public DreamTree(PApplet main) {
        this.main = main;
        createTree();
    }

    //initialize tree with sea and air categories for now
    private void createTree() {
        //DreamNode titleNode = new DreamNode(main, "Title", 1);  
        DreamNode firstChoiceNode = new DreamNode(main, "FirstChoice", 2, null);
        DreamNode seaNode = new DreamNode(main, "Sea", 3, "FirstChoice");
        DreamNode airNode = new DreamNode(main, "Air", 2, "FirstChoice");
        DreamNode boatNode = new DreamNode(main, "Boat", 2, "Sea");
        DreamNode waterNode = new DreamNode(main, "InTheWater", 2, "Sea");
        DreamNode islandNode = new DreamNode(main, "Island", 2, "Sea");
        DreamNode flyingNode = new DreamNode(main, "Flying", 2, "Air");
        DreamNode fallingNode = new DreamNode(main, "Falling", 2, "Air");


        ArrayList<DreamNode> nodesToAdd = new ArrayList<>();
        nodesToAdd.add(seaNode);
        nodesToAdd.add(airNode);
        nodesToAdd.add(boatNode);
        nodesToAdd.add(waterNode);
        nodesToAdd.add(islandNode);
        nodesToAdd.add(flyingNode);
        nodesToAdd.add(fallingNode);


        root = firstChoiceNode;
        root.addNextNodes(nodesToAdd);
        currentNode = root;

    }

    public Screen getCurrentScreen() {
        return currentNode.getScreen();
    }

}
