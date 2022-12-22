public class App {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       cliente.edad = 23;
       cliente.nombre = "Juanjo";
       cliente.telefono = 55957433;
       cliente.credito = 200;
       System.out.println("El cliente " + cliente.nombre + " tiene " + cliente.edad + " años de edad  y su número de teléfono es " + cliente.telefono + " y tiene un crédito de " + cliente.credito);

       Trabajador trabajador = new Trabajador();
       trabajador.edad = 50;
       trabajador.nombre = "Rene";
       trabajador.telefono = 55555555;
       trabajador.salario = 2000;
       System.out.println("El trabajador " + trabajador.nombre + " tiene " + trabajador.edad + " años de edad  y su número de teléfono es " + trabajador.telefono + " y tiene un crédito de " + trabajador.salario);

    }
}

class Persona {
   int edad;
   String nombre;
   int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
