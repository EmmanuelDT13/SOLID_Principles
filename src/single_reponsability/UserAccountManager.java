package single_reponsability;

import java.util.List;

public class UserAccountManager {

	//@Autowired
	private UserDbService userDbService;

	//@Autowired
	private UserEmailActivitiesService userEmailActivitiesService;

	//@Autowired
	private UserReportsService userReportsService;
	
	//@Autowired
	private UserAccountSecurityService userAccountSecurityService;
	
	//@Autowired
	private UserStatusManagerService userStatusManagerService;

}

class UserDbService{
	
	//@Autowired
	//UserRepository userRepository;
	
    // Manejo de usuarios en la base de datos
    public void addUserToDatabase(String username, String password) {
        System.out.println("Adding user to the database: " + username);
        // Lógica de conexión a base de datos
    }

    public List<String> getAllUsersFromDatabase() {
        System.out.println("Getting all users from the database.");
        // Simulación de obtención de usuarios desde la base de datos
        return List.of("user1", "user2", "user3");
    }
	
}

class UserEmailActivitiesService{
	
    // Enviar correos electrónicos
    public void sendEmailNotification(String email, String message) {
        System.out.println("Sending email to: " + email + " with message: " + message);
        // Lógica para enviar un correo electrónico
    }
	
}

class UserReportsService{
	
    // Generar reportes de actividad de los usuarios
    public void generateUserActivityReport() {
        System.out.println("Generating user activity report...");
        // Lógica para generar el reporte de actividad
    }
	
}


class UserAccountSecurityService{
	
    // Validar credenciales de usuario
    public boolean validateUserCredentials(String username, String password) {
        System.out.println("Validating credentials for: " + username);
        // Simulación de validación de credenciales
        return username.equals("user1") && password.equals("password123");
    }

    // Cifrar contraseñas
    public String encryptPassword(String password) {
        System.out.println("Encrypting password...");
        // Lógica de cifrado simple
        return "encrypted_" + password;
    }
	
}


class UserStatusManagerService{
	
    // Desbloquear cuenta de usuario
    public void unlockUserAccount(String username) {
        System.out.println("Unlocking user account for: " + username);
        // Lógica para desbloquear cuenta
    }
	
}


//package com.example.srp;
//
//import java.util.List;
//
//public class UserAccountManager {
//
//    // Manejo de usuarios en la base de datos
//    public void addUserToDatabase(String username, String password) {
//        System.out.println("Adding user to the database: " + username);
//        // Lógica de conexión a base de datos
//    }
//
//    public List<String> getAllUsersFromDatabase() {
//        System.out.println("Getting all users from the database.");
//        // Simulación de obtención de usuarios desde la base de datos
//        return List.of("user1", "user2", "user3");
//    }
//
//    // Enviar correos electrónicos
//    public void sendEmailNotification(String email, String message) {
//        System.out.println("Sending email to: " + email + " with message: " + message);
//        // Lógica para enviar un correo electrónico
//    }
//
//    // Generar reportes de actividad de los usuarios
//    public void generateUserActivityReport() {
//        System.out.println("Generating user activity report...");
//        // Lógica para generar el reporte de actividad
//    }
//
//    // Validar credenciales de usuario
//    public boolean validateUserCredentials(String username, String password) {
//        System.out.println("Validating credentials for: " + username);
//        // Simulación de validación de credenciales
//        return username.equals("user1") && password.equals("password123");
//    }
//
//    // Cifrar contraseñas
//    public String encryptPassword(String password) {
//        System.out.println("Encrypting password...");
//        // Lógica de cifrado simple
//        return "encrypted_" + password;
//    }
//
//    // Desbloquear cuenta de usuario
//    public void unlockUserAccount(String username) {
//        System.out.println("Unlocking user account for: " + username);
//        // Lógica para desbloquear cuenta
//    }
//}


