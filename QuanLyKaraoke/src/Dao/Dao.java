/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modell.Datphong;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface Dao {
     public <T> void  InsertInto( T t)throws SQLException;
      public <T> void Update ( T t )throws SQLException;
       public <T> void Delete ( T t )throws SQLException ;
}
