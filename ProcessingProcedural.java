import processing.core.PApplet;
public class ProcessingProcedural extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
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




    public static void main (String[] args){
        PApplet.main("ProcessingProcedural",args);

    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {

        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();


    }

   private void drawCircle1() {
        ellipse(ball_1_x_position,ball_1_y_position, DIAMETER, DIAMETER);
        ball_1_x_position=ball_1_x_position+ball_1_speed;

    }
    private void drawCircle2() {
        ellipse(ball_2_x_position,ball_2_y_position, DIAMETER, DIAMETER);
        ball_2_x_position=ball_2_x_position+ball_2_speed;

    }
    private void drawCircle3() {
        ellipse(ball_3_x_position,ball_3_y_position, DIAMETER, DIAMETER);
        ball_3_x_position=ball_3_x_position+ball_3_speed;

    }
    private void drawCircle4() {
        ellipse(ball_4_x_position,ball_4_y_position, DIAMETER, DIAMETER);
        ball_4_x_position=ball_4_x_position+ball_4_speed;

    }


}
