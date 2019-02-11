
package algorithmus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.kociemba.*;
import org.kociemba.twophase.Facelet;
import org.kociemba.twophase.Search;
import org.kociemba.twophase.Tools;

import maegacube_bewegungen.Befehle;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String s = new String();
		s = "B, D, D, L, U, R, D, U, L, U, U, F, F, R, D, R, F, U, B, B, F, L, F, U, B, D, B, U, F, U, B, D, R, D, L, F, D, U, L, D, L, F, R, R, L, L, B, R, R, B, L, R, B, F";
		System.out.println(Tools.verify(s));
		String b = new String();
		b = Tools.randomCube();
		System.out.println(b);

		System.out.println(Search.solution(b, 21, 10000L, false));

		String solution = new String();
		solution = Search.solution(b, 21, 10000L, false);

		String[] split = solution.split(" ");

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
//
			if (split[i].equals("F")) {

				Befehle.befehl("F", 1);

			}
			if (split[i].equals("F2")) {

				Befehle.befehl("F", 2);

			}
			if (split[i].equals("F'")) {

				Befehle.befehl("F", -1);

			}
			if (split[i].equals("F'2")) {

				Befehle.befehl("F", -2);

			}
//
			if (split[i].equals("D")) {

				Befehle.befehl("D", 1);

			}
			if (split[i].equals("D2")) {

				Befehle.befehl("D", 2);

			}
			if (split[i].equals("D'")) {

				Befehle.befehl("D", -1);

			}
			if (split[i].equals("D'2")) {

				Befehle.befehl("D", -2);

			}
//
			if (split[i].equals("B")) {

				Befehle.befehl("B", 1);

			}
			if (split[i].equals("B2")) {

				Befehle.befehl("B", 2);

			}
			if (split[i].equals("B'")) {

				Befehle.befehl("B", -1);

			}
			if (split[i].equals("B'2")) {

				Befehle.befehl("B", -2);

			}
//
			if (split[i].equals("U")) {

				Befehle.befehl("U", 1);

			}
			if (split[i].equals("U2")) {

				Befehle.befehl("U", 2);

			}
			if (split[i].equals("U'")) {

				Befehle.befehl("U", -1);

			}
			if (split[i].equals("U'2")) {

				Befehle.befehl("U", -2);

			}
//
			if (split[i].equals("L")) {

				Befehle.befehl("L", 1);

			}
			if (split[i].equals("L2")) {

				Befehle.befehl("L", 2);

			}
			if (split[i].equals("L'")) {

				Befehle.befehl("L", -1);

			}
			if (split[i].equals("L'2")) {

				Befehle.befehl("L", -2);

			}
//
			if (split[i].equals("R")) {

				Befehle.befehl("R", 1);

			}
			if (split[i].equals("R2")) {

				Befehle.befehl("R", 2);

			}
			if (split[i].equals("R'")) {

				Befehle.befehl("R", -1);

			}
			if (split[i].equals("R'2")) {

				Befehle.befehl("R", -2);

			}

		}

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		// System.out.println(split[0]);

		// U, R, F, D, L, B
		// U =weiß
		// D= gelbt
		// F = rot
		// L=blau
		// r = grün
		// b = orange

	}

}
