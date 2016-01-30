package org.usfirst.frc1073.robot16.navClasses;

public class Defense extends primitiveRegion{
	private double xStartLocal;
	private double yStartLocal;
	private double xLengthLocal;
	private double yLengthLocal;
	
	public Defense(double xStart, double yStart, double xLength, double yLength, double defenseID) {
		super(xStart, yStart, xLength, yLength);
		
		xStartLocal = xStart;
		yStartLocal = yStart;
		xLengthLocal = xLength;
		yLengthLocal = yLength;		
				
	}
	public Picture draw(Picture inputPic){
		//TODO inputPic = imag
		
		return inputPic;
	}
	public String getDefense(int ID)
	{
		if (ID == 0)
			return "Portcullis, Category A";
		else if (ID == 1)
			return "Cheval De Frise, Category A";
		else if (ID == 2)
			return "Moat, Category B";
		else if (ID == 3)
			return "Ramparts, Category B";
		else if (ID == 4)
			return "Drawbridge, Category C";
		else if (ID == 5)
			return "Sally Port, Category C";
		else if (ID == 6)
			return "Rock Wall, Category D";
		else if (ID == 7)
			return "Rough Terrain, Category D";
		else if (ID == 8)
			return "Low Bar, No Category, Defense Slot 1";
		else
			return "Invalid Number";
		
	}

}
