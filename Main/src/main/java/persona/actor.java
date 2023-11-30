/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author User sayo-melocojon
 */
public class actor extends Persona{
    private String generoCine;
    
    public String getGeneroCine(){
        return generoCine;
    }

    public void setGeneroCine(String generoCine){
        this.generoCine=generoCine;
    }
    
    public void mostrarGeneroCine(){
        System.out.println("Genero Cinematografico: "+generoCine);
    }
}
