package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    
    public static JFrame window;
    
    public static void main(String[] args) {
        
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("The Dawn of Glory");
        window.setIconImage(new ImageIcon("src/res/player/knight_down1.png").getImage());
        
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        
        //set to full screen
        gamePanel.config.loadConfig();
        if(gamePanel.fullScreenOn == true) {
            window.setUndecorated(true);
        }
        
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanel.setUpGame();
        gamePanel.startGameThread();
        
    }
}
