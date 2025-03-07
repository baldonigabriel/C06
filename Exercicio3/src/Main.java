public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 200;

        zumbi1.ganharvida();
        zumbi1.ganharvida();
        zumbi1.ganharvida();
        zumbi1.ganharvida();

        zumbi2.perdervida();
        zumbi2.perdervida();
        zumbi2.perdervida();
        zumbi2.perdervida();

        System.out.println("A vida do zumbi 1 é: "+zumbi1.vida);
        System.out.println("A vida do zumbi 2 é: "+zumbi2.vida);

        zumbi2 = zumbi1;

        zumbi1.ganharvida();
        zumbi2.perdervida();
        zumbi1.ganharvida();

        System.out.println("A vida do zumbi 1 é: "+zumbi1.vida);
        System.out.println("A vida do zumbi 2 é: "+zumbi2.vida);

    }
}