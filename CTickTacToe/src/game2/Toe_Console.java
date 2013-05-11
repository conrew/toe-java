package game2;

import java.util.Scanner;

public class Toe_Console {

	public Toe_Console(){}
	static C_Toe_Game toe = new C_Toe_Game();
	
	public static void main(String[] args) {
		Scanner	scan = new Scanner(System.in);
		Toe_Console t = new Toe_Console();
		
		System.out.println("\t\t___________________________");
		System.out.println("\t\t|--Tic Tac Toe | Console--|");
		System.out.println("\t\t|©©©©©©©©©©©©©©©©©©©©©©©©©|");
		System.out.println("\t\t|--------Commands---------|");
		System.out.println("\t\t|---1----------New Game---|");
		System.out.println("\t\t|---2----------Do Turn----|");
		System.out.println("\t\t|---3----------CurrentP---|");
		System.out.println("\t\t|---4----------FieldData--|");
		System.out.println("\t\t|---5----------GameState--|");
		System.out.println("\t\t|©©©©©©©©©©©©©©©©©©©©©©©©©|");
		System.out.println("\t\t|_________________________|");
		while(true){
		switch(scan.nextInt()){
		case 1:
			if(toe.NewGame() == true){System.out.println("\t\tNew Game created successfully");drawGame();}
			else{System.out.println("Error");}
			break;
		case 2:
			System.out.println("\t\tEnter Value:");
			if(toe.doTurn(scan.nextInt() , scan.nextInt()) == true){System.out.println("");}
			switch(toe.getGameState()){
			case -1:
			case  4:
				drawGame();
				break;
			}
			break;
		}
		}
	}
	
	static void drawGame(){
		int[][] gamefield = toe.getField();
		System.out.println("\n\t\tGame Field:\n\t\t___________________________");
		System.out.println("\t\t|||  "+ gamefield[0][0] +"  |||  "+ gamefield[0][1] +"  |||  "+ gamefield[0][2] +"  |||\n");
		System.out.println("\t\t|||  "+ gamefield[1][0] +"  |||  "+ gamefield[1][2] +"  |||  "+ gamefield[1][2] +"  |||\n");
		System.out.println("\t\t|||  "+ gamefield[2][0] +"  |||  "+ gamefield[2][1] +"  |||  "+ gamefield[2][2] +"  |||");
		System.out.println("\t\t___________________________");
	}

}
