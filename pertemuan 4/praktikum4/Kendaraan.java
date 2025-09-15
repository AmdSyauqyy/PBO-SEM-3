/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Lenovo
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanmaks;
    public String jenismaesin;

    public Kendaraan(String nama, int kecepatanmaks, String jenismaesin) {
        this.nama = nama;
        this.kecepatanmaks = kecepatanmaks;
        this.jenismaesin = jenismaesin;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void tampilinfomobil() {
        System.out.println("Nama : " + nama + "\nKecepatan maksimum : " + kecepatanmaks + "\nJenis mesin : " + jenismaesin);
    }
}
