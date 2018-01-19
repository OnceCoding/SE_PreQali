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
public class RutaAlimenticia {
    int idRutaAlimenticia;
    String desayuno;
    String refrigerio;
    int Paciente_idPaciente;

    public int getIdRutaAlimenticia() {
        return idRutaAlimenticia;
    }

    public void setIdRutaAlimenticia(int idRutaAlimenticia) {
        this.idRutaAlimenticia = idRutaAlimenticia;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    public String getRefrigerio() {
        return refrigerio;
    }

    public void setRefrigerio(String refrigerio) {
        this.refrigerio = refrigerio;
    }

    public int getPaciente_idPaciente() {
        return Paciente_idPaciente;
    }

    public void setPaciente_idPaciente(int Paciente_idPaciente) {
        this.Paciente_idPaciente = Paciente_idPaciente;
    }
    
}
