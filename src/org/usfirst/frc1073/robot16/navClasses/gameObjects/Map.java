package org.usfirst.frc1073.robot16.navClasses.gameObjects;

import org.usfirst.frc1073.robot16.navClasses.Core.RegionManager;

/*
 * TODO Kyle - fix the structure to your liking. It's kind
 * of a mess, and you're working on it anyway, so 1+1=2
 */

/**
 * @author Matt
 * 
 *         Serves to create and format all objects on the map. Will eventually
 *         interact with dashboard and to create a graphical representation of
 *         the field
 */
public class Map {

	private int[][] robotlessMapArray; // Map array with defenses, but without
										// robot
	private int[][] mapArray; // Active map array with robot
	private double robotStartX;
	private double robotStartY;

	/**
	 * The initial bottom-left coordinates of the two series of defenses
	 * (ft.decInch)
	 */
	private double defenseOffsetXFriendly = 0; // TODO
	private double defenseOffsetYFriendly = 0; // TODO
	private double defenseOffsetXOpposing = 0; // TODO
	private double defenseOffsetYOpposing = 0; // TODO

	/**
	 * Defense attributes (ft.decInch)
	 */
	private double defenseHeightY; // TODO
	private double defenseHeightX; // TODO

	/**
	 * Constructor for the Map
	 * 
	 * @param xLength
	 *            - Should be x Length of the field (ft.decInch)
	 * @param yLength
	 *            - Should be y Length of the field (ft.decInch)
	 */
	public Map(double xLength, double yLength) {
		mapArray = RegionManager.rectangleBuilder(0.0, 0.0, xLength, yLength, 0); // Returns
																					// array
																					// for
																					// map
	}

	/**
	 * Returns the array containing data for the entire field
	 * 
	 * @author Matt
	 * @return mapArray
	 */
	public int[][] getMapArray() {
		return mapArray;
	}

	/*
	 * Category A: 2- Portcullis 3- Cheval de Frise Category B: 4- Moat 5-
	 * Ramparts Category C: 6- Drawbridge 7- Sally Port Category D: 8- Rock Wall
	 * 9- Rough Terrain Non-Selectable 10- Low Bar
	 */
	private int F1 = 10;
	private int F2;
	private int F3;
	private int F4;
	private int F5;
	private int O1 = 10;
	private int O2;
	private int O3;
	private int O4;
	private int O5;

	public void assignDefenses(int F2, int F3, int F4, int F5, int O2, int O3, int O4, int O5) {
		this.F1 = 10;
		this.F2 = F2;
		this.F3 = F3;
		this.F4 = F4;
		this.F5 = F5;
		this.O1 = 10;
		this.O2 = O2;
		this.O3 = O3;
		this.O4 = O4;
		this.O5 = O5;

	}

	/**
	 * Updates the robots position on the map. This will be called constantly
	 * 
	 * @author Matt
	 * @param xDistance
	 *            - distance changed in x, can be + or -
	 * @param yDistance
	 *            - distance changed in y, can be + or -
	 */
	public void updateRobotPosition(int xDistance, int yDistance) {

		RobotNav testRobot = new RobotNav(robotStartX + xDistance, robotStartY + yDistance, 1.0, 1.0, this);
		mapArray = testRobot.getMapWithRobotArray();
	}

	/**
	 * Puts the appropriate defenses on the map array (requires they've been set
	 * first)
	 * 
	 * @param robotX
	 * @param robotY
	 */
	/*
	 * TODO Kyle - this is going to be a project. Basically, take the 10
	 * defenses with the integer values passed in by Michaela's method, then,
	 * using the initial defense offsets and heights above, put them on the
	 * mapArray
	 */

	public void initializeMap(double robotX, double robotY) {
		robotStartX = robotX;
		robotStartY = robotY;
		RobotNav testRobot = new RobotNav(robotX, robotY, 1.0, 1.0, this);
		robotlessMapArray = mapArray;		
		mapArray = testRobot.getMapWithRobotArray();
	}
	
	public void addItem(double x, double y, double robotWidth, double robotHeight, int type){
		for(int xCoord = (int) (10 * x); x < (10 * (x + robotWidth)); x++){
			for(int yCoord = (int) (10 * y); y < (10 * (y + robotHeight)); y++){
				mapArray[xCoord][yCoord] = type;
			}
		}
	}

}
