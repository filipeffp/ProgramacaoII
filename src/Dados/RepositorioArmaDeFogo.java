package Dados;

import java.util.ArrayList;
import Negócio.ArmaDeFogo;

public class RepositorioArmaDeFogo {
	private ArrayList<ArmaDeFogo> armasDeFogo;
	
	public RepositorioArmaDeFogo (int tamanho) {
		this.armasDeFogo = new ArrayList<>(tamanho);
	}
	
}