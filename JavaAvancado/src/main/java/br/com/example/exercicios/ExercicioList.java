package br.com.example.exercicios;

import java.util.*;

public class ExercicioList {

    public static void main(String[] args) {

        List<String> Exercicio = new ArrayList<>();

        Exercicio.add("Juliana");
        Exercicio.add("Pedro");
        Exercicio.add("Carlos");
        Exercicio.add("Larissa");
        Exercicio.add("João");

        System.out.println(Exercicio);

        Iterator<String> interador = Exercicio.iterator();

        while (interador.hasNext()) {

            System.out.println("----: " +interador.next());
        }

        System.out.println(Exercicio);

        Exercicio.set(2, "Roberto");

        System.out.println(Exercicio);

        Exercicio.remove(0);

        System.out.println("REMOVIDO POSIÇÃO 1 ---> " + Exercicio);

        Exercicio.remove(3);

        System.out.println("REMOVIDO POSIÇÃO 4 ---> " + Exercicio);

        Exercicio.remove("João");

        System.out.println(Exercicio);

        int quant = Exercicio.size();

        System.out.println("QUANTIDADE DE ITEM É: " + quant);

        boolean temJuliana = Exercicio.contains("Juliana");

        System.out.println(temJuliana);

        List<String> ListaDois = new ArrayList<>();

        ListaDois.add("Ismael");
        ListaDois.add("Rodrigo");

        System.out.println(ListaDois);
        System.out.println(Exercicio);

        Exercicio.addAll(ListaDois);

        System.out.println(Exercicio);

        Collections.sort(Exercicio);

        System.out.println(Exercicio);

        //Exercicio.clear();

        boolean listavazia = Exercicio.isEmpty();

        if (listavazia == false) {

            System.out.println("Rapaz tem coisa  ai...");
        }
        else{
            System.out.println("Tem nada ai não pow...");
        }

        System.out.println(listavazia);

    }
}
