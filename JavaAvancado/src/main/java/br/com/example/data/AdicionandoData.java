package br.com.example.data;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AdicionandoData {
    public static void main(String[] args){

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);

        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);
    }
}
