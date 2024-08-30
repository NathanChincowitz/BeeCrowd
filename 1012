/*Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data.
Each line corresponds to one of the areas described above,
always with a corresponding message (in Portuguese) and one space between the two points and the value.
The value calculated must be presented with 3 digits after the decimal point.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double a, b, c;
		double pi = 3.14159;
		Scanner teclado = new Scanner(System.in);
		
		//System.out.print("Valor A: ");
		a = teclado.nextDouble();
		
		//System.out.print("Valor B: ");
		b = teclado.nextDouble();
		
		//System.out.print("Valor C: ");
		c = teclado.nextDouble();
		
		//a) the area of the rectangled triangle that has base A and height C. | ((a*c)/2)
        String recTrian = String.format("%.3f",((a*c)/2));	
        System.out.println("TRIANGULO: " + recTrian);
        
        //b) the area of the radius's circle C. (pi = 3.14159)
        String areaCirc = String.format("%.3f",(pi *(c*c)));
        System.out.println("CIRCULO: " + areaCirc);
        
        //c) the area of the trapezium which has A and B by base, and C by height. | ((B+b)*h)/2
        String areaTrap = String.format("%.3f",(((a+b)*c)/2));
        System.out.println("TRAPEZIO: " + areaTrap);
		
		//d) the area of the square that has side B.
		String areaQuad = String.format("%.3f",(b*b));
		System.out.println("QUADRADO: " + areaQuad);
		
		//e) the area of the rectangle that has sides A and B.
		String areaRect = String.format("%.3f",(a*b));
		System.out.println("RETANGULO: " + areaRect);
		
	}
}
