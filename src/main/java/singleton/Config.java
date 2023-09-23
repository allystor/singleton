package singleton;

import java.util.ArrayList;
import java.util.List;

//criar uma classe singleton que adicione canais do youtube dentro de uma lista
public class Config {

    private Config() {
        canais = new ArrayList<>();
    };
    private static Config instance = new Config();
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
    private List<String> canais;

    public void addCanal(String canal) {
        canais.add(canal);
    }
    public List<String> getCanais() {
        return canais;
    }
}
