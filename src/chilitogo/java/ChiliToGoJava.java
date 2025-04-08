/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chilitogo.java;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class ChiliToGoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        final double adultPrice = 7.0;
        final double childPrice = 4.0;        
        double adultAmount;
        double childAmount;
        double adultTotalPrice;
        double childTotalPrice;
        double total;
        
        
        
        
        
        
        System.out.println("Enter number of adult meals");
        adultAmount = input.nextDouble();
        System.out.println("Enter number of child meals");
        childAmount = input.nextDouble();
        adultTotalPrice = (adultPrice * adultAmount );
        System.out.println(adultAmount+ " adult meals were ordered 7.0" + "\n" + "Totals is " + adultTotalPrice);        
        childTotalPrice = (childPrice * childAmount);
        System.out.println(childAmount+ " child meals were ordered 4.0" + "\n" + "Totals is " + childTotalPrice);
        total = ( adultTotalPrice + childTotalPrice );
        System.out.println("Grand Total for all meals is " + total);
        
        System.out.println("");
        
        
        
        
        
    }
    
}
