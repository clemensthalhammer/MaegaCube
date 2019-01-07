package colorsensor;

import lejos.remote.ev3.RMISampleProvider;
import lejos.remote.ev3.RemoteEV3;

public class colorsensortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RMISampleProvider sampleProvider = null;
		RemoteEV3 ev3 = null;
		
		try {
			ev3 = new RemoteEV3("10.0.1.1");
			
			sampleProvider = ev3.createSampleProvider
					("S1", "lejos.hardware.sensor.EV3ColorSensor", "RGB");
			float[] samples = new float[3];
			
			samples = sampleProvider.fetchSample();
			
			System.out.println("RGB="+samples[0] +" / " +samples[1]+ " / " + samples[2]);
			
			if(   (samples[0]>0.128f) && (samples[0]<0.139f) //ROT
			   && (samples[1]>0.031f) && (samples[1]<0.041f) //GRÜN
			   && (samples[2]>0.023f) && (samples[2]<0.033f) //BLAU
			   
			  ) System.out.println("ROT");
			  
			  } catch (Exception e) {
				  e.printStackTrace();
			  } finally {
				  
			  }
	
	}

}
