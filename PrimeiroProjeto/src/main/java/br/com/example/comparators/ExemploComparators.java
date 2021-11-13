package br.com.example.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparators {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Marina", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- ordem de inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("--- ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("--- ordem natural dos números - idade (method reference");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--- ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("--- ordem natural dos números - idade (Interface Comparator");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemReversaComparator());
        System.out.println("--- ordem reversa dos números - idade (Interface Comparator");
        System.out.println(estudantes);





    }
}
