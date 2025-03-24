public class InstrumentosViento extends Instrumentos {

    static {
        System.out.println("La clase Viento ha sido cargada en memoria.");
    }

    public InstrumentosViento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}
