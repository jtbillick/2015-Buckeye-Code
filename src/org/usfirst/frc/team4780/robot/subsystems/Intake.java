package org.usfirst.frc.team4780.robot.subsystems;

import org.usfirst.frc.team4780.robot.RobotMap;
import org.usfirst.frc.team4780.robot.commands.DriveIntake;
import org.usfirst.frc.team4780.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	
	private Victor rightVictor;
	private Victor leftVictor;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Intake(){
		rightVictor = new Victor(RobotMap.rightVictorPort);
		leftVictor = new Victor(RobotMap.leftVictorPort);
	}
	
	public void driveIntake(Joystick joystick){
		double x = joystick.getX();
		double y = joystick.getY();
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
		leftVictor.set(x+y);
		// practice bot rightTalon.set(x+y);
		rightVictor.set(x-y);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }

}


