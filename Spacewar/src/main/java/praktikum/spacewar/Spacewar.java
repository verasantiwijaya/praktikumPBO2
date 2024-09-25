/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.spacewar;
import java.util.ArrayList;
import praktikum.spacewar.*;

/**
 *
 * @author FLOW
 */
public class Spacewar {

    public static void main(String[] args) {
        //objek untuk kelas Rocket di Rocket.java
        Rocket rocket1 = new Rocket();
        
        //memanggil property di Rocket.java
        System.out.println("Kecepatan Rocket Per Jam : " + rocket1.kmSpeedPerHour);
        
        //memanggil method non parameter di Rocket.java
        rocket1.shootLaser();
        
        //memanggil method void dg parameter di Rocket.java
        rocket1.shootLaser("green");
        
        //memanggil method return dgn parameter di Rocket.java
        System.out.println("nilai nya " + rocket1.hitungLuasRoket(8, 9));
        
        //memanggil method dg keyword THIS di Rocket.java
        rocket1.addspeed(400);
        
        
 /////////////////////////////////////////////////////////////////////////////////////       
         //objek untuk kelas Rocket2 di Rocket2.java
        Rocket2 roket2 = new Rocket2("falcon 4", "Bumi");
        System.out.println("Sukses membuat Roket 2");
        
        //contoh implementasi menggunakan ArrayList
        ArrayList<Rocket2> daftarRoket = new ArrayList<>();
        // Membuat beberapa objek Roket
        Rocket2 objkroket1 = new Rocket2("Falcon 9", "Mars");
        Rocket2 objkroket2 = new Rocket2("Apollo 11", "Bulan");
        Rocket2 objkroket3 = new Rocket2("Soyuz", "Stasiun Luar Angkasa");

        // Menyimpan objek Roket ke dalam ArrayList
        daftarRoket.add(objkroket1);
        daftarRoket.add(objkroket2);
        daftarRoket.add(objkroket3);

        // Memanggil method sembari melakukan for-each 
        for (Rocket2 roket : daftarRoket) {
            roket.displayStatus();
        }
        
        
 /////////////////////////////////////////////////////////////////////////////////////  
        //objek untuk kelas Rocket3 di Rocket3.java
        Rocket3 roket3 = new Rocket3();
        System.out.println("Status awal roket: " + roket3.status);
        
        //static bisa akses variable kelas tanpa object (langsung menyebutkan nama kelas)
        System.out.println("brpa nilai variable STATUS_NON_ACTIVE: " + Rocket3.STATUS_NON_ACTIVE); //

        double speed = 0.1;  // inisialisasi Kecepatan roket 
        roket3.updateRocketStatus(speed);

        // Menampilkan status roket setelah diperbarui
        System.out.println("Status roket setelah kecepatan " + speed + " km/jam: " + roket3.status);
    }
}
