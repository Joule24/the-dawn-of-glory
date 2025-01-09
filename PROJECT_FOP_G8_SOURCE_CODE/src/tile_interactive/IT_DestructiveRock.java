package tile_interactive;

import java.awt.Color ;

import entity.Entity ;
import java.util.Random;
import main.GamePanel ;
import object.OBJ_Coin_Bronze;
import object.OBJ_Heart;
import object.OBJ_ManaCrystal;

import entity.Entity;
import java.awt.Color;
import main.GamePanel;
import monster.MON_RedSlime;
import object.OBJ_Key;
import object.OBJ_Potion_Red;


public class IT_DestructiveRock extends InteractiveTile {
    GamePanel gp;
    
    public IT_DestructiveRock(GamePanel gp, int col, int row) {
        super(gp, col, row);
        this.gp = gp;
        
        this.worldX = gp.tileSize * col;
        this.worldY = gp.tileSize * row;
        
        down1 = setup("/tiles_interactive/bigrock", gp.tileSize, gp.tileSize);
        destructible = true;
        life = 3;
        
    }
    
    public boolean isCorrectItem (Entity entity) {
        boolean isCorrectItem = false;
        if(entity.currentWeapon.type == type_pickaxe) {
            isCorrectItem = true;
        }
        return isCorrectItem;
    }
    
    public void playSE() {
        gp.playSE(20);
    }
    
    public InteractiveTile getDestroyedForm() {
        
        checkDrop();
        InteractiveTile tile = null ;
        return tile;
    }
    
    public Color getParticleColor() {
        Color color = new Color(65, 65, 65);
        return color;
    }
    
    public int getParticleSize() {
        int size = 6;
        return size;
    }
    
    public int getParticleSpeed() {
        int speed = 1;
        return speed;
    }
    
    public int getParticleMaxLife() {
        int maxLife = 20;
        return maxLife;
    }
    
    public void checkDrop() {
        
        int i = new Random().nextInt(100) + 1;

        if (i < 70) {
            dropMonster(new MON_RedSlime(gp));
        }
        if (i >= 70 && i < 85) {
            dropItem(new OBJ_Heart(gp));
        }
        if (i >= 85 && i < 100) {
            dropItem(new OBJ_ManaCrystal(gp));
        }
    }
}


