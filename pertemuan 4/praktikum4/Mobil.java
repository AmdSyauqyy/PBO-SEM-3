/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Lenovo
 */
public class Mobil extends Kendaraan {
    private int Jumlahpintu;
    
    public Mobil(String nama, int kecepatanmaks, String jenismaesin, int Jumlahpintu) {
        super(nama, kecepatanmaks, jenismaesin);
        this.Jumlahpintu = Jumlahpintu;
    } 
    
    public void tampilaninfomobil() {
        System.out.println("Kecepatan maks mobil : " + kecepatanmaks);
        System.out.println("Jumlah pintu : " + Jumlahpintu);
    }
}

