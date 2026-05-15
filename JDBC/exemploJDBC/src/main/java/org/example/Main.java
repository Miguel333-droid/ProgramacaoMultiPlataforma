package org.example;

import javax.swing.*;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        AlunoDAO al = new AlunoDAO();


        String nome = JOptionPane.showInputDialog("Digite o Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade:"));


        Aluno aluno = new Aluno(nome,idade);
        al.Cadastrar(aluno);

        String b = JOptionPane.showInputDialog("Digite um Nome para Busca:");
        al.Consultarl(b);
    }

}