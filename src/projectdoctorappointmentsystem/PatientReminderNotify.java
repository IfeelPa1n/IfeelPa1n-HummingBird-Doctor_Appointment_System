/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdoctorappointmentsystem;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DaddyK
 */
public class PatientReminderNotify {
    public class Yeeeet{
        public static Map<String, String[]> notify = new HashMap<>();
        public static Map<String, String[]> PStore = new HashMap<>();
        public static void PatNotify (String NUser, String NGmail, String PMessage){
            notify.put(NUser, new String[]{NUser, NGmail, PMessage});
        }
        
        public static void SecNotify (String PGmail, String stats){
            if (PStore.containsKey(PGmail)) {
                // Update the existing entry
                PStore.get(PGmail)[1] = stats; // Assuming stats is at index 1
            } else {
                // Add a new entry
                PStore.put(PGmail, new String[]{PGmail, stats});
            }
        }
        
        public static boolean NotificationExsistSec(String PatGmail) {
            for (String[] userData : PStore.values()) {
                if (PatGmail.equals(userData[1])) {
                return true;
                }
            }
            return false;
        }
        
        public static boolean NotificationExsist(String PatUser, String PatGmail) {
            for (String[] userData : notify.values()) {
                if (PatUser.equals(userData[0]) && PatGmail.equals(userData[1])) {
                return true;
                }
            }
            return false;
        }
    }
}
