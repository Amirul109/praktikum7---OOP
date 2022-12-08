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
 class ClassMobil{
    String namaMobil;
    int idMobil;
    
 ClassMobil(String nama, int id){
        this.namaMobil = nama;
        this.idMobil = id;
    }
}
 class Supir extends ClassMobil{
    String namaSupir;
    
 Supir(String nama, String namaM, int idM){
        super(namaM, idM);
        this.namaSupir = nama;
    }
}
 class PerusahaanBus {
    public static void main (String args[])
    { 
        Supir obj = new Supir("Amirul", "Honda Civic", 10109 );
        System.out.println(obj.namaSupir+" adalah supir dari mobil "
         +obj.namaMobil+ " dan " + "dengan id: "+obj.idMobil);
    }
}