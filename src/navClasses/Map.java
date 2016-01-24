package navClasses;
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
	
	/**
	 * The initial bottom-left coordinates 
	 * of the two series of defenses
	 */
	private int defenseOffsetXFriendly = 0; //TODO
	private int defenseOffsetYFriendly = 0; //TODO
	private int defenseOffsetXOpposing = 0; //TODO
	private int defenseOffsetYOpposing = 0; //TODO
	
	/**
	 * Defense attributes 
	 */
	private int defenseHeightY; //TODO
	private int defenseHeightX; //TODO

	public Map(int xStart, int yStart, int xLength, int yLength) {
		super(xStart, yStart, xLength, yLength);
	}
	/**
	 * Initializes the locations of all the defenses
	 * These shouldn't change
	 */
	public void initializeObjects(){
		d0 = new Defense(defenseOffsetXFriendly,defenseOffsetYFriendly,defenseHeightX,defenseHeightY);
		d1 = new Defense(defenseOffsetXFriendly + 1 * defenseHeightX,defenseOffsetYFriendly,defenseHeightX,defenseHeightY);
		d2 = new Defense(defenseOffsetXFriendly + 2 * defenseHeightX,defenseOffsetYFriendly,defenseHeightX,defenseHeightY);
		d3 = new Defense(defenseOffsetXFriendly + 3 * defenseHeightX,defenseOffsetYFriendly,defenseHeightX,defenseHeightY);
		d4 = new Defense(defenseOffsetXFriendly + 4 * defenseHeightX,defenseOffsetYFriendly,defenseHeightX,defenseHeightY);
		d5 = new Defense(defenseOffsetXOpposing,defenseOffsetYOpposing,defenseHeightX,defenseHeightY);
		d6 = new Defense(defenseOffsetXOpposing + 1 * defenseHeightX,defenseOffsetYOpposing,defenseHeightX,defenseHeightY);
		d7 = new Defense(defenseOffsetXOpposing + 2 * defenseHeightX,defenseOffsetYOpposing,defenseHeightX,defenseHeightY);
		d8 = new Defense(defenseOffsetXOpposing + 3 * defenseHeightX,defenseOffsetYOpposing,defenseHeightX,defenseHeightY);
		d9 = new Defense(defenseOffsetXOpposing + 4 * defenseHeightX,defenseOffsetYOpposing,defenseHeightX,defenseHeightY);
	}

}
