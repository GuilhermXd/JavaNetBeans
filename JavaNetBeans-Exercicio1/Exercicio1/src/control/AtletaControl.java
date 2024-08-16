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
    
    public String adicionar(String nome, double peso, double altura, int idade){
       Atleta at = new Atleta(nome,peso,altura,idade);
       Alatleta.add(at);
       return "Atleta cadastrado com SUCESSO!!";
    }
    
    
    public double PesoMedio()
    {
      
        double a=0;
        for(Atleta al: Alatleta){
            a+= al.getPeso();
      
        }
       a/=Alatleta.size();
         
       return a;
        
    }
    
    
    public String MaisAlto(){
        String n = " ";
        double a = 0;
        for(Atleta al: Alatleta){
         if(al.getAltura()>a){
             a= al.getAltura();
             n = al.getNome();
         }
           
        }
       
        return n; 
    }
    public ArrayList MaioresIdd(){
        ArrayList a = new ArrayList<String>();
        for(Atleta al: Alatleta){
            if(al.getIdade()>=18){
              String nome = al.getNome();
               a.add(nome);
            }
        }
        
        return a;
    }
    
    
    public ArrayList<Atleta> Mostrar(){
        return Alatleta;     
    }
    /*public String Mostrar(){
        String result = " ";
      for(Atleta al: Alatleta){
        result += "\n"+"ATLETA:"+al.getNome() + "\n " + al.getPeso() + "\n " + al.getAltura()+"\n "+al.getIdade();
      }
      return result;
    }*/
    
}
