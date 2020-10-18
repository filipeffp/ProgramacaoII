package dados;

import negocio.beans.ArmaDeFogo;

public interface IRepositorioArmaDeFogo {
	
	boolean cadastrarArmaDeFogo(ArmaDeFogo armaDeFogo);
	boolean removerArmaDeFogo(ArmaDeFogo armaDeFogo);
	boolean buscarArmaDeFogo(ArmaDeFogo armaDeFogo);

}
