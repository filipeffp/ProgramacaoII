package Negócio;

public class MunicaoPatrimonio {
	private String lote;
	private Militar responsavel;
	
	//construtores
	public MunicaoPatrimonio(String lote, Militar responsavel) {
		super();
		this.lote = lote;
		this.responsavel = responsavel;
	}

	public MunicaoPatrimonio() {
		super();
	}

	//métodos
	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Militar getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Militar responsavel) {
		this.responsavel = responsavel;
	}
	
}
