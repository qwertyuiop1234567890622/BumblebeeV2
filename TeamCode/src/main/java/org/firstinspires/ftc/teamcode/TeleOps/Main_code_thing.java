package org.firstinspires.ftc.teamcode.TeleOps;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Main_code_thing extends OpMode {
    Teleop bob = new Teleop();
    @Override
    public void init(){
        bob.init(hardwareMap);
    }

    @Override
    public void loop(){
        bob.setMotorSpeed(0.5);
        telemetry.addData("Motor Power", 0.5);
        telemetry.update();
    }
}
