import java.util.Scanner;

public class Teclado {
    private Scanner scanner = new Scanner(System.in);

    public String obtenerEntrada() {
        return scanner.nextLine();
    }
}
