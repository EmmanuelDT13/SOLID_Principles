package single_reponsability;

import java.util.Map;

public class StoreManager {

	private CustomerService CustomerService;
	
	private OrderService OrderService;
	
	private ContabilidadServices ContabilidadServices;
}

class CustomerService{
	
    // Manejo de clientes
    public void registerNewCustomer(String name, String email, String address) {
        System.out.println("Registering new customer: " + name);
        // Lógica para agregar un nuevo cliente a la base de datos
    }
    
    public void updateCustomerAddress(int customerId, String newAddress) {
        System.out.println("Updating customer address to: " + newAddress);
        // Lógica para actualizar la dirección del cliente en la base de datos
    }
}

class OrderProcesorService{
	
	private CustomerService CustomerService;
	
    // Manejo de pedidos
    public void createNewOrder(int customerId, Map<String, Integer> items) {
        System.out.println("Creating new order for customer: " + customerId);
        // Lógica para crear un nuevo pedido
    }
	
    public void shipOrder(int orderId) {
        System.out.println("Shipping order: " + orderId);
        // Lógica para preparar el envío de un pedido
    }
    
    public void cancelOrder(int orderId) {
        System.out.println("Canceling order: " + orderId);
        // Lógica para cancelar un pedido
    }
    
}

class PreciosManagerService{
	
	private OrderProcesorService OrderProcesorService;
	
    public void applyDiscount(int orderId, double discountPercentage) {
        System.out.println("Applying discount to order: " + orderId);
        // Lógica para aplicar descuentos a un pedido
    }
	
}

class TrackingOrderService{
	
	private OrderProcesorService OrderProcesorService;
	
    public void trackOrderShipment(int orderId) {
        System.out.println("Tracking shipment for order: " + orderId);
        // Lógica para hacer seguimiento del envío de un pedido
    }
    
}

class NotificacionsService{
	
	private PreciosManagerService PreciosManagerService;
	
	private CustomerService CustomerService;
	
    public void sendPromotionalEmail(String email) {
        System.out.println("Sending promotional email to: " + email);
        // Lógica para enviar correos promocionales
    }
	
}

class FacturacionService{
	
	private PreciosManagerService PreciosManagerService;
	
	private OrderProcesorService OrderProcesorService;
	
    public void generateInvoice(int orderId) {
        System.out.println("Generating invoice for order: " + orderId);
        // Lógica para generar una factura de un pedido
    }
	
}

class OrderService{
	
	private OrderProcesorService OrderProcesorService;
	
	private TrackingOrderService TrackingOrderService;
}

class ContabilidadServices{
	
	private PreciosManagerService PreciosManagerService;
	
	private FacturacionService FacturacionService;
	
}