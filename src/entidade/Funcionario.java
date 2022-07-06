package entidade;
//não tem mais instanciar um funcionário, ela é abstrata, tem que ser um filho concreto, existe o tipo, o conceito.
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;//protected double salario quer dizer que não é público e nem privado, quer dizer publico, para os filhos, esta é a classe pai, mas nem para todas as classes em geral.
	private static int calcular;
	
	public Funcionario() {
		calcular += 1;
		
		System.out.println("Quantidade de vezes que criou o construtor funci: " + calcular);
	}
	
	public abstract double getBonusSalario(); //MÉTODO ABSTRATO, SEM CORPO, SEM FUNÇÃO, QUEM IMPLEMENTA SÃO OS FILHOS
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static int getCalcular() {
		return calcular;
	}
		
}
