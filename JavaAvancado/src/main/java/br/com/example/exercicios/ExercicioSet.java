package br.com.example.exercicios;

import java.util.LinkedHashSet;

public class ExercicioSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> exercicioSet = new LinkedHashSet<>();

        exercicioSet.add(3);
        exercicioSet.add(88);
        exercicioSet.add(20);
        exercicioSet.add(44);
        exercicioSet.add(3);

        System.out.println(exercicioSet);

        for (Integer numeros: exercicioSet) {
            System.out.println(numeros);
        }

        exercicioSet.remove(3);

        System.out.println(exercicioSet);

        exercicioSet.add(23);

        System.out.println(exercicioSet);

        System.out.println(exercicioSet.size());

        System.out.println(exercicioSet.isEmpty());

    }
}
