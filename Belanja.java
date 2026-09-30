/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.belanja;

/**
 *
 * @author ACER
 */import java.util.Scanner;
public class Belanja {

    static Scanner cin = new Scanner(System.in);
    static final double PPN = 0.11;
    
    public static void main(String[] args) throws Exception {
      System.out.print("Nama barang: ");
      String namaBarang = cin.nextLine();
      
      System.out.print("Harga satuan: ");
      double hargaSatuan = Double.parseDouble(cin.nextLine());
      System.out.print("Jumlah: ");
 int jumlah = Integer.parseInt(cin.nextLine());
 
     double subtotal = hargaSatuan * jumlah;
     double pajak = subtotal * PPN;
     double total = subtotal + pajak;
     
     System.out.println("Barang : " + namaBarang);
     System.out.println("Subtotal : " + subtotal);
     System.out.println("PPN : " + pajak);
     System.out.println("Total : " + total);
     System.out.println("Total : " + total);

    }
}
