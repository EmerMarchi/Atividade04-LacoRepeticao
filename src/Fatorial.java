import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int num = sc.nextInt();

       int fatorial = 1;
       int i = num;

       do {
           fatorial *= i;
           i--;
       }while (i > 0);
       System.out.println("O fatorial de "+ num +" = "+ fatorial);
       }
}