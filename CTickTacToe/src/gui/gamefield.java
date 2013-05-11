package gui;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class gamefield extends BasicGame{

	Image kreis = null;
	Image kreuz = null;
	
	public gamefield(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
				kreis.draw(200 , 250);
				kreuz.draw(260 , 260);
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		kreis = new Image("images/ttt_kreis.png");
		kreuz = new Image("images/ttt_kreis.png");
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

}
