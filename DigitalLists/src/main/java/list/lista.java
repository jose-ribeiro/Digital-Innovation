package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class lista {

        public static void main(String[] args) {
            List<String> nomes= new ArrayList<>();
            nomes.add("Carlos");
            nomes.add("Jose");
            nomes.add("Julia");
            nomes.add("Maria");
            nomes.add("Didi");
            nomes.add("Anderson");
            System.out.println(nomes);
            nomes.set(2,"kariane");

            System.out.println(nomes);
            Collections.sort(nomes);
            nomes.set(0,"zariane");
            System.out.println(nomes);

            nomes.remove(4);

            System.out.println(nomes);

            int posicao = nomes.indexOf("Jose");
            System.out.println(posicao);

            nomes.remove("Didi");
            System.out.println(nomes);
            String nome= nomes.get(2);

            System.out.println(nome);

            int tamanho = nomes.size();
            System.out.println(tamanho);

            nomes.remove("Jose");

            tamanho = nomes.size();
            System.out.println(tamanho);


            boolean tem = nomes.contains("Carlos");
            System.out.println(tem);

            boolean tem1 = nomes.contains("Eu");
            System.out.println(tem1);

            boolean listavazia = nomes.isEmpty();
            System.out.println(listavazia);
            for (String nomeElementos: nomes) {
                System.out.println("--->" + nomeElementos);

            }
            Iterator<String> interator = nomes.iterator();
            while(interator.hasNext()){
                System.out.println("------> " + interator.next());
            }



            nomes.clear();

            listavazia = nomes.isEmpty();
            System.out.println(listavazia);





        }
}


