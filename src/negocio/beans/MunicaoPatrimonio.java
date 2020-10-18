package negocio.beans;

import java.time.LocalDate;

public class MunicaoPatrimonio extends Municao {
	private String lote;
	private Militar responsavel;
	
	//construtores
	public MunicaoPatrimonio(String calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga,
			int quantidade, String lote, Militar responsavel) {
		super(calibre, especie, dataCarga, dataDescarga, quantidade);
		this.lote = lote;
		this.responsavel = responsavel;
	}
	
	public MunicaoPatrimonio(String calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga,
			int quantidade, String lote) {
		super(calibre, especie, dataCarga, dataDescarga, quantidade);
		this.lote = lote;
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

	@Override
	public String toString() {
		return "MunicaoPatrimonio [lote=" + lote + ", responsavel=" + responsavel + ", calibre=" + calibre
				+ ", especie=" + especie + ", dataCarga=" + dataCarga + ", dataDescarga=" + dataDescarga
				+ ", getLote()=" + getLote() + ", getResponsavel()=" + getResponsavel() + ", getQuantidade()="
				+ getQuantidade() + ", getCalibre()=" + getCalibre() + ", getEspecie()=" + getEspecie()
				+ ", getDataCarga()=" + getDataCarga() + ", getDataDescarga()=" + getDataDescarga() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
