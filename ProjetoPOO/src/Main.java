// Gabriel Baldoni de Souza Patta - 451 - GES

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();
        System.out.print("Digite o CPF do cliente (somente números): ");
        long cpfCliente = scanner.nextLong();

        Cliente cliente = new Cliente(nomeCliente, telefoneCliente, cpfCliente);

        int numeroDeCompras = 5;

        for (int i = 0; i < numeroDeCompras; i++) {
            System.out.println("\nEscolha o código da promoção (1, 2 ou 3) ou 0 para sair:");
            System.out.println("1 - Promoção 1 (Marca: Apple, Processador: Pentium Core i3)");
            System.out.println("2 - Promoção 2 (Marca: Samsung, Processador: Pentium Core i5)");
            System.out.println("3 - Promoção 3 (Marca: Dell, Processador: Pentium Core i7)");
            System.out.print("Código: ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                System.out.println("Compra finalizada.");
                break;
            }

            Computador computador = new Computador();
            computador.mostraPCConfigs(123456, codigo);

            if (codigo == 1) {
                MemoriaUSB memoriaUSB = new MemoriaUSB("Pen-drive", 16);
                computador.addMemoriaUSB(memoriaUSB);
            } else if (codigo == 2) {
                MemoriaUSB memoriaUSB = new MemoriaUSB("Pen-drive", 32);
                computador.addMemoriaUSB(memoriaUSB);
            } else if (codigo == 3) {
                MemoriaUSB memoriaUSB = new MemoriaUSB("HD Externo", 1000);
                computador.addMemoriaUSB(memoriaUSB);
            }

            System.out.print("Deseja adicionar uma memória externa (HD Externo)? (s/n): ");
            scanner.nextLine();
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                MemoriaUSB hdExterno = new MemoriaUSB("HD Externo", 1000);
                computador.addMemoriaUSB(hdExterno);
                System.out.println("Memória Externa (HD Externo) adicionada!");
            }

            cliente.adicionarComputador(computador);
        }

        cliente.calculaTotalCompra();

        scanner.close();
    }
}
