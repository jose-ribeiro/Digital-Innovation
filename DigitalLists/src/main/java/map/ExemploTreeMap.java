package map;
import java.util.Iterator;
import  java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Montando a arvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC" , "Florianopolis");
        treeCapitais.put("PR" , "Curitiba");
        treeCapitais.put("SP" , "Sao paulo");
        treeCapitais.put("RJ" , "Rio de janeiro");
        treeCapitais.put("MG" , "Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeoira capital no top da arvore
        System.out.println("firstKey -" + treeCapitais.firstKey());

        //Retorna a ultima capital no final da arvore
        System.out.println("lastKey " +treeCapitais.lastKey());

        //Retorna a primeira capital abaixo na arvore da capital parametrizado
        System.out.println("lowerKey " +treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital acima na arvore da capital parametrizado
        System.out.println("higherKey " + treeCapitais.higherKey("SC"));

        //todas capitals no console
        System.out.println(treeCapitais);

        //return primeira capital do top da arvore
        System.out.println(treeCapitais.firstEntry().getKey() + "-" + treeCapitais.firstEntry().getValue());

        //Retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastEntry().getKey() + "----" + treeCapitais.lastEntry().getValue());

        System.out.println(treeCapitais);

        Map.Entry<String, String> firsEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lasEntry  = treeCapitais.pollLastEntry();

        //Rerona a primeira capital no topo da arvore removendo do map
        System.out.println(firsEntry.getKey() + "-" + firsEntry.getValue());

        //Retorna a primeira capital no final da arvore, removendo do map
        System.out.println(lasEntry.getKey()+ "-" + lasEntry.getValue());

        //exibe all
        System.out.println(treeCapitais);

        //Navegando em todas as chaves do intrator

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key +"-" + treeCapitais.get(key));
        }
        for (String capital: treeCapitais.keySet()) {
            System.out.println(capital + "--" + treeCapitais.get(capital));

        }
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + "---"+ capital.getValue());

        }

    }


}