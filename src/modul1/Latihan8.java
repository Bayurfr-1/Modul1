/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author win 7
 */
public class Latihan8 {
     public static void main(String[] args) {
            Scanner masukan=new Scanner(System.in);
            System.out.println("Masukkan nilai TPA : ");
            int TPA = masukan.nextInt();
            System.out.print("Masukkan nilai bahasa Inggris : ");
            int bahasaInggris = masukan.nextInt();
            if ((TPA  > 85 ) && (bahasaInggris  > 80))
                System.out.println("Siswa dapat beasiswa");
            else
                System.out.println("siswa tidak dapat beasiswa");
            
    }
    
}
