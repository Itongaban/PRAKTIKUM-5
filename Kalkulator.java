/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulator;

/**
 *
 * @author ACER
 */import java.util.Scanner;
public class Kalkulator {
    
    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    
    System.out.print("masukan bilangan a");
    int a = cin.nextInt();
    System.out.print("masukan bilangan b");
    int b = cin.nextInt();
    
    System.out.println("a + b =" + (a + b ));
    System.out.println("a - b =" + (a - b ));
    System.out.println("a * b =" + (a * b ));
    System.out.println("a / b =" + (a / b ));
    System.out.println("a * 1.0 / b = " + (a * 1.0 / b ));
    System.out.println("a % b =" + (a & b ));
    
    

    
    }
}
