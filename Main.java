package com.company;

import java.util.Scanner;

/*
*  Implemente uma classe chamada Aluno para definir os objetos que
representarão os alunos de uma escola. Essa classe deve declarar três atributos: o
primeiro para o nome, o segundo para o CPF e o terceiro para a data de
nascimento dos alunos.
*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ler = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno();
        Funcionarios funcionario = new Funcionarios();
        Funcionarios funcionario2 = new Funcionarios();


        aluno.nome ="Pedro";
        aluno.cpf ="0407559772";
        aluno.dataNascimento = "17/08/2016";
        aluno.cont++;

        aluno1.nome ="José";
        aluno1.cpf ="464645646465";
        aluno1.dataNascimento = "12/05/2016";
        aluno1.cont++;

        System.out.println(" ** ALUNOS **");
        aluno.testaAluno();
        aluno1.testaAluno();

        funcionario.nome= "Carlinhos de Gzuis";
        funcionario.salario = 1500.25;
        funcionario.cont++;

        funcionario2.nome= "tia da limpeza";
        funcionario2.salario = 2000.25;
        funcionario2.cont++;

        System.out.println("** FUNCIONARIOS **");
        funcionario.testaFuncionario();
        funcionario2.testaFuncionario();




    }
}
