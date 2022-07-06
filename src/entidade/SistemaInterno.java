package entidade;

public class SistemaInterno{
	
	private int senha = 1234;
	
	public void autenticadorDeSenha(Autenticavel usuarioComSenha) {
		boolean autenticador = usuarioComSenha.verificarSenha(senha);
		
		if(autenticador) {
			System.out.println("Passou");
		} else {
			System.out.println("Não passou");
		}
	}

}
