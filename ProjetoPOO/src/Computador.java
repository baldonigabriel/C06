public class Computador {
    String marca;
    HardwareBasico hardware;
    int memoriaRAM;
    int hd;
    SistemaOperacional sistemaOperacional;
    String acessorio;
    float preco;
    MemoriaUSB memoriaUSB;

    public Computador() {
        hardware = new HardwareBasico("", 0);
    }

    public void mostraPCConfigs(int matricula, int codigoPromocao) {
        if (codigoPromocao == 1) {
            marca = "Apple";
            hardware.tipo = "Pentium Core i3 (2200 Mhz)";
            hardware.capacidade = 2200;
            memoriaRAM = 8;
            hd = 500;
            sistemaOperacional = new SistemaOperacional();
            sistemaOperacional.nome = "Sistema Operacional Linux Ubuntu";
            sistemaOperacional.tipo = 32;
            acessorio = "Acompanha Pen-drive de 16GB";
            preco = matricula;
        } else if (codigoPromocao == 2) {
            marca = "Samsung";
            hardware.tipo = "Pentium Core i5 (3370 Mhz)";
            hardware.capacidade = 3370;
            memoriaRAM = 16;
            hd = 1000;
            sistemaOperacional = new SistemaOperacional();
            sistemaOperacional.nome = "Sistema Operacional Windows 8";
            sistemaOperacional.tipo = 64;
            acessorio = "Acompanha Pen-drive de 32GB";
            preco = matricula + 1234;
        } else if (codigoPromocao == 3) {
            marca = "Dell";
            hardware.tipo = "Pentium Core i7 (4500 Mhz)";
            hardware.capacidade = 4500;
            memoriaRAM = 32;
            hd = 2000;
            sistemaOperacional = new SistemaOperacional();
            sistemaOperacional.nome = "Sistema Operacional Windows 10";
            sistemaOperacional.tipo = 64;
            acessorio = "Acompanha HD Externo de 1TB";
            preco = matricula + 5678;
        }
    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }

    public String exibirComputador() {
        String infoComputador = "Marca: " + marca + "\n" +
                "Processador: " + hardware.tipo + " (" + hardware.capacidade + " MHz)\n" +
                "Memória RAM: " + memoriaRAM + " GB\n" +
                "HD: " + hd + " GB\n" +
                "Sistema Operacional: " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)\n" +
                "Acessório: " + acessorio + "\n" +
                "Preço: R$" + preco;

        if (memoriaUSB != null) {
            infoComputador += "\nMemória USB: " + memoriaUSB.exibirMemoriaUSB();
        }

        return infoComputador;
    }

    public float getPreco() {
        return preco;
    }
}
