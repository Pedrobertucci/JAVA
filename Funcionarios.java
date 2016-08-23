package com.company;

/**
 * Created by adsel on 22/08/2016.
 */
public class Funcionarios {
    String nome;
    double salario;
    int cont=0;



    boolean testaFuncionario(){


        if(this.cont > 0){
            for(int i=0; i < cont; i++){
                System.out.println(this.nome);
                System.out.println(this.salario);

            }
            System.out.println();
            return true;

        }
        else{
            System.out.println("Nenhum Funcioanrio cadastrado");
            return false;
        }
    }
}
