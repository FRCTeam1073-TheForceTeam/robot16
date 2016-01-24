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

import java.io.IOException;
import org.usfirst.frc1073.robot16.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;


/**
 *
 */
public class Vision extends Subsystem 
{

	private final static String[] GRIP_ARGS = new String[] {
	        "/usr/local/frc/JRE/bin/java", "-jar",
	        "/home/lvuser/grip.jar", "/home/lvuser/project.grip" };

	private final NetworkTable grip = NetworkTable.getTable("myContoursReport");
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new FindTarget());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void targetFound()
    {
    	//boolean isIt = false;
    	try 
    	{
            Runtime.getRuntime().exec(GRIP_ARGS);
        } catch (IOException e) 
    	{
            e.printStackTrace();
        }
    	while(true)
    	{
	    	for(double area : grip.getNumberArray("targets/area", new double[0]))
	    	{
	    		System.out.println(area);
	    	}
    	}
    	//return isIt;
    }  
}
