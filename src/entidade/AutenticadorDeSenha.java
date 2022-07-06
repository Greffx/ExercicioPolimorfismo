package entidade;

public class AutenticadorDeSenha {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	public boolean verificarSenha(int senha) {
		
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
//SERIA UMA COMPOSIÇÃO PARA REUTILIZAÇAO DE CÓDIGO