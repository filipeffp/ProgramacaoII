package Neg�cio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//inicializar os reposit�rios
		Scanner input = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("		[MENU]");
			System.out.println("1 - Cadastrar Armas de fogo");
			System.out.println("2 - Cadastrar Muni��es");
			System.out.println("3 - Empr�stimo de Armas de Fogo");
			System.out.println("4 - Empr�stimo de Muni��es");
			System.out.println("5 - Sa�da definitiva de Armas de fogo");
			System.out.println("6 - Sa�da definitiva de Muni��es");
			System.out.println("7 - Listar Armas de fogo");
			System.out.println("8 - Listar Muni��es");
			System.out.println("9 - Sair");
			
			opcao = input.nextInt();
			
		     switch (opcao) {
		     //Cadastrar Armas de fogo
		       case 1:
		    	   //add arma de fogo
		    	   break;
		    //Cadastrar Muni��es
		       case 2:
		    	   
		    	   break;
		    //Empr�stimo de Armas de Fogo
		       case 3:

		    	   break;
		    //Empr�stimo de muni��es
		       case 4:
		    	   
		    	   break;
		    //Sa�da definitiva de Armas de fogo
		       case 5:
		    	   
		    	   break;
		    //Sa�da definitiva de Muni��es
		       case 6:
		    	   
		    	   break;
		    //Listar Armas de fogo
		       case 7:
		    	   
		    	   break;
		    //Listar Muni��es
		       case 8:
		    	   
		    	   break;
		       case 9:
		   		System.out.println("Encerrado!");
		   		break;
		    //default
		       default:
		    	   System.out.println("Op��o inv�lida");
		    	   break;
		     }
			
		} while (opcao!=9);
			
	}

}
