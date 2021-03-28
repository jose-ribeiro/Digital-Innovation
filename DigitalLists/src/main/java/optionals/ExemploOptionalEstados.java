package optionals;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não esta presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null= não esta presente"));

        Optional<String>  emptOptional  = Optional.empty();

        System.out.println("Valor opcional que não esta presente");
        emptOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não esta presente"));

        Optional<String> optionalNullErro  = Optional.of(null);

        System.out.println("Valor opcional que lanca erro NullPointException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não esta presente"));
    }
}
