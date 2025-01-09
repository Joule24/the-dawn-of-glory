package data;

public class Winner {
    
    private String name;
    private int score;
    private String time;

    public Winner(String name, int score, String time) {
        this.name = name;
        this.score = score;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getTime() {
        return time;
    }
}

