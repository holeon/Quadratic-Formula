import java.util.Scanner;
import java.lang.Math.*;

public class MNF {
	static double a;
	static double b;
	static double c;
	static double z;
	static double z1;
	static double z2;
/////////////////////////////////////////////////////////////////////////////
	public static void zMNF() {
	
	System.out.println("\n\nz1 -> " + z1);
	System.out.println("z2 -> " + z2);
	
	int z1i = 0;
	int z2i = 0;
	
	if(z1<0) {								//because of complex neumbers
		z1 = z1*(-1);
		z1i = 1;
	}
	else {}
	
	if(z2<0) {									//becuase of complex numbers
		z2 = z2*(-1);
		z2i = 1;			
	}
	else {}
////////	

	double x12 = Math.pow(z1, 1/z);
	double x34 = Math.pow(z2, 1/z);
	if(z1i==1 && z2i==1) {
		System.out.println("\n\nx1/2 = " + x12 + "i");	
		System.out.println("x3/4 = " + x34 + "i");
	}
	else if(z1i==1) {
		System.out.println("\n\nx1/2 = " + x12 + "i");				//because of the complex numbers
		System.out.println("x3/4 = -/+ " + x34);
	}
	else if(z2i==1) {				   				//because of complex numbers
		System.out.println("\n\nx1/2 = " + x12);
		System.out.println("x3/4 = " + x34 + "i");
	}
	else {
		System.out.println("\n\nx1/2 = -/+ " + x12);
		System.out.println("x3/4 = -/+ " + x34);
			
	}
	
	System.out.println("\nDone!");
	}
////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Quadratic formula!\n\n");
		Scanner abcz = new Scanner(System.in);
		
		System.out.println("A:");
		a = abcz.nextDouble();
		System.out.println("B:");
		b = abcz.nextDouble();
		System.out.println("C:");
		c = abcz.nextDouble();
		System.out.println("Factor of 'Z'?\n (e.g.: z = x² -> 2, no z -> 1)\n  :");
		z = abcz.nextDouble();
		abcz.close();
		//System.out.println("\na -> " + a);
		//System.out.println("b -> " + b);
		//System.out.println("c -> " + c);
		//System.out.println("z -> " + z);
		
////////	
		double WZL = (Math.pow(b, 2.0) - 4 * a * c);
		//System.out.println("\nUnter WZL -> " + WZL);
		if(WZL<0) {
			System.out.println("No x!");			//no x, because of mathematical principes :D
		}
		else {
			WZL = Math.pow(WZL, 0.5);
		}
		
		//System.out.println("\nNach WZL -> " + WZL);
		
		double Oben1 = ((-b) - WZL);
		double Oben2 = ((-b) + WZL);
		double Unten = (2*a);
////////		
		//System.out.println("\nOben1 -> " + Oben1);
		//System.out.println("Oben2 -> " + Oben2);
		//System.out.println("Unten -> " + Unten);
		z1 = Oben1/Unten;
		z2 = Oben2/Unten;
		
		if(z==1) {
			System.out.println("\n\nx1 = " + z1);
			System.out.println("\nx2 = " + z2 + "\n");
		}
		else {
			zMNF();
		}
		System.out.println("Done!");	

	}
	

}
