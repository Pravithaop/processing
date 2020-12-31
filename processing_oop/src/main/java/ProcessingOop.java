
import processing.core.PApplet;
public class ProcessingOop extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    private static final int DIAMETER = 10;

    public static  int ball_1_x_position = 0;
    public static  int ball_2_x_position = 0;
    public static  int ball_3_x_position = 0;
    public static  int ball_4_x_position = 0;
    private static final int ball_1_y_position = (1*HEIGHT)/5;
    private static final int ball_2_y_position = (2*HEIGHT)/5;
    private static final int ball_3_y_position = (3*HEIGHT)/5;
    private static final int ball_4_y_position = (4*HEIGHT)/5;
    private static final int ball_1_speed = 1;
    private static final int ball_2_speed = 2;
    private static final int ball_3_speed = 3;
    private static final int ball_4_speed = 4;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;




    public static void main (String[] args){
        PApplet.main("ProcessingOop",args);

    }

    @Override
    public void settings() {
        super.settings();


       size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1= new Ball(ball_1_x_position,ball_1_y_position,ball_1_speed);
        ball2= new Ball(ball_2_x_position,ball_2_y_position,ball_2_speed);
        ball3= new Ball(ball_3_x_position,ball_3_y_position,ball_3_speed);
        ball4 = new Ball(ball_4_x_position,ball_4_y_position,ball_4_speed);

    }

    @Override
    public void draw() {

        drawCircle(ball1);
        drawCircle(ball2);
        drawCircle(ball3);
        drawCircle(ball4);



    }

    private void drawCircle(Ball ball) {
        ellipse(ball.x_position,ball.y_position, DIAMETER, DIAMETER);
        increment_x(ball);



    }

    private void increment_x(Ball ball) {
        ball.x_position= ball.x_position+ ball.ball_speed;
    }



}
