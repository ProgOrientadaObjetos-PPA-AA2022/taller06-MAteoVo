/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author mateovalarezoojeda
 */
public class Hospital {
    private String nombreHospital;
    private Ciudad ciudadHospital;
    private int numeroEspecialidades;
    private Medico[] conjuntoMedico;
    private Enfermero[] conjuntoEnfermero;
    private double sueldoTotal;
    private String direccionHospital;
    
    public Hospital(String nomHospital, Ciudad ciu, int numEspe, Medico[] med, Enfermero[] enfe, String direc){
        nombreHospital = nomHospital;
        ciudadHospital = ciu;
        numeroEspecialidades = numEspe;
        conjuntoMedico = med;
        conjuntoEnfermero = enfe;
        direccionHospital = direc;  
        
    }
    public void establecerNombreHospital(String nomHospital){
        nombreHospital = nomHospital;
    }
    public String obtenerNombreHospital(){
       return nombreHospital; 
    }
    public void establecerCiudadHospital(Ciudad ciu){
        ciudadHospital = ciu;
    }
    public Ciudad obtenerCiudadHospital(){
        return ciudadHospital;
    }
    public void establecerNumeroEspecialidades(int numEspe){
        numeroEspecialidades = numEspe;
    }
    public int obtenerNumeroEspecialidades(){
        return numeroEspecialidades;
    }
    public void establecerConjuntoMedico(Medico[] med){
        conjuntoMedico = med;
    }
    public Medico[] obtenerConjuntoMedico(){
        return conjuntoMedico;
    }
    public void establecerConjuntoEnfermero(Enfermero[] enfe){
        conjuntoEnfermero = enfe;
    }
    public Enfermero[] obtenerConjuntoEnfermero(){
        return conjuntoEnfermero;
    }
    public void establecerSueldosTotales(){
        for (int i = 0; i < conjuntoMedico.length; i++) {
            sueldoTotal+=conjuntoMedico[i].obtenerSueldoMensual();
        }
        for (int i = 0; i < conjuntoEnfermero.length; i++) {
            sueldoTotal+=conjuntoEnfermero[i].obtenerSueldoMensual();
        }
    }
    public double obtenerSueldosTotales(){
        return sueldoTotal;
    }
    public void establecerDireccionHospital(String direc){
        direccionHospital = direc;
    }
    public String obtenerDireccionHospital(){
        return direccionHospital;
    }
    public String toString(){
        String cadena = String.format("\n%s\nDireccion: %s\nCiudad: %s\nProvincia: %s\nNumero de especialidades: %d\nListado de medicos\n"
                ,nombreHospital.toUpperCase(),direccionHospital,ciudadHospital.obtenerNombreCiudad(),ciudadHospital.obtenerNombreProvincia(),
                numeroEspecialidades);
        for (int i = 0; i < conjuntoMedico.length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",cadena,conjuntoMedico[i].obtenerNombreMedico(),
            conjuntoMedico[i].obtenerSueldoMensual(),conjuntoMedico[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\n Listado de enfermeros(as)\n",cadena);
        for (int i = 0; i < conjuntoEnfermero.length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",cadena,conjuntoEnfermero[i].obtenerNombreEnfermero(),
            conjuntoEnfermero[i].obtenerSueldoMensual(),conjuntoEnfermero[i].obtenerTipo());
        }
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f\n",cadena,sueldoTotal);
        return cadena;
    }
}
