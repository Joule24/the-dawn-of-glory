package monster;

import entity.Entity;
import java.awt.image.BufferedImage;
import java.util.Random;
import main.GamePanel;
import object.OBJ_Coin_Bronze;
import object.OBJ_Heart;
import object.OBJ_ManaCrystal;
import object.OBJ_Rock;

public class MON_GreenSlime extends Entity{
    
    GamePanel gp;
    boolean runOnce = false;
    
    public MON_GreenSlime(GamePanel gp) {
        super(gp);
        
        this.gp = gp;
        
        type = type_monster;
        name = "Green Slime";
        defaultSpeed = 1;
        speed = defaultSpeed;
        maxLife = 10;
        life = maxLife;
        attack = 5;
        defense = 0;
        exp = 2;
        projectile = new OBJ_Rock(gp);
        
        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        
        getImage();
    }
    
    public void getImage(){
        
        up1 = setup("/monster/greenslime_down_1",gp.tileSize,gp.tileSize);
        up2 = setup("/monster/greenslime_down_2",gp.tileSize,gp.tileSize);
        down1 = setup("/monster/greenslime_down_1",gp.tileSize,gp.tileSize);
        down2 = setup("/monster/greenslime_down_2",gp.tileSize,gp.tileSize);
        left1 = setup("/monster/greenslime_down_1",gp.tileSize,gp.tileSize);
        left2 = setup("/monster/greenslime_down_2",gp.tileSize,gp.tileSize);
        right1 = setup("/monster/greenslime_down_1",gp.tileSize,gp.tileSize);
        right2 = setup("/monster/greenslime_down_2",gp.tileSize,gp.tileSize);
    }
    
    public void setAttributes(){
        maxLife = 5 + GamePanel.difficultyStackHP;
        life = maxLife;
        attack = 2 + GamePanel.difficultyStackDMG;
        defense = 0;
    }
    
    @Override
    public void setAction(){
        
        if(!runOnce) {
            setAttributes();
            runOnce = true;
        }
        
        if(onPath == true) {
            
            //Check if it stops chasing
            checkStopChasingOrNot(gp.player, 15, 100);
            
            //Search the direction to go
            searchPath(getGoalCol(gp.player), getGoalRow(gp.player));
            
        }
        else {
            
            //Check if it starts chasing
            checkStartChasingOrNot(gp.player, 5, 100);
        
            //Get a random direction
            getRandomDirection(120);
        }
    }

    @Override
    public void damageReaction(){
        
        actionLockCounter = 0;
        onPath = true;
    }
    @Override
    public void checkDrop() {
        
        //SCORE ALLOCATION
        gp.ui.addMessage("Score + " + String.valueOf((int)(20 * GamePanel.scoreMultiplier)));
        GamePanel.playerScore += 20 * GamePanel.scoreMultiplier;
        
        //CAST A DIE
        int i = new Random().nextInt(100)+1;

        //SET THE MONSTER DROP
        if(i < 50) {
            dropItem(new OBJ_Coin_Bronze(gp));
        }
        if(i >= 50 && i < 75) {
            dropItem(new OBJ_Heart(gp));
        }
        if(i >= 75 && i < 100) {
            dropItem(new OBJ_ManaCrystal(gp));
        }
    }
}
