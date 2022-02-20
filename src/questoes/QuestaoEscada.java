package questoes;

import java.util.Scanner;

public class QuestaoEscada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //entrada de dado para saber o tamanho da escada
        System.out.print("Digite um número inteiro maior que zero para definir a altura da escada: ");
        int numero = sc.nextInt();

        //laço for para desenhar a escada
        for (int i = 0; i < numero; i++){
            for(int j = i; j < numero - 1; j++){
                System.out.print(" ");
            }
            System.out.println("*".repeat(i+1));
        }


    }
}
