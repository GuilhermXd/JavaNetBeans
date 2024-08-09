/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Atleta;
/**
 *
 * @author aluno
 */
public class AtletaControl {

    private ArrayList<Atleta> Alatleta;
    
    public AtletaControl(){
      Alatleta = new ArrayList<>();
    }
    
    public void adicionar(String nome, double peso, double altura, int idade){
       Atleta at = new Atleta(nome,peso,altura,idade);
       Alatleta.add(at);
    }
    public String Mostrar(){
        String result = " ";
      for(Atleta al: Alatleta){
        result = "";
      }
      return result;
    }
    
}
