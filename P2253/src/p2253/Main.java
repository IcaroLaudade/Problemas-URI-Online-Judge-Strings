/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
       // while (true) {
            while (in.ready()) {
            String line = in.readLine();
            if (line.length() >= 6 && line.length() <= 32) {
                char[] letras = line.toCharArray();
                if (!containsOnlyLetters(letras)) {
                    System.out.println("Senha invalida.");
                } else {
                    boolean upper = false;
                    boolean lower = false;
                    boolean number = false;
                    for (int i = 0; i < letras.length; i++) {
                        if (Character.isUpperCase(letras[i])) {
                            upper = true;
                        }
                        if (Character.isLowerCase(letras[i])) {
                            lower = true;
                        }
                        if (Character.isDigit(letras[i])) {
                            number = true;
                        }
                    }
                    if (upper && lower && number) {
                        System.out.println("Senha valida.");
                    } else {
                        System.out.println("Senha invalida.");
                    }
                }

            } else {
                System.out.println("Senha invalida.");
            }
        }
    }

    static boolean containsOnlyLetters(char[] letras) {
        for (int i = 0; i < letras.length; i++) {
            if (!Character.isLetterOrDigit(letras[i])) {
                return false;
            }
        }
        return true;
    }
}
