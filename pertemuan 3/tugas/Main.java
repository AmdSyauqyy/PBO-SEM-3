/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.tugas;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil ("Ferrari", "yaitu", 2025, "Hytam");
        Mobil mobil2 = new Mobil ("MCLaren", "Lu warna apa bos", 2024, "Biwru");
        Mobil mobil3 = new Mobil ("Lamboirgini", "iyaitu", 2021,"Merah");
        
        mobil1.displayinfo();
        mobil1.startengine();
        
        mobil2.displayinfo();
        mobil2.startengine();
        
        mobil3.displayinfo();
        mobil3.startengine();
    
        System.out.println("\nUbah warna mobil ke 1 menjadi Putih.");
            mobil1.setWarna("Putih");
        mobil1.displayinfo();
    }
}