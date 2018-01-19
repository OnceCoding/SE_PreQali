/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoMysql;

import DAO.DaoDatosNutricional;
import DAO.DaoException;
import Model.DatosNutricional;
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
public class DaoMysqlDatosNutricional implements DaoDatosNutricional {
    private final Connection connection;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    String inserDatosNutricional="insert into DatosNutricional(peso,talla,perimetrocefalico,perimetrobranquial,perimetrotoracico,Paciente_idPaciente) values(?,?,?,?,?,?)";
    String updateDatosNutricional="update  DatosNutricional set peso=?,talla=?,perimetrocefalico=?,perimetrobranquial=?,perimetrotoracico=?,Paciente_idPaciente=? where idDatosNutricional=?";
    String getDatosNutricional="select * from DatosNutricional where idDatosNutricional=?";
     public DaoMysqlDatosNutricional(Connection connection){
        this.connection=connection;
    }
    @Override
    public void insert(DatosNutricional datos) throws DaoException {
        try {
            ps=connection.prepareStatement(inserDatosNutricional);
            ps.setFloat(1,datos.getPeso() );
            ps.setFloat(2,datos.getTalla() );
            ps.setFloat(3,datos.getPerimetroCefalico() );
            ps.setFloat(4,datos.getPerimetroBranquial() );
            ps.setFloat(5,datos.getPerimetroToracico() );
            ps.setInt(6, datos.getPaciente_idPaciente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlDatosNutricional.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(DatosNutricional datos) throws DaoException {
        try {
            ps=connection.prepareStatement(updateDatosNutricional);
            ps=connection.prepareStatement(inserDatosNutricional);
            ps.setFloat(1,datos.getPeso() );
            ps.setFloat(2,datos.getTalla() );
            ps.setFloat(3,datos.getPerimetroCefalico() );
            ps.setFloat(4,datos.getPerimetroBranquial() );
            ps.setFloat(5,datos.getPerimetroToracico() );
            ps.setInt(6, datos.getPaciente_idPaciente());
            ps.setInt(7, datos.getIdDatosNutricional());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlDatosNutricional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Integer id) throws DaoException {
        DatosNutricional datos = null;
        try {
            ps=connection.prepareStatement(getDatosNutricional);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            if(rs.next()){
                datos.setIdDatosNutricional(rs.getInt("idDatosNutricional"));
                datos.setPeso(rs.getFloat("peso"));
                datos.setTalla(rs.getFloat("talla"));
                datos.setPerimetroBranquial(rs.getFloat("perimetrobranquial"));
                datos.setPerimetroCefalico(rs.getFloat("perimetrocefalico"));
                datos.setPerimetroToracico(rs.getFloat("perimetrotoracico"));
                datos.setPaciente_idPaciente(rs.getInt("Paciente_idPaciente"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlDatosNutricional.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }

    @Override
    public int insertDatosNutricional(DatosNutricional datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
