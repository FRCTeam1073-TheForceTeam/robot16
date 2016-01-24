package navClasses;

public class Defense extends primitiveRegion{
	
	public Defense(int xStart, int yStart, int xLength, int yLength, int defenseID) {
		super(xStart, yStart, xLength, yLength);
		// TODO Auto-generated constructor stub
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
