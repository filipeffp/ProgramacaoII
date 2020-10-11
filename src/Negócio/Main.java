package Negócio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//inicializar os repositórios
		Scanner input = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("		[MENU]");
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
		     //Cadastrar Armas de fogo
		       case 1:
		    	   //add arma de fogo
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
