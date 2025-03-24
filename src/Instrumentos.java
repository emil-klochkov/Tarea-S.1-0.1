public abstract class Instrumentos {

    protected String nombre;
    protected double precio;

    // Este bloque se ejecuta solo una vez: cuando la clase carga en memoria
    static {
        System.out.println("La clase Instrumento ha sido cargada en memoria.");
    }

    // Bloque de inicialización: se ejecuta cada vez que se crea un objeto
    {
        System.out.println("Se ha creado un nuevo instrumento.");
    }

    public Instrumentos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void tocar();
}
