import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para a contagem regressiva: ");
        int num = sc.nextInt();

        while (num  >= 0) {
            System.out.println(num);
            num--;
        }
    }
}
