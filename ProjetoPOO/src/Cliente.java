public class Cliente {
    String nome;
    String telefone;
    long cpf;
    Computador[] computadoresComprados;
    float totalCompra;

    public Cliente(String nome, String telefone, long cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.computadoresComprados = new Computador[5];
        this.totalCompra = 0;
    }

    public void adicionarComputador(Computador computador) {
        for (int i = 0; i < computadoresComprados.length; i++) {
            if (computadoresComprados[i] == null) {
                computadoresComprados[i] = computador;
                totalCompra += computador.getPreco();
                break;
            }
        }
    }

    public void calculaTotalCompra() {
        System.out.println("Cliente: " + nome + " - Telefone: " + telefone + " - CPF: " + cpf);
        System.out.println("Computadores comprados:");
        for (Computador computador : computadoresComprados) {
            if (computador != null) {
                System.out.println(computador.exibirComputador());
                System.out.println();
            }
        }
        System.out.println("Total da Compra: R$" + totalCompra);
    }
}