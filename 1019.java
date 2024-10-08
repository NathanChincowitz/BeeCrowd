/*
Read an integer value, which is the duration in seconds of a certain event in a factory, and inform it expressed in hours:minutes:seconds.

Input
The input file contains an integer N.

Output
Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.
*/
import java.util.Scanner;
public class b1019 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int nSec = 0, temp = 0;
        int segundos = 0, minutos = 0, horas = 0;
        
        nSec = teclado.nextInt();
        temp = nSec;

        segundos = temp % 60;
        
        temp = temp / 60;

        minutos = temp % 60;
        
        temp = temp / 60;

        horas = temp;

        System.out.printf("%d:%d:%d\n",horas,minutos,segundos);

        teclado.close();
    }
}
