package org.usfirst.frc1073.robot16.navClasses;

public abstract class primitiveRegion {
	/**
	 * @author Matt
	 * 
	 * Establishes the base class for all coordinate-related objects
	 */
	
	int xInit;
	int yInit;

	public primitiveRegion(double xStart, double yStart, double xLength, double yLength){
		// __x__* 10 create a 1/10 inch resolution for pixel positioning
		int[][]  abstractPixelChart = new int[(int)(10*xLength)][(int)(10*yLength)];
		
		for(int x = (int) (xStart * 10); x < (int) (xStart * 10) + (int) (xLength * 10); x++){
			for(int y = (int) (yStart * 10); y < (int) (yStart * 10) + (int) (yLength * 10); y++){
				Pixel writer = new Pixel(x,y);
				
				
			}
		}
	}
}
