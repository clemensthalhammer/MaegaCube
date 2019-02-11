package colorsensor;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Maegacube_scan {
	
	static RegulatedMotor n = new EV3LargeRegulatedMotor(MotorPort.D);
	
	public static void maegacube_scan() {
		
		n.rotate(720);
		
	}
}
