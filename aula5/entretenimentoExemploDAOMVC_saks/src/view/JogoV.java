/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import dao.JogoDAO;
import java.util.Iterator;
import java.util.Scanner;
import model.Jogo;
/**
 *
 * @author 6962246
 */
public class JogoV {
        public static void imprime(JogoDAO jogoDAO){
        boolean continuar_menu = true;
        while(continuar_menu){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite:\n"
                    + "1 -> Listar\n"
                    + "2 -> Cadastrar\n"
                    + "3 -> Atualizar\n"
                    + "4 -> Locar\n"
                    + "5 -> Devolver\n"
                    + "6 -> Deletar\n"
                    + "7 -> Sair\n");

            String input = scanner.next();
            switch(input){
                case "1":
                    //listar
                    System.out.println("Segue lista de jogos: ");
                    for (model.Jogo j : jogoDAO.getJogos()) {
                        System.out.print("ID: " + j.getId());
                        System.out.print("  Jogo: " + j.getTitulo());
                        System.out.print("  Ano: " + j.getAno());
                        System.out.print("  Categoria: " + j.getCategoria());
                        System.out.print("  Sinopse: " + j.getSinopse());
                        if(j.getAtivo() == 2){
                            System.out.println("  Status: Locado ");
                        }else if(j.getAtivo() == 1){
                            System.out.println("  Status: Disponível");
                        }
                    }
                    break;

                case "2":
                    //cadastrar
                    System.out.println("Digite o titulo do Jogo: ");
                    String input_titulo = scanner.next();

                    System.out.println("Digite o ano do Jogo: ");
                    int input_ano = scanner.nextInt();

                    System.out.println("Digite a categoria do Jogo: ");
                    String input_categoria = scanner.next();

                    System.out.println("Digite a sinopse do Jogo: ");
                    String input_sinopse = scanner.next();

                    Jogo jogo = new Jogo(input_ano, input_titulo, input_categoria, input_sinopse);
                    jogoDAO.save(jogo);
                    break;

                case "3":
                    //editar
                    System.out.println("Digite o titulo do Jogo: ");
                    input_titulo = "";
                    input_titulo = scanner.next();

                    System.out.println("Digite o ano do Jogo: ");
                    input_ano = 0;
                    input_ano = scanner.nextInt();

                    System.out.println("Digite a categoria do Jogo: ");
                    input_categoria = "";
                    input_categoria = scanner.next();

                    System.out.println("Digite a sinopse do Jogo: ");
                    input_sinopse = "";
                    input_sinopse = scanner.next();

                    System.out.println("Digite o ID do Jogo: ");
                    int input_id = scanner.nextInt();

                    Jogo jogo_update = new Jogo(input_ano, input_titulo, input_categoria, input_sinopse);
                    jogoDAO.update(jogo_update,input_id); //envia o jogo e o id que deseja fazer o update
                    break;

                case "4":
                    //Locar
                    System.out.println("Digite o ID do Jogo que deseja locar: ");
                    int input_locar = scanner.nextInt();
                    jogoDAO.locar(input_locar);
                    break;

                case "5":
                    //Devolver
                    System.out.println("Digite o ID do Jogo que deseja devolver: ");
                    int input_ativar = scanner.nextInt();
                    jogoDAO.ativar(input_ativar);
                    break;

                case "6":
                    //desativar
                    System.out.println("Digite o ID do Jogo que deseja deletar/desativar: ");
                    int input_delete = scanner.nextInt();
                    jogoDAO.delete(input_delete);
                    break;

                case "7":
                    //sair do loop
                    continuar_menu = false;
                    break;
            }
        }
    }
}
