/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.ffrancoc.storeapp.db;

import com.github.ffrancoc.storeapp.models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author niruc
 */
public class DAOUsuario extends DAO {

    private Usuario usuario = null;
    private ArrayList<Usuario> usuarios = null;

    @Override
    public Object getItem(Integer id) {
        try {
            Connection conn = Conexion.getConnection();
            if (conn != null) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM usuarios WHERE id=?;");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    usuario = new Usuario(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getTimestamp(7),
                            rs.getTimestamp(8),
                            rs.getString(9));
                }
            }
        } catch (SQLException ex) {

        }

        return usuario;
    }

    @Override
    public ArrayList<?> getItems() {
        try {
            usuarios = new ArrayList<>();
            Connection conn = Conexion.getConnection();
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios;");
                while (rs.next()) {
                    usuarios.add(
                            usuario = new Usuario(
                                    rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getTimestamp(7),
                                    rs.getTimestamp(8),
                                    rs.getString(9)));
                }
            }
        } catch (SQLException ex) {

        }

        return usuarios;
    }

    public Usuario getLogin(String login, String clave) {
        try {
            Connection conn = Conexion.getConnection();
            if (conn != null) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM usuarios WHERE login=? AND CLAVE=SHA2(?, 256) AND estado=1;");
                ps.setString(1, login);
                ps.setString(2, clave);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    usuario = new Usuario(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getTimestamp(7),
                            rs.getTimestamp(8),
                            rs.getString(9));
                }
            }
        } catch (SQLException ex) {

        }
        return usuario;
    }

}
