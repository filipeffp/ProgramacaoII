package Dados;

import java.time.LocalDate;

import Negócio.ArmaDeFogo;
import Negócio.ArmaDeFogoPatrimonio;
import Negócio.Militar;
import Negócio.Usuario;

public class TesteRepositórios {

	public static void main(String[] args) {
		Militar militar1 = new Militar("Filipe", "1234", "matrícula");
		Militar militar2 = new Militar("Filipe", "1235", "matrícula");
		
		ArmaDeFogo arma1 = new ArmaDeFogo(".40", "pistola", LocalDate.now(), LocalDate.now(), "marca", "modelo", "1234", "status");
		ArmaDeFogo arma2 = new ArmaDeFogoPatrimonio(".40", "pistola", LocalDate.now(), LocalDate.now(), "marca", "modelo", "1234", "status", "7890", militar1);

		Usuario usuario1 = new Usuario("nome", "809123", "matricula", "senha", false, true);
		Usuario usuario2 = new Usuario("nome", "135791", "matricula", "senha", false, true);
		
		RepositorioPessoas pessoas = new RepositorioPessoas();
		RepositorioArmaDeFogo armas = new RepositorioArmaDeFogo();
		RepositorioUsuarios usuarios = new RepositorioUsuarios();
		
		System.out.println("\nPESSOAS-------------");
		pessoas.cadastrarPessoa(militar1); //PESSOA CADASTRADA COM SUCESSO!
		pessoas.cadastrarPessoa(militar1); //PESSOA JÁ CADASTRADA
		pessoas.cadastrarPessoa(militar2);//PESSOA CADASTRADA COM SUCESSO!
		pessoas.removerPessoa(militar2); //PESSOA REMOVIDA COM SUCESSO!
		pessoas.removerPessoa(militar2); //PESSOA NÃO CADASTRADA!
		pessoas.cadastrarPessoa(militar2); //PESSOA REATIVADA COM SUCESSO!
				
		System.out.println("\nARMAS-------------");
		armas.cadastrarArmaDeFogo(arma1); //ARMA CADASTRADA COM SUCESSO!
		armas.cadastrarArmaDeFogo(arma1); //ARMA JÁ CADASTRADA
		armas.cadastrarArmaDeFogo(arma2);//ARMA CADASTRADA COM SUCESSO!
		armas.removerArmaDeFogo(arma2); //ARMA REMOVIDA COM SUCESSO!
		armas.removerArmaDeFogo(arma2); //ARMA NÃO CADASTRADA!
		armas.cadastrarArmaDeFogo(arma2); //ARMA REATIVADA COM SUCESSO!
		
		System.out.println("\nUSUARIOS-------------");
		usuarios.cadastrarUsuario(usuario1); //USUARIO CADASTRADA COM SUCESSO!
		usuarios.cadastrarUsuario(usuario1); //USUARIO JÁ CADASTRADA
		usuarios.cadastrarUsuario(usuario2);//USUARIO CADASTRADA COM SUCESSO!
		usuarios.removerUsuario(usuario2); //USUARIO REMOVIDA COM SUCESSO!
		usuarios.removerUsuario(usuario2); //USUARIO NÃO CADASTRADA!
		usuarios.cadastrarUsuario(usuario2); //USUARIO REATIVADA COM SUCESSO!
		
		System.out.println("\n-------------");
		System.out.println(arma1);
		System.out.println(arma2);
		System.out.println(militar1);
		System.out.println(militar2);
		System.out.println(usuario1);
		System.out.println(usuario2);

	}

}
