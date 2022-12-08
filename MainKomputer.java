/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author Amir
 */
class cpu {
  String nama;
   cpu(String nama) {
    this.nama = nama;
  }
  public String getNama() {
    return this.nama;
  }
}
class Keyboard {
  String jenis;
  
  Keyboard(String jenis) {
    this.jenis = jenis; 
  }
  public String getJenis() {
    return this.jenis;
  }
}
class Mouse {
  String merk;
  
   Mouse(String merk) {
    this.merk = merk;
  }
  public String getMerk() {
    return this.merk; 
  }
}
 class Komputer {
   String merk;
   String tipe;
   String mouse;
   String keyboard;
   String cpu;
  
   Komputer(String merk, String tipe,String mouse, String keyboard, String cpu) {
    this.merk = merk;
    this.tipe = tipe;
    this.mouse = mouse;
    this.keyboard = keyboard;
    this.cpu = cpu;
  }
}
public class MainKomputer {
  public static void main(String[] args) {
    // membuat objek komputer dan komponen nya
    Komputer obj = new Komputer("Asus","A450CC","Logitec","Logitec","intel core i7");
    System.out.println(obj.merk+" dengan series "+obj.tipe+" keyboardnya  " +obj.keyboard+ " dengan mousenya "
     + obj.mouse+ " serta dibekali dengan prosesor " +obj.cpu+ " ");
  }
}
