/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Output Produk");
        Elektronik produk1 = new Elektronik("", 15000000, 1);
        produk1.tampilkanInfo();

        System.out.println("\n2. Output Pegawai");
        PegawaiTetap pegawai1 = new PegawaiTetap("Syauqy", 9000000, 5000000);
        pegawai1.tampilkanInfo();

        System.out.println("\n3. Output Polimorfisme");
        Produk produk2 = new Makanan("Burgir Kemasan", 15000, "2025-12-07\n");
        produk2.tampilkanInfo();

        Pegawai pegawai2 = new PegawaiKontrak("Ahmad", 4500000, 6);
        pegawai2.tampilkanInfo();
    }
}
