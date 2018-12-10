
package algorithmus;

import org.kociemba.*;
import org.kociemba.twophase.Facelet;
import org.kociemba.twophase.Tools;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = new String();
	s = "B, D, D, L, U, R, D, U, L, U, U, F, F, R, D, R, F, U, B, B, F, L, F, U, B, D, B, U, F, U, B, D, R, D, L, F, D, U, L, D, L, F, R, R, L, L, B, R, R, B, L, R, B, F";
	 System.out.println(Tools.verify(s));
	 
	//U, R, F, D, L, B
	// U =weiß
	// D= gelbt
	//F = rot
	//L=blau
	//r = grün
	//b = orange
	
	}


}
