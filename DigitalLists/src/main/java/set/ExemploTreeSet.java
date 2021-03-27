package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São paulo");
        treeCapitais.add("Rio de janeiro");
        //treeCapitais.add("Belo horizonte");

        //primeira capital
        System.out.println(treeCapitais);
        //primeira da lista
        System.out.println(treeCapitais.first());
        //retorna a utima da lista
        System.out.println(treeCapitais.last());
        //retorna a primeira cap abaixo na arvore de capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));
        //reotrna a primeira capital acima da arvore de capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));
        //todas as capitais
        System.out.println(treeCapitais);
        //retorna a primeira capital do top da arvore, removendo do set
        System.out.println(treeCapitais.pollFirst());
        //retorna a primeira capital do final da arvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String capital: treeCapitais ) {
            System.out.println(capital);

        }


    }
}
