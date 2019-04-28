import processing.core.PApplet;

import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;
import java.lang.reflect.Array;


public class MainApp extends PApplet {
    private int[][] board;

    public static void main(String[] args) {
        PApplet.main("MainApp", args);


    }


    public void settings() {
        size(640, 360);
    }

    public void setup() {
        background(102);
//        fill(100,255,100);
//        rect(0,0,80,40);
//        textSize(12);
//        fill(0);
//        text("Reset Eraser", 3,20);
//        fill(0);
    }

    public void draw() {
//        count++;
//        stroke(255);
//
//
//        if (mousePressed) {
//            strokeWeight(2);
//            stroke(0);
//            line(mouseX, mouseY, pmouseX, pmouseY);
//            if(mouseX <= 80 && mouseY <= 40){
//                lineSize = 1;
//            }
//        }
//        if (keyPressed ) {
//            print("keyPressed", key, "\n");
//            if (key == 'x' && count % 2 == 0) {
//                lineSize++;
//            } else if (key == 'z' && count % 2 == 0) {
//                lineSize--;
//                if (lineSize <= 0) {
//                    lineSize = 0;
//                }
//            }
//            stroke(102);
//            strokeWeight(lineSize);
//            line(mouseX, mouseY, pmouseX, pmouseY);

        }
    }



