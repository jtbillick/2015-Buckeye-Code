
package org.usfirst.frc.team4780.robot.commands;

import org.usfirst.frc.team4780.robot.subsystems.Elevator;



/**
 *
 */
public class ElevateUp extends Elevate {
	
	protected Elevator elevator;

 public ElevateUp(Elevator elevator) {
		super(elevator, .65);
		setInterruptible(false);
		// TODO Auto-generated constructor stub
	}


}
