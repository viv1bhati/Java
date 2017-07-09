/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowel;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Alphabet: ");
        String x = s.next();

        if (x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u")) {
            System.out.println("It is a Vowel");
        } else {
            System.out.println("It is a Consonant");
        }
    }
}
