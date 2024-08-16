/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import model.Produto;
public class ProdutoControl {
    private ArrayList<Produto> alProd;
    public ProdutoControl(){
        alProd = new ArrayList<Produto>();
    }
    
    public String adicionar(int codigo, String descricao, double preco){
       Produto p = new Produto(codigo, descricao, preco);
       alProd.add(p);
       return "Produto cadastrado com Sucesso!";
    }
    
    public ArrayList<Produto> mostrar(){
        return alProd;
    }
    
}
