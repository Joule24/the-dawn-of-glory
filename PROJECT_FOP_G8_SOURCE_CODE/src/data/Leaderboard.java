package data;

import java.util.ArrayList;

public class Leaderboard {
    
    public static ArrayList<Winner> winners;
    public static String[][] topFive = new String[5][3];
    public static int limit;
    
    public Leaderboard(){
        //DatabaseController.deleteRowsWithNullTime();
        
        winners = new ArrayList<Winner>();
        winners = DatabaseController.readPlayersSortedByScore();
        
        if(winners.size() <= 4){ limit = winners.size();}
        else{limit = 5;}
        settingTopFive();
    }
    
    public static void settingTopFive(){
        
        for(int i = 0; i<limit; i++){
            topFive[i][0] = winners.get(i).getName();   //fetch name
            topFive[i][1] = winners.get(i).getTime();   //fetch time
            topFive[i][2] = String.format("%06d", winners.get(i).getScore()); //fetch score
        }
    }
    
    public static void displayTopFive(){
        
        System.out.println("Game Leaderboard");
        System.out.printf("%-20s%-10s%-10s\n", "Name", "Time", "Score");
        for(int i = 0; i<limit; i++){
            for(int j = 0; j<3; j++){
                
                if(j == 0){
                    System.out.printf("%-20s", topFive[i][j]);
                }
                
                else{
                    System.out.printf("%-10s", topFive[i][j]);
                }
            }
            
            System.out.println("");
        }
    }
}
