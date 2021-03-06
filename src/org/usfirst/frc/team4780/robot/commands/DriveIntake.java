
package org.usfirst.frc.team4780.robot.commands;

import org.usfirst.frc.team4780.robot.Robot;


import org.usfirst.frc.team4780.robot.subsystems.DriveTrain;



import org.usfirst.frc.team4780.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveIntake extends Command {
	protected Intake intake = Robot.intake;
	public DriveIntake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
    protected void drive(double x, double y) {
    	drive(x,y);
		  
	}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	intake.driveIntake(Robot.oi.getJoystickValue());

    	//double twist;
    	
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