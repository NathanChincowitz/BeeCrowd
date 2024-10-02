/*Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2) and calculate the distance between them, showing four decimal places, according to the formula:

Distance = 

Input
The input file contains two lines of data. The first one contains two double values: x1 y1 and the second one also contains two double values with one digit after the decimal point: x2 y2.

Output
Calculate and print the distance value using the provided formula, with 4 decimal places.*/
import java.lang.Math;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x1, y1, x2, y2, result;
		
		x1 = teclado.nextDouble();
		y1 = teclado.nextDouble();
		x2 = teclado.nextDouble();
		y2 = teclado.nextDouble();
		
		result = Math.sqrt( ((x2 - x1)*(x2 - x1)) + ((y2-y1)*(y2-y1)) );
		
		System.out.printf("%.4f\n", result);
		
		teclado.close();
	}
}
