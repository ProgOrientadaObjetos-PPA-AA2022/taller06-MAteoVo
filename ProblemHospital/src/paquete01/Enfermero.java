/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author mateovalarezoojeda
 */
public class Enfermero {

    private String nombreEnfermero;
    private String tipo;
    private double sueldoMensual;
    
    public Enfermero(String nomEnfermero,String type,double sueMen){
        nombreEnfermero = nomEnfermero;
        tipo = type;
        sueldoMensual = sueMen;
    }
    
    public void establecerNombreEnfermero(String nomEnfermero){
        nombreEnfermero = nomEnfermero;
    }
    public String obtenerNombreEnfermero(){
        return nombreEnfermero;
    }
    
    public void establecerTipo(String type){
        tipo = type;
    }
    public String obtenerTipo(){
        return tipo;
    }
    
    public void establecerSueldoMensual(double sueMen){
        sueldoMensual = sueMen;
    }
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
}
