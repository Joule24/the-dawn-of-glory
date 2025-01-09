package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class GameplayTime {

    private static int elapsedTime = 0;
    private static int seconds = 0;
    private static int minutes = 0;
    private static int hours = 0;
    private static boolean started = false;

    private static Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime += 1000;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
        }
    });

    public static void start() {
        if (!started) {
            started = true;
            timer.start();
        }
    }

    public static void stop() {
        if (started) {
            started = false;
            timer.stop();
        }
    }

    public static void reset() {
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        started = false;
    }

    public static String getFormattedTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    
    public static int getTotalTimeInSeconds(){
        return elapsedTime/1000;
    }
}
