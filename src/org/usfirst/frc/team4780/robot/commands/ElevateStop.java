package org.usfirst.frc.team4780.robot.commands;

import org.usfirst.frc.team4780.robot.subsystems.Elevator;




/**
 *
 */
public class ElevateStop extends Elevate {

    public ElevateStop(Elevator elevator) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	super(elevator, 0);
		setInterruptible(false);
    }

   
}