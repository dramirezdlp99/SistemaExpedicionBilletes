import java.util.HashMap;
import java.util.Map;

public class Destino {
    private static final Map<String, Double> destinos = new HashMap<>();

    static {
        destinos.put("Ciudad A", 30.0);
        destinos.put("Ciudad B", 50.0);
        destinos.put("Ciudad C", 45.0);
    }

    public static Map<String, Double> getDestinos() {
        return destinos;
    }
}
