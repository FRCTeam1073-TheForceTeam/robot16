// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1073.robot16;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Encoder launcherlauncherTravelEncoder;
    public static Solenoid launcherlauncherRelease;
    public static DigitalInput launcherlauncherFrontLimit;
    public static DigitalInput launcherlauncherBackLimit;
    public static SpeedController launcherpullBackMotor;
    public static Relay launcherflashLight;
    public static SpeedController collectorrollerMotor;
    public static DigitalInput collectorballSensor;
    public static SpeedController climberclimberMotor;
    public static Solenoid climberextensionPiston;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**CANTalons
     * Must manually add as of the 2017
     * toolchain update
     */
    
    public static CANTalon driveTrainleftMotor1;
    public static CANTalon driveTrainleftMotor2;
    public static CANTalon driveTrainrightMotor1;
    public static CANTalon driveTrainrightMotor2;
    public static CANTalon launcherElevationelevationMotor;
    public static CANTalon defenseElevationelevationMotor;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        launcherlauncherTravelEncoder = new Encoder(10, 11, false, EncodingType.k4X);
        LiveWindow.addSensor("Launcher", "launcherTravelEncoder", launcherlauncherTravelEncoder);
        launcherlauncherTravelEncoder.setDistancePerPulse(1.0);
        launcherlauncherTravelEncoder.setPIDSourceType(PIDSourceType.kRate);
        launcherlauncherRelease = new Solenoid(1, 2);
        LiveWindow.addActuator("Launcher", "launcherRelease", launcherlauncherRelease);
        
        launcherlauncherFrontLimit = new DigitalInput(8);
        LiveWindow.addSensor("Launcher", "launcherFrontLimit", launcherlauncherFrontLimit);
        
        launcherlauncherBackLimit = new DigitalInput(7);
        LiveWindow.addSensor("Launcher", "launcherBackLimit", launcherlauncherBackLimit);
        
        launcherpullBackMotor = new VictorSP(4);
        LiveWindow.addActuator("Launcher", "pullBackMotor", (VictorSP) launcherpullBackMotor);
        
        launcherflashLight = new Relay(0);
        LiveWindow.addActuator("Launcher", "flashLight", launcherflashLight);
        
        collectorrollerMotor = new VictorSP(7);
        LiveWindow.addActuator("Collector", "rollerMotor", (VictorSP) collectorrollerMotor);
        
        collectorballSensor = new DigitalInput(6);
        LiveWindow.addSensor("Collector", "ballSensor", collectorballSensor);
        
        climberclimberMotor = new VictorSP(6);
        LiveWindow.addActuator("Climber", "climberMotor", (VictorSP) climberclimberMotor);
        
        climberextensionPiston = new Solenoid(1, 1);
        LiveWindow.addActuator("Climber", "extensionPiston", climberextensionPiston);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        /**CANTalon Constructors
         * Must manually add as of the
         * 2017 toolchain update
         */
        
        driveTrainleftMotor1 = new CANTalon(7);
        LiveWindow.addActuator("DriveTrain", "leftMotor1", driveTrainleftMotor1);
        
        driveTrainleftMotor2 = new CANTalon(8);
        LiveWindow.addActuator("DriveTrain", "leftMotor2", driveTrainleftMotor2);
        
        driveTrainrightMotor1 = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "rightMotor1", driveTrainrightMotor1);
        
        driveTrainrightMotor2 = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "rightMotor2", driveTrainrightMotor2);
        
        launcherElevationelevationMotor = new CANTalon(6);
        LiveWindow.addActuator("LauncherElevation", "elevationMotor", launcherElevationelevationMotor);
        
        defenseElevationelevationMotor = new CANTalon(2);
        LiveWindow.addActuator("DefenseElevation", "elevationMotor", defenseElevationelevationMotor);
    }
}
