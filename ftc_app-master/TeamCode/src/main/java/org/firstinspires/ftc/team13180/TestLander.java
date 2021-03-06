package org.firstinspires.ftc.team13180;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp (name="TestLander1", group="testGroup1")
public class TestLander extends LinearOpMode {
    private DcMotor landerMotor;
    @Override
    public void runOpMode() {
        //imu = hardwareMap.get(Gyroscope.class, "imu");
        landerMotor = hardwareMap.get(DcMotor.class, "Lander");

        double tgtPower1 = 0;
        double multiPlier1 = 1;

        waitForStart();

        while (opModeIsActive()) {

            if (gamepad1.left_stick_y != 0) {
                tgtPower1 = multiPlier1 * this.gamepad1.left_stick_y;
                landerMotor.setPower(tgtPower1);
            if (gamepad1.left_stick_y == 0){
                landerMotor.setPower(0);
            }

                if(gamepad1.y) {
                    // move to 0 degrees.

                    //servoTest2.setPosition(1);
                } else if (gamepad1.a) {
                    // move to 180 degrees.

                    //servoTest1.setPosition(1);
                    //servoTest2.setPosition(0);
                }
            }

        }
    }

        }

