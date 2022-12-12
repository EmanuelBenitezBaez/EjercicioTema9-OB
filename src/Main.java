
/*
Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
y con una variable salario que solo tenga la clase Trabajador.
*/




/////////////////////////////////////////////////////////

public class Main {
    public static void main(String[] args) {
        System.out.println("\nEjercicio Tema 9\n");
        System.out.println("---------------------------------------------\n");
        Cliente cliente=new Cliente();
        cliente.setNombre("Emanuel");
        cliente.setEdad(33);
        cliente.setTelefono(1166209612);
        cliente.setCredito(20000000);
        System.out.println("Nombre del cliente:" + cliente.getNombre());
        System.out.println("Telefono:" + cliente.getTelefono());
        System.out.println("Edad:" + cliente.getEdad());
        System.out.println("Credito:" + cliente.getCredito());

        System.out.println("---------------------------------------------\n");
        Trabajador trabajador=new Trabajador();
        trabajador.setNombre("Teo");
        trabajador.setEdad(33);
        trabajador.setTelefono(1166209610);
        trabajador.setSalario(450000);
        System.out.println("Nombre del trabajador:" + trabajador.getNombre());
        System.out.println("Telefono:" + trabajador.getTelefono());
        System.out.println("Edad:" + trabajador.getEdad());
        System.out.println("Salario:" + trabajador.getSalario());
        System.out.println("---------------------------------------------\n");

    }

}

class Persona{
    private String nombre;
    private int edad, telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

final class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

final class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
