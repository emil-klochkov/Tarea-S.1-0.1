public class InstrumentosPercusion extends Instrumentos {

    static {
        System.out.println("La clase Percusion ha sido cargada en memoria.");
    }

    public InstrumentosPercusion(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
