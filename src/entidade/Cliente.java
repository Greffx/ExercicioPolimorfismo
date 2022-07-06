package entidade;
//PARA UTILIZAR UMA INTERFACE EM OUTRA CLASSE, UTILIZAMOS A PALAVRA IMPLEMENTS, UMA IMPLEMENTAÇÃO
public class Cliente implements Autenticavel{


	private AutenticadorDeSenha autenticador;

	public Cliente() {
		 this.autenticador = new AutenticadorDeSenha();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean verificarSenha(int senha) {
		return this.autenticador.verificarSenha(senha);
	}

}
