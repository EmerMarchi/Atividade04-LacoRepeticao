import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para obter sua tabuada: ");
        int num = sc.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}