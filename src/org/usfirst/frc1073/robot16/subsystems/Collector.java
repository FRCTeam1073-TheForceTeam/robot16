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

import org.usfirst.frc1073.robot16.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Collector extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController rollerMotor = RobotMap.collectorrollerMotor;
    private final SpeedController elevationMotor = RobotMap.collectorelevationMotor;
    private final DigitalInput ballSensor = RobotMap.collectorballSensor;
    private final Solenoid armExtension = RobotMap.collectorarmExtension;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	// Turns on roller (Single direction)
    
	public void rollerOn(){
		rollerMotor.set(1.0f);
	}
	
	// Turns off roller
	public void rollerOff(){
		rollerMotor.set(0);
	}
	
	// Raises collector
	public void collectorUp(){
		elevationMotor.set(1.0f);
	}
	
	// Lowers collector
	/**
	 * 
	 */
	public void collectorDown(){
		elevationMotor.set(-1.0f);
	}
	
	
	
	// Ball in robot = true
	/**
	 * Returns when a ball is in the robot.
	 * 
	 * @return true if ball is in the robot
	 *	else false
	 */
	public boolean isCollected(){
		return 
	}
	
	// Ball in robot = false
	// Ball launched = true
	
	/**
	 * 
	 * @return	true if the ball is not in the robot
	 * 	else false
	 */
	public boolean isReadyToCollect(){
		return 
	}
	
	// Ball in robot = false
	// Ball launched = false
	public boolean isFailed(){
		return false;
	}
	
	
	
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

