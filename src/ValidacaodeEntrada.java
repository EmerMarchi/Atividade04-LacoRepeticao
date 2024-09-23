import java.util.Scanner;

public class ValidacaodeEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        do {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

        }while (idade <= 0);
    }
}
