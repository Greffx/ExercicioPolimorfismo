package entidade;

public class EditorDeVideo extends Funcionario {//EXTENDES � UMA PALAVRA CHAVE, ONDE VAI HERDAR TUDO DA OUTRA CLASSE CITADA
	
	public double getBonusSalario() {
			System.out.println("Chamando editor");
			//super � da classe mae, da super classe, onde � a classe que contem o atributo que est� sendo usado fora dela
			return 200;
			//caso n�o utilize o super.salario, fa�a super.getSalario()
			//atrav�s do super, al�m de reaproveitar os atributos, pode reaproveitar os m�todos
	}
}

