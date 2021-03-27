package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHasSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequinciaNumerica = new LinkedHashSet<>();

        //Adicionar os numeros  no ste
        sequinciaNumerica.add(1);
        sequinciaNumerica.add(2);
        sequinciaNumerica.add(4);
        sequinciaNumerica.add(8);
        sequinciaNumerica.add(16);

        System.out.println(sequinciaNumerica);

        //remoce o número do set
        sequinciaNumerica.remove(4);

        System.out.println(sequinciaNumerica);

        //Retorna a quantidade de itens do set
        System.out.println(sequinciaNumerica.size());

        //Navega em todos os itens iterator
        Iterator<Integer> iterator = sequinciaNumerica.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer numero: sequinciaNumerica) {
            System.out.println(numero);
            
        }
        sequinciaNumerica.clear();

        //Retorne uma lista vazia ou não
        System.out.println(sequinciaNumerica.isEmpty());
    }
}
