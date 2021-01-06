package objectOriented;

import processing.core.PApplet;

public class ProcessingOOP extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    public static final Circle[] circles = new Circle[4];

    public static void main (String[] args){
        PApplet.main("objectOriented.ProcessingOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    public void initialiseCircles(){
        for (int i = 0; i < 4; i++) {
            circles[i] = new Circle(0,(i+1)*HEIGHT/5,i+1);
        }
    }

    @Override
    public void setup() {
        initialiseCircles();
    }
    public void drawCircles(){
        for (int i = 0; i < 4; i++) {
            circles[i].drawCircle(this);
        }
    }
    public void moveCircles(){
        for (int i = 0; i < 4; i++) {
            circles[i].moveCircle();

        }
    }

    @Override
    public void draw() {
        drawCircles();
        moveCircles();

    }
}
