/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.spacewar;

/**
 *
 * @author FLOW
 */
public class Rocket3 {
    // keyword static dan final
    public static final int STATUS_NON_ACTIVE = 0;  
    public static final int STATUS_TAKE_OFF = 1;    
    public static final int STATUS_FLYING = 2;      
    public static final int STATUS_FLOATING = 3;  

    // Variabel untuk menyimpan status roket saat ini
    public int status = Rocket3.STATUS_NON_ACTIVE; 

    // Method untuk memperbarui status roket berdasarkan kecepatan
    public void updateRocketStatus(double kmSpeedPerHour) {
        if (kmSpeedPerHour == 0) {
            this.status = Rocket3.STATUS_NON_ACTIVE;  // Jika kecepatan 0, STATUS_NON_ACTIVE
        } else if (kmSpeedPerHour > 0.005 && kmSpeedPerHour <= 0.5) {
            this.status = Rocket3.STATUS_TAKE_OFF;   // Jika kecepatan antara 0.005 dan 0.5 km/jam, STATUS_TAKE_OFF
        } else if (kmSpeedPerHour > 10000) {
            this.status = Rocket3.STATUS_FLYING;     // Jika kecepatan lebih dari 10.000 km/jam, STATUS_FLYING
        } else if (kmSpeedPerHour >= 0 && kmSpeedPerHour <= 64) {
            this.status = Rocket3.STATUS_TAKE_OFF;   // Jika kecepatan antara 0 dan 64 km/jam, STATUS_TAKE_OFF
        } else {
            this.status = Rocket3.STATUS_FLOATING;   // Jika tidak ada kondisi di atas, STATUS_FLOATING
        }
    }
    
}
