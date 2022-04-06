/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajdbc;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 6962246
 */
public class JavaJDBC {

    /**
     * @param args the command line arguments
     */
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/locadora";
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main(String[] args) {
        // TODO code application logic here
        //insereFilme("Os Vingadores",2017,"Acao","Filme de super heroi","Marvel");
        //deletaFilme(1);
        //passa como parametro o codigo, a coluna que quer editar e o dado novo
        editaFilme(2,"ano","2021");
        listaFilmes();
    }
    
    public static void listaFilmes(){
        String QUERY = "SELECT codigo, titulo, ano, genero, sinopse, produtora FROM filmes";
        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            java.sql.Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);){
            
            while(rs.next()){
                System.out.println("Codigo: " + rs.getInt("codigo"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }       
    }
    
    public static void insereFilme(String titulo, int ano, String genero, String sinopse, String produtora){
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            java.sql.Statement stmt = conn.createStatement();
            
            String QUERY = "INSERT INTO filmes(titulo, ano, genero, sinopse, produtora) "
                     + "VALUES('"+titulo+"',"+ano+",'"+genero+"','"+sinopse+"','"+produtora+"')";
            
            stmt.executeUpdate(QUERY);
            System.out.println("Inserido com sucesso");
                    
        } catch(SQLException e){
            e.printStackTrace();
        }       
    }
    
        
    public static void deletaFilme(int codigo){
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            java.sql.Statement stmt = conn.createStatement();
            String QUERY = "DELETE FROM filmes WHERE filmes.codigo = "+codigo;
            
            stmt.executeUpdate(QUERY);
            System.out.println("Deletado com sucesso");
                    
        } catch(SQLException e){
            e.printStackTrace();
        }     
    }
    
    public static void editaFilme(int codigo, String coluna, String novo_dado){
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            java.sql.Statement stmt = conn.createStatement();

            String QUERY = "UPDATE filmes SET "+coluna+" = '"+novo_dado+"' WHERE filmes.codigo =" + codigo;

            stmt.executeUpdate(QUERY);
            System.out.println("Editado com sucesso");
                    
        } catch(SQLException e){
            e.printStackTrace();
        } 
    }
}
