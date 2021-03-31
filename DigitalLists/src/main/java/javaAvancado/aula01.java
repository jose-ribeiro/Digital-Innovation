package javaAvancado;

import java.util.function.UnaryOperator;

public class aula01 {
    public static void main(String[] args) {

        UnaryOperator<Integer> exemploLambda = valor -> valor*3;//programação funcional
        int valor = 10;
        System.out.println(" o resultado e : " + exemploLambda.apply(10));
    }
}
