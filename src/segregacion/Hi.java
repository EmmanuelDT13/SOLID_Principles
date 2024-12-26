package segregacion;

interface VehiculoMarino {
    void navegar();

}

interface VehiculoManejador{
    void conducir();
}

interface VehiculoCarga{
    void cargar();
}

interface VehiculoVolador{
    void volar();
}

class Coche implements VehiculoManejador, VehiculoCarga {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el coche...");
    }

    @Override
    public void cargar() {
        System.out.println("Cargando el coche...");
    }
}

class Avion implements VehiculoVolador, VehiculoCarga {

    @Override
    public void volar() {
        System.out.println("Volando el avión...");
    }

	@Override
	public void cargar() {
        System.out.println("Cargando el avion...");
		
	}
}

class Barco implements VehiculoMarino, VehiculoCarga {

    @Override
    public void navegar() {
        System.out.println("Navegando el barco...");
    }

    @Override
    public void cargar() {
        System.out.println("Cargando el barco...");
    }
}
