package dip;

interface IPaymentService {
    public void processPayment(double amount);
}

class CreditCardPaymentService implements IPaymentService{
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("The implementation for prcessing the payment by credit card");
	}
	
}

class PaymentProcessor {

    private IPaymentService PaymentService;

    public PaymentProcessor() {
    }

    public void process(double amount) {
    	PaymentService.processPayment(amount);
    }
}

public class Helloo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.process(100.00);
    }
}
