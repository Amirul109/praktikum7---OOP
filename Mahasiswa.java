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
class Alamat{
    int noRumah;
    String kota;
    String provinsi;
    String negara;
    Alamat(int noRumah, String kota, String provinsi, String negara){
        this.noRumah=noRumah;
        this.kota=kota;
        this.provinsi = provinsi;
        this.negara = negara;
    }
}
class Mahasiswa {
    int nim;
    String namaMahasiswa;
    Alamat alamat;
    Mahasiswa(int nim, String namaMahasiswa, Alamat almt){
        this.nim=nim;
        this.namaMahasiswa=namaMahasiswa;
        this.alamat=almt;
    }
    public static void main(String args[]){
        Alamat ad = new Alamat (15, "Kebumen", "Jawa Tengah", "Indonesia");
        Mahasiswa obj1 = new Mahasiswa (312110109, "Amirul Mu'minin", ad);
        System.out.println(obj1.nim);
        System.out.println(obj1.namaMahasiswa);
        System.out.println(obj1.alamat.noRumah);
        System.out.println(obj1.alamat.kota);
        System.out.println(obj1.alamat.provinsi);
        System.out.println(obj1.alamat.negara);
    }
}
