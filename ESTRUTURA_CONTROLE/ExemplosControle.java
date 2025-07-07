package ESTRUTURA_CONTROLE;

public class ExemplosControle {
   
    
    public static void main(String[] args) {
       
        
        // if - else (condicionais)

        // operadores de comparação
        // x > y, a == b

        int idade = 18; 

        // if -> começa uma condição
        // () -> contém a condição a ser  avaliada
        // {} -> corpo da condição

        if(idade >= 18) {
            System.out.println("Você é maior de idade.");
        }
            // if -> validar se algo é verdadeiro
            // else -> executa se o if nao executar

            double nota = 6.3;

            if (nota > 7) {
                System.out.println("Você passou de ano.");
            } else {
                System.out.println("Você esta de recuperação.");

            }

            // elseif intermediario de if e else
            // e ele valida um bloco também

            int hora = 14;

            if(hora < 12){
                System.out.println("Bom dia");

            } else if (hora < 18) {
                    System.out.println("Boa Tarde");
                 } else {
                    System.out.println("Boa noite");
                }
            
                // Operadores lógicos

                // && => AND = E
                // || => OR = OU
                // ! => NOT = NÃo

                boolean temDinheiro = true;
                boolean temTempo = false;

                if ( temDinheiro && temTempo) {
                    System.out.println("Pode viajar");
                } else {
                    System.out.println("Não pode viajar");
                }


                // LOOPS = while e for
                // FOCO em FOR
                // Repetir algo até uma condição ser atingida
                // Evitar repetição mecanica de código (ela vira automatica)

                int contador = 1;

                while (contador <= 5) {
                    System.out.println(contador);
                    contador++;
                    
                }
                // se eu não tenho uma condição de encerramaneto de loop 
                // eu caio em um loop infinito

                // interação = cada passagem pela estrutura do loop

                for (int i = 1; i <= 5; i++) {
                    System.out.println("valor de i é " +  i);
                }


                // analise numerica
                int[] numeros = {1,2,3,4,5,6,7,8,9};

                int somaPar = 0;
                int somaImpar = 0;

                //como eu vou chamar a unidade da minha lista: lista

                for(int num : numeros) {

                    if (num % 2 == 0) {
                        somaPar += num;
                        
                    } else {
                        somaImpar += num;
                    }
                }

                System.out.println("Soma pares: " + somaPar);
                System.out.println("Soma impares: " + somaImpar);

       }
 }    
