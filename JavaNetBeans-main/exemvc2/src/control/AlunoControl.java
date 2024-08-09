/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoControl {

 private ArrayList<Aluno> ListaAl;    

    public AlunoControl() {
        ListaAl = new ArrayList<>();
       
    }
    
    public void cadastrar(String nome, int idade){
        Aluno al = new Aluno(nome,idade);
        ListaAl.add(al);
        //quanod eu falo pra vcs que na view vou pegar inf. da tela e passar para o controle... qr dizer que?... Que eu importei? mais que isso, tem que criar uma instancia e chamar um metodo o.O
    }
 
    public String mostrar()
    {
        String result = " ";
        for (Aluno al: ListaAl)
        {
            result+=al.getNome()+ " "+al.getIdade()+ "\n";
        }
        return result;
    }
 
}
