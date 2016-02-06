package org.usfirst.frc1073.robot16.navClasses.gameObjects;

import org.usfirst.frc1073.robot16.navClasses.Core.RegionManager;

	/*
	 * TODO Michaela - create a method to set defense types integers, 2-10
	 * Store them in integers in this class, appropriately named
	 * Create a table (in comments) assigning integer values to all defense types
	 */

	/*
	 * TODO Kyle - first thing, there are 2 units of measure stored as doubles
	 * ft.decIn - Example, 5 feet 6 inches = 5.5 feet
	 * decFeet - increments of 1/10 foot. 10 decFeet = 1 foot (provides resolution)
	 * Lets make all of these the second one, for simplicity's sake. Pretty sure
	 * ft.decIn is labeled everywhere. 
	 */
/**
	 * @author Matt
	 * 
	 * Serves to create and format all objects
	 * on the map. Will eventually interact with
	 * dashboard and to create a graphical representation
	 * of the field
	 */
public class Map{
	
	private int[][] mapArray;

	/**
	 * The initial bottom-left coordinates 
	 * of the two series of defenses (ft.decInch)
	 */
	private double defenseOffsetXFriendly = 0; //TODO
	private double defenseOffsetYFriendly = 0; //TODO
	private double defenseOffsetXOpposing = 0; //TODO
	private double defenseOffsetYOpposing = 0; //TODO
	
	/**
	 * Defense attributes (ft.decInch)
	 */
	private double defenseHeightY; //TODO
	private double defenseHeightX; //TODO

	/**
	 * Constructor for the Map
	 * 
	 * @param xLength - Should be x Length of the field (ft.decInch)
	 * @param yLength - Should be y Length of the field (ft.decInch)
	 */
	public Map(double xLength, double yLength) {
		mapArray = RegionManager.rectangleBuilder(0.0, 0.0, xLength, yLength, 0);	//Returns array for map	
	}
	/**
	 * Returns the array containing data
	 * for the entire field
	 * 
	 * @author Matt
	 * @return mapArray
	 */
	public int[][] getMapArray(){
		return mapArray;
	}

	/*
	 * Category A:
	 * 2- Portcullis
	 * 3- Cheval de Frise
	 * Category B:
	 * 4- Moat
	 * 5- Ramparts
	 * Category C:
	 * 6- Drawbridge
	 * 7- Sally Port
	 * Category D:
	 * 8- Rock Wall
	 * 9- Rough Terrain
	 * Non-Selectable
	 * 10- Low Bar
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

	public void assignDefenses(int F2, int F3, int F4, int F5, int O2, int O3, int O4, int O5)
	{
	//TODO Michaela - set this.F2 = F2 and the like
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
	 * Puts the appropriate defenses on the map array
	 * (requires they've been set first)
	 * 
	 * @param robotX
	 * @param robotY
	 */
	/*
	 * TODO Kyle - this is going to be a project. Basically,
	 * take the 10 defenses with the integer values passed
	 * in by Michaela's method, then, using the initial defense
	 * offsets and heights above, put them on the mapArray
	 */
	
	public void initializeMap(double robotX, double robotY){
		
	}


}
