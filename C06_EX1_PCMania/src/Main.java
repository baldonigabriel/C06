import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados estáticos (hardcoded)
        Hardware h1 = new Hardware("Processador Core i5", 4);
        SistemaOperacional so1 = new SistemaOperacional("Windows 10", 64);
        PC pc1 = new PC(h1, so1, 123456);

        Hardware h2 = new Hardware("Memória RAM 8GB", 8);
        SistemaOperacional so2 = new SistemaOperacional("Linux Ubuntu", 32);
        PC pc2 = new PC(h2, so2, 654321);

        // Criando um cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, telefoneCliente);

        // Interface de compra
        int codigo;
        while (true) {
            System.out.println("\nEscolha o código da promoção (1 ou 2) ou 0 para sair:");
            System.out.println("1 - Promoção 1 (PC com Processador Core i5 e Windows 10)");
            System.out.println("2 - Promoção 2 (PC com Memória RAM 8GB e Linux Ubuntu)");
            System.out.print("Código: ");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            switch (codigo) {
                case 1:
                    cliente.adicionarPC(pc1);
                    break;
                case 2:
                    cliente.adicionarPC(pc2);
                    break;
                default:
                    System.out.println("Código inválido!");
            }
        }

        // Exibir a compra final
        cliente.mostrarCompra();

        scanner.close();
    }
}