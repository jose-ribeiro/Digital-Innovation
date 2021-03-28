package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {
    public static void main(String[] args) {
        List <Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("----------oredes de inserção------------");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() -second.getIdade());

        System.out.println("----------Orden natural dos numeros-----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("oregem natural dos numeros- idade metodo reference");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println("interface comparable");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdenIdadeReversaComparador());

        System.out.println("ordem reversa dos  numeros - idade");
        System.out.println(estudantes);

    }
}
