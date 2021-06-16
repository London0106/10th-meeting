/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project25;

import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project25 {
//login / signup system

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        String firstName, lastName, email, password;
        int i = 0;
        System.out.println("=====Register AND LOGIN =======");
        System.out.println("1.Register ");

        System.out.println("2.Login");
        i = scan.nextInt();
        switch (i) {
            case 1:
                System.out.println("===Register===");
                System.out.println("1.Insert Your FirstName");
                System.out.println("=");
                firstName = scan.next();
                System.out.println("2.Insert Your LastName");
                System.out.println("=");
                lastName = scan.next();
                System.out.println("3.Insert Your Email Address");
                System.out.println("=");
                email = scan.next();
                System.out.println("4.Insert Your Password");
                System.out.println("=");
                password = scan.next();
                System.out.println("Your Account Has been Created.");
                break;
            case 2 :
                System.out.println("===Login===");
                System.out.println("1.Insert Your Email Address");
                System.out.println("=");
                email = scan.next();
                System.out.println("2.Insert Your Password");
                System.out.println("=");
                password = scan.next();
                System.out.println("You Have Been Log In.");
                break;
                    
                

        }
    }

}
