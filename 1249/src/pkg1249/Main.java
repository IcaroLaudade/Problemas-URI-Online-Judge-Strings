/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1249;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 253746
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String linha;

        while ((linha = br.readLine()) != null) {
            char[] palavrasChar = linha.toCharArray();
            for (int contador = 0; contador < palavrasChar.length; contador++) {
                if (Character.isLetter(palavrasChar[contador])) {
                    for (int contador2 = 0; contador2 < alfabeto.length; contador2++) {
                        if (Character.toLowerCase(palavrasChar[contador]) == Character.toLowerCase(alfabeto[contador2])) {
                            if (contador2 > 12 && Character.isUpperCase(palavrasChar[contador])) {
                                palavrasChar[contador] = Character.toUpperCase(alfabeto[contador2 - 13]);
                            } else if (contador2 > 12 && Character.isLowerCase(palavrasChar[contador])) {
                                palavrasChar[contador] = alfabeto[contador2 - 13];
                            } else if (Character.isUpperCase(palavrasChar[contador])) {
                                int diferenca = contador2 - 13;
                                int tamanhoAlfabeto = 26 + diferenca;
                                System.out.println(tamanhoAlfabeto);
                                palavrasChar[contador] = Character.toUpperCase(alfabeto[tamanhoAlfabeto]);
                            } else if (Character.isLowerCase(palavrasChar[contador])) {
                                int diferenca = contador2 - 13;
                                int tamanhoAlfabeto = 26 + diferenca;
                                System.out.println(tamanhoAlfabeto);
                                palavrasChar[contador] = alfabeto[tamanhoAlfabeto];
                            }
                        }
                    }

                }
            }
            String textoFormatado = new String(palavrasChar);
            System.out.println(textoFormatado);
        }
    }

}
