/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.tugas;

/**
 *
 * @author Lenovo
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    public Mobil(String merk, String model, int tahun, String warna){
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void displayinfo() {
        System.out.println("\nInfo Kendaraan" + "\n1. Merk Mobil   : " + getMerk() + "\n2. Model Mobil  : " + getModel() + "\n3. Tahun Keluar : " + getTahun() + "\n4. Warna Mobil  : " + getWarna());
    }
    public void startengine() {
        System.out.println("Mesin mobil " + getMerk() + " menyala.");
    }
}
