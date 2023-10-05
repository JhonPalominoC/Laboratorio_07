/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cita {
    
    public static List<String> horasDisponibles = new ArrayList<>();
     public static List<String> fechasDisponibles = new ArrayList<>();
    
    private int hora;
    private int fecha;
    private Medico medico;
    private Paciente paciente;
    private Especialidad especialidad;

    public Cita(Medico medico, Paciente paciente, Especialidad especialidad) {
        this.medico = medico;
        this.paciente = paciente;
        this.especialidad = especialidad;
        horasDisponibles.add("9:00am");
        horasDisponibles.add("9:30am");
        horasDisponibles.add("10:00am");
        horasDisponibles.add("10:30am");
        horasDisponibles.add("11:00am");
        horasDisponibles.add("11:30am");
        
        fechasDisponibles.add("05/05/2023");
        fechasDisponibles.add("06/05/2023");
        fechasDisponibles.add("07/05/2023");
        fechasDisponibles.add("08/05/2023");
        fechasDisponibles.add("09/05/2023");
        
        
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }


    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    public String mostrarDatos(){
        return this.getPaciente().getNombre() + " - " + fechasDisponibles.get(getFecha())
                +" - "+horasDisponibles.get(getHora());
    }
}
