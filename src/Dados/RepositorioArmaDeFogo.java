package Dados;

import java.util.ArrayList;
import Neg�cio.ArmaDeFogo;

public class RepositorioArmaDeFogo {
	private ArrayList<ArmaDeFogo> armasDeFogo;
	
	public RepositorioArmaDeFogo (int tamanho) {
		this.armasDeFogo = new ArrayList<>(tamanho);
	}
	
}