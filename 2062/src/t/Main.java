/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int numeroCasos = Integer.parseInt(br.readLine());
        String[] palavras = br.readLine().split(" ");
        String txt = "";
        for (int j = 0; j < palavras.length; j++) {
            if (palavras[j].length() == 3) {
                char[] palavraTresCaracters = palavras[j].toCharArray();
                if (palavraTresCaracters[0] == 'U' && palavraTresCaracters[1] == 'R'
                        || palavraTresCaracters[0] == 'O' && palavraTresCaracters[1] == 'B') {
                    palavraTresCaracters[2] = 'I';
                    palavras[j] = String.valueOf(palavraTresCaracters);
                }

            }
            if (j == palavras.length - 1) {
                txt += palavras[j];
            } else {
                txt += palavras[j] + " ";
            }

        }
        System.out.println(txt);
    }

}
