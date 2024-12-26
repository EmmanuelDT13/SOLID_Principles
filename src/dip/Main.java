package dip;

interface EmailService {
    public void sendEmail(String message);
}

class EmailServiceImpl implements EmailService{

	@Override
	public void sendEmail(String message) {
        System.out.println("Email enviado: " + message);
		
	}
	
	
}

class Notification {

	private EmailService emailService;

    public Notification() {

    }

    public void notifyUser(String message) {
        emailService.sendEmail(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.notifyUser("¡Hola! Este es un mensaje de notificación.");
    }
}
