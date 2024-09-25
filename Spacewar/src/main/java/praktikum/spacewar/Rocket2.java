/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.spacewar;

/**
 *
 * @author FLOW
 */
public class Rocket2 {
    public String Nama;
    public String Tujuan;
    
    //constructor
    public Rocket2(String Nama, String Tujuan){
        this.Nama = Nama;
        this.Tujuan = Tujuan;
    }
    
    // Method untuk menampilkan status roket
    public void displayStatus() {
        System.out.println("Nama Roket : " + Nama + ", Tujuan : " + Tujuan);
    }
}
