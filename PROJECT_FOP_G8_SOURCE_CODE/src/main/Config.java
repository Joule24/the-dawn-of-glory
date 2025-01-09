package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Config {
    
    GamePanel gp;
    
    public Config(GamePanel gp) {
        this.gp = gp;
    }
    
    public void saveConfig() {
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
            
            //save full screen
            if(gp.fullScreenOn == true) {
                bw.write("On");
            }
            if(gp.fullScreenOn == false) {
                bw.write("Off");
            }
            bw.newLine();
            
            //save music volume 
            bw.write(String.valueOf(gp.music.volumeScale));
            bw.newLine();
            
            //save se volume
            bw.write(String.valueOf(gp.se.volumeScale));
            bw.newLine();
            
            bw.close();
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    
    public void loadConfig() {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("config.txt"));
            
            String s = br.readLine();
            
            //load full screen
            if(s.equals("On")){
                gp.fullScreenOn = true;
            }
            if(s.equals("Off")){
                gp.fullScreenOn = false;
            }
            
            //load music volume
            s = br.readLine();
            gp.music.volumeScale = Integer.parseInt(s);
            
            //load se volume
            s = br.readLine();
            gp.se.volumeScale = Integer.parseInt(s);
            
            br.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
