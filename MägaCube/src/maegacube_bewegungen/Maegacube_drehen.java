

package maegacube_bewegungen;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Maegacube_drehen {
	 
	static RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.A);
	
	public static void maegacube_drehen(int x) {
		
		
		m.rotateTo(270*x);

		
		// TODO Auto-generated method stub

	}

}
