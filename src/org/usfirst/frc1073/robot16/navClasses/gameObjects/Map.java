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
	
	/*
	 * Begin Defense config
	 */
	
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

	/*
	 * End Defense config
	 */
	
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
	
	public void assignDefenses(int Bl2, int Bl3, int Bl4, int Bl5, int Re2, int Re3, int Re4, int Re5)
	{
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
		
		// e.g. B1- Blue Alliance Defense 1 //
		int B1 = 10;
		int B2 = Bl2;
		int B3 = Bl3;
		int B4 = Bl4;
		int B5 = Bl5;
		int R1 = 10;
		int R2 = Re2;
		int R3 = Re3;
		int R4 = Re4;
		int R5 = Re5;
	}

}
