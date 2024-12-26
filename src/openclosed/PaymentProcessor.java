package openclosed;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {

    public double processPayment(GeneralPaymentProcess generalPaymentProcess, double amount) {
    	return generalPaymentProcess.performPayment(amount);
    }
}

interface GeneralPaymentProcess{
	public double performPayment(Double amount);
}

class CreditCardProcess implements GeneralPaymentProcess{
	@Override
	public double performPayment(Double amount) {
        return amount - (amount * 0.02); // 2% de tarifa
	}
}

class PayPalProcess implements GeneralPaymentProcess{
	@Override
	public double performPayment(Double amount) {
        return amount - (amount * 0.03); // 3% de tarifa
	}
}

class BankTransferProcess implements GeneralPaymentProcess{
	@Override
	public double performPayment(Double amount) {
        return amount - (amount * 0.01); // 1% de tarifa
	}
}
