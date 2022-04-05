/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

class Mahasiswa{
    String nama;
    String umur;
}
/**
 *
 * @author ACER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa ();
    Mahasiswa mhs2 = new Mahasiswa ();
    Mahasiswa mhs3 = new Mahasiswa ();
    mhs1.nama = "Odelyn Hadley";
    mhs1.umur = "18";
    mhs2.nama = "Alpen Cipmunk";
    mhs2.umur = "19";
    mhs3.nama = "Saki Cipettes";
    mhs3.umur = "19";
    System.out.println("Nama Mahasiswa;"+ mhs1.nama);
    System.out.println("Umur Mahasiswa;"+ mhs1.umur);
    System.out.println("Nama Mahasiswa;"+ mhs2.nama);
    System.out.println("Umur Mahasiswa;"+ mhs2.umur);
    System.out.println("Nama Mahasiswa;"+ mhs3.nama);
    System.out.println("Umur Mahasiswa:"+ mhs3.umur);
    }
}
