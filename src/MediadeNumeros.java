import java.util.Scanner;

public class MediadeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Insira um número maior que zero.");
        }else {
            for (int i = 1; i <= n; i++) {
                System.out.println("Digite o numero "+ i +"º:");
                double num = sc.nextDouble();
                soma += num;
            }
            System.out.println("A média dos números é: "+(soma / n ));
        }
        }
    }
