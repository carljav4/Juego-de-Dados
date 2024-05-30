import java.util.Random;

public class Dado {
    private int caraSuperior;

    public void lanzar() {
        Random rand = new Random();
        caraSuperior = rand.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }
}
