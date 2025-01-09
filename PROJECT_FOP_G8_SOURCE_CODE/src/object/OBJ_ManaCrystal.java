package object;

import entity.Entity;
import entity.Projectile;
import main.GamePanel;

public class OBJ_ManaCrystal extends Projectile{
    
    GamePanel gp;
    public static final String objName = "Mana Crystal " ;
    public OBJ_ManaCrystal(GamePanel gp) {
        super(gp);
        this.gp = gp;
        
        type = type_pickupOnly;
        name = objName;
        price = 200;
        description = "[Mana Crystal]\nAwaken the spirit\nwithin its possessor.";
        value = 1;
        down1 = setup("/object/manacrystal_full", gp.tileSize, gp.tileSize);
        image = setup("/object/manacrystal_full", gp.tileSize, gp.tileSize);
        image2 = setup("/object/manacrystal_blank", gp.tileSize, gp.tileSize);
    }
    public boolean use(Entity entity){
        
        gp.playSE(2);
        gp.ui.addMessage("Mana +" + value);
        entity.mana += value;
        return true;
        
    }
}
