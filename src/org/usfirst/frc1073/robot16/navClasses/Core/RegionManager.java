package org.usfirst.frc1073.robot16.navClasses.Core;

public class RegionManager {
	/**
	 * @author Matt
	 * 
	 * Constructs and manages 2D arrays for regions (Map/Defenses/Robot)
	 */

	/**
	 * 
	 * Return a rectangular 2D array with the value set to type
	 * 
	 * @author Matt
	 * 
	 * @param xStart - x start of array
	 * @param yStart - y start of array
	 * @param xLength - x length of array
	 * @param yLength - y length of array
	 * @param type - ID in array
	 * 
	 * @return 2D array
	 */
	public static int[][] rectangleBuilder(double xStart, double yStart, double xLength, double yLength, int type){
		// __x__* 10 create a 1/10 inch resolution for pixel positioning
		int[][]  abstractPixelChart = new int[(int)(10*xLength)][(int)(10*yLength)];

		//Nested for loops to progress pixels through a 2D array
		for(int x = (int) (xStart * 10); x < (int) (xStart * 10) + (int) (xLength * 10); x++){
			for(int y = (int) (yStart * 10); y < (int) (yStart * 10) + (int) (yLength * 10); y++){
				Pixel writer = new Pixel(x,y);
				writer.setState(type);
				abstractPixelChart[x][y] = writer.getState();
			}
		}
		return abstractPixelChart;
	}
	/**
	 * Takes the map array and adds game objects to it
	 * 
	 * @author Matt
	 * 
	 * @param mapArray - the array contained in the game map
	 * @param bumpyArray - the array for the game piece being added
	 * @param xStart - the bottom left x position for the object being added
	 * @param yStart - the bottom right y position for the object being added
	 * 
	 * @return fixed mapArray
	 */
	public static int[][] flattener(int[][] mapArray, int[][] bumpyArray, int xStart, int yStart, int xLength, int yLength){
		int xStatic = xStart;
		int yStatic = yStart;
		
		for(int x = (int) (xStart * 10); x < (int) (xStart * 10) + (int) (xLength * 10); x++){
			for(int y = (int) (yStart * 10); y < (int) (yStart * 10) + (int) (yLength * 10); y++){
				Pixel writer = new Pixel(x,y);
				mapArray[x][y] = bumpyArray[x-xStatic][y-yStatic];
			}
		}
		
		return mapArray;
	};
	
	
	
	
}
