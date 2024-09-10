/* 
Main.java
Author: Anika Krieger
Project Name: Hello World Project
Date: September 8
Description: Hello World project that displays a picture of Earth on a starry sky background!
 */

package com.project_example;

import processing.core.*;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.project_example.Main");
        System.out.println("Hello world project:");
    }

    public void settings()
    {
        // Change screen size from default
        size(500,500);
    }

    int numStars = 300; // Set number of stars that will be printed on screen
    PImage photo; // Variable to store image of Earth
    PImage moon; // Variable to store image of moon

    // Starting positions of Earth and moon
    float earthX = -325; // Start off-screen to the left
    float earthY = 135;  // Final Y position for Earth
    float moonX = -80;   // Start off-screen for Moon
    float moonY = 130;   // Final Y position for Moon

    public void setup()
    {
        background(0); // Set canvas background to black
        noStroke(); // Get rid of outlines on shapes

        photo = loadImage("photo.png"); // Load image from file
        photo.resize(325, 325); //Resize image so it fits on canvas
        moon = loadImage("moon.png"); // Load image from file
        moon.resize(80, 80); //Resize image so it fits on canvas

        println("Created by Anika!"); //Print "Created by Anika" to console

    }


    public void draw()
    {
        background(0);

        //STARS CLUMP
        fill(255); //Set stars size
        for (int i = 0; i < numStars; i++) 
            {
            float x = random(width); // Set random x position for each star
            float y = random(height); // Set random y position for each star
            ellipse(x, y, 3, 3);
            }
       // noLoop(); // Stop draw loop to prevent continuous redrawing of stars

        //TEXT CLUMP
        fill(255, 255, 210); //Set rectangle color
        rect(90, 58, 330, 50); //Set rectangle values
  
        textSize(50); //Set text size
        fill(0); //Set text color
        text("Hello, World!", 100, 100); //Print text String to screen, set location
          
        // Move Earth and Moon to the right
            if (earthX < 95) 
            { // Stop Earth at x=95
                earthX += 2; // Move Earth by 2 pixels per frame
            }
            if (moonX < 390) 
            { // Stop Moon at x=390
                moonX += 2; // Move Moon by 2 pixels per frame}
        
        //EARTH
        image(photo, 95, 135); // Display image of Earth  at 95, 135

        //MOON
        image(moon, 390, 130); // Display image of moon  at 350, 150

        /*
        //MOON CLUMP
        fill(150, 150, 150); // Set color to gray
        noStroke(); // No outline for the moon
        ellipse(420, 170, 60, 60); // Draw gray circle at 350, 150 with diameter 50
        
        //CRATER CLUMP
        fill(100);
        stroke(50); // Set stroke color to dark gray
        strokeWeight(2); // Set outline weight for craters
        ellipse(430, 185, 20, 20); // Draw gray crater 
        ellipse(420, 160, 15, 15); // Draw another gray crater
        ellipse(401, 180, 18, 18); // Draw another gray crater
        ellipse(402, 152, 10, 10); // Draw another gray crater
        ellipse(442, 168, 12, 12); // Draw another gray crater
        ellipse(433, 150, 9, 9); // Draw another gray crater
        */


        }
    }
}

