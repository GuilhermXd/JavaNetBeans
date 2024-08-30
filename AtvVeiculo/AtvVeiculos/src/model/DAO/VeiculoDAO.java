/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author aluno
 */
public class VeiculoDAO {
    Connection con = null;
    //ano marca modelo placa (pk) cor
    public void InserirVeic(Veiculo v) throws SQLException, ClassNotFoundException
            {
                
                con = new Conexao().getConnection();
                String sql = "Insert into VEICULO (ANO, MARCA, MODELO, PLACA, COR) values (?,?,?,?,?)";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, v.getAno());
                smt.setString(2, v.getMarca());
                smt.setString(3, v.getModelo());
                smt.setString(3, v.getPlaca());
                smt.setString(3, v.getCor());

                smt.execute();
                smt.close();
                con.close();
    }
    
    public void excluir(String placa) throws SQLException, ClassNotFoundException{
        con = new Conexao().getConnection();
        String sql = "DELETE FROM VEICULO WHERE PLACA = ?";
        PreparedStatement smt = con.prepareStatement(sql);
         smt.setString(1, placa);
         smt.execute();
         smt.close();
         con.close();
    }
    
    public ArrayList<Veiculo> buscaVeiculos() throws SQLException, ClassNotFoundException{
    ResultSet rs;
    ArrayList<Veiculo> lista = new ArrayList();
    con = new Conexao().getConnection();
    String sql = "SELECT * FROM VEICULO";
    PreparedStatement smt = con.prepareStatement(sql);
    rs = smt.executeQuery();
    while(rs.next())
    {
        //String placa, String modelo, String marca, int ano, String cor
        int ano = rs.getInt("ANO");
        String marca = rs.getString("MARCA");
        String modelo = rs.getString("MODELO");
        String placa = rs.getString("PLACA");
        String cor = rs.getString("COR");
       
        Veiculo v = new Veiculo(placa, modelo,marca, ano, cor);
        lista.add(v);
    }
    smt.close();
    con.close();
    return lista;
    }
}
