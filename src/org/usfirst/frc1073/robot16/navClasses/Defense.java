package org.usfirst.frc1073.robot16.navClasses;

//@author Michaela Dinman
public class Defense {

	
	//Defense ID
	private int ID = 10;
	
	//Opposing X coordinate value
	public int defense1XOpposingStart;
	public int defense2XOpposingStart;
	public int defense3XOpposingStart;
	public int defense4XOpposingStart;
	public int defense5XOpposingStart;
	
	//Friendly X coordinate value
	public int defense1XFriendlyStart;
	public int defense2XFriendlyStart;
	public int defense3XFriendlyStart;
	public int defense4XFriendlyStart;
	public int defense5XFriendlyStart;
	
	//Opposing Y coordinate value
	public int defense1YOpposingStart;
	public int defense2YOpposingStart;
	public int defense3YOpposingStart;
	public int defense4YOpposingStart;
	public int defense5YOpposingStart;
	
	//Friendly Y coordinate value
	public int defense1YFriendlyStart;
	public int defense2YFriendlyStart;
	public int defense3YFriendlyStart;
	public int defense4YFriendlyStart;
	public int defense5YFriendlyStart;
	
	//Going to be received from other class but my laptop doesn't have it sooooo...
	private int mapArray[][];
	
	/*
	 * int arrays with defense X and Y start positions. Starts with Friendly
	 * and moves to Opposing. Initialized in constructor.
	 */
	private int defenseXArray[];
	private int defenseYArray[];

	//Assigns ID to Defense object
	public Defense(int id) {
		ID = id;
		
		defense1XOpposingStart = defenseXArray[1];
		defense2XOpposingStart = defenseXArray[2];
		defense3XOpposingStart = defenseXArray[3];
		defense4XOpposingStart = defenseXArray[4];
		defense5XOpposingStart = defenseXArray[5];
		defense1XFriendlyStart = defenseXArray[6];
		defense2XFriendlyStart = defenseXArray[7];
		defense3XFriendlyStart = defenseXArray[8];
		defense4XFriendlyStart = defenseXArray[9];
		defense5XFriendlyStart = defenseXArray[10];

		defense1YOpposingStart = defenseYArray[1];
		defense2YOpposingStart = defenseYArray[2];
		defense3YOpposingStart = defenseYArray[3];
		defense4YOpposingStart = defenseYArray[4];
		defense5YOpposingStart = defenseYArray[5];
		defense1YFriendlyStart = defenseYArray[6];
		defense2YFriendlyStart = defenseYArray[7];
		defense3YFriendlyStart = defenseYArray[8];
		defense4YFriendlyStart = defenseYArray[9];
		defense5YFriendlyStart = defenseYArray[10];
	}
	/*
	 * Category A:
	 *    ID 1: Portcullis
	 *    ID 2: Cheval De Frise
	 * Category B:
	 *    ID 3: Moat
	 *    ID 4: Ramparts
	 * Category C:
	 *    ID 5: Drawbridge
	 *    ID 6: Sally Port
	 * Category D:
	 *    ID 7: Rock Wall
	 *    ID 8: Rough Terrain
	 * Non-Selectable:
	 *    ID 9: Low Bar
	 */
	
	//Returns Defense's ID
	public int getDefenseID(Defense d) {
		return ID;
	}

	/*
	 * Inserts number that correlates to IDs in the X and Y Start of Defense
	 * positions. Position count starts at Friendly 1 and moves to Opposing Low Bar
	 */
	public void selectDefense(int position, int id) {
		switch (id) {
		case 1:
			insertNums(1, position);
			break;
		case 2:
			insertNums(2, position);
			break;
		case 3:
			insertNums(3, position);
			break;
		case 4:
			insertNums(4, position);
			break;
		case 5:
			insertNums(5, position);
			break;
		case 6:
			insertNums(6, position);
			break;
		case 7:
			insertNums(7, position);
			break;
		case 8:
			insertNums(8, position);
			break;
		case 9:
			insertNums(9, position);
			break;
		default:
			System.out.println("Invalid ID. Located in selectDefense()");
			break;
		}
	}

	/*
	 * Inserts a number at each defense X and Y start coordinate. This number
	 * can be checked by the dashboard and an image (or series of pixels) can be
	 * inserted
	 */
	public void insertNums(int num, int pos) {
		switch (pos) {
		case 1:
			mapArray[defense1XOpposingStart][defense1YOpposingStart] = num;
			break;
		case 2:
			mapArray[defense2XOpposingStart][defense2YOpposingStart] = num;
			break;
		case 3:
			mapArray[defense3XOpposingStart][defense3YOpposingStart] = num;
			break;
		case 4:
			mapArray[defense4XOpposingStart][defense4YOpposingStart] = num;
			break;
		case 5:
			mapArray[defense5XOpposingStart][defense5YOpposingStart] = num;
			break;
		case 6:
			mapArray[defense1XFriendlyStart][defense1YFriendlyStart] = num;
			break;
		case 7:
			mapArray[defense2XFriendlyStart][defense2YFriendlyStart] = num;
			break;
		case 8:
			mapArray[defense3XFriendlyStart][defense3YFriendlyStart] = num;
			break;
		case 9:
			mapArray[defense4XFriendlyStart][defense4YFriendlyStart] = num;
			break;
		case 10:
			mapArray[defense5XFriendlyStart][defense5YFriendlyStart] = 0;
			break;
		default:
			System.out.println("Invalid position. Located in insertNums()");
			break;
		}
	}
	
	public void display(){
		/*
		 * Check each defense X and Y position on field
		 * if 1, put Defense 1
		 * nested switch statements..?
		 */
		for (int i = 0; i > defenseXArray.length; i++)
		switch(mapArray[i][i]){
		case 1:
			//make it pattern 1
			break;
		case 2:
			//make it pattern 2
			break;
		case 3:
			//make it pattern 3
			break;
		case 4:
			//etc
			break;
		case 5:
			//etc
			break;
		case 6:
			//etc
			break;
		case 7:
			//etc
			break;
		case 8:
			//etc
			break;
		case 9:
			//etc
			break;
		default:
			System.out.println("Invalid position. Located in display()");
			break;
		}
		
	}

}
