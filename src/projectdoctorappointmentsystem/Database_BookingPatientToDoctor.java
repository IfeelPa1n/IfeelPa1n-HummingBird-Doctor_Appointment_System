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
public class Database_BookingPatientToDoctor {
    public class Relationship_BetweenEntities{
        public static Map<String, String[]> data = new HashMap<>();
        // key val for keep is Docuser!
        public static void Keep (String ID, String Docuser, String Docemail, String Patuser, String Patemail, String Doczone, String DocS, String DocE){
            data.put(Docuser, new String[]{ ID, Docuser, Docemail, Patuser, Patemail, Doczone, DocS, DocE});
        }
        
        public static boolean checkDATA(String Docuser, String Docemail, String Patuser, String Patemail) {
            for (String[] userData : data.values()) {
                if (Docuser.equals(userData[1]) && Docemail.equals(userData[2]) && Patuser.equals(userData[3]) && Patemail.equals(userData[4])) {
                    return true;
                }
            }
            return false;
        }
        
        public static String[] getIDInfo(String Docuser, String Docemail, String Patuser, String Patemail) { 
            if (checkDATA(Docuser, Docemail, Patuser, Patemail)) {
                return data.get(Docuser);
            } else {
                return null; // User or password is invalid
            }
        }
    }
}
