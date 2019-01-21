package colorsensor;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;

public class Colorsensor3 {

	public static void main(String[] args) {

		EV3ColorSensor col = new EV3ColorSensor(SensorPort.S3);
		
		
		col.setFloodlight();
		
		while (condition) {
			
		}
		
		
		
	}
}
