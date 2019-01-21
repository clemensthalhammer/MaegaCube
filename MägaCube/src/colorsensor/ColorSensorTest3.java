package colorsensor;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

class ColorSensorTest3 {
	
	EV3ColorSensor colorSensor;
	SampleProvider colorProvider;
	float[] colorSample;

	public static void main(String[] args) {
		
		new ColorSensorTest3();
	}
	
	public ColorSensorTest3() {
		
		Port s3 = LocalEV3.get().getPort("S3");
		colorSensor = new EV3ColorSensor(s3);
		colorProvider = colorSensor.getColorID()
	}
}
