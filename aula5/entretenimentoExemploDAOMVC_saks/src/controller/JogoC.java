/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import conexao.ConectaBD;
import dao.JogoDAO;
import model.Jogo.*;
import java.sql.*;
import model.Jogo;
import static view.JogoV.imprime;
/**
 *
 * @author 6962246
 */
public class JogoC {
        public static void iniciar() throws SQLException{
        Connection connection = ConectaBD.createConnectionMySQL();
        if(connection != null){
            System.out.println("Conexão realizada com sucesso");
            connection.close();
        }
        
        JogoDAO jogoDAO = new JogoDAO();
        //Jogo jogo = new Jogo(2011, "Dota 2", "moba", "Original");
        //jogoDAO.save(jogo);

        //Jogo jogo = new Jogo(2009, "LOL", "moba", "Jogo");
        //jogoDAO.update(jogo,1); //envia o jogo e o id que deseja fazer o update

        //jogoDAO.delete(1);
        //jogoDAO.ativar(1);
        
        
        imprime(jogoDAO);
        
    }
}
