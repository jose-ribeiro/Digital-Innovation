package optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptinalPrimitivos {
    public static void main(String[] args) {
        System.out.println("valor interio");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Valor decimal");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("Valor longo opcional");
        OptionalLong.of(23L).ifPresent(System.out::println);

    }
}
