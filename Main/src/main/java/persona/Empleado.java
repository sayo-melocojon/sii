/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author User sayo-melocojon
 */
public class Empleado extends Persona{
    private double sueldo;
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo=sueldo;
    }
    
    public void mostrarSueldo(){
        System.out.println("Sueldo: "+sueldo);
    } 
}

    
 
