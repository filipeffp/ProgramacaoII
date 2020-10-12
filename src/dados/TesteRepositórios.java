package dados;

//CLASSE PARA TESTAR CRUD

import java.time.LocalDate;

import negocio.ArmaDeFogo;
import negocio.ArmaDeFogoPatrimonio;
import negocio.Militar;

public class TesteReposit�rios {

	public static void main(String[] args) {
		Militar militar1 = new Militar("Filipe", "1234", "matr�cula");
		Militar militar2 = new Militar("Filipe", "1235", "matr�cula");
		
		ArmaDeFogo arma1 = new ArmaDeFogo(".40", "pistola", LocalDate.now(), LocalDate.now(), "marca", "modelo", "1234", "status");
		ArmaDeFogo arma2 = new ArmaDeFogoPatrimonio(".40", "pistola", LocalDate.now(), LocalDate.now(), "marca", "modelo", "1234", "status", "7890", militar1);
		
		RepositorioPessoas pessoas = new RepositorioPessoas();
		RepositorioArmaDeFogo armas = new RepositorioArmaDeFogo();
		
		System.out.println("\nPESSOAS-------------");
		pessoas.cadastrarPessoa(militar1); //PESSOA CADASTRADA COM SUCESSO!
		pessoas.cadastrarPessoa(militar1); //PESSOA J� CADASTRADA
		pessoas.cadastrarPessoa(militar2);//PESSOA CADASTRADA COM SUCESSO!
		pessoas.removerPessoa(militar2); //PESSOA REMOVIDA COM SUCESSO!
		pessoas.removerPessoa(militar2); //PESSOA N�O CADASTRADA!
		pessoas.cadastrarPessoa(militar2); //PESSOA REATIVADA COM SUCESSO!
				
		System.out.println("\nARMAS-------------");
		armas.cadastrarArmaDeFogo(arma1); //ARMA CADASTRADA COM SUCESSO!
		armas.cadastrarArmaDeFogo(arma1); //ARMA J� CADASTRADA
		armas.cadastrarArmaDeFogo(arma2);//ARMA CADASTRADA COM SUCESSO!
		armas.removerArmaDeFogo(arma2); //ARMA REMOVIDA COM SUCESSO!
		armas.removerArmaDeFogo(arma2); //ARMA N�O CADASTRADA!
		armas.cadastrarArmaDeFogo(arma2); //ARMA REATIVADA COM SUCESSO!
		
		System.out.println("\n-------------");
		System.out.println(arma1);
		System.out.println(arma2);
		System.out.println(militar1);
		System.out.println(militar2);


	}

}
