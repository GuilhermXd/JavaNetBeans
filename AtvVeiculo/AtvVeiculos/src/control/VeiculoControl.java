/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.VeiculoDAO;
import model.Veiculo;

/**
 *
 * @author aluno
 */
public class VeiculoControl {
    
     ArrayList<Veiculo> listV ;
    
    public VeiculoControl(){
        listV = new ArrayList();
    }
    
    public void cadastrar(String placa, String modelo, String marca, int ano, String cor) throws SQLException, ClassNotFoundException {
        Veiculo v = new Veiculo(placa, modelo, marca, ano, cor);
        VeiculoDAO vDAO = new VeiculoDAO();
        vDAO.InserirVeic(v);
    }
    
    public ArrayList<Veiculo> mostrar() throws SQLException, ClassNotFoundException{
        
        VeiculoDAO vDAO = new VeiculoDAO();
        listV = vDAO.buscaVeiculos();
        return listV;
    }
    
    public void remover(String placa) throws SQLException, ClassNotFoundException{
      VeiculoDAO vDAO = new VeiculoDAO();
      vDAO.excluir(placa);
          
      
    }
}
