/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoMysql;

import DAO.DaoDiagnostico;
import DAO.DaoException;
import Model.Diagnostico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javierfuenteshuertas
 */
public class DaoMysqlDiagnostico implements DaoDiagnostico{
    private final Connection connection;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String insertDiagnostico="insert into Diagnostico(tipoDesnutricion,observacion,Paciente_idPaciente) values(?,?,?)";
    String updateDiagnostico="update diagnostico tipoDesnutricion=?,observacion=?,Paciente_idPaciente=? where idDiagnostico=?";
    String getDiagnostico="select * from Diagnostico where idDiagnostico=?";
     public DaoMysqlDiagnostico(Connection connection){
        this.connection=connection;
    }
    @Override
    public void insert(Diagnostico diagnostico) throws DaoException {
        try {
            ps=connection.prepareStatement(insertDiagnostico);
            ps.setString(1, diagnostico.getTipoDesnutricion());
            ps.setString(2, diagnostico.getObservacion());
            ps.setInt(3, diagnostico.getPaciente_idPaciente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Diagnostico diagnostico) throws DaoException {
        try {
            ps=connection.prepareStatement(updateDiagnostico);
            ps.setString(1, diagnostico.getTipoDesnutricion());
            ps.setString(2, diagnostico.getObservacion());
            ps.setInt(3, diagnostico.getPaciente_idPaciente());
            ps.setInt(4, diagnostico.getIdDiagnostico());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer id) throws DaoException {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Integer id) throws DaoException {
        Diagnostico diagnostico=null;
        try {
            ps=connection.prepareStatement(getDiagnostico);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            if(rs.next()){
                diagnostico= new Diagnostico();
                diagnostico.setIdDiagnostico(rs.getInt("idDiagnostico"));
                diagnostico.setTipoDesnutricion(getDiagnostico);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return diagnostico;
    }
    
}
