/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.Hospital;
import java.util.Scanner;
import paquete01.Ciudad;
import paquete01.Enfermero;
import paquete01.Medico;
/**
 *
 * @author mateovalarezoojeda
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreHospital, direccion, ciudad, provincia;
        int n, especialidades;
        System.out.println("Ingrese el nombre del Hospital");
        nombreHospital = sc.nextLine();
        System.out.println("Ingrese la direccion de " + nombreHospital);
        direccion = sc.nextLine();
        System.out.println("Ingrese la ciudad de " + nombreHospital);
        ciudad = sc.nextLine();
        System.out.println("Ingrese la provincia de " + nombreHospital);
        provincia = sc.nextLine();
        System.out.println("Ingrese la cantidad de especialidades de " + nombreHospital);
        especialidades = sc.nextInt();
        Ciudad ciu = new Ciudad(ciudad,provincia);
        System.out.println("Cuantos medicos cuenta el " + nombreHospital);
        n = sc.nextInt();
        sc.nextLine();
        Medico med[]= new Medico[n];
        for (int i = 0; i < med.length; i++) {
            String name, espe;
            double sue;
            System.out.println("Ingrese el nombre del medico " + (i+1) + ": ");
            name = sc.nextLine();
            System.out.println("Ingrese el sueldo mensual del medico " +name + ": ");
            sue = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la especialidad de " +name+": ");
            espe = sc.nextLine();
            med[i] = new Medico(name,espe,sue);
        }
        System.out.println("Ingrese la cantidad de enfermeros(as) de " +nombreHospital+": ");
        n = sc.nextInt();
        sc.nextLine();
        Enfermero enf[] = new Enfermero[n];
        for (int i = 0; i < enf.length; i++) {
            String nombre, tipo;
            double sueldo;
            System.out.println("Ingrese el nombre del enfermero " + (i+1) + ": ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el sueldo mensual del enfermero " +nombre + ": ");
            sueldo = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el tipo de contrato de " +nombre+": ");
            tipo = sc.nextLine();
            enf[i] = new Enfermero(nombre,tipo,sueldo);
        }
        Hospital hp = new Hospital(nombreHospital,ciu,especialidades,med,enf,direccion);
        hp.establecerSueldosTotales();
        System.out.printf("%s\n", hp);
    }
}
