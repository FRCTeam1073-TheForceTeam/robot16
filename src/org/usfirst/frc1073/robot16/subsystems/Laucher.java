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
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Laucher extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController pullBackMotor = RobotMap.laucherpullBackMotor;
    private final SpeedController elevationMotor = RobotMap.laucherelevationMotor;
    private final Encoder pullBackEncoder = RobotMap.laucherpullBackEncoder;
    private final AnalogPotentiometer laucherElevation = RobotMap.laucherlaucherElevation;
    private final Encoder elevationEncoder = RobotMap.laucherelevationEncoder;
    private final AnalogPotentiometer elevationAngle = RobotMap.laucherelevationAngle;
    private final DigitalInput elevationHighLimit = RobotMap.laucherelevationHighLimit;
    private final DigitalInput elevationLowLimit = RobotMap.laucherelevationLowLimit;
    private final DigitalInput laucherBackLimit = RobotMap.laucherlaucherBackLimit;
    private final DigitalInput laucherFrontLimit = RobotMap.laucherlaucherFrontLimit;
    private final Solenoid laucherRelease = RobotMap.laucherlaucherRelease;


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

