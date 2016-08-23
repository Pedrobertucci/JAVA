package com.company;

/**
 * Created by adsel on 22/08/2016.
 *  Faça uma classe chamada TestaAluno e crie dois objetos da classe Aluno
 atribuindo valores a eles. A classe também deve mostrar na tela as informações
 desses objetos.
 */
public class Aluno {
    String nome;
    String cpf;
    String dataNascimento;
    int cont=0;

    boolean testaAluno(){
        if(this.cont > 0){
            for(int i=0; i < cont; i++){
                System.out.println(this.nome);
                System.out.println(this.cpf);
                System.out.println(this.dataNascimento);
            }
            System.out.println();
            return true;

        }
        else{
            System.out.println("Nenhum aluno cadastrado");
            return false;
        }
    }









}
