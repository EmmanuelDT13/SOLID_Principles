package liskov;


interface Pago{
	
	 public void procesarPago();
	
}

//Clase base Pago
class PagoSinValidacion implements Pago {
	
 protected double monto;

 public PagoSinValidacion(double monto) {
     this.monto = monto;
 }

 public void procesarPago() {
     System.out.println("Procesando pago por: " + monto);
 }
}

//Clase base Pago
class PagoConValidacion implements Pago{
	
protected double monto;

public PagoConValidacion(double monto) {
   this.monto = monto;
}

public void procesarPago() {
   System.out.println("Procesando pago por: " + monto);
}
}






//Subclase PagoConTarjeta
class PagoConTarjeta extends PagoConValidacion {
 private String numeroTarjeta;

 public PagoConTarjeta(double monto, String numeroTarjeta) {
     super(monto);
     this.numeroTarjeta = numeroTarjeta;
 }

 @Override
 public void procesarPago() {
     if (validarTarjeta()) {
         System.out.println("Procesando pago con tarjeta por: " + monto);
     } else {
         throw new IllegalArgumentException("Tarjeta inválida");
     }
 }

 private boolean validarTarjeta() {
     // Lógica de validación ficticia
     return numeroTarjeta.startsWith("4"); // Solo tarjetas que comienzan con 4 son válidas
 }
}





//Subclase PagoConCredito
class PagoConCredito extends PagoSinValidacion {
 public PagoConCredito(double monto) {
     super(monto);
 }

 @Override
 public void procesarPago() {
     // Siempre aprueba pagos de crédito sin validación
     System.out.println("Procesando pago con crédito por: " + monto);
 }
}







//Código que utiliza los pagos
class ProcesadorPagos {
 public static void procesar(Pago pago) {
     pago.procesarPago();
 }

 public static void main(String[] args) {
	 Pago pago1 = new PagoConTarjeta(100.0, "4111111111111111");
	 Pago pago2 = new PagoConCredito(200.0);

     procesar(pago1); // Esto funcionará
     procesar(pago2); // Esto también funcionará
 }
}

