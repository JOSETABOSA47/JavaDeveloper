package br.com.example.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        //remove nota no set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        //retorna a quantidade de item do set
        System.out.println(notasAlunos.size());

        //navega todos os item do iterator no set
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()) {
            System.out.println("WHILE----> " + iterator.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println("FOR---> " + nota);
        }

        notasAlunos.clear();

        //retorna se o set esta vazio
        System.out.println(notasAlunos.isEmpty());




    }
}
