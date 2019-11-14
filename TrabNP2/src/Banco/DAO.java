/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;

/**
 *
 * @author guilherme
 */
public abstract class DAO {
    private Connection con;
    
    DAO(Connection con){
        this.con=con;
    }
    
    public Connection getCon() {
        return this.con;
    }
}
