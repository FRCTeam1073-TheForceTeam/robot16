package org.usfirst.frc1073.robot16;
// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {


	
	//TODO Needs to be added in RobotBuilder -Matt
	public static AnalogGyro navGyro;
	
    //The following had assignments below, but no declaration?
    public static Solenoid collectorarmExtension;
    public static Encoder collectorelevationEncoder;
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftMotor1;
    public static SpeedController driveTrainleftMotor2;
    public static SpeedController driveTrainrightMotor1;
    public static SpeedController driveTrainrightMotor2;
    public static Encoder driveTrainleftSideEncoder;
    public static Encoder driveTrainrightSideEncoder;
    public static SpeedController laucherpullBackMotor;
    public static SpeedController laucherelevationMotor;
    public static Encoder laucherpullBackEncoder;
    public static AnalogPotentiometer laucherlaucherElevation;
    public static Encoder laucherelevationEncoder;
    public static AnalogPotentiometer laucherelevationAngle;
    public static DigitalInput laucherelevationHighLimit;
    public static DigitalInput laucherelevationLowLimit;
    public static DigitalInput laucherlaucherBackLimit;
    public static DigitalInput laucherlaucherFrontLimit;
    public static Solenoid laucherlaucherRelease;
    public static Solenoid laucherlockLaucher;
    public static SpeedController collectorrollerMotor;
    public static DigitalInput collectorballSensor;
    public static SpeedController climberclimberMotor;
    public static Solenoid climberextensionPiston;
    public static AnalogPotentiometer defensedefenseAngle;
    public static Solenoid defensearmExtension;
    public static SpeedController defenseelevationMotor;
    public static DigitalInput defenseelevationHighLimit;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    public static void init() {
    	
    	//TODO THIS ANALOG CHANNEL IS JUST ARBITRARILY ASSIGNED; NEEDS TO BE INTEGRATED -Matt
    	navGyro = new AnalogGyro(0);
    	
    	
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftMotor1 = new VictorSP(0);
        LiveWindow.addActuator("DriveTrain", "leftMotor1", (VictorSP) driveTrainleftMotor1);
        
        driveTrainleftMotor2 = new VictorSP(1);
        LiveWindow.addActuator("DriveTrain", "leftMotor2", (VictorSP) driveTrainleftMotor2);
        
        driveTrainrightMotor1 = new VictorSP(2);
        LiveWindow.addActuator("DriveTrain", "rightMotor1", (VictorSP) driveTrainrightMotor1);
        
        driveTrainrightMotor2 = new VictorSP(3);
        LiveWindow.addActuator("DriveTrain", "rightMotor2", (VictorSP) driveTrainrightMotor2);
        
        driveTrainleftSideEncoder = new Encoder(0, 1, false, EncodingType.k1X);
        LiveWindow.addSensor("DriveTrain", "leftSideEncoder", driveTrainleftSideEncoder);
        driveTrainleftSideEncoder.setDistancePerPulse(1.0);
        driveTrainleftSideEncoder.setPIDSourceType(PIDSourceType.kRate);
        driveTrainrightSideEncoder = new Encoder(2, 3, false, EncodingType.k1X);
        LiveWindow.addSensor("DriveTrain", "rightSideEncoder", driveTrainrightSideEncoder);
        driveTrainrightSideEncoder.setDistancePerPulse(1.0);
        driveTrainrightSideEncoder.setPIDSourceType(PIDSourceType.kRate);
        laucherpullBackMotor = new VictorSP(4);
        LiveWindow.addActuator("Laucher", "pullBackMotor", (VictorSP) laucherpullBackMotor);
        
        laucherelevationMotor = new VictorSP(5);
        LiveWindow.addActuator("Laucher", "elevationMotor", (VictorSP) laucherelevationMotor);
        
        laucherelevationAngle = new AnalogPotentiometer(0, 1.0, 0.0);
        LiveWindow.addSensor("Laucher", "elevationAngle", laucherelevationAngle);
        
        laucherelevationHighLimit = new DigitalInput(4);
        LiveWindow.addSensor("Laucher", "elevationHighLimit", laucherelevationHighLimit);
        
        laucherelevationLowLimit = new DigitalInput(5);
        LiveWindow.addSensor("Laucher", "elevationLowLimit", laucherelevationLowLimit);
        
        laucherlaucherBackLimit = new DigitalInput(7);
        LiveWindow.addSensor("Laucher", "laucherBackLimit", laucherlaucherBackLimit);
        
        laucherlaucherFrontLimit = new DigitalInput(8);
        LiveWindow.addSensor("Laucher", "laucherFrontLimit", laucherlaucherFrontLimit);
        
        laucherlaucherRelease = new Solenoid(1, 2);
        LiveWindow.addActuator("Laucher", "laucherRelease", laucherlaucherRelease);
        

        laucherelevationEncoder = new Encoder(7, 8, false, EncodingType.k4X);
        LiveWindow.addSensor("Laucher", "elevationEncoder", laucherelevationEncoder);
        laucherelevationEncoder.setDistancePerPulse(1.0);
        laucherelevationEncoder.setPIDSourceType(PIDSourceType.kRate);


        laucherlockLaucher = new Solenoid(1, 3);
        LiveWindow.addActuator("Laucher", "lockLaucher", laucherlockLaucher);
        

        collectorrollerMotor = new VictorSP(7);
        LiveWindow.addActuator("Collector", "rollerMotor", (VictorSP) collectorrollerMotor);
        
        collectorballSensor = new DigitalInput(6);
        LiveWindow.addSensor("Collector", "ballSensor", collectorballSensor);
        
        collectorarmExtension = new Solenoid(0, 0);
        LiveWindow.addActuator("Collector", "armExtension", collectorarmExtension);
        

        collectorelevationEncoder = new Encoder(7, 8, false, EncodingType.k4X);
        LiveWindow.addSensor("Collector", "elevationEncoder", collectorelevationEncoder);
        collectorelevationEncoder.setDistancePerPulse(1.0);
        collectorelevationEncoder.setPIDSourceType(PIDSourceType.kRate);


        climberclimberMotor = new VictorSP(6);
        LiveWindow.addActuator("Climber", "climberMotor", (VictorSP) climberclimberMotor);
        
        climberextensionPiston = new Solenoid(1, 1);
        LiveWindow.addActuator("Climber", "extensionPiston", climberextensionPiston);
        
        defensedefenseAngle = new AnalogPotentiometer(1, 1.0, 0.0);
        LiveWindow.addSensor("Defense", "defenseAngle", defensedefenseAngle);
        
        defensearmExtension = new Solenoid(1, 0);
        LiveWindow.addActuator("Defense", "armExtension", defensearmExtension);
        
        defenseelevationMotor = new VictorSP(8);
        LiveWindow.addActuator("Defense", "elevationMotor", (VictorSP) defenseelevationMotor);
        
        defenseelevationHighLimit = new DigitalInput(9);
        LiveWindow.addSensor("Defense", "elevationHighLimit", defenseelevationHighLimit);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
