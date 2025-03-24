//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Accedemos a un miembro estático de una clase (provoca carga sin crear objetos)
        System.out.println("Accediendo a un miembro estático de la clase Viento...");
        System.out.println(InstrumentosViento.class.getName());

        // 2. Creamos una instancia de Viento (provoca ejecución del bloque de inicialización)
        System.out.println("\nCreando un objeto de la clase Viento...");
        InstrumentosViento flauta = new InstrumentosViento("Flauta", 120.0);
        flauta.tocar();

        // 3. Creamos una instancia de Cuerda
        System.out.println("\nCreando un objeto de la clase Cuerda...");
        InstrumentosCuerda guitarra = new InstrumentosCuerda("Guitarra", 300.0);
        guitarra.tocar();

        // 4. Creamos una instancia de Percusión
        System.out.println("\nCreando un objeto de la clase Percusion...");
        InstrumentosPercusion tambor = new InstrumentosPercusion("Tambor", 80.0);
        tambor.tocar();

    }
}