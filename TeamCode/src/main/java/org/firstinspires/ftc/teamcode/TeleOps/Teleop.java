package org.firstinspires.ftc.teamcode.TeleOps;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class Teleop {
    private DcMotor motor;

    public void init(HardwareMap hwMap) {
        motor=hwMap.get(DcMotor.class, "motorTopLeft");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //motor.setMode(DcMotor.RunMode.RUN_)
        motor.setTargetPosition(2);
    }

    public void setMotorSpeed(double speed){
        // values between -1 and 1
        motor.setPower(speed);
    }


}
