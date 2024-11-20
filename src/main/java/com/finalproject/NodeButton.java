

package com.finalproject;

import processing.core.PApplet;

public class NodeButton extends Button {

    private DreamNode linkedNode;
    private DreamTree tree;
    private Main actualMain;

    public NodeButton(Main main, String label, float x, float y, float width, float height, int color) {
        super(main, label, x, y, width, height, color);
        actualMain = main;
    }

    public void setNodeAndTree(DreamNode node, DreamTree tree) {
        this.linkedNode = node;
        this.tree = tree;
    }

    @Override
    public void onPress() {
        System.out.println(label + " button clicked");
        tree.setCurrentNode(linkedNode.name); // Update the current node
        //tree.displayCurrentNode(); // Display the screen of the new node
        actualMain.setCurrentScreen(tree.getCurrentScreen());
    }
}


