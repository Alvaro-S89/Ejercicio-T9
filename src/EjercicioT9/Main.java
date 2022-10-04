package EjercicioT9;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 40;
        cliente.nombre = "Dwight Schrute";
        cliente.telefono = "123456789";
        cliente.credito = 600;

        System.out.println(cliente.nombre+ " "+cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Jim Harper";
        trabajador.telefono = "987654321";
        trabajador.salario = 2000;

        System.out.println(trabajador.nombre+ " "+trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

}
class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    int salario;
}