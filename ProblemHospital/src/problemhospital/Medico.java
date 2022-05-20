/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemhospital;

/**
 *
 * @author mateovalarezoojeda
 */
public class Medico {
    private String nombreMedico;
    private String especialidad;
    private double sueldoMensual;
    
    public Medico(String nomMedico, String espe, double sueMen){
        nombreMedico = nomMedico;
        especialidad = espe;
        sueldoMensual = sueMen;
    }
    
    public void establecerNombreMedico(String nomMedico){
        nombreMedico = nomMedico;
    }
    public String obtenerNombreMedico(){
        return nombreMedico;
    }
    
    public void establecerEspecialidad(String espe){
        especialidad = espe;
    }
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public void establecerSueldoMensual(double sueMen){
        sueldoMensual = sueMen;
    }
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
    
}
