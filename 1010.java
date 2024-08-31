/*In this problem, the task is to read;
a code of a product 1,
the number of units of product 1,
the price for one unit of product 1,
the code of a product 2,
the number of units of product 2 and the price for one unit of product 2.
After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay.
Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int p1_Id, p1_Un, p2_Id, p2_Un;
        float p1_Rs, p2_Rs, total;
		Scanner teclado = new Scanner(System.in);
		
		p1_Id = teclado.nextInt();
		p1_Un = teclado.nextInt();
		p1_Rs = teclado.nextFloat();
		
		p2_Id = teclado.nextInt();
		p2_Un = teclado.nextInt();
		p2_Rs = teclado.nextFloat();
		
		total = ((p1_Un * p1_Rs) + (p2_Un * p2_Rs));
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f",total));
	}
}
