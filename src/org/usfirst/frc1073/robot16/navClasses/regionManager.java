package org.usfirst.frc1073.robot16.navClasses;

public class regionManager {
	/**
	 * @author Matt
	 * 
	 * Establishes the base class for all coordinate-related objects
	 */
	//decInch
	int xInit = 0;
	int yInit = 0;

	public regionManager(double xStart, double yStart, double xLength, double yLength){
		// __x__* 10 create a 1/10 inch resolution for pixel positioning
		int[][]  abstractPixelChart = new int[(int)(10*xLength)][(int)(10*yLength)];
		
		xInit = (int) (10* xStart);
		yInit = (int) (10* yStart);
		
		//Nested for loops to progress pixels through a 2D array
		for(int x = (int) (xStart * 10); x < (int) (xStart * 10) + (int) (xLength * 10); x++){
			for(int y = (int) (yStart * 10); y < (int) (yStart * 10) + (int) (yLength * 10); y++){
				Pixel writer = new Pixel(x,y);
				abstractPixelChart[x][y] = writer.getState();
			}
		}
	}
}
