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
public class Database {
    //FINAL CODE DONT TOUCH!
    //PATIENT ACCOUNT DATABASE
    public class PatientDataRegister {
    private static Map<String, String[]> data = new HashMap<>();

    public static void register(String user, String pass, String subject) {
        data.put(user, new String[]{user, pass, subject});
        }
    
    //CHECKS IF ACCOUNT EXSIST
    public static boolean validate(String user, String pass) {
        return data.containsKey(user) && pass.equals(data.get(user)[1]);
        }
    }
    
    //FINAL CODE DONT TOUCH!
    //SECRETART ACCOUNT DATABASE
    public class SecretaryDataRegister {
    private static Map<String, String[]> data = new HashMap<>();

    public static void register(String user, String pass, String subject) {
        data.put(user, new String[]{user, pass, subject});
        }
    
    //CHECKS IF ACCOUNT EXSIST
    public static boolean validate(String user, String pass) {
        return data.containsKey(user) && pass.equals(data.get(user)[1]);
        }
    }
    
    //FINAL CODE DONT TOUCH!
    //DOCTOR ACCOUNT DATABASE
    public class DoctorDataRegister {
    private static Map<String, String[]> data = new HashMap<>();

    public static void register(String user, String pass, String subject) {
        data.put(user, new String[]{user, pass, subject});
        }
    
    //CHECKS IF ACCOUNT EXSIST
    public static boolean validate(String user, String pass) {
        return data.containsKey(user) && pass.equals(data.get(user)[1]);
        }
    }
}
