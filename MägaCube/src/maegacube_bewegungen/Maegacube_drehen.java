

package maegacube_bewegungen;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Maegacube_drehen {

	public static void maegacube_drehen() {
		
		RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.A);
		m.rotateTo(270);

		
		// TODO Auto-generated method stub

	}

}
