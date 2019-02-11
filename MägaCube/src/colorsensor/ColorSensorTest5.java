package colorsensor;

import java.awt.Color;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class ColorSensorTest5 {

	public static void main(String[] args) {
		
		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();
		
		EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S3);
		SensorMode color = colorSensor.getColorIDMode();
		
		float[] sample = new float[color.sampleSize()];
		color.fetchSample(sample, 0);
		int colorId = (int)sample[0];
		String colorName = "";
		
		System.out.println(colorId);

	}

}