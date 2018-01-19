/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author javierfuenteshuertas
 */
public class Diagnostico {
    int idDiagnostico;
    String tipoDesnutricion;
    String observacion;
    int Paciente_idPaciente;

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getTipoDesnutricion() {
        return tipoDesnutricion;
    }

    public void setTipoDesnutricion(String tipoDesnutricion) {
        this.tipoDesnutricion = tipoDesnutricion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getPaciente_idPaciente() {
        return Paciente_idPaciente;
    }

    public void setPaciente_idPaciente(int Paciente_idPaciente) {
        this.Paciente_idPaciente = Paciente_idPaciente;
    }
    

}
