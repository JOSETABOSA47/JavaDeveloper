package br.com.example.exercicios;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> filaExercicio = new LinkedList<>();

        filaExercicio.add("Juliana");
        filaExercicio.add("Pedro");
        filaExercicio.add("Carlos");
        filaExercicio.add("Larissa");
        filaExercicio.add("João");

        System.out.println("LISTA:---> " + filaExercicio);

        for (String item : filaExercicio) {
            System.out.println("COM FOR ---> " +item);
        }

        String PrimeiroSemRemove = filaExercicio.peek();

        System.out.println(PrimeiroSemRemove);
        System.out.println("LISTA:---> " + filaExercicio);

        String PrimeiroRemovendo = filaExercicio.poll();

        System.out.println(PrimeiroRemovendo);
        System.out.println("LISTA:---> " + filaExercicio);

        filaExercicio.add("Daniel");

        System.out.println(filaExercicio);

        int tamanho = filaExercicio.size();

        System.out.println("TAMANHO DA FILA:---> " + tamanho);

        boolean ListaVazia = filaExercicio.isEmpty();

        System.out.println(ListaVazia);

        boolean temCarlos = filaExercicio.contains("Carlos");

        System.out.println(temCarlos);

    }
}