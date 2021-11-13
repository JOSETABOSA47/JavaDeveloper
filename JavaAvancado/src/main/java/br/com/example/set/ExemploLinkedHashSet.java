package br.com.example.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //remove um numero do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        //navegando no itens da set
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println("WHILE --> " + iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println("FOR --> " + numero);
        }

        //retorna se o set esta vazio
        System.out.println(sequenciaNumerica.isEmpty());


    }
}
