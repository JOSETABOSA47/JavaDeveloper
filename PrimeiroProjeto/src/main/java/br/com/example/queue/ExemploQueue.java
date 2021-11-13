package br.com.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pedro");
        filaBanco.add("Jose");
        filaBanco.add("Tabosa");
        filaBanco.add("Mateus");
        filaBanco.add("Maike");

        System.out.println(filaBanco);

        //ele printa o primeiro elemento e remove da list
        String clienteAseratendido = filaBanco.poll();

        System.out.println(clienteAseratendido);

        System.out.println(filaBanco);

        //ele printa o primeiro elemento e não remove da list
        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        //ele printa o primeiro elemento e se a lista estivar vazia ele da um erro
        String MetodoElemento = filaBanco.element();

        System.out.println(MetodoElemento);






    }
}
