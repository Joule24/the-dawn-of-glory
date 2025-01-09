package tiles;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import main.GamePanel;
import main.UtilityTool;

public class TileManager {
    
    GamePanel gp;
    public Tiles[] tiles;
    public int mapTileNum[][][];
    boolean drawPath = true;
    
    public TileManager(GamePanel gp){
        
        this.gp = gp;
        
        tiles = new Tiles[50];
        mapTileNum = new int[gp.maxMap][gp.maxWorldCol][gp.maxWorldRow];
        
        getTileImage();
        loadMap("/res/maps/worldmap.txt",0);
        loadMap("/res/maps/indoor01.txt",1);
        loadMap("/res/maps/dungeon01.txt",2);
        loadMap("/res/maps/dungeon02.txt",3);
        loadMap("/res/maps/dungeon03.txt",4);
        loadMap("/res/maps/dungeon04.txt",5);
        
    }
    
    public void getTileImage(){
        
        //add/edit tiles path
        //( index , imageName , collision ) 
        //PLACEHOLDER
        setup(0, "000", false);
        
        //PLACEHOLDER
        setup(1, "001", false);
        setup(2, "002", false);
        setup(3, "003", false);
        setup(4, "004", false);
        setup(5, "005", false);
        setup(6, "006", false);
        setup(7, "007", false);
        setup(8, "008", false);
        setup(9, "009", false);
        setup(10, "010", false);
        setup(11, "011", false);
        setup(12, "012", false);
        setup(13, "013", false);
        setup(14, "014", false);
        setup(15, "015", false);
        setup(16, "016", true);
        setup(17, "017", false);
        setup(18, "018", true);
        setup(19, "019", true);
        setup(20, "020", true);
        setup(21, "021", true);
        setup(22, "022", true);
        setup(23, "023", true);
        setup(24, "024", true);
        setup(25, "025", true);
        setup(26, "026", true);
        setup(27, "027", true);
        setup(28, "028", true);
        setup(29, "029", true);
        setup(30, "030", true);
        setup(31, "031", true);
        setup(32, "032", true);
        setup(33, "033", false);
        setup(34, "034", false);
        setup(35, "035", true);
        setup(36, "036", false);
        setup(37, "037", false);
        setup(38, "038", false);
        setup(39, "039", false);
        setup(40, "040", false);
        setup(41, "041", false);
        
        
    }
    
    public void setup(int index, String imageName, boolean collision){
        
        UtilityTool uTool = new UtilityTool();
        
        try{
            
            tiles[index] = new Tiles();
            tiles[index].image = ImageIO.read(getClass().getResource("/res/tiles/" + imageName + ".png"));
            tiles[index].image = uTool.scaledImage(tiles[index].image, gp.tileSize, gp.tileSize);
            tiles[index].collision = collision;
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void loadMap(String filePath, int map){
        
        try{
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            int col = 0;
            int row = 0;
            
            while(col < gp.maxWorldCol && row < gp.maxWorldRow){
                String line = br.readLine();
                
                while(col < gp.maxWorldCol){
                    
                    String numbers[] = line.split(" ");
                    
                    int num = Integer.parseInt(numbers[col]);
                    
                    mapTileNum[map][col][row] = num;
                    col++;
                }
                
                if(col == gp.maxWorldCol){
                    col = 0;
                    row++;
                }
            }
            
            br.close();
            
        }catch(Exception e){
            
        }
    }
    
    public void draw(Graphics2D g2){
        
        int worldCol = 0;
        int worldRow = 0;
        
        while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow){
            
            int tileNum = mapTileNum[gp.currentMap][worldCol][worldRow];
            
            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;
            
            if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
               worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
               worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
               worldY - gp.tileSize < gp.player.worldY + gp.player.screenY){
                
                g2.drawImage(tiles[tileNum].image, screenX, screenY, null);
            }
            
            g2.drawImage(tiles[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            
            
            worldCol++;
            
            if(worldCol == gp.maxWorldCol){
                worldCol = 0;
                worldRow++;
            }
        }
    }
}
