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
        DreamNode seaNode = new DreamNode(main, "Sea", 2, "FirstChoice");
        DreamNode airNode = new DreamNode(main, "Air", 2, "FirstChoice");

        ArrayList<DreamNode> nodesToAdd = new ArrayList<>();
        nodesToAdd.add(seaNode);
        nodesToAdd.add(airNode);

        root = firstChoiceNode;
        root.addNextNodes(nodesToAdd);
        currentNode = root;

    }

    Screen getCurrentScreen()
    {
        currentNode.getScreen();
    }

    //create getScreen 



}
