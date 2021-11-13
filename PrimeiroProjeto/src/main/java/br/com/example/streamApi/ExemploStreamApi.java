package br.com.example.streamApi;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStreamApi {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("José");
        estudantes.add("Tabosa");
        estudantes.add("Maike");
        estudantes.add("João");
        estudantes.add("Mateus");
        estudantes.add("Maria");

        System.out.println(estudantes);

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Maior numero de letras: "
                + estudantes.stream().max(Comparator.comparingInt(
                        String::length)));

        System.out.println("Menor numero de letras: "
                + estudantes.stream().min(Comparator.comparingInt(
                        String::length)));


        System.out.println("Com letra r no nome: "
            + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r"))
                    .collect(Collectors.toList()));


        System.out.println("Retorna uma coleção com a quantidade de letra: "
            + estudantes.stream().map(estudante -> estudante.concat(" - ")
                .concat(String.valueOf(estudante.length())))
                    .collect(Collectors.toList()));


        System.out.println("Retorna somente os 3 primeiro elementos: "
            + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorna os elementos no console e depois retorna a mesmo coleção: "
            + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Todos os elemento tem a letra W no nome: "
                + estudantes.stream().allMatch((elemento) -> elemento.contains("w")));

        System.out.println("Retorna true se tiver algum elemento com a minusculo no nome: "
            + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        System.out.println("Não tem nenhum elemento com a minusculo no nome: "
            + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream().peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(
                    estudante.length()))).peek(System.out::println).filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                        .collect(Collectors.toList()));
                        //.collect(Collectors.joining(", ")));
                        //.collect(Collectors.toSet()));
                        //.collect(Collectors.groupingBy(estudante ->
                        //    estudante.substring(estudante.indexOf("-") + 1)));
                        //    estudante.substring(estudante.indexOf("-") + 1)));


    }

}
