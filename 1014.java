/*Calculate a car's average consumption being provided the total distance
traveled (in Km) and the spent fuel total (in liters).

Input
The input file contains two values:
one integer value X representing the total distance (in Km)
and the second one is a floating point number Y  representing the spent fuel total,
with a digit after the decimal point.

Output
Present a value that represents the average consumption of a car with 3 digits after the decimal point,
followed by the message "km/l".

ex:
500
35.0

2254
124.4
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int km;
		float fuel, km_L;
		
		km = teclado.nextInt();
		fuel = teclado.nextFloat();
		
		km_L = km / fuel;
		
		System.out.printf("%.3f km/l\n",km_L);
		
		
	}
}
