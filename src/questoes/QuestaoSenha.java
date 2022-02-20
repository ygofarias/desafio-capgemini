package questoes;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class QuestaoSenha {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Qual a sua senha? ");
        JOptionPane.showMessageDialog(null,"A senha deve conter:" +
                "\n- no mínimo 1 dígito" +
                "\n- no mínimo 1 letra minúscula" +
                "\n- no mínimo 1 letra maiúscula" +
                "\n- no mínimo 1 caracter especial." +
                "\n Os caracteres especiais são: !@#$%^&*()-+\n");

        String senha = JOptionPane.showInputDialog("Digite a senha: ");
        //System.out.print("Digite a senha: ");

        int tamanhoSenha = senha.length();
        int tamanhoMinimo = 6;



        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temDigito = false;
        char[] charEspecial = {'!', '@', '#', '$', '%', '^', '&', '*','(',')','-','+'};
        boolean temEspecial = false;



        //temMaiuscula = senha.toUpperCase().equals(senha);
        //temMinuscula = senha.toLowerCase().equals(senha);




        //Loop enquanto não satisfaz todas as condições
        while (!temDigito && !temMaiuscula && !temMinuscula && !temEspecial) {
            JOptionPane.showMessageDialog(null, "Senha fraca");

            tamanhoSenha = tamanhoMinimo - tamanhoSenha;

            //condicional para definir que a senha tenha o tamanho maior que zero e no mínimo 6 dígitos
            if(tamanhoSenha > 0 && tamanhoSenha < 6) {
                JOptionPane.showMessageDialog(null, "Faltam " + tamanhoSenha + " digitos!!");
                //System.out.println("Faltam " + tamanhoSenha + " digitos!!");
                senha = JOptionPane.showInputDialog(null, "Digite a senha novamente: ");
                //senha = sc.next();
            }
            //aqui para conferir se tem todos os dígitos predefinidos
            if (!temDigito && !temMaiuscula && !temMinuscula && !temEspecial) {
                JOptionPane.showMessageDialog(null,"A senha deve conter:" +
                        "\n- no mínimo 1 dígito" +
                        "\n- no mínimo 1 letra minúscula" +
                        "\n- no mínimo 1 letra maiúscula" +
                        "\n- no mínimo 1 caracter especial." +
                        "\n Os caracteres especiais são: !@#$%^&*()-+\n");
                JOptionPane.showMessageDialog(null,"Faltam caracteres predefinidos!!");
                senha = JOptionPane.showInputDialog("Digite a senha novamente: ");
                //senha = sc.next();
            }

            //As sequencias a seguir, são para verificar cada caracter, afim de saber se estão dentro das regras
                for (int i = 0; i < senha.length(); i++) {
                    if (Character.isDigit(senha.charAt(i))) {
                        temDigito = true;
                    }
                }

                for (int i = 0; i < senha.length(); i++) {
                    if ((senha.charAt(i) >= 'A') && (senha.charAt(i) <= 'Z')) {
                        temMaiuscula = true;
                    } else if ((senha.charAt(i) >= 'a') && (senha.charAt(i) <= 'z')) {
                        temMinuscula = true;
                    }

                }
                for (int i = 0; i < senha.length(); i++) {
                    char caracter = senha.charAt(i);
                    for (int j = 0; j < charEspecial.length; j++) {
                        if (charEspecial[j] == caracter) {
                            temEspecial = true;
                        }
                    }
                }
            }
        JOptionPane.showMessageDialog(null,"Senha forte: " + senha);

/*
        int tamanhoSenha = senha.length();

        if (tamanhoSenha < 6) {
            int faltaCaracter = tamanhoSenha - 6;
            System.out.println("Faltam: " + faltaCaracter);
        } else
            System.out.println(senha);
            */
    }
}
