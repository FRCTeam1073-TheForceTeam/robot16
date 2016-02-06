package org.usfirst.frc1073.robot16.navClasses.gameObjects;

import org.usfirst.frc1073.robot16.navClasses.Core.RegionManager;

/**
 * The class that represents the robot on the map
 * @author Matt & Kyle
 */

public class RobotNav {
	private int[][] mapArray; //Holds the imported map array
	
	
	public RobotNav(double xStart, double yStart, double robotXWidth, double robotYWidth, Map gameMap) {
		
		mapArray = gameMap.getMapArray(); //Return the array for the map
		
		for(int x = (int) (10 * xStart); x < (10 * (xStart + robotXWidth)); x++){
			for(int y = (int) (10 * yStart); y < (10 * (yStart + robotYWidth)); y++){
				mapArray[x][y] = 1;
			}
		}
	}
	
	public int[][] getMapWithRobotArray(){
		return mapArray;
	}
	
	
}
