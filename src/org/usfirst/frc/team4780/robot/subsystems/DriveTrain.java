package org.usfirst.frc.team4780.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

import org.usfirst.frc.team4780.robot.RobotMap;
import org.usfirst.frc.team4780.robot.commands.DriveWithJoystick;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	private Talon rightTalon;
	private Talon leftTalon;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public DriveTrain(){
		rightTalon = new Talon(RobotMap.rightTalonPort);
		leftTalon = new Talon(RobotMap.leftTalonPort);
	}
	
	public void drive(Joystick stick){
		double x = stick.getX();
		double y = stick.getY();
		// 0,-1 -> -1 -1
		// 0, 1 ->  1  1
	    // 
		// 1, 0 -> +1, +1
		// -1, 0 -> -1, -1
		// left motor forward is +1
		// right motor forward is -1
		// need f: +1, -1
		//      b: -1, +1
		//      l: -1, -1
		//      r: +1, +1
		// x+y x-y -x+y -x-y
		// left x-y, -x-y
		// right x+y -x+y
		leftTalon.set(x+y);
		// practice bot rightTalon.set(x+y);
		rightTalon.set(x-y);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }

}


