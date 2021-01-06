package objectOriented;


import processing.core.PApplet;

public class Circle {


    private  int xPosition;
    private  int yPosition;
    private  int speed;
    private  int diameter;

    private int PApplet;

    Circle(int xPosition, int yPosition, int speed){

        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.speed = speed;
        this.diameter = 10;
    }

    public void drawCircle(PApplet pApplet){

        pApplet.ellipse(xPosition, yPosition, diameter, diameter);

    }

    public void moveCircle(){
        this.xPosition += speed;
    }
}
