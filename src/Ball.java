import java.awt.*;
import java.util.TimerTask;
import javax.swing.Timer;

public class Ball {
    private int size;
    private int xPosition;
    private int yPosition;
    private int xSpeed;

    public Ball(int size, int xPosition, int yPosition, int xSpeed){
        this.size = size;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.xSpeed = xSpeed;
    }

    public void drawBall(Graphics g){
        g.setColor(Color.white);
        g.fillOval(this.xPosition, this.yPosition, this.size, this.size);
    }

    public void moveBall(){
        this.xPosition += this.xSpeed;
    }

    public int getSize() {
        return size;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int speed) {
        this.xSpeed = speed;
    }
}
