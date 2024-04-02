package medium.dictionaryMap;

import java.util.HashMap;
import java.util.Map;

public class MyFirstMap {
    public Map<String, String> dictionary = new HashMap<>();

    public void insert(){
        dictionary.put("Bola", "Azul");
        dictionary.put("Boneca", "Amarelo");
        dictionary.put("Dado", "Rosa");
    }
    public void show(){
        for (Map.Entry<String, String> infos : dictionary.entrySet()) {
            System.out.println("Chave: " + infos.getKey() + ", Valor: " + infos.getValue());
        }

    }
}
