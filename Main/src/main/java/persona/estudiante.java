/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author User sayo-melocojon
 */
public class estudiante extends Persona{
    private String carrera;
    
    public String getCarrera(){
        return carrera;
    }

    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    
    public void mostrarCarrera(){
        System.out.println("Carrera: "+carrera);
    }
}
