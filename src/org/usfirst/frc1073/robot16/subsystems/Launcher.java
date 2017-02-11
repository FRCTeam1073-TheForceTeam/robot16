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

import org.usfirst.frc1073.robot16.Robot;
import org.usfirst.frc1073.robot16.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Launcher extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Encoder launcherTravelEncoder = RobotMap.launcherlauncherTravelEncoder;
    private final Solenoid launcherRelease = RobotMap.launcherlauncherRelease;
    private final DigitalInput launcherFrontLimit = RobotMap.launcherlauncherFrontLimit;
    private final DigitalInput launcherBackLimit = RobotMap.launcherlauncherBackLimit;
    private final SpeedController pullBackMotor = RobotMap.launcherpullBackMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private final boolean open = false;
	private final boolean closed = true;
	
	private final double launcher_MAX = 0.0;
	private final double launcher_MIN = 4.0;
	private final double INCHES_PER_PULSE = .0036363636364;

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public enum launcherState { readyToLauch, 
							   emptyMiddle,
							   closedForwards,
							   emptyForwards,
							   emptyBackwards,
							   closedMiddle };

	private launcherState current; // Current state of the launcher
	private launcherState destination; // Where you want to be

	private final double SPEED = 1.00;

	public Launcher() {
		current = launcherState.emptyMiddle; // Robot starts emptyMiddle
		pullBackMotor.setInverted(Robot.invertLauncher);
		launcherTravelEncoder.setDistancePerPulse(INCHES_PER_PULSE);
		flashLight.set(Value.kReverse);
	}

	/**********************************
	 * 
	 * Method to get the current state
	 * 
	 * @return the current state
	 *
	 **********************************/
	public launcherState getState() {
		return current;
	}

	/**********************************
	 * 
	 * Method to get the destination
	 * 
	 * @return the current destination
	 *
	 **********************************/
	public launcherState getDestination() {
		return destination;
	}
	
	/*************************************
	 * 
	 * sets current to a new state
	 * 
	 * @param newState is the new state
	 *
	 *************************************/
	public void setCurrentState(launcherState newState) {
		current = newState;
	}

	public void updateCurrentState() {
		if (isBackLimitHit()) {
			if (isClamped()) {
				setCurrentState(launcherState.readyToLauch);
			} 
			else {
				setCurrentState(launcherState.emptyBackwards);
			}
		}
		else if (isFrontLimitHit()) {
			if (isClamped()) {
				setCurrentState(launcherState.closedForwards);
			} 
			else {
				setCurrentState(launcherState.emptyForwards);
			}
		} 
		else {
			if (isClamped()) {
				setCurrentState(launcherState.closedMiddle);
			}
			else {
				setCurrentState(launcherState.emptyMiddle);
			}
		}
	}
	
	//Valid inputs should be from 0 to 4...I think
	public void setlauncherPos(double dist) {
		//Distance given by Derek. 137.5 revs for 1 inch of travel
		if(launcherTravelEncoder.getDistance() < dist && !isMaxed()) {
			driveLauncherMotorBackwards();
		}
		else if(launcherTravelEncoder.getDistance() > dist && !isMin()) {
			driveLauncherMotorForwards();
		}
		else {
			stopLauncherMotor();
		}
	}
	
	private boolean isMaxed() {		
		if(launcherTravelEncoder.getDistance() >= launcher_MAX)
			return true;
		else
			return false;
	}
	
	private boolean isMin() {
		if(launcherTravelEncoder.getDistance() <= launcher_MIN)
			return true;
		else
			return false;
	}

	public void openClamp() {
		launcherRelease.set(open);
	}

	public void closeClamp() {
		launcherRelease.set(closed);
	}

	/*********************************
	 * 
	 * Drives the pullBack motor forwards
	 * 
	 *********************************/
	public void driveLauncherMotorForwards() {
		if (!isFrontLimitHit())
			pullBackMotor.set(SPEED);
		else
			stopLauncherMotor();
	}

	/*********************************
	 * 
	 * Drives the pullBack motor backwards
	 * 
	 *********************************/
	public void driveLauncherMotorBackwards() {
		if (!isBackLimitHit())
			pullBackMotor.set(-SPEED);
		else
			stopLauncherMotor();
	}

	/*********************************
	 * 
	 * Stops the pullBack motor
	 * 
	 *********************************/
	public void stopLauncherMotor() {
		pullBackMotor.set(0.0);
	}

	public boolean isFrontLimitHit() {
		return !launcherFrontLimit.get();
	}

	public boolean isBackLimitHit() {
		return !launcherBackLimit.get();
	}
    
	public boolean isClamped() {
		return launcherRelease.get();
	}
	
	public void flashLightOn() {
		flashLight.set(Value.kForward);
	}
	
	public void flashLightOff() {
		flashLight.set(Value.kReverse);
	}
	
	public void flashLightToggle() {
		if(flashLight.get() == Value.kReverse) flashLightOn();
		else flashLightOff();
	}
	
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

