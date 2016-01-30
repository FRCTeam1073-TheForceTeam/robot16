package org.usfirst.frc1073.robot16.navClasses.gameObjects;

import org.usfirst.frc1073.robot16.navClasses.Core.RegionManager;

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
	 * @param xStart - Should be 0.0
	 * @param yStart - Should be 0.0
	 * @param xLength - Should be x Length of the field (ft.decInch)
	 * @param yLength - Should be y Length of the field (ft.decInch)
	 */
	public Map(double xStart, double yStart, double xLength, double yLength) {
		mapArray = RegionManager.rectangleBuilder(xStart, yStart, xLength, yLength, 0);	//Returns array for map	
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

}
