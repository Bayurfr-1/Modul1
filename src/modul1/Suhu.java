/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;
import java.io.*;
/**
 *
 * @author win 7
 */
public class Suhu {
   
 public static void main(String[] args) throws IOException
 {
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  
  double celcius, hasilfahrenheit, hasilkelvin, hasilreamur;
  
  System.out.print("Masukan Suhu Dalam Celcius  : ");
  celcius = Integer.parseInt(input.readLine());
  System.out.println("");
  System.out.println("1. Fahrenheit");
  System.out.println("2. Kelvin");
  System.out.println("3. Reamur");
  System.out.print("Masukan Pilihan :");
  int pilih = Integer.parseInt(input.readLine());
  System.out.println("");
  
  switch(pilih){
  case 1 :
   hasilfahrenheit = (celcius*9/5)+32;
   System.out.println(celcius + " Celcius = " + hasilfahrenheit +" Fahrenheit");
   break;
  case 2 :
   hasilkelvin = celcius+273.15;
   System.out.println(celcius + " Celcius = " + hasilkelvin +" Kelvin");
   break;
  case 3 :
   hasilreamur = celcius*4/5;
   System.out.println(celcius + " Celcius = " + hasilreamur +" Reamur");
   break;
  default :
   System.out.println("Pilihan yg anda masukan salah");
   break;
  }
 }
}

    

