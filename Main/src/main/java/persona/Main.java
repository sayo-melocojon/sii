/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package persona;

/**
 *
 * @author User sayo
 */

public class Main {

    public static void main(String[] args) {
        Empleado empleado= new Empleado();
        empleado.setNombre("Ritorukai");
        empleado.setEdad(25);
        empleado.setGenero("Masculino");
        empleado.setSueldo(50000);
        empleado.mostrarDatos();
        empleado.mostrarSueldo();
        
        System.out.println("\n");
        System.out.println("Estudiante: ");
        estudiante estudiante= new estudiante();
        estudiante.setNombre("Ana");
        estudiante.setEdad(20);
        estudiante.setGenero("Femenino");
        estudiante.setCarrera("Ingieneria Informatica");
        estudiante.mostrarDatos();
        estudiante.mostrarCarrera();
        
        System.out.println("\n");
        System.out.println("Cliente: ");
        cliente cliente= new cliente();
        cliente.setNombre("Blnko");
        cliente.setEdad(24);
        cliente.setGenero("Masculino");
        cliente.setDireccion("123 Calle Principal");
        cliente.mostrarDatos();
        cliente.mostrarDireccion();
                
        System.out.println("\n");
        System.out.println("Profesor: ");
        Profesor profesor= new Profesor();
        profesor.setNombre("Daniel");
        profesor.setEdad(40);
        profesor.setGenero("Masculino");
        profesor.setEspecialidad("Matematicas");
        profesor.mostrarDatos();
        profesor.mostrarEspecialidad();
        
        System.out.println("\n");
        System.out.println("Actor: ");
        actor Actor= new actor();
        Actor.setNombre("Evelyn");
        Actor.setEdad(35);
        Actor.setGenero("Femenino");
        Actor.setGeneroCine("Drama");
        Actor.mostrarDatos();
        Actor.mostrarGeneroCine();
        
        System.out.println("\n");
        System.out.println("Estilista: ");
        estilista estilista= new estilista();
        estilista.setNombre("Pedro");
        estilista.setEdad(28);
        estilista.setGenero("Masculino");
        estilista.setEspecialidadCorte("Cortes modernos");
        estilista.mostrarDatos();
        estilista.mostrarEspecialidadCorte();
    }
}
