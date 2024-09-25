/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.spacewar;

/**
 *
 * @author FLOW
 */
//kelas
public class Rocket {
    //property
    int kmSpeedPerHour = 28000;
    int fuelCapacityInLiter = 300;
    
    //method non parameter dan void
    public void shootLaser() {
        System.out.println("Shooting a Laser... Pheww");
    }
    
     //method dengan parameter dan void
    public void shootLaser(String laserColor){
        System.out.println("menyala laser " + laserColor);
    }
    
    //method mengembalikan nilai
    public int getLaserPower() {
        return 100; 
    }
    
    //method mengembalikan nilai dan parameter
    public int hitungLuasRoket(int a, int b) {
        return a * b; // Mengembalikan hasil perkalian
    }
     
    //method dg THIS
    public void addspeed(int speed){
        this.kmSpeedPerHour += speed; //menambah kecepatan dri inputan di parameter
        System.out.println("Roket berkecepatan " + this.kmSpeedPerHour + "km/jam");
    }  
    
}
