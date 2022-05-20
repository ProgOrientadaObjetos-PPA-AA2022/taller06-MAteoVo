/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemhospital;

public class Ciudad {
    private String nombreCiudad;
    private String nombreProvincia;
    
    public Ciudad(String nomCiu, String nomPro){
        nombreCiudad = nomCiu;
        nombreProvincia = nomPro;
    }
    
    public void establecerNombreCiudad(String nomCiu){
        nombreCiudad = nomCiu;
    }
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    public void establecerNombreProvincia(String nomPro){
        nombreProvincia = nomPro;
    }
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
}
