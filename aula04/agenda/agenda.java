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
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/agenda";
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main(String[] args) {

        insereContato("Ana","ana@hotmail.com","99913-1293","10/10/2000");
        //deletaContato(1);
        
        //passa como parametro o codigo, a coluna que quer editar e o dado novo
        //editaContato(2,"nome","isabel");
        listaContato();
    }
    
    public static void listaContato(){
        String QUERY = "SELECT codigo, nome, email, telefone, dataNascimento, ativo FROM contato";
        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            java.sql.Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);){
            
            while(rs.next()){
                if(rs.getInt("ativo")!=0){
                System.out.print("Codigo: " + rs.getInt("codigo"));
                System.out.print("  Nome: " + rs.getString("nome"));
                System.out.print("  Email: " + rs.getString("email"));
                System.out.print("  Telefone: " + rs.getString("Telefone"));
                System.out.println("  Data de Nascimento: " + rs.getString("dataNascimento"));
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }       
    }
    
    public static void insereContato(String nome, String email, String telefone, String data){
        String QUERY = "SELECT codigo, nome, email, telefone, dataNascimento, ativo FROM contato";
        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            java.sql.Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);){
            
            
            while(rs.next()){
                System.out.println(rs.getString("nome"));
                System.out.println(nome);
                if(rs.getString("nome") == nome){
                    System.out.println("Nome ja existe");
                }else if(rs.getString("email") == email){
                    System.out.println("Email ja existe");
                }else if(rs.getString("telefone") == telefone){
                    System.out.println("Telefone ja existe");
                }else{
                    //QUERY = "INSERT INTO contato(nome, email, telefone, dataNascimento) "
                     //+ "VALUES('"+nome+"','"+email+"','"+telefone+"','"+data+"')";
                    
                    //stmt.executeUpdate(QUERY);
                    System.out.println("Inserido com sucesso");
                }
            }
                    
        } catch(SQLException e){
            e.printStackTrace();
        }       
    }
    
        
    public static void deletaContato(int codigo){
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            java.sql.Statement stmt = conn.createStatement();
            String QUERY = "UPDATE contato SET ativo = 0 WHERE codigo = " + codigo;
            
            stmt.executeUpdate(QUERY);
            System.out.println("Deletado com sucesso");
                    
        } catch(SQLException e){
            e.printStackTrace();
        }     
    }
    
    public static void editaContato(int codigo, String coluna, String novo_dado){
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            java.sql.Statement stmt = conn.createStatement();

            String QUERY = "UPDATE contato SET "+coluna+" = '"+novo_dado+"' WHERE contato.codigo =" + codigo;

            stmt.executeUpdate(QUERY);
            System.out.println("Editado com sucesso");
                    
        } catch(SQLException e){
            e.printStackTrace();
        } 
    }
}
