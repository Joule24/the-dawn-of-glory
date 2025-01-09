package main;

import data.Progress;
import entity.NPC_BigRock;
import entity.NPC_Genie;
import entity.NPC_Merchant;
import entity.NPC_OldMan;
import monster.MON_Bat;
import monster.MON_GreenSlime;
import monster.MON_Orc;
import monster.MON_RedSlime;
import monster.MON_SkeletonLord;
import object.OBJ_Axe;
import object.OBJ_BlueHeart;
import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Coin_Bronze;
import object.OBJ_Door;
import object.OBJ_Door_Iron;
import object.OBJ_Heart;
import object.OBJ_Key;
import object.OBJ_Lantern;
import object.OBJ_ManaCrystal;
import object.OBJ_Pickaxe;
import object.OBJ_Potion_Red;
import object.OBJ_Shield_Blue;
import object.OBJ_Tent;
import tile_interactive.IT_DestructibleWall;
import tile_interactive.IT_DestructiveRock;
import tile_interactive.IT_DryTree;
import tile_interactive.IT_MetalPlate;

public class AssetSetter {
    
    GamePanel gp;
    
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    
    public void setObject(){
        int i = 0;
        int mapNum = 0;
        gp.obj[mapNum][i] = new OBJ_Axe(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*33;
        gp.obj[mapNum][i].worldY = gp.tileSize*7;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*14;
        gp.obj[mapNum][i].worldY = gp.tileSize*28;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*12;
        gp.obj[mapNum][i].worldY = gp.tileSize*12;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Key(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*30;
        gp.obj[mapNum][i].worldY = gp.tileSize*29;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Tent(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*17;
        gp.obj[mapNum][i].worldY = gp.tileSize*20;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*16;
        gp.obj[mapNum][i].worldY = gp.tileSize*20;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Tent(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;

        //DEMO KIT
        gp.obj[mapNum][i] = new OBJ_Key(gp); // for debugging, give key to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
          gp.obj[mapNum][i] = new OBJ_Key(gp); // for debugging, give key to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
          gp.obj[mapNum][i] = new OBJ_Key(gp); // for debugging, give key to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Axe(gp);    // for debugging, give axe to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Pickaxe(gp);    // for debugging, give pickaxe to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Lantern(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Potion_Red(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Potion_Red(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Potion_Red(gp);    // for debugging, give coin to player
        gp.obj[mapNum][i].worldX = gp.tileSize*23;
        gp.obj[mapNum][i].worldY = gp.tileSize*22;
        i++;
        
        mapNum = 2 ;
        i = 0 ;
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Pickaxe(gp)) ;
        gp.obj[mapNum][i].worldX = gp.tileSize*40;
        gp.obj[mapNum][i].worldY = gp.tileSize*41;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp)) ;
        gp.obj[mapNum][i].worldX = gp.tileSize*13;
        gp.obj[mapNum][i].worldY = gp.tileSize*16;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp)) ;
        gp.obj[mapNum][i].worldX = gp.tileSize*26;
        gp.obj[mapNum][i].worldY = gp.tileSize*34;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp)) ;
        gp.obj[mapNum][i].worldX = gp.tileSize*27;
        gp.obj[mapNum][i].worldY = gp.tileSize*15;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp)) ;
        gp.obj[mapNum][i].worldX = gp.tileSize*18;
        gp.obj[mapNum][i].worldY = gp.tileSize*23;
        i++;
        gp.obj[mapNum][i] = new OBJ_Key(gp); // for debugging, give axe to player
        gp.obj[mapNum][i].worldX = gp.tileSize*22;
        gp.obj[mapNum][i].worldY = gp.tileSize*20;
        i++;
        
        mapNum = 3 ;
        i = 0 ;

        if (Progress.skeletonLordDefeated == false ){
                gp.obj[mapNum][i] = new OBJ_Door_Iron(gp);
                gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp)) ;
                gp.obj[mapNum][i].worldX = gp.tileSize*25;
                gp.obj[mapNum][i].worldY = gp.tileSize*15;
                i++ ;

                gp.obj[mapNum][i] = new OBJ_BlueHeart(gp);
                gp.obj[mapNum][i].worldX = gp.tileSize*25;
                gp.obj[mapNum][i].worldY = gp.tileSize*8;
                i++ ;
        }
        
        mapNum = 4 ;
        i = 0 ;
        
        gp.obj[mapNum][i] = new OBJ_Key(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*9;
        gp.obj[mapNum][i].worldY = gp.tileSize*28;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*9;
        gp.obj[mapNum][i].worldY = gp.tileSize*37;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Pickaxe(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*28;
        gp.obj[mapNum][i].worldY = gp.tileSize*21;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*34;
        gp.obj[mapNum][i].worldY = gp.tileSize*23;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*34;
        gp.obj[mapNum][i].worldY = gp.tileSize*18;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*24;
        gp.obj[mapNum][i].worldY = gp.tileSize*31;
        i++;
        
        mapNum = 5 ;
        i = 0 ;
        
        gp.obj[mapNum][i] = new OBJ_Key(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*31;
        gp.obj[mapNum][i].worldY = gp.tileSize*9;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize*9;
        gp.obj[mapNum][i].worldY = gp.tileSize*12;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Pickaxe(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*10;
        gp.obj[mapNum][i].worldY = gp.tileSize*36;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*16;
        gp.obj[mapNum][i].worldY = gp.tileSize*36;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*30;
        gp.obj[mapNum][i].worldY = gp.tileSize*31;
        i++;
        
        gp.obj[mapNum][i] = new OBJ_Chest(gp);
        gp.obj [mapNum][i].setLoot(new OBJ_Potion_Red(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize*39;
        gp.obj[mapNum][i].worldY = gp.tileSize*33;
        i++;
        
    }
    
    public void setNPC(){
        
        //MAP 0
        int mapNum = 0;
        int i = 0;
        gp.npc[mapNum][i] = new NPC_OldMan(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 21;
        gp.npc[mapNum][i].worldY = gp.tileSize * 21;
        i++;
        
        gp.npc[mapNum][i] = new NPC_Genie(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 26;
        gp.npc[mapNum][i].worldY = gp.tileSize * 16;
        i++;
        
        //MAP 1
        mapNum = 1;
        i = 0;
        gp.npc[mapNum][i] = new NPC_Merchant(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 12;
        gp.npc[mapNum][i].worldY = gp.tileSize * 7;
        i++;
        
        mapNum = 2 ;
        i = 0 ;
        
    }
    
    public void setMonster() {
        
        int mapNum = 0;
        int i = 0; 
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 23;
        gp.monster[mapNum][i].worldY = gp.tileSize * 36;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 23;
        gp.monster[mapNum][i].worldY = gp.tileSize * 42;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 24;
        gp.monster[mapNum][i].worldY = gp.tileSize * 36;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 34;
        gp.monster[mapNum][i].worldY = gp.tileSize * 42;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 38;
        gp.monster[mapNum][i].worldY = gp.tileSize * 42;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 21;
        gp.monster[mapNum][i].worldY = gp.tileSize * 38;
        i++;
        gp.monster[mapNum][i] = new MON_Orc(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 12;
        gp.monster[mapNum][i].worldY = gp.tileSize * 33;
        i++;
        
        mapNum = 2 ;
        i++ ;
        gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 34;
        gp.monster[mapNum][i].worldY = gp.tileSize * 39;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 39;
        gp.monster[mapNum][i].worldY = gp.tileSize * 26;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 28;
        gp.monster[mapNum][i].worldY = gp.tileSize * 11;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 10;
        gp.monster[mapNum][i].worldY = gp.tileSize * 19;
        i++;
        
        mapNum = 3 ;
        i++ ;
        gp.monster[mapNum][i] = new MON_SkeletonLord(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 23;
        gp.monster[mapNum][i].worldY = gp.tileSize * 16;
        
        mapNum = 4;
        i++ ;
        
        //BAT
        gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 30;
        gp.monster[mapNum][i].worldY = gp.tileSize * 36;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 37;
        gp.monster[mapNum][i].worldY = gp.tileSize * 39;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 15;
        gp.monster[mapNum][i].worldY = gp.tileSize * 35;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 27;
        gp.monster[mapNum][i].worldY = gp.tileSize * 17;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 10;
        gp.monster[mapNum][i].worldY = gp.tileSize * 20;
        i++;
        
        //OGRE
        gp.monster[mapNum][i] = new MON_Orc(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 15;
        gp.monster[mapNum][i].worldY = gp.tileSize * 24;
        i++;
        gp.monster[mapNum][i] = new MON_Orc(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 13;
        gp.monster[mapNum][i].worldY = gp.tileSize * 31;
        i++;
        gp.monster[mapNum][i] = new MON_Orc(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 34;
        gp.monster[mapNum][i].worldY = gp.tileSize * 33;
        i++;
        
        //GREEN SLIME
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 35;
        gp.monster[mapNum][i].worldY = gp.tileSize * 27;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 35;
        gp.monster[mapNum][i].worldY = gp.tileSize * 29;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 32;
        gp.monster[mapNum][i].worldY = gp.tileSize * 31;
        i++;
        
        //RED SLIME
        gp.monster[mapNum][i] = new MON_RedSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 34;
        gp.monster[mapNum][i].worldY = gp.tileSize * 28;
        i++;
        gp.monster[mapNum][i] = new MON_RedSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 27;
        gp.monster[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.monster[mapNum][i] = new MON_RedSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 24;
        gp.monster[mapNum][i].worldY = gp.tileSize * 35;
        i++;
        
        mapNum = 5;
        i++ ;
        
        //BAT
        gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 10;
        gp.monster[mapNum][i].worldY = gp.tileSize * 39;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 17;
        gp.monster[mapNum][i].worldY = gp.tileSize * 31;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 20;
        gp.monster[mapNum][i].worldY = gp.tileSize * 21;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 31;
        gp.monster[mapNum][i].worldY = gp.tileSize * 26;
        i++;
         gp.monster[mapNum][i] = new MON_Bat(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 24;
        gp.monster[mapNum][i].worldY = gp.tileSize * 14;
        i++;
        
        //OGRE
        gp.monster[mapNum][i] = new MON_Orc(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 12;
        gp.monster[mapNum][i].worldY = gp.tileSize * 14;
        i++;
        gp.monster[mapNum][i] = new MON_Orc(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 11;
        gp.monster[mapNum][i].worldY = gp.tileSize * 21;
        i++;
        gp.monster[mapNum][i] = new MON_Orc(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 35;
        gp.monster[mapNum][i].worldY = gp.tileSize * 32;
        i++;
        
        //GREEN SLIME
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 39;
        gp.monster[mapNum][i].worldY = gp.tileSize * 27;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 39;
        gp.monster[mapNum][i].worldY = gp.tileSize * 29;
        i++;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 40;
        gp.monster[mapNum][i].worldY = gp.tileSize * 24;
        i++;
        
        //RED SLIME
        gp.monster[mapNum][i] = new MON_RedSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 40;
        gp.monster[mapNum][i].worldY = gp.tileSize * 28;
        i++;
        gp.monster[mapNum][i] = new MON_RedSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 11;
        gp.monster[mapNum][i].worldY = gp.tileSize * 32;
        i++;
        gp.monster[mapNum][i] = new MON_RedSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 39;
        gp.monster[mapNum][i].worldY = gp.tileSize * 10;
    }    
    
    public void setInteractiveTile() {
        
        int mapNum = 0;
        int i = 0;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 12); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 12); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 12); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 12); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 31, 12); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 32, 12); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 33, 12); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 31, 21); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 18, 40); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 17, 40); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 16, 40); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 15, 40); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 14, 40); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 40); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 41); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 41); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 11, 41); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 41); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 40); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 25, 27); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 26, 27); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 27); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 28); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 29); i++;
        gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 30); i++;        
        
        
        mapNum = 2 ;
        i = 0 ;
        
        //WALL
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 18,30 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 17,31 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 17,32 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 17,34 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 18,34 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 18,33 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 10,22 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 10,24 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,18 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,19 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,20 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,21 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 18,13 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 18,14 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp,22,28 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp,30 , 28 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 32 , 28 ); i++;
        
        //BIG ROCK
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 20 , 25 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 11 , 18 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 23 , 14 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 23 , 13 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 24 , 14 ); i++;
        
        mapNum = 4 ;
        i = 0 ;
        
        //WALL
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 32,9 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 35,9 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,9 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,13 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,18 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,23 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,28 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,33 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 23,37 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 24,37 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 25,37 ); i++;
        
        //BIG ROCK
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 22 , 27 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 29 , 31 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 32 , 30 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 32 , 40 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 31 , 32 ); i++;
        
        mapNum = 5 ;
        i = 0 ;
        
        //WALL
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 33,9 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 34,9 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 32,10 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 33,10 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 31,11 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 32,11 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 33,11 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 31,12 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 38,13 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 37,13 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 20,35 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 37,24 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 37,28 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 39,30 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 35,30 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructibleWall (gp, 33,31 ); i++;
        
        //BIG ROCK
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 32 , 9 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 31 , 10 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 21 , 14 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 14 , 26 ); i++;
        gp.iTile[mapNum][i] = new IT_DestructiveRock(gp, 9 , 29 ); i++;
    }
}
