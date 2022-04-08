/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Jogo;
/**
 *
 * @author 6962246
 */
public class JogoDAO {
    
    
        public void locar(int id){
            String QUERY = "UPDATE jogo SET ativo = ? WHERE jogo.id = ?";
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            
            try {
                connection = conexao.ConectaBD.createConnectionMySQL();
                preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);
                preparedStatement.setString(1, "2");
                preparedStatement.setInt(2, id);

                preparedStatement.execute();
                System.out.println("Jogo locado com sucesso");

            } catch (SQLException ex) {
                Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
        public void delete(int id){
            String QUERY = "UPDATE jogo SET ativo = ? WHERE jogo.id = ?";
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            
            try {
                connection = conexao.ConectaBD.createConnectionMySQL();
                preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);
                preparedStatement.setString(1, "0");
                preparedStatement.setInt(2, id);

                preparedStatement.execute();
                System.out.println("Jogo desativado com sucesso");

            } catch (SQLException ex) {
                Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
        public void ativar(int id){
            String QUERY = "UPDATE jogo SET ativo = ? WHERE jogo.id = ?";
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            
            try {
                connection = conexao.ConectaBD.createConnectionMySQL();
                preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);
                preparedStatement.setString(1, "1");
                preparedStatement.setInt(2, id);

                preparedStatement.execute();
                System.out.println("Jogo ativado com sucesso");

            } catch (SQLException ex) {
                Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    
        public void update(Jogo jogo, int id){
        //UPDATE `jogo` SET `titulo` = 'Lol' WHERE `jogo`.`id` = 1; 
        //UPDATE `jogo` SET `titulo` = 'Dota2', `ano` = '2010', `categoria` = 'mobaa', `sinopse` = 'Jogo' WHERE `jogo`.`id` = 1; 
            
            String QUERY = "UPDATE jogo SET titulo = ?, ano = ?, categoria = ?, sinopse = ? WHERE jogo.id = ?";
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            
            try {
                connection = conexao.ConectaBD.createConnectionMySQL();
                preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);
                preparedStatement.setString(1, jogo.getTitulo());
                preparedStatement.setInt(2, jogo.getAno());
                preparedStatement.setString(3, jogo.getCategoria());
                preparedStatement.setString(4, jogo.getSinopse());
                preparedStatement.setInt(5, id);

                preparedStatement.execute();
                System.out.println("Jogo editado com sucesso");

            } catch (SQLException ex) {
                Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        }
    
        public void save(Jogo jogo) {
        String QUERY = "INSERT INTO jogo (titulo, ano, categoria, sinopse, ativo)"
                + " VALUES (?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = conexao.ConectaBD.createConnectionMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);
            preparedStatement.setString(1, jogo.getTitulo());
            preparedStatement.setInt(2, jogo.getAno());
            preparedStatement.setString(3, jogo.getCategoria());
            preparedStatement.setString(4, jogo.getSinopse());
            preparedStatement.setInt(5, jogo.getAtivo());

            preparedStatement.execute();
            System.out.println("Jogo salvo com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Jogo> getJogos() {
        List<Jogo> jogos = new ArrayList<Jogo>();
        String QUERY = "SELECT * FROM jogo WHERE ativo != 0";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;       

        try {
            connection = conexao.ConectaBD.createConnectionMySQL();
            preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY);
            
            resultSet = preparedStatement.executeQuery(QUERY);
            
            while (resultSet.next()) {
                Jogo jogo = new Jogo();
                
                jogo.setId(resultSet.getInt("id"));
                jogo.setAno(resultSet.getInt("ano"));
                jogo.setTitulo(resultSet.getString("titulo"));
                jogo.setCategoria(resultSet.getString("categoria"));
                jogo.setSinopse(resultSet.getString("sinopse"));
                jogo.setAtivo(resultSet.getInt("ativo"));
                
                jogos.add(jogo);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jogos;
    }
}
