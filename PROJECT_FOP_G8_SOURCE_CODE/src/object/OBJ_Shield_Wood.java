package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shield_Wood extends Entity{
    
    public static final String objName = "Wood Shield " ;
            
    public OBJ_Shield_Wood(GamePanel gp) {
        super(gp);
        
        type = type_shield;
        name = objName ;
        down1 = setup("/object/Shielded",gp.tileSize,gp.tileSize);
        defenseValue = 10;
        description = "[" + name + "]\nMade with wood.";
        price = 350;
    }
    
}
