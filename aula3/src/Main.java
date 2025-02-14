import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor do lanche 1: ");
        int lanche1 = entrada.nextInt();
        System.out.print("Informe o valor do lanche 2: ");
        int lanche2 = entrada.nextInt();
        System.out.print("Informe o valor do lanche 3: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        float media = (float)total/3;

        System.out.println("Total de lanches: "+total);
        System.out.println("Média de lanches: "+media);

        entrada.close();
    }
}