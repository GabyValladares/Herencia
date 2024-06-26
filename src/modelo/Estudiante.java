/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {

    private int idEstudiante;
    private int numeroMatricula;
    private String horario;
    private String jornada;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int numeroMatricula, String horario, String jornada, int idPersona, String nombres, String apellidos, String cedula, String direccion, String correoElectronico, String sexo, String fechaNacimiento, int telefono) {
        super(idPersona, nombres, apellidos, cedula, direccion, correoElectronico, sexo, fechaNacimiento, telefono);
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.horario = horario;
        this.jornada = jornada;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String imprimir() {
        return "-------DATOS PERSONALES-----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "Nombre:" + getNombres() + "\n"
                + "Apellidos:" + getApellidos() + "\n"
                + "Cédula:" + getCedula() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Correo Electrónico:" + getCorreoElectronico() + "\n"
                + "Fecha Nacimiento:" + getFechaNacimiento() + "\n"
                + "Sexo:" + getSexo() + "\n"
                + "Teléfono:" + getTelefono() + "\n"
                + "-------DATOS ESTUDIANTE------" + "\n"
                + "Id Estudiante:" + getIdEstudiante() + "\n"
                + "Numero de Matricula:" + getNumeroMatricula() + "\n"
                + "horario:" + getHorario() + "\n"
                + "jornada:" + getJornada();
    }
}
