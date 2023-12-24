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
public class Database_AcceptedRequest {
    public class Entity_Accepteds {
        public static Map<String, String[]> owner = new HashMap<>();
        public static Map<String, String[]> child = new HashMap<>();
        
        public static void RequestOwnerHolder (String DocID, String DocUser, String DocGmail){
            owner.put(DocID, new String[]{DocID, DocUser, DocGmail});
        }
        
        public static void RequestPatientRelation (String PatID, String PatUser, String PatGmail, String AppointmentStart, 
                String AppointmentEnd, String DocOwnerUser, String DocOwnerGmail){
            child.put(PatID, new String[]{PatID, PatUser, PatGmail, AppointmentStart, AppointmentEnd, DocOwnerUser, DocOwnerGmail});
        }
        
        public static boolean ifexsistPatientHolder(String PatUser, String PatGmail, String DocOwnerUser, String DocOwnerGmail) {
            for (String[] userData : child.values()) {
                if (PatUser.equals(userData[1]) && PatGmail.equals(userData[2]) && DocOwnerUser.equals(userData[5]) && DocOwnerGmail.equals(userData[6])) {
                return true;
                }
            }
            return false;
        }
        
        
        public static boolean ifexsistOwnerHolder(String DocUser, String DocGmail) {
            for (String[] userData : owner.values()) {
                if (DocUser.equals(userData[1]) && DocGmail.equals(userData[2])) {
                return true;
                }
            }
            return false;
        }
    }

}
