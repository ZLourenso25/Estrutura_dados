import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] num = new double[50];
        double media, soma = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Digite um número");
            num[i] = scanner.nextDouble();
            soma += num[i];
        }

        media = soma / 50;
        System.out.println("A média das 50 notas digitadas é: " + media);
    }
}
