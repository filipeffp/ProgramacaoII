package Negócio;

import java.util.Scanner;

import Dados.RepositorioArmaDeFogo;
import Dados.RepositorioPessoas;
import Dados.RepositorioUsuario;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //inicializar os repositórios
    RepositorioUsuario repositorioUsuarios = new RepositorioUsuario();
    RepositorioArmaDeFogo armas = new RepositorioArmaDeFogo();
    RepositorioPessoas pessoas = new RepositorioPessoas();
    
    int cont = 0;
    Usuario admin = new Usuario("123","123456","756","Carlos");
    admin.setAdmin(true);
    repositorioUsuarios.cadastrar(admin);
    int valor = 1;
    boolean cond =false;
    String cpf = "";
    String senha = "";
    while(valor != 0 && cond == false) {
      System.out.println("-------------------LOGIN-------------------");
      System.out.println("Digite 1 - para logar,  2 -para cadastrar ou 0 para sair: ");
      valor = input.nextInt();
      if(valor == 1) {
        System.out.println("Digite o login(CPF): ");
        cpf = input.next();
        System.out.println("Digite a senha: ");
        senha = input.next();
        for(int i = 0;i<repositorioUsuarios.tamanho();i++) {
          if(cpf.equals(repositorioUsuarios.cpf(i))){
            if(senha.equals(repositorioUsuarios.senha(i))) {
              cond = true;
              break;
            }
          
          }
        
        
      
      
      }
        if(cond == true) {
          System.out.println("Entrou no sistema...");
        }
        else if(cond == false) {
          System.out.println("Falha no login...");
      }
      }
      else if(valor == 2) {
        cont = 0;
        System.out.println("APENAS USUARIOS ADMINISTRADORES PODEM EFETUAR O CADASTRO DE UM NOVO USUARIO.");
        System.out.println("Login: ");
        cpf = input.next();
        System.out.println("Senha: ");
        senha = input.next();
        cont= 0;
        for(int i = 0;i<repositorioUsuarios.tamanho();i++) {
          if(cpf.equals(repositorioUsuarios.cpf(i))) {
            if(senha.equals(repositorioUsuarios.senha(i))) {
              if(repositorioUsuarios.admin(i) == true) {
                System.out.println("Acesso autorizado");
                System.out.println("Digite o nome: ");
                String nome = input.next();
                System.out.println("Digite a matricula: ");
                String matricula = input.next();
                System.out.println("Digite o CPF para cadastrar: ");
                cpf = input.next();
                System.out.println("Digite a senha que será utilizada: ");
                senha = input.next();
                System.out.println("Será ADM? true - PARA -SIM- OU false - PARA -NÃO-");
                boolean adm = input.nextBoolean();
                Usuario usuario = new Usuario(senha, cpf, matricula, nome);
                usuario.setAdmin(adm);
                System.out.println(repositorioUsuarios.cadastrar(usuario));
                cont=1;
                break;
                
              }
              
            }
            
            }
        
            
          }
        if(cont == 0){
          System.out.println("Falha no acesso");
          
          
          }
        }
      else if(valor == 0) {
        System.out.println("Encerrado...");
      }
      }
  
    if(valor>0) {  
      int opcao;
      do {
        System.out.println("    [MENU]");
        System.out.println("1 - Cadastrar Armas de fogo");
        System.out.println("2 - Cadastrar Munições");
        System.out.println("3 - Empréstimo de Armas de Fogo");
        System.out.println("4 - Empréstimo de Munições");
        System.out.println("5 - Saída definitiva de Armas de fogo");
        System.out.println("6 - Saída definitiva de Munições");
        System.out.println("7 - Listar Armas de fogo");
        System.out.println("8 - Listar Munições");
        System.out.println("9 - Sair");
      
        opcao = input.nextInt();
      
        switch (opcao) {
        
        case 1://Cadastrar Armas de fogo
        	
             break;
        //Cadastrar Munições
        case 2:
             
             break;
        //Empréstimo de Armas de Fogo
        case 3:

             break;
        //Empréstimo de munições
        case 4:
             
             break;
        //Saída definitiva de Armas de fogo
        case 5:
             
             break;
        //Saída definitiva de Munições
        case 6:
             
             break;
        //Listar Armas de fogo
        case 7:
             
             break;
        //Listar Munições
        case 8:
             
             break;
           case 9:
           System.out.println("Encerrado!");
           break;
        //default
           default:
             System.out.println("Opção inválida");
             break;
         }
      
    } while (opcao!=9);
      
  }
  }
}
