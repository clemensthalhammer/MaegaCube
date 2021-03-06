package colorsensor;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.Color;
import lejos.robotics.ColorIdentifier;
import maegacube_bewegungen.Befehle;
import maegacube_bewegungen.Maegacube_drehen;

public class ColorSensorTest4 {

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
		switch(colorId){
			case 2: colorName = "BLUE"; break;
			case Color.GREEN: colorName = "GREEN"; break;
			case Color.YELLOW: colorName = "YELLOW"; break;
			case Color.RED: colorName = "RED"; break;
			case Color.WHITE: colorName = "WHITE"; break;
			case Color.ORANGE: colorName = "WHITE"; break;
			 
		}
		lcd.drawString(colorId + " - " + colorName, 0, 0);
		Befehle.befehl("D", 1);
		keys.waitForAnyPress();
		
	}

}
