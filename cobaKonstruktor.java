package com.tutorial;
class Mahasiswa {
    // Data Member/Ciri/Atribut
    String Nama;
    String NIM;
    String Prodi;

    //Membuat Konstruktor tanpa parameter
    // Mahasiswa(){
    //     System.out.println("Ini adalah konstruktor");
        
    // }

    // membuat konstruktor dengan parameter 
    Mahasiswa(String inputNama, String inputNIM, String inputProdi) {
        Nama = inputNama;
        NIM = inputNIM;
        Prodi = inputProdi;
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + Prodi);


    }

}

public class cobaKonstruktor {

    public static void main(String[] args) {
        // instansiasi objek / penciptaan objek
        Mahasiswa mhs1 = new Mahasiswa("Emanue A palu", "22241067", "PTI");

         

        
    }
}