/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoMysql;

import DAO.DaoException;
import DAO.DaoRutaNutricional;
import Model.RutaAlimenticia;
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
public class DaoMysqlRutaNutricional implements DaoRutaNutricional{
    private final Connection connection;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String insertRuta="insert into RutaAlimenticia (desayuno,refrigerio,Paciente_idPaciente) values (?,?,?)";
    String updateRuta="update RutaAlimenticia set desayuno=?,refrigerio=?,Paciente_idPaciente=? where idRutaAlimenticia=?";
    String getRuta="select * from RutaAlimenticia where idRutaAlimenticia=?";
     public DaoMysqlRutaNutricional(Connection connection){
        this.connection=connection;
    }
    @Override
    public void insert(RutaAlimenticia ruta){
        try {
            ps=connection.prepareStatement(insertRuta);
            ps.setString(1, ruta.getDesayuno());
            ps.setString(2, ruta.getRefrigerio());
            ps.setInt(3, ruta.getPaciente_idPaciente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlRutaNutricional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(RutaAlimenticia ruta) throws DaoException {
        try {
            ps=connection.prepareStatement(updateRuta);
            ps.setString(1, ruta.getDesayuno());
            ps.setString(2, ruta.getRefrigerio());
            ps.setInt(3, ruta.getPaciente_idPaciente());
            ps.setInt(4, ruta.getIdRutaAlimenticia());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlRutaNutricional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Integer id) throws DaoException {
        RutaAlimenticia ruta=null;
        try {
            ps=connection.prepareStatement(getRuta);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            if(rs.next()){
                ruta= new RutaAlimenticia();
                ruta.setIdRutaAlimenticia(rs.getInt("idRutaAlimenticia"));
                ruta.setDesayuno(rs.getString("desayuno"));
                ruta.setRefrigerio(rs.getString("refrigerio"));
                ruta.setPaciente_idPaciente(rs.getInt("Paciente_idPaciente"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlRutaNutricional.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ruta;
    }
    
}
