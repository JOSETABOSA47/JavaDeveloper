package br.com.example.optional;

import java.util.Optional;

public class ExemploOptionalEstado {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor optional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor optional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor optional que está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor optional que lança erro NullPoiterException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));

    }
}
