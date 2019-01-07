package maegacube_bewegungen;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Mägacube_wenden {

	public static void main(String[] args) {
		RegulatedMotor ma = new EV3LargeRegulatedMotor(MotorPort.A);
		
		ma.rotate(90);
	}

}
