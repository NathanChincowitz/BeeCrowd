/*Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". Use the following formula:

Input
The input file contains 3 integer values.

Output
Print the greatest of these three values followed by a space and the message “eh o maior”.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        
        int[] valores = new int[3];
        int maior = 0;
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            valores[i] = teclado.nextInt();
            if(valores[i] > maior){
                maior = valores[i];
            }
        }
        System.out.println(maior + " eh o maior");
	}
}
