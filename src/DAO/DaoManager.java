/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author javierfuenteshuertas
 */
public interface DaoManager {
    public DaoDatosNutricional getDaoDatosNutricional();
    public DaoDiagnostico getDaoDiagnostico();
    public DaoPaciente getDaoPaciente();
    public DaoRutaNutricional getDaoRutaNutricional();
}
