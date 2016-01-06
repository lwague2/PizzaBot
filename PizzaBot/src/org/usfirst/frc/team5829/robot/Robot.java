
package org.usfirst.frc.team5829.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	Joystick driveStick = new Joystick(1);
	Joystick shootStick = new Joystick(2);
	RobotDrive mainDrive = new RobotDrive(1,2,3,4);
	Victor hopper = new Victor(5);
	Jaguar hopper2 = new Jaguar(6);
	
	
    public void robotInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	mainDrive.mecanumDrive_Cartesian(driveStick.getAxis(Joystick.AxisType.kX),
    			driveStick.getAxis(Joystick.AxisType.kY),
    			driveStick.getAxis(Joystick.AxisType.kZ),
    			0);
    	if(shootStick.getRawButton(1)){
    		hopper.set(1.0);
    	}else if(shootStick.getRawButton(2)){
    		hopper.set(0.0);
    	}else{
    		hopper.set(0.0);
    	}
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
