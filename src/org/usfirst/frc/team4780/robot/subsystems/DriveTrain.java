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
		leftTalon.set(x-y);
		rightTalon.set(x+y);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }

}


