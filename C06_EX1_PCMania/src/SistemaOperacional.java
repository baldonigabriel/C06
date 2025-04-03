public class SistemaOperacional {
    String nome; // Nome do SO (ex: Linux Ubuntu)
    int tipo;    // Tipo de SO (32 ou 64 bits)

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome + " " + tipo + " bits";
    }
}
