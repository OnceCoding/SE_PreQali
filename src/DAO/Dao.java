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
public interface Dao <Obj,Id>{
    
    public void insert(Obj object) throws DaoException;
    public void update(Obj object) throws DaoException;
    public void delete(Id id) throws DaoException;
    public Object get(Id id) throws DaoException;
}
