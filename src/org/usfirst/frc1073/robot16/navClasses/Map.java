package org.usfirst.frc1073.robot16.navClasses;

/**
 * @author Nav Group
 * 
 *         Serves to create and format all objects on the map. Will eventually
 *         interact with dashboard and to create a graphical representation of
 *         the field
 */
public class Map {
	//Active map array with robot
	private int[][] mapArray;
	
	//Map array with defenses, but without robot
	private int[][] robotlessMapArray;
	
	//Robot starting location
	private double robotStartX;
	private double robotStartY;
	
	//Last robot location
	private double lastX;
	private double lastY;
	
	//The initial bottom-left coordinates of the two series of defenses
	private final double defenseOffsetXFriendly = 0.0; //TODO
	private final double defenseOffsetYFriendly = 0.0; //TODO
	private final double defenseOffsetXOpposing = 0.0; //TODO
	private final double defenseOffsetYOpposing = 0.0; //TODO

	//Defense attributes
	private final double defenseHeightY = 0.0; //TODO
	private final double defenseHeightX = 0.0; //TODO

	/**
	 * Constructor for the Map
	 * 
	 * @param xLength - Should be x Length of the field (10th's of an inch)
	 * @param yLength - Should be y Length of the field (10th's of an inch)
	 * @param robotStartX - Starting X value
	 * @param robotStartY - Starting Y value
	 */
	public Map(double xLength, double yLength, double robotStartX, double robotStartY) {
		//Saves the starting position of the robot
		this.robotStartX = robotStartX;
		this.robotStartY = robotStartY;
		
		//Initializes the map with the a robot and the defenses
		initializeMap(xLength, yLength);
	}

	/**
	 * Sets up the map for the first time
	 * 
	 * @param mapLengthX - length of map in 10th's of a foot
	 * @param mapLengthY - length of map in 10th's of a foot
	 */
	public void initializeMap(double mapLengthX, double mapLengthY) {
		//Creates a map array the size of the field
		mapArray = new int[(int) mapLengthX][(int) mapLengthY];

		//TODO Need to add defense regions with variables above
		
		//Establishes the base map array with defenses, but no robot
		robotlessMapArray = mapArray;
		
		//TODO Magic numbers, adds robot to map array
		addItem(robotStartX, robotStartY, 10, 10, 1);
		
		//Initializes the relative last value
		lastX = robotStartX;
		lastY = robotStartY;
	}

	/**
	 * Updates the robots position on the map. This will be called constantly
	 * 
	 * @param d - distance changed in x, can be + or -
	 * @param e - distance changed in y, can be + or -
	 */
	public void updateRobotPosition(double x, double y) {
		//Removes the robot from the mapArray
		mapArray = robotlessMapArray;
		
		//Updates the robots location based on the positive or negative change in position passed in
		lastX = lastX + x;
		lastY = lastY + y;
		
		//Adds the new robot, TODO Magic Numbers
		addItem(lastX, lastY, 0.3, 0.2, 1);		
	}

	public void addItem(double x, double y, double xHeight, double yHeight, int type){
		for(int xCoord = (int) (x); xCoord < ((x + xHeight)); xCoord++){
			for(int yCoord = (int) (y); yCoord < ((y + yHeight)); yCoord++){
				mapArray[xCoord][yCoord] = type;
			}
		}
	}

	/**
	 * Returns the array containing data for the entire field
	 * 
	 * @return mapArray
	 */
	public int[][] getMapArray() {
		return mapArray;
	}

}
