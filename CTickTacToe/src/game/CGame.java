package game;


public class CGame implements Game{
	
	int GameState;
	int CurrentPlayer;
	byte[] field = new byte[9];
	
	public CGame(){
		System.out.println("");
	}
	public byte getFieldValue(int fieldnum) {
		 
		return field[fieldnum];
	}

	public void setFieldValue(int fieldnum) {
		switch(CurrentPlayer){
		case 1:
			field[fieldnum] = 1;
			CurrentPlayer = 2;
			break;
		case 2:
			field[fieldnum] = 2;
			CurrentPlayer = 1;
			break;
		}
	}

	public void InterruptGame() {
		 
		
	}

	public boolean NewGame() {
		boolean error = false;
		//Array erstellen , CurrentPlayer , GameState ändern
		try{
		if(GameState == 4){
			//Feld befüllen
			for(int fi : field){
				field[fi] = 0;
			}
			//Zufall generation des AnfangsSpielers
			CurrentPlayer = (int)(Math.random()*2 + 1);
			GameState = 0;
		}else{return error;}
		}catch(Exception e){return error;}
		return true;
	}

	public boolean LoadGame() {
		 
		return false;
	}

	public boolean SaveGame() {
		 
		return false;
	}

	public int getCurrentPlayer() {
		 
		return CurrentPlayer;
	}

	public int getGameState() {
		 
		return 0;
	}


	public void checkWin(byte[] gfield) {
		
	//Spieler 1
	if(gfield[0] == 1 && gfield[1] == 1 && gfield[2] == 1){GameState = 1;}
	if(gfield[0] == 1 && gfield[3] == 1 && gfield[6] == 1){GameState = 1;}
	if(gfield[0] == 1 && gfield[4] == 1 && gfield[8] == 1){GameState = 1;}
	if(gfield[2] == 1 && gfield[5] == 1 && gfield[8] == 1){GameState = 1;}
	if(gfield[2] == 1 && gfield[4] == 1 && gfield[6] == 1){GameState = 1;}
	if(gfield[3] == 1 && gfield[4] == 1 && gfield[5] == 1){GameState = 1;}
	if(gfield[6] == 1 && gfield[7] == 1 && gfield[8] == 1){GameState = 1;}
	if(gfield[1] == 1 && gfield[4] == 1 && gfield[7] == 1){GameState = 1;}
	
	//Spieler 2
	if(gfield[0] == 2 && gfield[1] == 2 && gfield[2] == 2){GameState = 2;}
	if(gfield[0] == 2 && gfield[3] == 2 && gfield[6] == 2){GameState = 2;}
	if(gfield[0] == 2 && gfield[4] == 2 && gfield[8] == 2){GameState = 2;}
	if(gfield[2] == 2 && gfield[5] == 2 && gfield[8] == 2){GameState = 2;}
	if(gfield[2] == 2 && gfield[4] == 2 && gfield[6] == 2){GameState = 2;}
	if(gfield[3] == 2 && gfield[4] == 2 && gfield[5] == 2){GameState = 2;}
	if(gfield[6] == 2 && gfield[7] == 2 && gfield[8] == 2){GameState = 2;}
	if(gfield[1] == 2 && gfield[4] == 2 && gfield[7] == 2){GameState = 2;}
	
	
	
	}

	public void ListAll(byte[] gfield) {
	for(int fi : gfield){
		System.out.println(gfield[fi] + " ");
	}
		
	}

	@Override
	public byte[] getField() {	
		return field;
	}



	
}
