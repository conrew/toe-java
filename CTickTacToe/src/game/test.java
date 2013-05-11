package game;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("TicTacToe - Debug Console");
		
		CGame tac = new CGame();
		System.out.println("TicTacToe Class created");
		Scanner scan = new Scanner(System.in);
		System.out.println("<Waiting for Commands - Enter help for Command List>");
	
		System.out.println("HELP - Command List:");
		System.out.println("1	-	new    - Neues Spiel emulieren");
		System.out.println("2	-	place  - Einen Zug machen (Als CurrentPlayer");
		System.out.println("3	-	abort  - Das Spiel beenden (force)");
		System.out.println("4	-	gamestate - Den Spielstatus anzeigen");
		System.out.println("5	-	current   - Den Aktuellen Player anzeigen");
		System.out.println("7	-	value   - Den Aktuellen Value anzeigen");
		System.out.println("8	-	Byte Test   - /&/%)(%&)(/&=)((&)&/(%");
		System.out.println("9	-	all   - Alle Felder anzeigen");
		
		boolean running = true;
		
		while(running = true){
		switch(scan.nextInt()){
		case 1:
			tac.NewGame();
			System.out.println("New Game Created!");
			break;
		case 2:
			System.out.println("Field ?");
			int f = scan.nextInt();
			tac.setFieldValue(f) ;
			System.out.println("Placed Succesfully");
			break;
		case 3:
			tac.InterruptGame() ;
			System.out.println("Dont Work yet!");
			break;
		case 4:
			System.out.println("GameState: "+tac.getGameState());
			break;
		case 5:
			System.out.println("Current: " + tac.getCurrentPlayer());
			break;
		case 7:
			System.out.println("Field ?");
			int ff = scan.nextInt();
			System.out.println("Value: " + tac.getFieldValue(ff));
			break;
		case 8:
			System.out.println("Byte Test Startet...");
			byte bt = 5;
			if(bt == 5){System.out.println("Test Erfolgreich");}
			break;
		case 9:
			tac.ListAll(tac.getField());
			break;
		case 10:
			tac.checkWin(tac.getField());
			break;
		default:
			System.exit(0);
		}
		}
	}

}
