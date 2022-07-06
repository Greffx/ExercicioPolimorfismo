package entidade;

public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticadorDeSenha autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticadorDeSenha();
	}
	
	@Override
	public double getBonusSalario() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean verificarSenha(int senha) {
		return autenticador.verificarSenha(senha);
	}

}
