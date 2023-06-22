import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        float n3;
        System.out.printf("Digite o primeiro número inteiro: ");
        n1 = ler.nextInt();
        System.out.printf("Digite o segundo número inteiro: ");
        n2 = ler.nextInt();
        System.out.printf("Digite o primeiro número real: ");
        n3 = ler.nextFloat();
        System.out.println("A - " + ((2*n1)*(n2/2)));
        System.out.println("B - " + ((3*n1)+n3));
        System.out.println("C - " + (n3*n3*n3));
    }
}
