/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Produto;
/**
 *
 * @author aluno
 */
public class ProdutoDAO {
    Connection con = null;
    
    public void InserirProd(Produto p) throws SQLException, ClassNotFoundException
            {
                
                con = new Conexao().getConnection();
                String sql ="Insert into PRODUTO (CODIGO, PRECO, DESCRICAO) values (?,?,?)";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, p.getCodigo());
                smt.setDouble(2, p.getPreco());
                smt.setString(3, p.getDescricao());
                smt.execute();
                smt.close();
                con.close();
    }
    
    public void excluir(int codigo) throws SQLException, ClassNotFoundException{
        con = new Conexao().getConnection();
        String sql = "DELETE FROM PRODUTO WHERE CODIGO = ?";
        PreparedStatement smt = con.prepareStatement(sql);
         smt.setInt(1, codigo);
         smt.execute();
         smt.close();
         con.close();
    }
}
