/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class UsuarioDAO {
    public boolean autenticar(String email, String senha){
        String sql = "SELECT * from donoLoja "
                +"WHERE email = ? and senha = ? ";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()){
                return true;
            }           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }
        return false;
    }
    
    public boolean adicionarUsuario(Usuario u){
        String sql = "INSERT into cadastroUusario (nomeDono, telefone, "
                + "nomePet, dataNasc) "
                + "VALUES (?,?,?,?)";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNomeDono()); 
            stmt.setString(2, u.getTelefone());
            stmt.setString(3, u.getNomePet());
            stmt.setDate(4, new java.sql.Date(u.getDataNasc().getTime()));
            stmt.setBoolean(5, u.isAtivo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Usuário: " + u.getNomeDono() + " inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }
        
        return false;
    }
    
    public List<Usuario> readForDesc(int tipo, String desc) {
        String sql = "SELECT * FROM tbusuario";
        if(!desc.equals("")){
            if (tipo == 0 || tipo == 1)
                sql = sql + " WHERE nome LIKE ?";
            else
                sql = sql + " WHERE email LIKE ?";
        }
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            if(!desc.equals("")){
                if (tipo == 0 || tipo == 2)
                    stmt.setString(1, desc+"%");
                else    
                    stmt.setString(1, "%"+desc+"%");
            }
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setPkUsuario(rs.getLong("pkusuario"));
                usuario.setNomeDono(rs.getString("nome do dono"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setNomePet(rs.getString("nome do pet"));
                usuario.setDataNasc(rs.getDate("datanasc"));
                usuario.setAtivo(rs.getBoolean("ativo"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

        return usuarios;
    }
    
    public Usuario readForPk(long pk){
        String sql = "SELECT * FROM tbusuario WHERE pkusuario = ?";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = new Usuario();

        try {
            stmt = con.prepareStatement(sql);
             stmt.setLong(1, pk);
            
            rs = stmt.executeQuery();

            if (rs.next()) {

                usuario.setPkUsuario(rs.getLong("pkusuario"));
                usuario.setNomeDono(rs.getString("nome do dono"));
                usuario.setTelefone(rs.getString("email"));
                usuario.setNomePet(rs.getString("nome do pet"));
                usuario.setDataNasc(rs.getDate("datanasc"));
                usuario.setAtivo(rs.getBoolean("ativo"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

//        return usuarios;
        return usuario;
    }                           
    
  //  "INSERT into TBUSUARIO (nome, email, "
   //             + "senha, dataNasc, ativo) "
    //            + "VALUES (?,?,?,?,?)";
    
    public boolean alterarUsuario(Usuario usuario){
        String sql = "UPDATE tbusuario SET nome = ?, email = ?, senha = ?, datanasc = ?, ativo = ? WHERE pkusuario = ? ";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeDono()); 
            stmt.setString(2, usuario.getTelefone());
            stmt.setString(3, usuario.getNomePet());
            stmt.setDate(4, new java.sql.Date(usuario.getDataNasc().getTime()));
            stmt.setBoolean(5, usuario.isAtivo());
            stmt.setLong(6, usuario.getPkUsuario());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Usuário: " + usuario.getNomeDono() + " inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }
        
        return false;
    }
    
    public boolean excluirUsuario(int pkUsuario){
        String sql = "DELETE FROM tbusuario WHERE pkusuario = ?";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, pkUsuario);
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            return true;
        }    catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + e.getMessage());
        }    finally {
            gerenciador.closeConnection(stmt);
        }
        return false;
    }
}
