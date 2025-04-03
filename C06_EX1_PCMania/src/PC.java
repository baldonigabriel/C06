public class PC {
    Hardware hardware;
    SistemaOperacional sistema;
    int preco;

    public PC(Hardware hardware, SistemaOperacional sistema, int matricula) {
        this.hardware = hardware;
        this.sistema = sistema;
        // O preço é a matrícula somada de 1234 ou 5678
        this.preco = matricula + (matricula % 2 == 0 ? 1234 : 5678);
    }

    public int getPreco() {
        return preco;
    }

    // Método para exibir as informações do PC
    public String exibirPC() {
        return "PC com " + hardware.tipo + " - " + hardware.capacidade + " e " + sistema.nome + " " + sistema.tipo + " bits - Preço: R$" + preco;
    }
}
