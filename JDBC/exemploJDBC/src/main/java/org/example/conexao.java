package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar(){
        try{
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/escola",
                    "root",
                    ""
            );
        }catch (SQLException e ){
            JOptionPane.showMessageDialog(null,"Erro na Conexão");
            return null;
        }
    }

}
