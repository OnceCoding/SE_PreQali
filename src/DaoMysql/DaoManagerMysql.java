/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoMysql;




import DAO.DaoDatosNutricional;
import DAO.DaoDiagnostico;
import DAO.DaoManager;
import DAO.DaoPaciente;
import DAO.DaoRutaNutricional;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author javierfuenteshuertas
 */
public class DaoManagerMysql implements DaoManager{
    
    public static DaoManagerMysql manager;
    private static Connection connection;
    public static String url="jdbc:mysql://localhost:3306/sis_experto_nutricion";
    public static String user = "root";
    public static String password = "Yuav4.22";
    
    public DaoDatosNutricional daoDatosNutricional;
    public DaoDiagnostico daoDiagnostico;
    public DaoPaciente daoPaciente;
    public DaoRutaNutricional daoRutaNutricional;
    public DaoManagerMysql() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public static DaoManagerMysql getDaoManager(){
        manager = new DaoManagerMysql();        
        return manager;
    }

    @Override
    public DaoDatosNutricional getDaoDatosNutricional() {
        daoDatosNutricional= new DaoMysqlDatosNutricional(connection);
        return daoDatosNutricional;
    }

    @Override
    public DaoDiagnostico getDaoDiagnostico() {
        daoDiagnostico = new DaoMysqlDiagnostico(connection);
        return daoDiagnostico;
    }

    @Override
    public DaoPaciente getDaoPaciente() {
        daoPaciente = new DaoMysqlPaciente(connection);
        return daoPaciente;
    }

    @Override
    public DaoRutaNutricional getDaoRutaNutricional() {
        daoRutaNutricional = new DaoMysqlRutaNutricional(connection);
        return daoRutaNutricional;
    }

    
}
