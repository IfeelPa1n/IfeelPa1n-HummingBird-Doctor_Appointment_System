/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdoctorappointmentsystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Janson Gabuya
 */
public class Database_PatientToSecretary {
    public class PatientApplicationDatabase {
    private static Map<String, String[]> data = new HashMap<>();

    public static void application(String user, String pass, String id, String firstname, String lastname, String age, String contact, String mail) {
        data.put(user, new String[]{user, pass, id, firstname, lastname, age, contact, mail});
        }
    
    //CHECKS IF ACCOUNT EXSIST
    public static boolean checkValid(String user, String pass) {
        return data.containsKey(user) && pass.equals(data.get(user)[1]);
        }
    
    //CHECKS IF ACCOUNT AND EMAIL ASSOCIATE EACH OTHER
    public static boolean checkValidUser_Email(String user, String mail) {
        return data.containsKey(user) && mail.equals(data.get(user)[7]);
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
