package br.com.example.exercicios;

import java.util.Map;
import java.util.TreeMap;

public class ExercicioMap {

    public static void main(String [] args) {

        TreeMap<String, String> mapEstado = new TreeMap<>();

        mapEstado.put("AC", "Acre");
        mapEstado.put("AL", "Alagoas");
        mapEstado.put("AP", "Amapá");
        mapEstado.put("AM", "Amazonas");
        mapEstado.put("BA", "Bahia");
        mapEstado.put("CE", "Ceará");
        mapEstado.put("ES", "Espírito Santo");
        mapEstado.put("RR", "Roraima");
        mapEstado.put("GO", "Goiás");
        mapEstado.put("MA", "Maranhão");
        mapEstado.put("MT", "Mato Grosso");
        mapEstado.put("MS", "Mato Grosso do Sul");
        mapEstado.put("MG", "Minas Gerais");
        mapEstado.put("PA", "Pará");
        mapEstado.put("PB", "Paraíba");
        mapEstado.put("PR", "Paraná");
        mapEstado.put("PE", "Pernambuco");
        mapEstado.put("PI", "Piauí");
        mapEstado.put("RJ", "Rio de Janeiro");
        mapEstado.put("RN", "Rio Grande do Norte");
        mapEstado.put("RS", "Rio Grande Sul");
        mapEstado.put("RO", "Rondônia");
        mapEstado.put("SC", "Santa Catarina");
        mapEstado.put("SP", "São Paulo");
        mapEstado.put("SE", "Sergipe");
        mapEstado.put("TO", "Tocantins");

        System.out.println(mapEstado);

        mapEstado.remove("MG");

        System.out.println(mapEstado);

        mapEstado.put("DF", "Distrito Ferderal");

        System.out.println(mapEstado);

        System.out.println(mapEstado.size());

        mapEstado.remove("Mato Grosso do Sul");

        System.out.println(mapEstado);

        for (Map.Entry<String, String> entry : mapEstado.entrySet()) {
            //System.out.println(entry.getKey() + " -- " + entry.getValue());
            System.out.println(entry.getValue() + " (" + entry.getKey() + ")");
        }

        boolean temAi = mapEstado.containsKey("SC");

        System.out.println(temAi);

        mapEstado.remove("SC");

        boolean temAi1 = mapEstado.containsKey("SC");

        System.out.println(temAi1);

        boolean temMaranhao = mapEstado.containsValue("Maranhão");

        System.out.println(temMaranhao);


    }
}
