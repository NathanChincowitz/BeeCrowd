/*The formula to calculate the area of a circumference is defined as A = π . (R.R)
Considering to this problem that π = 3.14159:

Calculate the area using the formula given in the problem description.

Input
The input contains a value of floating point (double precision), that is the variable R.

Output
Present the message "A=" followed by the value of the variable, as in the example bellow, with four places after the decimal point.
Use all double precision variables. Like all the problems, don't forget to print the end of line after the result, otherwise you will receive "Presentation Error".*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double r, a;
	    double pi = 3.14159;
	    Scanner teclado = new Scanner(System.in);
	    
	    r = teclado.nextDouble();
	    
	    //A = π . (R.R)
	    a = pi * (r*r);
	    
	    System.out.println("A=" + (String.format("%.4f", a)));
	}
}
