/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author User sayoOoooOO AAAAAA choripan
 */
public class estilista extends Persona{
        private String estilista;
    
    public String getEstilista(){
        return estilista;
    }

    public void setEspecialidadCorte(String estilista){
        this.estilista=estilista;
    }
    
    public void mostrarEspecialidadCorte(){
        System.out.println("Especializado en corte de cabello de: "+estilista);
    }
}
