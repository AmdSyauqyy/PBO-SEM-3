/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main (String[] args) {
        Hewan kucing = new Hewan("Antonio de gato", 3);
        kucing.suara();
        kucing.info();
        kucing.berlari();
        
        Hewan anjing = new Hewan ("Alberto", 5);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
