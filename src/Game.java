import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JPanel{
    private Ball myBall;

    private Timer timer = new Timer(100, new TimerAction());

    public Game(int xPos, int yPos){
        myBall = new Ball(50, xPos, yPos, 1);

        timer.start();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse e");
                if ((e.getX() > myBall.getxPosition()) &&
                        (e.getX() < myBall.getxPosition() + myBall.getSize()) &&
                        (e.getY() < myBall.getyPosition() + myBall.getSize()) &&
                        ((e.getY() > myBall.getyPosition()))
                ) {
                    System.out.println("This is firing");
                    if (myBall.getxSpeed() > 0) {
                        myBall.setxSpeed(-1 * (myBall.getxSpeed() + 1));
                    } else {
                        myBall.setxSpeed(-1 * (myBall.getxSpeed() - 1));
                    }
                }
            }
        });
    }

    protected  void paintComponent(Graphics g) {
        super.paintComponent(g);
        myBall.drawBall(g);
        myBall.moveBall();
    }

    public void moveEverything() {
            myBall.moveBall();
            checkCollision(myBall);
            this.repaint();
    }

    public void checkCollision(Ball myBall) {
        if(myBall.getxPosition() < 0 || (myBall.getxPosition() + myBall.getSize()) > this.getWidth()){
            timer.stop();
        }
    }

    private class TimerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            moveEverything();
        }
    }
}
