package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseController {
    private static final String URL = "jdbc:mysql://localhost:3306/myfopgame?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USER = "root";
    private static final String PASSWORD = "Lun@xno1";

    private String playerName;

    // Constructor to initialize with player name
    public DatabaseController(String playerName) {
        this.playerName = playerName;
    }

    // Get Database Connection
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Connection failed: " + e.getMessage());
        }
    }

    // Read all players' data
    public static void readPlayers() {
        String query = "SELECT * FROM leaderboard";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            System.out.println("Name\t\tScore\t\tTime");
            System.out.println("--------------------------------------");
            while (resultSet.next()) {
                String name = resultSet.getString("name"); // 'name' as VARCHAR
                int score = resultSet.getInt("score");     // 'score' as INT
                String time = resultSet.getString("time"); // 'time' as VARCHAR
                System.out.println(name + "\t\t" + score + "\t\t" + time);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Insert player's name
    public static void insertPlayerName(String name) {
        String query = "INSERT INTO leaderboard (name) VALUES ('" + name + "')";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Player name added: " + name + ". Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Insert player's score
    public static void insertPlayerScore(String name, int score) {
        String query = "UPDATE leaderboard SET score = " + score + " WHERE name = '" + name + "'";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Player score added for " + name + ". Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Insert player's time
    public static void insertPlayerTime(String name, String time) {
        String query = "UPDATE leaderboard SET time = '" + time + "' WHERE name = '" + name + "'";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Player time added for " + name + ". Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update a player's score
    public static void updateScore(String name, int newScore) {
        String query = "UPDATE leaderboard SET score = " + newScore + " WHERE name = '" + name + "'";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Score updated for player " + name + ". Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Update a player's time
    public static void updateTime(String name, String newTime) {
        String query = "UPDATE leaderboard SET time = '" + newTime + "' WHERE name = '" + name + "'";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Time updated for player " + name + ". Rows affected: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Winner> readPlayersSortedByScore() {
        String query = "SELECT * FROM leaderboard ORDER BY score DESC"; //or ASC for ascending order
        ArrayList<Winner> winners = new ArrayList<>();

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int score = resultSet.getInt("score");
                String time = resultSet.getString("time");
                winners.add(new Winner(name, score, time));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return winners;
    }
    
    public static void deleteRowsWithNullTime() {
        String query = "DELETE FROM leaderboard WHERE time IS NULL";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Rows with NULL time deleted: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static boolean isPlayerNameTaken(String playerName) {
        String query = "SELECT COUNT(*) FROM leaderboard WHERE name = '" + playerName + "'";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}


