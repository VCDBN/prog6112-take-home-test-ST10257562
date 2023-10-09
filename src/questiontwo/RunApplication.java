/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questiontwo;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the current estate agent name: ");
        String name = scan.next();
        System.out.print("\nEnter the property price: ");
        double price = scan.nextDouble();
        
        EstateAgentSales agent1 = new EstateAgentSales(name, price);
        

        System.out.println("Property Report:");
        System.out.println("***********************");
        agent1.printPropertyReport();
        System.out.println();

    }
}

