/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2reloj;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {
 
    private LocalDate dia;
    private LocalTime hora;
    private String modelo;
    private long numSerie;

    public Reloj(LocalDate dia, LocalTime hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }
    
    public Reloj(){
        
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getModelo() {
        return modelo;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }
    
    public void incrementarDia (int dias ){
        dia=dia.plusDays(dias);
    }
    public void incrementarHora ( int horas){
        hora = hora.plusHours(horas);
    }
    public void limpiarPantalla(){
        System.out.println("Pantalla limpia");
    }
    
            
}
