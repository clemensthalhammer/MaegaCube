

package maegacube_bewegungen;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Maegacube_drehen {

	public static void main(String[] args) {
		
		RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.A);
		
		m.rotate(90);
		

		
		// TODO Auto-generated method stub

	}

}
