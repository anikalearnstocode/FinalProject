package com.finalproject;
import processing.core.PImage;

import java.util.ArrayList;

import processing.core.PApplet;

public class DreamNode {
    //variables
    PApplet main;
    DreamNode parentNode;
    ArrayList<DreamNode> childNodes;
    String name;
    PImage image;
    String description;
    String parentName = "FirstChoice";

    //constructor
    public DreamNode(PApplet main, String name, int childCount, String parent_) {
        this.main = main;
        this.name = name;
        this.childNodes = new ArrayList<>();
        parentName = parent_;
    }

    //load image for this node
    public void setImage(PImage img) {
        this.image = img;

    }

    //display image if available
    public void displayImage() {
        if (image != null) {
            main.image(image, main.width/2, main.height/2 - 200);
        }
    }

    public String getParentName() {
        return parentName;
    }

    //add a print so you can see your tree

    public void addNextNodes(ArrayList<DreamNode> nodesToAdd) {
        for (int i = nodesToAdd.size()-1; i >=0 ; i--) {
            DreamNode node = nodesToAdd.get(i);

            if (this.name.equals (node.getParentName())) {
                childNodes.add(node);
                nodesToAdd.remove(node);
                System.out.println("Added " + node.name + " to " + this.name);
            }
        }

        if(nodesToAdd.size() <= 0)
        {
            return;
        }

        for (DreamNode child : childNodes) {
            // if (child != null) {
                child.addNextNodes(nodesToAdd);
            // }
        }
    }
}