/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mary.jane.and.invitations;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class MaryJaneAndInvitations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String x = sc.nextLine();
        char[] y = x.toCharArray();

        String[] s = new String[50];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();

        }

        for (int i = 0; i < n; i++) {
            if (y[i] == 'A') {
                System.out.println("Dear " + s[i] + ", beloved artist, I would love to have you at my party. Come to my crib on April 20th.");
            } else if (y[i] == 'O') {
                System.out.println("Dear " + s[i] + ", beloved occasion enthusiast, come to my crib to celebrate this very special day.");
            } else {
                System.out.println("Dear " + s[i] + ", April 20th is happening again this year. Don't miss out.");
            }
        }
    }

}
