// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1073.robot16.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1073.robot16.Robot;
import org.usfirst.frc1073.robot16.subsystems.DriveTrain.profiles;

/**
 *
 */
public class Drive extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public Drive() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    /***********************************************
     * 
     * Method to adjust a dead zone on joystick
     * 
     * @param mag is the magnitude of the joystick
     * 
     * @return an adjusted value based on deadZone
     * set in Robot Main
     * 
     ***********************************************/
    public double checkDeadZone(double mag) {
    	if(Math.abs(mag) <= Robot.deadZone) return 0;
    	else return mag;
    }
    
    /***************************************
     * 
     * Method to scale a joystick value.
     *    @param arg is the joystick value
     *
     ***************************************/
    private double cubicScale(double arg) {
    	return (Robot.cubicScale*arg + (1 - Robot.cubicScale) * Math.pow((double)arg, 3));
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double left = Robot.oi.driverLeftStick.getY();
    	double right = Robot.oi.driverRightStick.getY();
    	
    	left = checkDeadZone(left);
    	right = checkDeadZone(right);
    	
    	left = cubicScale(left);
    	right = cubicScale(right);
    	
    	left *= -1; // joystick readings are backwards and move methods expect positive as forward
    	right *= -1;
    	
    	if(Robot.driveTrain.getCurrentProfile() == profiles.BASIC) {
    		if(Robot.isOrientationSwitched) Robot.driveTrain.moveBasic(right, left);
    		else Robot.driveTrain.moveBasic(left, right);
    	}
    	else {
    		if(Robot.isOrientationSwitched) Robot.driveTrain.movePIDSpeed(right, left);
    		else Robot.driveTrain.movePIDSpeed(left, right);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
