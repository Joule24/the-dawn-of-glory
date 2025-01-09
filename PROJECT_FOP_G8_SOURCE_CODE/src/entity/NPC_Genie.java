package entity;

import java.awt.Rectangle;
import main.GamePanel;

public class NPC_Genie extends Entity{
    
    public NPC_Genie(GamePanel gp){
        super(gp);
        
        direction = "down";
        
        speed = 0;
        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        getImage();
        setDialogue();
    }
    
    public void getImage(){
        
        up1 = setup("/npc/genie_1",gp.tileSize,gp.tileSize);
        up2 = setup("/npc/genie_2",gp.tileSize,gp.tileSize);
        down1 = setup("/npc/genie_1",gp.tileSize,gp.tileSize);
        down2 = setup("/npc/genie_2",gp.tileSize,gp.tileSize);
        right1 = setup("/npc/genie_1",gp.tileSize,gp.tileSize);
        right2 = setup("/npc/genie_2",gp.tileSize,gp.tileSize);
        left1 = setup("/npc/genie_1",gp.tileSize,gp.tileSize);
        left2 = setup("/npc/genie_2",gp.tileSize,gp.tileSize);
    }
    
    public void setDialogue(){
        
        dialogues[0][0] = "If anything, just find me here! "; //10
        dialogues[1][0] = "To guard, press SPACE and you can also parry! "; //5
        dialogues[2][0] = "Perhaps, you're looking for Control Master! "; //0
        dialogues[3][0] = "To open inventory, press C"; //6
        dialogues[4][0] = "Then I am, Genie the person you're looking for! "; //1
        dialogues[5][0] = "To open Option Menu, press ESC"; //7
        dialogues[6][0] = "To move, press W A S D "; //2 
        dialogues[7][0] = "To pause the game, press P"; //8
        dialogues[8][0] = "To attack or interact, press Enter "; //3
        dialogues[9][0] = "To configure coordinates, press T"; //9
        dialogues[10][0] = "To throw projectile, press F"; //4
    }
    
    @Override
    public void speak(){
        
        facePlayer();
        startDialogue(this,dialogueSet);
        gp.ui.npc = this;
        
        dialogueSet++;
        
        if(dialogueSet == 11){
            dialogueSet = 0;
        }
    }
}
