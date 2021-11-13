package br.com.example;

import br.com.example.model.Usuario;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("Maike");
        usuario.setSenha("123");

        System.out.println("Usuario: " + usuario);
    }
}
