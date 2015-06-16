package org.usfirst.frc.team4780.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	Talon leftVictor = new Talon(0);
	Talon rightVictor = new Talon(1);
	Talon elevatorTalon = new Talon(2);
	Victor rightIntakeVictor = new Victor(3);
	Victor leftIntakeVictor = new Victor(4);
	
	public static final int leftTalonPort = 0;
	public static final int rightTalonPort = 1;
	public static final int elevatorTalonPort = 2;
	public static final int rightVictorPort = 3;
	public static final int leftVictorPort = 4;
	
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
