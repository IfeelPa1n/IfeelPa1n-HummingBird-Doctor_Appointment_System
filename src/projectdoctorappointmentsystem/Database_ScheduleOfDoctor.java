/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdoctorappointmentsystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Janson
 */
public class Database_ScheduleOfDoctor {
    public class DoctorScheduleDatabase {
        public static Map<String, String[]> data = new HashMap<>();
        
        public static void Stored(String user, String pass, String name,  String mail, String Timezone, String Start, String End) {
            data.put(user, new String[]{user, pass, name, mail, Timezone, Start, End});
        }
        //CHECKS IF ACCOUNT EXSIST
        public static boolean checkValid(String user, String pass) {
        return data.containsKey(user) && pass.equals(data.get(user)[1]);
        }
        
        public static boolean checkDATA(String user, String mail) {
            for (String[] userData : data.values()) {
                if (user.equals(userData[0]) && mail.equals(userData[3])) {
                    return true;
                }
            }
            return false;
        }
        
        //CHECKS IF ACCOUNT ID ExSIST
        public static String[] getIDInfo(String user, String ID) { //not yet used
            if (checkValid(user, ID)) {
                return data.get(user);
            } else {
                return null; // User or password is invalid
            }
        }
    
        public static String[] getApplicationInfo(String user, String pass) { //not yet used
            if (checkValid(user, pass)) {
                return data.get(user);
            } else {
                return null; // User or password is invalid
            }
        }
     }
}
