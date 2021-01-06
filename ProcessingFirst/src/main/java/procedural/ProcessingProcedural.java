package procedural;

import processing.core.PApplet;

public class ProcessingProcedural extends PApplet{

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int DIAMETER = 10;
    private static final int[] xPosition = new int[4];
    private static final int[] yPosition = new int[4];
    private static final int[] speed = new int[4];


    public static void main (String[] args) {
        PApplet.main("procedural.ProcessingProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    
    public void initializeXPosition(){
        for (int i = 0; i < 4; i++) {
            xPosition[i]=0;
            
        }
    }
    public void initialiseYPosition(){
        for (int i = 0; i < 4; i++) {
            yPosition[i]= (HEIGHT*(i+1))/5;


        }
    }
    public void initialiseSpeed(){
        for (int i = 0; i < 4; i++) {
            speed[i]=i+1;
        }
    }

    @Override
    public void setup() {
        super.setup();
        initializeXPosition();
        initialiseYPosition();
        initialiseSpeed();
    }

    public void drawCircle(){
        for (int i = 0; i < 4; i++) {
            ellipse(xPosition[i],yPosition[i], DIAMETER,DIAMETER);
        }
    }

    public void moveCircle(){
        for (int i = 0; i < 4; i++) {
            xPosition[i] += speed[i];
        }
    }

    @Override
    public void draw() {
        drawCircle();
        moveCircle();
    }
}
