public class Cliente {
    String nome;
    String telefone;
    PC[] pcsComprados;
    int totalCompra;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.pcsComprados = new PC[5];  // Limite de 5 PCs
        this.totalCompra = 0;
    }

    public void adicionarPC(PC pc) {
        for (int i = 0; i < pcsComprados.length; i++) {
            if (pcsComprados[i] == null) {
                pcsComprados[i] = pc;
                totalCompra += pc.getPreco();
                break;
            }
        }
    }

    // Método para exibir as informações da compra
    public void mostrarCompra() {
        System.out.println("Cliente: " + nome + " - Telefone: " + telefone);
        System.out.println("PCs comprados:");
        for (PC pc : pcsComprados) {
            if (pc != null) {
                System.out.println(pc.exibirPC());
            }
        }
        System.out.println("Total da Compra: R$" + totalCompra);
    }
}
