package maegacube_bewegungen;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Maegacube_griffel {

	public static void maegacube_halten() {
		// TODO Auto-generated method stub
		RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.B);
		m.rotateTo(90);

	}
	
	public static void maegacube_drehen() {
		RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.B);
		m.rotateTo(180);
		m.rotateTo(90);
		
	}
}
