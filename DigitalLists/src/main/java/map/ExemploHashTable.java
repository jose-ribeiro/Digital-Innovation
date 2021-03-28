package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {
        HashMap<String, Integer> estudantes = new HashMap<>();

        estudantes.put("CArlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        //Rempvendo um estudante no indice  0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        //Recupera um estudante no inice 2;
        int idadeEstudantw = estudantes.get("Mariana");

        System.out.println(idadeEstudantw);

        System.out.println(estudantes.size());
        //Navegar nos  registro do mapa
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        System.out.println(estudantes);


    }

}
