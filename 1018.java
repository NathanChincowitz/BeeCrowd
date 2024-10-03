/*
In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 and 1. Print the read value and the list of banknotes.

Input
The input file contains an integer value N (0 < N < 1000000).

Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int[] tipoNotas = { 100, 50, 20, 10, 5, 2, 1 };
        int[] quantidades = {0, 0, 0, 0, 0, 0, 0};
        int saque = 0, i = 0, temp = 0;
        
        saque = teclado.nextInt();
        temp = saque;
        while(i < tipoNotas.length){
            if(temp - tipoNotas[i] >= 0){
                quantidades[i]++;
                temp -= tipoNotas[i];
            }else{
                i++;
            }
        }
        
        i = 0;
        System.out.println(saque);
        while(i < tipoNotas.length){
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidades[i], tipoNotas[i]);
            i++;
        }
        
        teclado.close();
    }
}
