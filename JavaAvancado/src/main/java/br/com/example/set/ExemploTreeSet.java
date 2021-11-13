package br.com.example.set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

        //retorna a ulltima capital no final da arvore
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixo na arvore da capitalp parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //retrna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //exibe todas as capitais no console
        System.out.println(treeCapitais);

        //retorna a primaira capital no topo da arvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //retorna a primaira capital no final da arvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

    }
}
