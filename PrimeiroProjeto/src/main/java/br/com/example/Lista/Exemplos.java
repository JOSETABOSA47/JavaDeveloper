package br.com.example.Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exemplos {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        //Adicianando na lista
        nomes.add("Jose");
        nomes.add("Maike");
        nomes.add("Mateus");
        nomes.add("Carlos");
        nomes.add("Tabosa");

        System.out.println(nomes);

        //Alterando um elemento da lista com indice
        nomes.set(2, "Pedro");

        System.out.println(nomes);

        //Odenando lista de elementos
        Collections.sort(nomes);

        System.out.println(nomes);

        //Alterando um elemento da lista com indice no modo ordenado
        nomes.set(3, "Braga");

        System.out.println(nomes);

        //Removendo com indice
        nomes.remove(4);

        System.out.println(nomes);

        //Removendo com elemento
        nomes.remove("Maike");

        System.out.println(nomes);

        //Buscando um elemento especifico na lista usando o indice
        String nome = nomes.get(3-1);

        System.out.println(nome);

        //buscando a quantidade de elementos da lista
        int tamanho = nomes.size();

        System.out.println(tamanho);

        // verificando se tem esse elemento na lista
        boolean temBraga = nomes.contains("Braga");

        System.out.println(temBraga);

        //verificando se eu tenho algum elemento dentro da minha lista
        // vai responder com true para sim e false para não
        boolean ListaVazia = nomes.isEmpty();

        System.out.println(ListaVazia);

        //ele retornar a posição do elemento na lista
        //caso não tenha esse elemento ele retornar valor -1 que significar não encontrei esse elemento na lista.
        int posicao = nomes.indexOf("Braga");

        System.out.println(posicao);

        //percorre a lista elemento por elemento.
        for (String Item: nomes) {
            System.out.println("COM FOR ---> "+ Item);
        }

        //percorre a lista elemento por elemento.
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {

            System.out.println("COM ITERATOR E WHILE ---> "+ iterator.next());
        }

    }
}
