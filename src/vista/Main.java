/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Administrativo;
import modelo.Docente;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Persona x=new Persona();
        Docente d=new Docente() ;
        d.setIdPersona(1);
        d.setNombres("Gabriela");
        d.setApellidos("Valladares");
        d.setTitulo("Ingeniera en Sistemas Computacionales");
        d.setEspecialidad("Backend");
        d.setRegistroSenescyt("001-006-2016RX");
        //System.out.println(d.imprimir());
        //objeto administrativo 
        Administrativo a=new Administrativo(2, "secretaria", "software", 1, "Paulina", "Jacome", "1234567891", "IBARRA", "p.jacome@ist17dejulio.edu.ec", "femenino", "11/06/1992", 987919912);
        System.out.println(a.imprimir());
                
                
    }
    
}
