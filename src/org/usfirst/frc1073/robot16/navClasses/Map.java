package org.usfirst.frc1073.robot16.navClasses;

import org.usfirst.frc1073.robot16.Robot;

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
	
	//Map Dimensions
	private final double mapLengthY = 541;
	private final double mapLengthX = 266;
	
	//Robot Dimensions
	private final double robotLengthX = 28;
	private final double robotLengthY = 32;
	
	//Map array with defenses, but without robot
	private int[][] robotlessMapArray;

	//Last robot location
	private double lastX;
	private double lastY;
	
	//The initial bottom-left coordinates of the two series of defenses
	private final double defenseOffsetXFriendly = 0.0; //TODO
	private final double defenseOffsetYFriendly = 0.0; //TODO
	private final double defenseOffsetXOpposing = 0.0; //TODO
	private final double defenseOffsetYOpposing = 0.0; //TODO

	//Defense attributes
	private final double defenseHeightY = 40; //TODO
	private final double defenseHeightX = 42; //TODO

	/**
	 * Constructor for the Map
	 */
	public Map() {
		//Initializes the map with the a robot and the defenses
		initializeMap();
	}

	/**
	 * Sets up the map for the first time 
	 * with defenses and the robot position
	 */
	public void initializeMap() {
		//Creates a map array the size of the field
		mapArray = new int[(int) mapLengthX][(int) mapLengthY];

		//Adds defense regions with variables above
		addDefenses();
		
		//Establishes the base map array with defenses, but no robot
		robotlessMapArray = mapArray;
		
		//Adds robot to map array
		addItem(Robot.robotGlobalStartX, Robot.robotGlobalStartY, robotLengthX, robotLengthY, 1);
		
		//Initializes the relative last value
		lastX = Robot.robotGlobalStartX;
		lastY = Robot.robotGlobalStartY;
	}

	/**
	 * Updates the robot's position on the map. This will be called constantly
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

	
	public void addDefenses(){
		addItem(56, 160, defenseHeightX, defenseHeightY, 2);
		addItem(98, 160, defenseHeightX, defenseHeightY, 3);
		addItem(140, 160, defenseHeightX, defenseHeightY, 2);
		addItem(182, 160, defenseHeightX, defenseHeightY, 3);
		addItem(224, 160, defenseHeightX, defenseHeightY, 2);
		
		addItem(0, 340, defenseHeightX, defenseHeightY, 3);
		addItem(42, 340, defenseHeightX, defenseHeightY, 2);
		addItem(83, 340, defenseHeightX, defenseHeightY, 3);
		addItem(125, 340, defenseHeightX, defenseHeightY, 2);
		addItem(167, 340, defenseHeightX, defenseHeightY, 3);
	}
}
