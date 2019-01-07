package maegacube_bewegungen;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Maegacube_griffel {

	public static RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.A);
	
	 static void maegacube_halten() {
		// TODO Auto-generated method stub
		
		m.rotateTo(90);

	}
	
	public static void maegacube_stophalten() {
		// TODO Auto-generated method stub
		
		m.rotate(-90);;

	}
	
	
	
	
	public static void maegacube_drehen() {
		
		m.rotateTo(180);
		m.rotateTo(90);
		m.rotate(0);
		
	}
}
