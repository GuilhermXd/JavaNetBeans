/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.ProdutoDAO;
import model.Produto;
/**
 *
 * @author aluno
 */
public class ProdutoControl {
    
    ArrayList<Produto> listPd ;
    
    public ProdutoControl(){
        listPd = new ArrayList();
    }
    
    public void cadastrar(int codigo, double preco, String descricao) throws SQLException, ClassNotFoundException {
        Produto p = new Produto(codigo, preco, descricao);
        ProdutoDAO pDAO = new ProdutoDAO();
        pDAO.InserirProd(p);
    }
    
    public ArrayList<Produto> mostrar(){
        return listPd;
    }
    
    public void remover(int cod) throws SQLException, ClassNotFoundException{
      ProdutoDAO pDAO = new ProdutoDAO();
      pDAO.excluir(cod);
          
      
    }
    }

