public class InstrumentosCuerda extends Instrumentos {

    static {
        System.out.println("La clase Cuerda ha sido cargada en memoria.");
    }

    public InstrumentosCuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
