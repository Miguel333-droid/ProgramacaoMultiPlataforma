package org.example;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoDAO {
    public void Cadastrar(Aluno aluno){
        Connection con = Conexao.conectar();

        String sql = "INSERT INTO Aluno(nome,idade) values (?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,aluno.getNome());
            stmt.setInt(2,aluno.getIdade());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Aluno Cadastrado com Sucesso!");
            stmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro:" + e.getMessage());

        }
    }

    public void Consultarl(String NomeB) {
        Connection con = Conexao.conectar();

        String sql = "SELECT * FROM Aluno where nome = ?";


        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1,NomeB);

            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
            String res = "Nome: " + rs.getString("nome") +
            "\nIdade: " + rs.getInt("idade");

            JOptionPane.showMessageDialog(null,res);
            } else{
                JOptionPane.showMessageDialog(null,"Aluno não Encontrado!");
            }
            rs.close();
            stmt.close();
            con.close();
    } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro:" + e.getMessage());


        }
    }
}
