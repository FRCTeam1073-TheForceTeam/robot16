
// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc1073.robot16.subsystems;

import org.usfirst.frc1073.robot16.commands.NavManager;
import org.usfirst.frc1073.robot16.navClasses.Map;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Navigation extends Subsystem {

	private double mapLengthX; // TODO Should be constant
	private double mapLengthY; // TODO Should be constant
	Map gameMap;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	/**
	 * 
	 * Makes the map object that holds game regions, the first time
	 * 
	 * @author Matt
	 * 
	 * @param robotStartX
	 *            - 1/10 foot
	 * @param robotStartY
	 *            - 1/10 foot
	 * @param F2
	 *            - Friendly defense 2
	 * @param F3
	 *            - Friendly defense 3
	 * @param F4
	 *            - Friendly defense 4
	 * @param F5
	 *            - Friendly defense 5
	 * @param O2
	 *            - Opposing defense 2
	 * @param O3
	 *            - Opposing defense 3
	 * @param O4
	 *            - Opposing defense 4
	 * @param O5
	 *            - Opposing defense 5
	 */
	public void initializeMap(double robotStartX, double robotStartY, int F2, int F3, int F4, int F5, int O2, int O3,
			int O4, int O5) {
		//gameMap = new Map(mapLengthX, mapLengthY);
		
		gameMap.initializeMap(robotStartX, robotStartY);
	}

	/**
	 * Changes the map to reflect the robot's change in position
	 * 
	 * @author Matt
	 * @param xDistance
	 * @param yDistance
	 */
	public void updateMap(int xDistance, int yDistance) {
		gameMap.updateRobotPosition(xDistance, yDistance);

	}
	
	

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		setDefaultCommand(new NavManager());

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
