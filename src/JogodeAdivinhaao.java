import java.util.Random;
import java.util.Scanner;

public class JogodeAdivinhaao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int numAleatorio = rand.nextInt(100) + 1;
        int numUsuario = 0;

        while (numUsuario != numAleatorio) {
            System.out.print("Digite um numero entre 1 a 100: ");
            numUsuario = sc.nextInt();
            if (numUsuario != numAleatorio) {
                System.out.println("Tente novamente: ");
            }else {
                System.out.println("Você acertou!");
            }
        }
    }
}
