/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author Lenovo
 */
public class Main {
    
    public static void main(String[] args) {
        pekerja pekerja1 = new pekerja("Valen", 19, "Sepuh IT", 7500000);
        
        System.out.println("\n_Informasi sebelum diubah_");
        System.out.println("Info Pekerja 1 :");
        System.out.println(pekerja1);
        
        pekerja1.setNama("Lenn");
        
        System.out.println("\n_Informasi setelah diubah_");
        System.out.println("Info Pekerja 1 :");
        System.out.println(pekerja1);
    }
}
