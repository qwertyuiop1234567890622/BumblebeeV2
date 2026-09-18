package org.firstinspires.ftc.teamcode.TeleOps;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.TeleOps.Teleop;

@TeleOp
public class Thinggy_code_I_guess {
    Teleop bob = new Teleop();
    @Override
    public void init(){
        bob.init(hardwareMap);
    }

    @Override
    public void loop(){
        bob.setMotorSeed(0.5);
    }
}
