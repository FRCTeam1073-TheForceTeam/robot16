package navClasses;

import Library.Picture;

/**
	 * @author Matt
	 * 
	 * Serves to create and format all objects
	 * on the map. Will eventually interact with
	 * dashboard and an external picture class
	 * to create a graphical representation of the
	 * field
	 */
public class Map extends primitiveRegion{
	
	//Initializes defense objects for the known field configuration
	private Defense d0;
	private Defense d1;
	private Defense d2;
	private Defense d3;
	private Defense d4;
	private Defense d5;
	private Defense d6;
	private Defense d7;
	private Defense d8;
	private Defense d9;
	
	private double defense0 = 9, defense1 = 9, defense2 = 9, defense3 = 9, defense4 = 9, defense5 = 9, defense6 = 9, defense7 = 9, defense8 = 9, defense9 = 9;
	
	/**
	 * The initial bottom-left coordinates 
	 * of the two series of defenses
	 */
	private double defenseOffsetXFriendly = 0; //TODO
	private double defenseOffsetYFriendly = 0; //TODO
	private double defenseOffsetXOpposing = 0; //TODO
	private double defenseOffsetYOpposing = 0; //TODO
	
	/**
	 * The field Picture
	 */
	public Picture fieldPicture = new Picture();
	
	/**
	 * Defense attributes 
	 */
	private double defenseHeightY; //TODO
	private double defenseHeightX; //TODO

	public Map(double xStart, double yStart, double xLength, double yLength) {
		super(xStart, yStart, xLength, yLength);
		fieldPicture = new Picture(1 + (int) xLength,1 + (int) yLength);
		fieldPicture = initializeObjects(fieldPicture);
		
		
	}
	/**
	 * Initializes the locations of all the defenses
	 * These shouldn't change
	 * @return 
	 */
	public Picture initializeObjects(Picture fieldPicture){
		d0 = new Defense(defenseOffsetXFriendly,defenseOffsetYFriendly,defenseHeightX,defenseHeightY, defense0);
		d1 = new Defense(defenseOffsetXFriendly + 1 * defenseHeightX,defenseOffsetYFriendly,defenseHeightX,defenseHeightY, defense1);
		d2 = new Defense(defenseOffsetXFriendly + 2 * defenseHeightX,defenseOffsetYFriendly,defenseHeightX,defenseHeightY, defense2);
		d3 = new Defense(defenseOffsetXFriendly + 3 * defenseHeightX,defenseOffsetYFriendly,defenseHeightX,defenseHeightY, defense3);
		d4 = new Defense(defenseOffsetXFriendly + 4 * defenseHeightX,defenseOffsetYFriendly,defenseHeightX,defenseHeightY, defense4);
		d5 = new Defense(defenseOffsetXOpposing,defenseOffsetYOpposing,defenseHeightX,defenseHeightY, defense5);
		d6 = new Defense(defenseOffsetXOpposing + 1 * defenseHeightX,defenseOffsetYOpposing,defenseHeightX,defenseHeightY, defense6);
		d7 = new Defense(defenseOffsetXOpposing + 2 * defenseHeightX,defenseOffsetYOpposing,defenseHeightX,defenseHeightY, defense7);
		d8 = new Defense(defenseOffsetXOpposing + 3 * defenseHeightX,defenseOffsetYOpposing,defenseHeightX,defenseHeightY, defense8);
		d9 = new Defense(defenseOffsetXOpposing + 4 * defenseHeightX,defenseOffsetYOpposing,defenseHeightX,defenseHeightY, defense9);
		
		//d0
		return fieldPicture;
	}

}
