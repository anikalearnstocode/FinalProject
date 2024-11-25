/*
 * Anika Krieger
 * Nov 21, 2024
 * NodeButton Class
 * Description: Represents a specialized button that links to a DreamNode and integrates with a DreamTree.
 *              This class handles the button's initialization, interaction, and updates the current screen
 *              when clicked, reflecting the associated node's content within the DreamTree.
 */

package com.finalproject;

import processing.core.PApplet;

public class NodeButton extends Button {

    private DreamNode linkedNode; // dream node this button is linked to
    private DreamTree tree; //dreamtree managing the linked nodes and navigation
    private Main actualMain; //reference to the main application for managing screens

    //constructor
    public NodeButton(Main main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color); //call to super
        actualMain = main; //save a reference to main app
    }

    //links a dream node and a dream tree to this button, allows button to update tree's state upon interaction
    public void setNodeAndTree(DreamNode node, DreamTree tree) {
        this.linkedNode = node;
        this.tree = tree;
    }

    //called when button is pressed, updates dreamtree's current node and changes main app's current screen to reflect linked node's associated screen
    @Override
    public void onPress() {
        System.out.println(label + " button clicked"); //log button interaction
        tree.setCurrentNode(linkedNode.name); // Update the current node
        actualMain.setCurrentScreen(tree.getCurrentScreen()); //change active screen
    }

    @Override
    public void mousePressed(float mx, float my) {
        if (mx > x - width / 2 && mx < x + width / 2 && my > y - height / 2 && my < y + height / 2) {
            onPress(); //call on press if within bounds
        }

        //call dream tree's method to navigate back to the root
        if (this.label.equals("Back to Start")) {
            actualMain.dreamTree.gotoStart();
        }
    }

}


