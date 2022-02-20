package questoes;

import javax.swing.*;
import java.util.HashMap;

public class QuestaoAnagrama {
    public static void main(String[] args) {

        //entrada de dados e chamada da função
        String anagrama = JOptionPane.showInputDialog("Digite a plavra: ");
        contemAnagrama(anagrama);

    }
    //função a ser chamada pelo main
    public static void contemAnagrama(String anagrama){

        //transformar o string em um vetor de caracteres
        char[] charAnagrama = anagrama.toCharArray();
        String aux = null;
        int cont = 0;
        //int cont2 = 0;

        //laço para quebra em substrings e contar
        for (int i = 0; i < anagrama.length(); i++) {
            for (int j = anagrama.length() - 1; j > i; j--) {
                if (charAnagrama[i] == charAnagrama[j]) {
                    aux = anagrama.substring(i, j + 1);
                    cont++;
                }
            }
        }
        char[] aux2 = aux.toCharArray();
        //laço para comparar a substring quebrada e contar novamente
        for (int i = 0; i < aux2.length; i++) {
            for (int j = aux2.length - 1; j > i; j--) {
                if (aux2[i] == aux2[j]) {
                    cont++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, cont);
    }

}



        /*String invertida = new StringBuilder(anagrama).reverse().toString();

        HashMap<Character, Integer> mapAnagrama = new HashMap<>();
        HashMap<Character, Integer> mapInvertida = new HashMap<>();

        char[] charAnagrama = anagrama.toCharArray();
        char[] charInvertida = invertida.toCharArray();
        Integer cont = 0;

        Integer aux = null;
        Integer aux2 = null;

        for (int i = 0; i < charAnagrama.length; i++) {
            if (mapAnagrama.get(charAnagrama[i]) == null) {
                mapAnagrama.put(charAnagrama[i], 1);
            } else {
                aux = (int) mapAnagrama.get(charAnagrama[i]);
                mapAnagrama.put(charAnagrama[i], ++aux);
            }
        }
        for (int i = 0; i < charInvertida.length; i++) {
            if (mapInvertida.get(charInvertida[i]) == null) {
                mapInvertida.put(charInvertida[i], 1);
            } else {
                aux2 = (int) mapInvertida.get(charInvertida[i]);
                mapInvertida.put(charInvertida[i], ++aux2);
            }
        }


        for (int i = 0; i < charAnagrama.length; i++){
                if (mapAnagrama.get(charAnagrama[i]).equals(mapInvertida.get(charInvertida[i]))){

            }else

        }*/


        //JOptionPane.showMessageDialog(null, cont);



/*
        String subAnagrama;
        String subInvertida;
        char[] charAnagrama = anagrama.toCharArray();
        char[] charInvertida = invertida.toCharArray();
        int cont = 0;
        char[] charAnagrama;


        for (int i = 0; i < anagrama.length();i++) {
            for (int j = anagrama.length() - 1; j >= 0; j--){
                subAnagrama = anagrama.substring(i,j);
                subInvertida = anagrama.substring(i,j);
                if (subAnagrama == subInvertida){
                    cont++;
                }
                JOptionPane.showMessageDialog(null,"subAngrama: "+ subAnagrama);
                JOptionPane.showMessageDialog(null,"subInvertida: " + subInvertida);


            }
        }

        for (int i = 0; i < anagrama.length(); i++){
            for (int j = anagrama.length() - 1; j > 0; j--){
                char[] charAnagrama = anagrama.substring(i,j).toCharArray();
                char[] charInvertida = invertida.substring(i,j).toCharArray();
                if (charAnagrama[i] == charAnagrama[j]){
                    cont++;
                }
                System.out.println(charAnagrama);
                }
        }
        JOptionPane.showMessageDialog(null, cont);


    }



        for (int i = 0; i < anagrama.length(); i++){
            for (int j = anagrama.length() - 1; j > 0;j--){
                if (charAnagrama[i] == charAnagrama[j]) {
                    cont++;
                }
            }
            i++;
        }
}


    public static void isAnagrama(String anagrama, String invertida){
        int cont = 0, resultado = 0;
        for (int i = 0; i < anagrama.length(); i++){
            resultado = resultado ^ anagrama.charAt(i);
            if (resultado == 0){
                cont ++;
            }
        }
        for (int i = 0; i < invertida.length(); i++){
            resultado = resultado ^ invertida.charAt(i);
            if (resultado == 0){
                cont++;
            }
        }
        System.out.println(cont);
    }
         */




