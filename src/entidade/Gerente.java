package entidade;

public class Gerente extends Funcionario implements Autenticavel{//EXTENDES � UMA PALAVRA CHAVE, ONDE VAI HERDAR TUDO DA OUTRA CLASSE CITADA
	
	private AutenticadorDeSenha autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticadorDeSenha();
	}
	public double getBonusSalario() {
			//super � da classe mae, da super classe, onde � a classe que contem o atributo que est� sendo usado fora dela
			return super.getSalario();
			//caso n�o utilize o super.salario, fa�a super.getSalario()
			//atrav�s do super, al�m de reaproveitar os atributos, pode reaproveitar os m�todos
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
		
	}

	@Override
	public boolean verificarSenha(int senha) {
		return this.autenticador.verificarSenha(senha);
	}
}

