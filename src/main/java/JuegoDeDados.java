public class JuegoDeDados {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    public JuegoDeDados() {
        dado1 = new Dado();
        dado2 = new Dado();
        calculadora = new Calculadora();
    }

    public void jugar() {
        dado1.lanzar();
        dado2.lanzar();

        int suma = calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());

        System.out.println("Dado 1: " + dado1.getCaraSuperior());
        System.out.println("Dado 2: " + dado2.getCaraSuperior());
        System.out.println("Suma de los dos dados: " + suma);

        if (suma == 7) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Has perdido.");
        }
    }

    public static void main(String[] args) {
        JuegoDeDados juego = new JuegoDeDados();
        juego.jugar();
    }
}
