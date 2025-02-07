package com.bleak.graphics.framework;

import java.awt.image.BufferedImage;

//import com.bleak.graphics.test.Animation;
import com.bleak.graphics.test.BufferedImageLoader;

public class Texture {

	SpriteSheet bs, ps, ss; //block_sheet and player_sheet
	private BufferedImage block_sheet = null;
	private BufferedImage player_sheet = null;
	private BufferedImage skies_sheet = null;
	
	public BufferedImage[] block = new BufferedImage[5];
	public BufferedImage[] player = new BufferedImage[9];
	public BufferedImage[] enemy = new BufferedImage[9];
	public BufferedImage[] sky = new BufferedImage[1];
	public BufferedImage[] coin = new BufferedImage[10];
	public BufferedImage[] explosion = new BufferedImage[3];
	public BufferedImage[] kaboom = new BufferedImage[3];
	public BufferedImage[] bullet = new BufferedImage[4];
	public BufferedImage[] water = new BufferedImage[3];
	
	
	public Texture(){
		BufferedImageLoader loader = new BufferedImageLoader();
		
		block_sheet = loader.loadImage("/block_sheet.png");
		skies_sheet = loader.loadImage("/skies_sheet.gif");
		player_sheet = loader.loadImage("/battle_city_sprite_sheet.png");
		
		bs = new SpriteSheet(block_sheet);
		ps = new SpriteSheet(player_sheet);
		ss = new SpriteSheet(skies_sheet);
		
		getTextures();
	}
	
	private void getTextures(){
		//block[0] = bs.grabImage(1, 1, 32, 32);//dirt block
		//block[1] = bs.grabImage(2, 1, 32, 32);//grass block
		
		//block[0] = ps.grabImage(17, 1, 16, 16);//dirt block
		//block[1] = ps.grabImage(17, 2, 16, 16);//grass block
				
		block[0] = ps.grabImage(33, 10, 8, 8);//concrete block
		block[1] = ps.grabImage(33, 9, 8, 8);//brick block
		block[2] = ps.grabImage(34, 10, 8, 8);//grass block
		block[3] = ps.grabImage(33, 11, 8, 8);//water block
		
		water[0] = ps.grabImage(33, 11, 8, 8);//
		water[1] = ps.grabImage(34, 11, 8, 8);// water animation
		water[2] = ps.grabImage(35, 11, 8, 8);//
		
		player[0] = ps.grabImage(1, 1, 16, 16);//player idle frame
		
		player[1] = ps.grabImage(1, 1, 16, 16);// player movement up
		player[2] = ps.grabImage(2, 1, 16, 16);//     animation
		
		player[3] = ps.grabImage(3, 1, 16, 16);// player movement left
		player[4] = ps.grabImage(4, 1, 16, 16);//     animation
		
		player[5] = ps.grabImage(5, 1, 16, 16);// player movement down
		player[6] = ps.grabImage(6, 1, 16, 16);//     animation
		
		player[7] = ps.grabImage(7, 1, 16, 16);// player movement right
		player[8] = ps.grabImage(8, 1, 16, 16);//     animation
		
	
		enemy[1] = ps.grabImage(1, 9, 16, 16);// enemy movement up
		enemy[2] = ps.grabImage(2, 9, 16, 16);//     animation
		
		enemy[3] = ps.grabImage(3, 9, 16, 16);// enemy movement left
		enemy[4] = ps.grabImage(4, 9, 16, 16);//     animation
		
		enemy[5] = ps.grabImage(5, 9, 16, 16);// enemy movement down
		enemy[6] = ps.grabImage(6, 9, 16, 16);//     animation
		
		enemy[7] = ps.grabImage(7, 9, 16, 16);// enemy movement right
		enemy[8] = ps.grabImage(8, 9, 16, 16);//     animation
		
		
		bullet[0] = ps.grabImage(41, 14, 8, 8);//
		bullet[1] = ps.grabImage(42, 14, 8, 8);// bullet different directions
		bullet[2] = ps.grabImage(43, 14, 8, 8);//        sprites
		bullet[3] = ps.grabImage(44, 14, 8, 8);//
		
		explosion[0] = ps.grabImage(17, 9, 16, 16);//
		explosion[1] = ps.grabImage(18, 9, 16, 16);// small explosion
		explosion[2] = ps.grabImage(19, 9, 16, 16);//
		
		kaboom[0] = ps.grabImage(9, 8, 32, 32);
		kaboom[1] = ps.grabImage(10, 8, 32, 32);
		
		/*
		coin[0] = bs.grabImage(1, 2, 32, 32);//
		coin[1] = bs.grabImage(2, 2, 32, 32);//
		coin[2] = bs.grabImage(3, 2, 32, 32);//
		coin[3] = bs.grabImage(4, 2, 32, 32);//
		coin[4] = bs.grabImage(5, 2, 32, 32);// coin animation
		coin[5] = bs.grabImage(6, 2, 32, 32);//
		coin[6] = bs.grabImage(1, 3, 32, 32);//
		coin[7] = bs.grabImage(2, 3, 32, 32);//
		coin[8] = bs.grabImage(3, 3, 32, 32);//
		
		sky[0] = ss.grabImage(1, 1, 958, 544);
		*/
	}
}
