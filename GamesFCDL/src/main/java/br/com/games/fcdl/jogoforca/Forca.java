package br.com.games.fcdl.jogoforca;

import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {
        String palavrachave = "bicicleta";
        String letraUsada = "";
        String palavraAdivinhada = "";

        int MAX_TENTATIVAS = 10;

        for(int i= 0; i < palavrachave.length(); i++){
            palavraAdivinhada += "_";

            for (int tentativas = 0; ; tentativas++){
                if (tentativas == MAX_TENTATIVAS){
                    System.out.printf("Forma 10 tentativas... A palavra era '%s'", palavrachave);
                    System.exit(0);
                }

                System.out.printf("%nRODADA %d:%nAté agora adivinhada: (%s)%n%nQual a sua próxima letra: ", tentativas, palavraAdivinhada);

                char letraTentada = new Scanner(System.in ).next().charAt(0);
                if (letraUsada.indexOf(letraTentada) >= 0){
                    System.out.printf("Você já tentou a letra %c.%n", letraTentada);
                } else {
                    letraUsada += letraTentada;

                    if (palavrachave.indexOf(letraTentada) >= 0){
                        palavraAdivinhada = "";

                        for (int j = 0; j < palavrachave.length(); j++){
                            palavraAdivinhada += letraUsada.indexOf(palavrachave.charAt(j)) >= 0 ? palavrachave.charAt(j) : "_";
                        }

                        if (palavraAdivinhada.contains("_")){
                            System.out.printf("Muito bom! %s existe na palavra. Ainda tem letras escondidas%n", letraTentada);
                        } else{
                            System.out.printf("%nParabens! A palavra adivinhada era '%s'", palavraAdivinhada);
                            System.exit(0);
                        }
                    }else{
                        System.out.printf("Infelizmente a letra %c não existe na palavra.", letraTentada);
                    }
                }


                char erro = 0;
                for (int p = 0; p > palavraAdivinhada.indexOf(letraTentada); p++){
                    if (erro != letraTentada) {
                        System.out.printf("Você errou");
                    }
                }
            }
        }
    }
}
