package liskov;

//Clase base Figura
abstract class Figura {
 public abstract double calcularArea();
}

//Subclase Cuadrado
class Cuadrado extends Figura {
 private double lado;

 public Cuadrado(double lado) {
     this.lado = lado;
 }

 @Override
 public double calcularArea() {
     return lado * lado;
 }
}

//Subclase Rectángulo
class Rectángulo extends Figura {
 private double ancho;
 private double alto;

 public Rectángulo(double ancho, double alto) {
     this.ancho = ancho;
     this.alto = alto;
 }

 @Override
 public double calcularArea() {
     return ancho * alto;
 }
}

//Código que utiliza las figuras
class CalculadorArea {
 public static void main(String[] args) {
     Figura figura1 = new Cuadrado(5);
     Figura figura2 = new Rectángulo(4, 6);

     System.out.println("Área del cuadrado: " + figura1.calcularArea());
     System.out.println("Área del rectángulo: " + figura2.calcularArea());
 }
}
