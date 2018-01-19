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
public class DatosNutricional {
    int idDatosNutricional;
    float peso;
    float talla;
    float perimetroCefalico;
    float perimetroBranquial;
    float perimetroToracico;
    int Paciente_idPaciente;

    public int getIdDatosNutricional() {
        return idDatosNutricional;
    }

    public void setIdDatosNutricional(int idDatosNutricional) {
        this.idDatosNutricional = idDatosNutricional;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getPerimetroCefalico() {
        return perimetroCefalico;
    }

    public void setPerimetroCefalico(float perimetroCefalico) {
        this.perimetroCefalico = perimetroCefalico;
    }

    public float getPerimetroBranquial() {
        return perimetroBranquial;
    }

    public void setPerimetroBranquial(float perimetroBranquial) {
        this.perimetroBranquial = perimetroBranquial;
    }

    public float getPerimetroToracico() {
        return perimetroToracico;
    }

    public void setPerimetroToracico(float perimetroToracico) {
        this.perimetroToracico = perimetroToracico;
    }

    public int getPaciente_idPaciente() {
        return Paciente_idPaciente;
    }

    public void setPaciente_idPaciente(int Paciente_idPaciente) {
        this.Paciente_idPaciente = Paciente_idPaciente;
    }
    

}
