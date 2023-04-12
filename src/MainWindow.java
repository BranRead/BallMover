import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        //Windows Properties
        this.setBounds(200, 200, 1000, 800);
        this.setTitle("Don't Drop the Ball!");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game(this.getWidth()/2,this.getHeight()/2);
        game.setBackground(Color.darkGray);
        this.add(game);
        game.setLayout(null);
    }
}
