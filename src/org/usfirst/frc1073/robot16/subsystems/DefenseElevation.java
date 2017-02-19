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
import org.usfirst.frc1073.robot16.commands.*;
import org.usfirst.frc1073.robot16.subsystems.DriveTrain.profiles;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DefenseElevation extends Subsystem {
	public boolean isDefenseAdjust;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
	private final CANTalon elevationMotor = RobotMap.defenseElevationelevationMotor;
    private static final double MOTOR_TOP_RPM = 50;
    
    public DefenseElevation() {
    	elevationMotor.setInverted(Robot.invertDefenseDir);
    	
    	setupPID();
    }
    
    private void setupPID() {
    	elevationMotor.changeControlMode(TalonControlMode.Speed);
    	
    	elevationMotor.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogEncoder);
    	elevationMotor.configPotentiometerTurns(360);
    	
    	elevationMotor.configNominalOutputVoltage(+0f, -0f);
    	elevationMotor.configPeakOutputVoltage(+12f, -12f);
    	
    	elevationMotor.setPID(20, 0.0, 0.0);
    	
    	ZeroOutPosition();
    }
    
    public void movePIDPositional(double angle) {
    	
    	if(elevationMotor.getControlMode() != TalonControlMode.Position) elevationMotor.changeControlMode(TalonControlMode.Position);
    	
    	angle = convertFromDegrees(angle);
    	
    	elevationMotor.set(angle);
    }
    
    public void movePIDSpeed(double mag) {
    	
    	if(elevationMotor.getControlMode() != TalonControlMode.Speed) elevationMotor.changeControlMode(TalonControlMode.Speed);
    	
    	elevationMotor.set(mag * MOTOR_TOP_RPM);
    }
    
    public void moveBasic(double mag) {
    	
    	if(elevationMotor.getControlMode() != TalonControlMode.PercentVbus) elevationMotor.changeControlMode(TalonControlMode.PercentVbus);
    	
    	elevationMotor.set(mag);
    }
    
    public double getRawPot() {
    	return elevationMotor.getPosition();
    }
    
    public boolean isPID() {
    	return elevationMotor.getControlMode() == TalonControlMode.Position || elevationMotor.getControlMode() == TalonControlMode.Speed;
    }
    
    public void ZeroOutPosition() {
    	elevationMotor.setPosition(+0f);
    }
    
    public void enableSpeedPID() {
    	elevationMotor.changeControlMode(TalonControlMode.Speed);
    }
    
    public double convertToDegrees(double rawPotReading) {
    	return (rawPotReading * 90.0);
    }
    
    public double convertFromDegrees(double degrees) {
    	return (degrees / 90.0);
    }
    
    public double getDegreeReading() {
    	return convertToDegrees(getRawPot());
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

