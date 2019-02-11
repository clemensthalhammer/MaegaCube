package algorithmus;

import org.kociemba.twophase.Search;
import org.kociemba.twophase.Tools;

public class Randomcube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b = new String();
		b = Tools.randomCube();
		System.out.println(b);
		System.out.println(Search.solution(b, 21, 10000L, false));
		
	}

}
