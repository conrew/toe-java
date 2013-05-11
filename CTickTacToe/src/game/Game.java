package game;

public interface Game {
	
	//Public Variablen
	
	//Public Methoden
	public byte 	getFieldValue(int fieldnum);
	public byte[] 	getField();
	
	public void 	setFieldValue(int fieldnum);
	public void		InterruptGame();
	public void		ListAll(byte[] gfield);
	
	public boolean 	NewGame();
	public boolean	LoadGame();
	public boolean	SaveGame();
	
	public int		getCurrentPlayer();
	public int		getGameState();

	
	//Private Variablen
	int GameState = 4;
	int CurrentPlayer = 0;
	byte[] field = new byte[9];
	
}
