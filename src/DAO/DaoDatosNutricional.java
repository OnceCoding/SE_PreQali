/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DatosNutricional;
import Model.Paciente;

/**
 *
 * @author javierfuenteshuertas
 */
public interface DaoDatosNutricional extends Dao<DatosNutricional,Integer> {
    public int insertDatosNutricional(DatosNutricional datos);
}
