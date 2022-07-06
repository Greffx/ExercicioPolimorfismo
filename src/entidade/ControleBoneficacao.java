package entidade;

public class ControleBoneficacao {
	
	private double soma;
	
	public void registrar(Funcionario f) {
		
		double bonificacao = f.getBonusSalario();
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}
}
