package entidade;

public class EditorDeVideo extends Funcionario {//EXTENDES É UMA PALAVRA CHAVE, ONDE VAI HERDAR TUDO DA OUTRA CLASSE CITADA
	
	public double getBonusSalario() {
			System.out.println("Chamando editor");
			//super é da classe mae, da super classe, onde é a classe que contem o atributo que está sendo usado fora dela
			return 200;
			//caso não utilize o super.salario, faça super.getSalario()
			//através do super, além de reaproveitar os atributos, pode reaproveitar os métodos
	}
}

