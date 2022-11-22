import javax.swing.*;
//extend means inherit another class, multiple inheritance is not allowed in java
//a class can extend only one class to avoid ambiguity.
public class gameFrame extends JFrame {
    gameFrame() {
        gamePanel panel = new gamePanel();
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
