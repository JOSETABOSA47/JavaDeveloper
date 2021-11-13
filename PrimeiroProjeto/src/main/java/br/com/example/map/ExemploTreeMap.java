package br.com.example.map;

import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Brasil");
        treeCapitais.put("SC", "Florialopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.firstKey());

        System.out.println(treeCapitais.lastKey());

        System.out.println(treeCapitais.lowerKey("SC"));

        System.out.println(treeCapitais.higherKey("SC"));


    }
}
