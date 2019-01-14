package colorsensor;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.Color;
import lejos.utility.Delay;

public class colorsensortest2 {
	

	public static void main(String[] args) {

			EV3ColorSensor col = new EV3ColorSensor(SensorPort.S3);
			
			col.setFloodlight(true);
			
			while(col.getColorID() != Color.BLUE) {
				System.out.println("waiting for blue");
			}
		

		lejos.hardware.Button.waitForAnyPress();

		}

	}

