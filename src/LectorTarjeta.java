import java.util.Scanner;

public class LectorTarjeta {
    public static boolean validar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu número de tarjeta: ");
        String tarjeta = scanner.nextLine();

        System.out.print("Introduce tu PIN: ");
        String pin = scanner.nextLine();

        return pin.length() == 4;
    }
}
