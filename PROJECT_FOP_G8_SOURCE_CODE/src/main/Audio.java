package main;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Audio {
    
    Clip clip;
    URL soundURL[] = new URL[30];
    FloatControl fc;
    int volumeScale = 3;
    float volume;
    
    public Audio(){
        
        //audio must be in wav file sized 16 bits
        //access audio and their locations here
        soundURL[0] = getClass().getResource("/res/audio/ingame.wav");
        soundURL[1] = getClass().getResource("/res/audio/pickup_coin.wav");
        soundURL[2] = getClass().getResource("/res/audio/power_up.wav");
        soundURL[3] = getClass().getResource("/res/audio/door.wav");
        soundURL[4] = getClass().getResource("/res/audio/victory.wav");
        soundURL[5] = getClass().getResource("/res/audio/hitmonster.wav");
        soundURL[6] = getClass().getResource("/res/audio/receivedamage.wav");
        soundURL[7] = getClass().getResource("/res/audio/swingingstick.wav");
        soundURL[8] = getClass().getResource("/res/audio/levelup.wav");
        soundURL[9] = getClass().getResource("/res/audio/cursor.wav");
        soundURL[10] = getClass().getResource("/res/audio/burning.wav");
        soundURL[11] = getClass().getResource("/res/audio/cuttree.wav");
        soundURL[12] = getClass().getResource("/res/audio/gameover.wav");
        soundURL[13] = getClass().getResource("/res/audio/transitional_swipe.wav"); // in video = stairs
        soundURL[14] = getClass().getResource("/res/audio/sleep.wav");
        soundURL[15] = getClass().getResource("/res/audio/blocked.wav");
        soundURL[16] = getClass().getResource("/res/audio/parry.wav");
        soundURL[17] = getClass().getResource("/res/audio/speak.wav");
        soundURL[18] = getClass().getResource("/res/audio/moonlight_sonata.wav");
        soundURL[19] = getClass().getResource("/res/audio/Merchant.wav");
        soundURL[20] = getClass().getResource("/res/audio/chipwall.wav");
        soundURL[21] = getClass().getResource("/res/audio/dooropen.wav");
        soundURL[22] = getClass().getResource("/res/audio/FinalBattle.wav");
        soundURL[23] = getClass().getResource("/res/audio/TitleScreen.wav");

    }
    
    public void setFile(int i){
        
        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
            fc = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
            checkVolume();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void play(){
        clip.start();
    }
    
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void stop(){
        clip.stop();
    }
    
    public void checkVolume() {
        
        switch(volumeScale) {
            case 0: volume = -80f; break;
            case 1: volume = -20f; break;
            case 2: volume = -12f; break;
            case 3: volume = -5f; break;
            case 4: volume = 1f; break;
            case 5: volume = 6f; break;
        }
        
        fc.setValue(volume);
    }
}
