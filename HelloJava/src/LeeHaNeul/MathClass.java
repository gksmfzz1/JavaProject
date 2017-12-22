package LeeHaNeul;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.rint;
import static java.lang.Math.round;
import static java.lang.System.out;

public class MathClass {

	public static void main(String[] args) {
		
		double val = 90.7552;
		out.println("round("+ val +")=" + round(val));		// 반올림
		
		val *= 100;
		out.println("round("+val+")="+round(val));		//반올림
		
		out.println("round("+ val +")/100 =" + round(val)/100);		//올림
		out.println("round("+ val +")/100.0=" + round(val)/100.0);	//버림
		out.println();
		out.printf("ceil(%3.1f)= %3.1f%n", 1.1, ceil(1.1));		//올림
		out.printf("floor(%3.1f)= %3.1f%n", 1.5, floor(1.5));	//버림
		out.printf("round(%3.1f)= %d%n", 1.1, round(1.1));	//반올림
		out.printf("round(%3.1f)= %d%n", 1.5, round(1.5));	//반올림
		out.printf("rint(%3.1f)= %f%n", 1.5, rint(1.5));	//반올림
		out.printf("round(%3.1f)= %df%n", -1.5, round(-1.5));	//반올림
		out.printf("rint(%3.1f)= %f%n", -1.5, rint(-1.5));		//반올림
		out.printf("ceil(%3.1f)= f%n", -1.5, ceil(-1.5));	//올림
		out.printf("floor(%3.1f)= %f%n", -1.5, floor(-1.5));	//버림
	
		
	}

}
