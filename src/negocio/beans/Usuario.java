package negocio.beans;


public class Usuario extends Militar {
  protected String senha;
  protected String log;
  protected boolean admin = false;
  
  
  public Usuario(String senha, String cpf, String matricula, String nome) {
    super(cpf, matricula,nome);
    this.senha = senha;
    this.log = cpf;
  }
  public Usuario(String senha, String cpf, String matricula, String nome,boolean admin) {
	    super(cpf, matricula,nome);
	    this.senha = senha;
	    this.log = cpf;
	    this.admin = admin;
	  }
  

  public boolean isAdmin() {
    return admin;
  }


  public void setAdmin(boolean admin) {
    this.admin = admin;
  }


  public String getSenha() {
    return senha;
  }


  public void setSenha(String senha) {
    this.senha = senha;
  }


  public String getLog() {
    return log;
  }


  public void setLog(String log) {
    this.log = log;
  }


  }