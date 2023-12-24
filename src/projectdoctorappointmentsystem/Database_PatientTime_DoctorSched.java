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
public class Database_PatientTime_DoctorSched {
    public class PATtime_DocSched {
        public static Map<String, String[]> data = new HashMap<>();
    
        public static void TimeKeeper (String DocUser, String DocMail, String DocTZone, String Start, String End, String PatUser, String PatMail){
            data.put(PatUser, new String[]{ DocUser, DocMail, DocTZone, Start, End, PatUser, PatMail});
        }
        
        public static void deleteTimeKeeper(String key) {
            data.remove(key);
        }
        
    }
}
