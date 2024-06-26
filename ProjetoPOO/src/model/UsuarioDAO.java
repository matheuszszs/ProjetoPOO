/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utils.Utils;

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
        String sql = "INSERT into cadastroUsuario (nomeDono, telefone, "
                + "nomePet, dataNasc, ativo,imagem) "
                + "VALUES (?,?,?,?,?,?)";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        
        try {
            byte[] iconBytes = Utils.iconToBytes(u.getImagem());
                    
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNomeDono()); 
            stmt.setString(2, u.getTelefone());
            stmt.setString(3, u.getNomePet());
            stmt.setDate(4, new java.sql.Date(u.getDataNasc().getTime()));
            stmt.setBoolean(5, u.isAtivo());
            stmt.setBytes(6, iconBytes);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Usuário: " + u.getNomeDono() + " inserido com sucesso!");
            return true;
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }
        
        return false;
    }
    
    public List<Usuario> readForDesc(int tipo, String desc) {
        String sql = "SELECT * FROM cadastroUsuario";
        if(!desc.equals("")){
            if (tipo == 0 || tipo == 1)
                sql = sql + " WHERE nomeDono LIKE ?";
            else
                sql = sql + " WHERE nomePet LIKE ?";
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

                usuario.setPkUsuario(rs.getLong("codigo"));
                usuario.setNomeDono(rs.getString("nomeDono"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setNomePet(rs.getString("nomePet"));
                usuario.setDataNasc(rs.getDate("dataNasc"));
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
        String sql = "SELECT * FROM cadastrousuario WHERE codigo = ?";
        
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

                usuario.setPkUsuario(rs.getLong("codigo"));
                usuario.setNomeDono(rs.getString("nomeDono"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setNomePet(rs.getString("nomePet"));
                usuario.setDataNasc(rs.getDate("dataNasc"));
                usuario.setAtivo(rs.getBoolean("ativo"));
                
                byte[] bytes = rs.getBytes("imagem");
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                BufferedImage imagem = ImageIO.read(bis);
                
                usuario.setImagem(new ImageIcon(imagem));
            }

        } catch (SQLException | IOException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

//        return usuarios;
        return usuario;
    }                           
    
    public boolean alterarUsuario(Usuario usuario){
        String sql = "UPDATE cadastroUsuario SET NomeDono = ?, Telefone = ?, NomePet = ?, "
                + "DataNasc = ?, ativo = ?, "
                + "imagem = ? WHERE codigo = ? ";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        
        try {
            byte[] iconBytes = Utils.iconToBytes(usuario.getImagem());
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeDono()); 
            stmt.setString(2, usuario.getTelefone());
            stmt.setString(3, usuario.getNomePet());
            stmt.setDate(4, new java.sql.Date(usuario.getDataNasc().getTime()));
            stmt.setBoolean(5, usuario.isAtivo());
            stmt.setLong(6, usuario.getPkUsuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            return true;
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atu: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }
        
        return false;
    }
    
    public boolean excluirUsuario(int pkUsuario){
        String sql = "DELETE FROM cadastroUsuario WHERE codigo = ?";
        
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
