package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeosMundialFifa = new HashMap<>();
        campeosMundialFifa.put("Brasil", 5);
        campeosMundialFifa.put("Alemanha", 2);
        campeosMundialFifa.put("Italia", 2);
        campeosMundialFifa.put("Uruguai",1);
        campeosMundialFifa.put("Argentina", 2);
        campeosMundialFifa.put("Franca", 2);
        campeosMundialFifa.put("Inglaterra", 1);
        campeosMundialFifa.put("Espanha", 1);

        System.out.println(campeosMundialFifa);

        //Atualiza o valor para a chave br
        campeosMundialFifa.put("Brasil", 6);
        System.out.println(campeosMundialFifa);

        //Retorna a Argentina
        System.out.println(campeosMundialFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeosMundialFifa.containsKey("Franca"));

        //Remove o campeão Franca
        campeosMundialFifa.remove("Franca");

        //Retorna se existe ou não um campeao frança
        System.out.println(campeosMundialFifa.containsKey("Franca"));

        //Retorna se existe ou não alguma seleção campeã
        System.out.println(campeosMundialFifa.containsValue(6));

        //Reotrna o tamanho do mapa
        System.out.println(campeosMundialFifa.size());

        System.out.println(campeosMundialFifa);

        //Navegar mps registros
        for (Map.Entry<String, Integer> entry : campeosMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + "____" + entry.getValue());

        }

        for (String key: campeosMundialFifa.keySet()) {
            System.out.println(key + "_______" + campeosMundialFifa.get(key));

        }

        System.out.println(campeosMundialFifa);

        System.out.println(campeosMundialFifa.containsKey("Estados Unidos"));

        System.out.println(campeosMundialFifa.size());

        campeosMundialFifa.clear();
        System.out.println(campeosMundialFifa.size());


    }
}
