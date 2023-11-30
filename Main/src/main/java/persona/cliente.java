/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author User sayo-melocojon
 */
public class cliente extends Persona{
    private String direccion;
    
    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public void mostrarDireccion(){
        System.out.println("Direccion: "+direccion);
    }
}
