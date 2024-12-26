package single_reponsability;
import java.util.List;
import java.util.Map;

public class OrderProcessingManager {

	//@Autowired
	private InventarioService inventarioService;
	
	//@Autowired
	private NotificacionesPedidosService NotificacionesPedidosService;
	
	//@Autowired
	private GeneracionFacturasService generacionFacturasService;
	
	//@Autowired
	private ComunicacionesInternasService comunicacionesInternasService;
	
	//@Autowired
	private ContabilidadService ContabilidadService;
	
	//@Autowired
	private ReportesService ReportesService;
	
    // Manejo de pedidos
    public void processOrder(int orderId, Map<String, Integer> items) {
        System.out.println("Processing order: " + orderId);
        // Lógica de procesamiento de pedidos, actualizando stock, etc.
        inventarioService.updateStockLevels(items);
        NotificacionesPedidosService.sendOrderConfirmation(orderId);
        generacionFacturasService.generateInvoice(orderId);
        comunicacionesInternasService.notifyWarehouse(orderId);
    }


    // Manejo de cancelación de pedidos
    public void cancelOrder(int orderId) {
        System.out.println("Canceling order: " + orderId);
        // Lógica para cancelar el pedido
        ContabilidadService.refundOrder(orderId);
    }
    
}


class InventarioService{
	
    // Gestión del inventario
    public void updateStockLevels(Map<String, Integer> items) {
        System.out.println("Updating stock levels...");
        // Lógica de actualización de inventario
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            System.out.println("Reducing stock for: " + item.getKey() + " by " + item.getValue() + " units.");
        }
    }
}

class NotificacionesPedidosService{
	
    // Envío de correos electrónicos de confirmación
    public void sendOrderConfirmation(int orderId) {
        System.out.println("Sending order confirmation for order: " + orderId);
        // Lógica para enviar un correo electrónico de confirmación
    }
}

class GeneracionFacturasService{
	
    // Generación de facturas
    public void generateInvoice(int orderId) {
        System.out.println("Generating invoice for order: " + orderId);
        // Lógica para generar una factura (PDF, HTML, etc.)
    }
	
}

class ComunicacionesInternasService{
	
    // Notificación al almacén
    public void notifyWarehouse(int orderId) {
        System.out.println("Notifying warehouse about order: " + orderId);
        // Lógica para notificar al almacén de que el pedido está listo para ser empaquetado
    }
	
}

class ContabilidadService{
	
    // Reembolso
    public void refundOrder(int orderId) {
        System.out.println("Processing refund for order: " + orderId);
        // Lógica de reembolso
    }
	
}

class ReportesService{
	
    // Generación de reportes de ventas
    public List<String> generateSalesReport(String reportType) {
        System.out.println("Generating sales report: " + reportType);
        // Lógica para generar reportes de ventas, puede ser por mes, día, cliente, etc.
        return List.of("Report 1", "Report 2");
    }
	
}

