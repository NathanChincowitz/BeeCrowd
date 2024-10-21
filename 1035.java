/*
Read 4 integer values A, B, C and D.
Then if B is greater than C and D is greater than A -
and if the sum of C and D is greater than the sum of A and B
and if C and D were positives values
and if A is even, write the message “Valores aceitos” (Accepted values).
Otherwise, write the message “Valores nao aceitos” (Values not accepted).

Input
Four integer numbers A, B, C and D.

Output
Show the corresponding message after the validation of the values​​.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c,d;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        if (b>c && d>a && ((c+d)>(a+b)) && (c>=0 && d>=0) && (a%2 == 0)){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }

        teclado.close();
    }
}
