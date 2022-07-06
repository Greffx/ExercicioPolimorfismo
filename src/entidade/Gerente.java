package entidade;

public class Gerente extends Funcionario implements Autenticavel{//EXTENDES É UMA PALAVRA CHAVE, ONDE VAI HERDAR TUDO DA OUTRA CLASSE CITADA
	
	private AutenticadorDeSenha autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticadorDeSenha();
	}
	public double getBonusSalario() {
			//super é da classe mae, da super classe, onde é a classe que contem o atributo que está sendo usado fora dela
			return super.getSalario();
			//caso não utilize o super.salario, faça super.getSalario()
			//através do super, além de reaproveitar os atributos, pode reaproveitar os métodos
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

