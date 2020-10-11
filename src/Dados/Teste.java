package Dados;

import java.time.LocalDate;

import Negócio.ArmaDeFogo;
import Negócio.Militar;

public class Teste {

	public static void main(String[] args) {
		Militar militar = new Militar("Filipe", "1234", "matrícula");
		Militar militar2 = new Militar("Filipe", "1235", "matrícula");
		
		ArmaDeFogo arma1 = new ArmaDeFogo(".40", "pistola", LocalDate.now(), LocalDate.now(), "marca", "modelo", "1234", "status");
		ArmaDeFogo arma2 = new ArmaDeFogo(".40", "pistola", LocalDate.now(), LocalDate.now(), "marca", "modelo", "1235", "status");
				
		RepositorioPessoas pessoas = new RepositorioPessoas();
		RepositorioArmaDeFogo armas = new RepositorioArmaDeFogo();
		
		pessoas.cadastrarPessoa(militar); //PESSOA CADASTRADA COM SUCESSO!
		pessoas.cadastrarPessoa(militar); //PESSOA JÁ CADASTRADA
		pessoas.cadastrarPessoa(militar2);//PESSOA CADASTRADA COM SUCESSO!
		pessoas.removerPessoa(militar2); //PESSOA REMOVIDA COM SUCESSO!
		pessoas.removerPessoa(militar2); //PESSOA NÃO CADASTRADA!
		pessoas.cadastrarPessoa(militar2); //PESSOA REATIVADA COM SUCESSO!
		
		armas.cadastrarArmaDeFogo(arma1); //ARMA CADASTRADA COM SUCESSO!
		armas.cadastrarArmaDeFogo(arma1); //ARMA JÁ CADASTRADA
		armas.cadastrarArmaDeFogo(arma2);//ARMA CADASTRADA COM SUCESSO!
		armas.removerArmaDeFogo(arma2); //ARMA REMOVIDA COM SUCESSO!
		armas.removerArmaDeFogo(arma2); //ARMA NÃO CADASTRADA!
		armas.cadastrarArmaDeFogo(arma2); //ARMA REATIVADA COM SUCESSO!

	}

}
