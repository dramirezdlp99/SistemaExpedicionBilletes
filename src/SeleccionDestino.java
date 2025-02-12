import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeleccionDestino {
    private static Map<String, Double> destinos = new HashMap<>();

    static {
        destinos.put("Ciudad A", 30.0);
        destinos.put("Ciudad B", 50.0);
        destinos.put("Ciudad C", 45.0);
    }

    public static String seleccionar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Destinos disponibles:");
        for (Map.Entry<String, Double> destino : destinos.entrySet()) {
            System.out.println(destino.getKey() + ": $" + destino.getValue());
        }

        System.out.print("Selecciona tu destino: ");
        String seleccion = scanner.nextLine();

        if (destinos.containsKey(seleccion)) {
            return seleccion;
        } else {
            System.out.println("Destino no válido.");
            return seleccionar();
        }
    }

    public static double obtenerPrecio(String destino) {
        return destinos.getOrDefault(destino, 0.0);
    }
}
