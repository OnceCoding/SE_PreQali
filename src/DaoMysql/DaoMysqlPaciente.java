/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoMysql;

import DAO.DaoException;
import DAO.DaoPaciente;
import Model.Paciente;
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
public class DaoMysqlPaciente implements DaoPaciente{
    private final Connection connection;
    PreparedStatement ps = null;
    ResultSet rs = null;
     public DaoMysqlPaciente(Connection connection){
        this.connection=connection;
    }
    String insertPaciente="insert into Paciente (nombrePaciente,apellidoPaciente,edad,domicilio,lugarProcedencia,genero) values (?,?,?,?,?,?)";
    String updatePaciente="update paciente set nombrePaciente=?, apellidoPaciente=?, edad=?, domicilio=?, lugarProcedencia=?, genero=? where idPaciente=?";
    String getPaciente="select * from paciente where idPaciente=?";
    String getIdPacienteLast="select idPaciente from Paciente order by idPaciente desc limit 1";
    @Override
    public int insertPaciente(Paciente paciente) {
        int idPaciente=0;
        try {
            ps=connection.prepareStatement(insertPaciente);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getEdad());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getLugarProcedencia());
            ps.setString(6, paciente.getGenero());
            ps.executeUpdate();
            //get last idPaciente
            ps=connection.prepareStatement(getIdPacienteLast);
            rs=ps.executeQuery();
            if(rs.next())idPaciente=rs.getInt("idPaciente");
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idPaciente; 
    }

    @Override
    public void update(Paciente paciente) throws DaoException {
        try {
            ps=connection.prepareStatement(updatePaciente);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getEdad());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getLugarProcedencia());
            ps.setString(6, paciente.getGenero());
            ps.setInt(7, paciente.getIdPaciente());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Integer id) throws DaoException {
        Paciente paciente = null;
        try {
            ps=connection.prepareStatement(getPaciente);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            if(rs.next()){
                paciente=new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombrePaciente"));
                paciente.setApellido(rs.getString("apellidoPaciente"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setLugarProcedencia(rs.getString("lugarProcedencia"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoMysqlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paciente;
    }

    @Override
    public void insert(Paciente object) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
