package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Sensors check")
public class sensors_check extends LinearOpMode {


    private DcMotor frontleft;
    private DcMotor frontright;
    private DcMotor rearleft;
    private DcMotor arm;
    private DcMotor armextend;

    /**
     * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
     * Comment Blocks show where to place Initialization code (runs once, after touching the
     * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
     * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
     * Stopped).
     */
    @Override
    public void runOpMode() {
        frontleft = hardwareMap.get(DcMotor.class, "frontleft");
        frontright = hardwareMap.get(DcMotor.class, "frontright");
        rearleft = hardwareMap.get(DcMotor.class, "rearleft");
        arm = hardwareMap.get(DcMotor.class, "arm");
        armextend = hardwareMap.get(DcMotor.class, "armextend");
        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rearleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        armextend.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                telemetry.addData("par0", frontleft.getCurrentPosition());
                telemetry.addData("par1", frontright.getCurrentPosition());
                telemetry.addData("perp",rearleft.getCurrentPosition());
                telemetry.addData("arm",arm.getCurrentPosition());
                telemetry.addData("armextend",armextend.getCurrentPosition());
                telemetry.update();
            }
        }
    }
}