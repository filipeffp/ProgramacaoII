package Negócio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Pessoa militar1 = new Militar("filipe", "cpf", "1234");
		System.out.println(militar1);
		
		ArmaDeFogoPatrimonio arma1 = new ArmaDeFogoPatrimonio("calibre", "especie", LocalDate.now(), LocalDate.now(), "marca", "modelo", "nrSerie", "status", "patrimonio");
		System.out.println(arma1);
		
		MunicaoPatrimonio municao1 = new MunicaoPatrimonio("calibre", "especie", LocalDate.now(), LocalDate.now(), 50, "lote");
		System.out.println(municao1);
	}

}
