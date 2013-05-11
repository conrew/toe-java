package game2;

public class C_Toe_Game implements I_Toe_Game{
	
	//Variables
	private int GameState = 4;
	private int CurrentPlayer = 0;
	@SuppressWarnings("unused")
	private int GameID = 1000;
	private int Turns = 0;
	
	private boolean playable = false;
	
	private long TimeStart = 0;
	private long TimeEnd	= 0;
	private long PlayTime = TimeEnd - TimeStart;
	
	//private int[] field = {0,0,0,0,0,0,0,0,0};
	private int[][] field = new int[3][3];
	
	public C_Toe_Game(){
		System.out.println("C_Toe_Game aufgerufen");
	}
	
	//Methoden
	
	public boolean doTurn(int FieldY , int FieldX) { //Erledigt	
		if(playable){
		switch(FieldX){
		case 0:
		case 1:
		case 2:
			switch(FieldY){
			case 0:
			case 1:
			case 2:
				break;
			}
			break;
		default:
			System.out.println("Error");
			return false;
		}
		
		switch(CurrentPlayer){
		case 1:
			field[FieldY][FieldX] = 1;
			CurrentPlayer = 2;
			System.out.println("\t\tPlayer "+ CurrentPlayer +" done Turn");
			update();
			return true;
		case 2:
			field[FieldY][FieldX] = 2;
			CurrentPlayer = 1;
			System.out.println("\t\tPlayer " + CurrentPlayer + " done Turn");
			update();
			return true;
		default:
			System.out.println("Turn ended uncorrectly");
			return false;
		}
		}else{return false;}
		
	}
	
	private void update(){
		//Spieler 1
//		if(field[0] == 1 && field[1] == 1 && field[2] == 1){GameState = 1;System.out.println("P1 Win!");}
//		if(field[0] == 1 && field[3] == 1 && field[6] == 1){GameState = 1;System.out.println("P1 Win!");}
//		if(field[0] == 1 && field[4] == 1 && field[8] == 1){GameState = 1;System.out.println("P1 Win!");}
//		if(field[2] == 1 && field[5] == 1 && field[8] == 1){GameState = 1;System.out.println("P1 Win!");}
//		if(field[2] == 1 && field[4] == 1 && field[6] == 1){GameState = 1;System.out.println("P1 Win!");}
//		if(field[3] == 1 && field[4] == 1 && field[5] == 1){GameState = 1;System.out.println("P1 Win!");}
//		if(field[6] == 1 && field[7] == 1 && field[8] == 1){GameState = 1;System.out.println("P1 Win!");}
//		if(field[1] == 1 && field[4] == 1 && field[7] == 1){GameState = 1;System.out.println("P1 Win!");}
//		
//		//Spieler 2
//		if(field[0] == 2 && field[1] == 2 && field[2] == 2){GameState = 2;System.out.println("P2 Win!");}
//		if(field[0] == 2 && field[3] == 2 && field[6] == 2){GameState = 2;System.out.println("P2 Win!");}
//		if(field[0] == 2 && field[4] == 2 && field[8] == 2){GameState = 2;System.out.println("P2 Win!");}
//		if(field[2] == 2 && field[5] == 2 && field[8] == 2){GameState = 2;System.out.println("P2 Win!");}
//		if(field[2] == 2 && field[4] == 2 && field[6] == 2){GameState = 2;System.out.println("P2 Win!");}
//		if(field[3] == 2 && field[4] == 2 && field[5] == 2){GameState = 2;System.out.println("P2 Win!");}
//		if(field[6] == 2 && field[7] == 2 && field[8] == 2){GameState = 2;System.out.println("P2 Win!");}
//		if(field[1] == 2 && field[4] == 2 && field[7] == 2){GameState = 2;System.out.println("P2 Win!");}
		
		int wit2 = 0; 
		for(int wit = 0 ; wit < 3 ; wit++){
			//Combination 1: 
			switch(field[wit][wit2]){
			case 1:
				switch(field[wit][wit2 + 1]){
				case 1:
					switch(field[wit][wit2 + 2]){
					case 1:
						GameState = 1;
						System.out.println("Player 1 Win");
					}
				}
			}
			switch(field[wit][wit2]){
			case 2:
				switch(field[wit][wit2 + 1]){
				case 2:
					switch(field[wit][wit2 + 2]){
					case 2:
						GameState = 2;
						System.out.println("Player 2 Win");
					}
				}
			}
			
			//Combination 2:
			switch(field[wit][wit2]){
			case 1:
				switch(field[wit][wit2 + 3]){
				case 1:
					switch(field[wit][wit2 + 6]){
					case 1:
						GameState = 1;
						System.out.println("Player 1 Win");
					}
				}
			}
			switch(field[wit][wit2]){
			case 2:
				switch(field[wit][wit2 + 3]){
				case 2:
					switch(field[wit][wit2 + 6]){
					case 2:
						GameState = 2;
						System.out.println("Player 2 Win");
					}
				}
			}
			
			//Combination 3:
			switch(field[wit][wit2]){
			case 1:
				switch(field[wit][wit2 + 4]){
				case 1:
					switch(field[wit][wit2 + 8]){
					case 1:
						GameState = 1;
						System.out.println("Player 1 Win");
					}
				}
			}
			switch(field[wit][wit2]){
			case 2:
				switch(field[wit][wit2 + 4]){
				case 2:
					switch(field[wit][wit2 + 8]){
					case 2:
						GameState = 2;
						System.out.println("Player 2 Win");
					}
				}
			}
			
			//Combination 4
			switch(field[wit][wit2]){
			case 1:
				switch(field[wit][wit2 + 3]){
				case 1:
					switch(field[wit][wit2 + 6]){
					case 1:
						GameState = 1;
						System.out.println("Player 1 Win");
					}
				}
			}
			switch(field[wit][wit2]){
			case 2:
				switch(field[wit][wit2 + 3]){
				case 2:
					switch(field[wit][wit2 + 6]){
					case 2:
						GameState = 2;
						System.out.println("Player 2 Win");
					}
				}
			}
		}
		
		switch(GameState){
		case 1:
		case 2:
		case 3:
			TimeEnd = System.currentTimeMillis();
			playable = false;
			break;
		default:
			playable = true;
		
		}
	}
	
	public boolean revokeTurn(int FieldX , int FieldY) {	
		// TODO Auto-generated method stub
		return false;
	}

	//Create New Game
	public boolean NewGame() { //Erledigt
		if(playable == false){
		switch(GameState){
		case 4:				//Kein Spiel
		case 2:				//Spieler 2 gewinnt
		case 1:				//Spieler 1 gewinnt
		case 3:				//Unentschieden
			
			//Feld zurücksetzen
			for(int fi = 0; fi < 2 ; fi++){
				field[fi][0] = 0;
				field[fi][1] = 0;
				field[fi][2] = 0;
			}
			
			//Zufalls zahlen
			CurrentPlayer = (int)(Math.random()*2 + 1);
			GameID = (int)(Math.random()*1000 + 1);
			TimeStart = System.currentTimeMillis();
			playable = true;
			return true;
			
		default:
			System.out.println("Game could not be created! Error");
			return false;
		}
		}else{return false;}
	}

	
	public boolean NewGame(int GameIDU) { //Erledigt
		if(playable = false){
		switch(GameState){
		case 4:				//Kein Spiel
		case 2:				//Spieler 2 gewinnt
		case 1:				//Spieler 1 gewinnt
		case 3:				//Unentschieden
			
			//Feld zurücksetzen
			for(int fi = 0; fi < 2 ; fi++){
				field[fi][0] = 0;
				field[fi][1] = 0;
				field[fi][2] = 0;
			}
			
			//Zufalls zahlen
			CurrentPlayer = (int)(Math.random()*2 + 1);
			GameID = GameIDU;
			TimeStart = System.currentTimeMillis();
			playable = true;
			return true;
			
		default:
			System.out.println("Game could not be created! Error");
			return false;
		}}else{return false;}
	}

	//Load a Game
	public boolean LoadGame() {
		// TODO Auto-generated method stub
		return false;
	}

	//Save a Game
	public boolean SaveGame() {
		// TODO Auto-generated method stub
		return false;
	}

	//Get Methoden - Erledigt
	public int getGameState() {return GameState;}
	public int getCurrentPlayer() {return CurrentPlayer;}
	public int getTurns() {return Turns;}
	public boolean getPlayable(){return playable;}
	public float getPlayTime() {return PlayTime;}
	public int[][] getField() {return field;}

}
