import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 02/03/2015.
 */
public class Sierpinski extends JPanel {

    public int points;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Point point12 = new Point();
        point12.setLocation(240,0);
        Point point34 = new Point();
        point34.setLocation(0,350);
        Point point56 = new Point();
        point56.setLocation(480,350);
        g.setColor(Color.blue);
        int x = (int)Math.random()*480;
        int y = (int)Math.random()*480;
        Point currentPoint = new Point();
        currentPoint.setLocation(x,y);
        for(int i=0;i<points;i++){
            g.drawOval((int)currentPoint.getX(),(int)currentPoint.getY(),2,2);
            int ran = ((int)(Math.random()*6))+1;
            Random random = new Random();
            float r1 = random.nextFloat();
            float g1 = random.nextFloat();
            float b1 = random.nextFloat();
            g.setColor(new Color(r1,g1,b1));
            switch(ran) {
                case 1:
                case 2:
                    currentPoint.setLocation(((currentPoint.getX() + point12.getX()) / 2), (currentPoint.getY() + point12.getY()) / 2);
                    break;
                case 3:
                case 4:
                    currentPoint.setLocation(((currentPoint.getX() + point34.getX()) / 2), (currentPoint.getY() + point34.getY()) / 2);
                    break;
                case 5:
                case 6:
                    currentPoint.setLocation(((currentPoint.getX() + point56.getX()) / 2), (currentPoint.getY() + point56.getY()) / 2);
                    break;

            }
        }

     }

    public Sierpinski(int points){
        super();
        this.points = points;
    }
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        int points = lectura.nextInt();
        Sierpinski fractal = new Sierpinski(points);
        JFrame jf = new JFrame();
        jf.setTitle("Sierpisnki Triangle");
        jf.setSize(500,500);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(fractal);


    }
}
