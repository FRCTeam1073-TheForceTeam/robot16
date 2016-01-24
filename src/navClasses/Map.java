package navClasses;

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
	
	public void initializeObjects(){
		//d0 = new Defense()
	}

}
