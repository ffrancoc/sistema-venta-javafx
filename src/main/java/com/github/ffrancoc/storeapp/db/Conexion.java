/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.ffrancoc.storeapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author niruc
 */
public class Conexion {

    private static Connection conn = null;

    private static final String HOST = "localhost";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String DB = "store";
    private static final int PORT = 3306;

    public static Connection getConnection() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            if (conn == null) {
                conn = DriverManager.getConnection("jdbc:mariadb://" + HOST + ":" + PORT + "/" + DB, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("DB ERROR: " + ex.getMessage());
        }

        return conn;
    }            
}
