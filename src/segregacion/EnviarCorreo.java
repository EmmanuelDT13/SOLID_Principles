package segregacion;

public interface EnviarCorreo {
    void enviarCorreo();
}

interface Imprimir{
    void imprimir();
}

interface Escanear{
    void escanear();
}

interface EnviarFax{
    void fax();
}

class Impresora implements Imprimir {
	@Override
	public void imprimir() {
	}
}

class Escaner implements Escanear {
    @Override
    public void escanear() {
        System.out.println("Escaneando documento...");
    }
}

class Fax implements EnviarFax {
    @Override
    public void fax() {
        System.out.println("Enviando fax...");
    }
}
