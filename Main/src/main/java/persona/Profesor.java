/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author User sayo-melocojon
 */
public class Profesor extends Persona{
    private String especialidad;
    
    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
    public void mostrarEspecialidad(){
        System.out.println("Especialidad: "+especialidad);
    }
}
