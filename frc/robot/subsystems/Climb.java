// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Climb extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonSRX climbTalon;
private WPI_TalonSRX climbTalon2;
//private WPI_TalonSRX lowerClimbTalon;
//private WPI_TalonSRX lowerClimbTalon2;
//private MotorControllerGroup rightClimb;
//private MotorControllerGroup leftClimb;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public Climb() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        climbTalon2 = new WPI_TalonSRX(10); //left
        climbTalon = new WPI_TalonSRX(8); //right
        //lowerClimbTalon = new WPI_TalonSRX(7); //right
        //lowerClimbTalon2 = new WPI_TalonSRX(9); //left

        //rightClimb = new MotorControllerGroup(climbTalon, lowerClimbTalon);
        //leftClimb = new MotorControllerGroup(climbTalon2, lowerClimbTalon2);


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    } 

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. call these from Commands.
    public void rightClimbing(double rClimbValue) {
        climbTalon.set(rClimbValue * -1.0);
    }
    public void leftClimbing(double lClimbValue){
        climbTalon2.set(lClimbValue);
    }
    public void fullStop(){
        climbTalon.set(0.0);
        climbTalon2.set(0.0);
    }
}

