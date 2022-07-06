package aplicacao;

import entidade.Administrador;
import entidade.Cliente;
import entidade.ControleBoneficacao;
import entidade.EditorDeVideo;
import entidade.Funcionario;
import entidade.Gerente;
import entidade.SistemaInterno;

public class ProgramaPolimorfismo {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		Funcionario ev = new EditorDeVideo();
		Gerente gerente1 = new Gerente();
		Administrador adm = new Administrador();
		SistemaInterno sistema = new SistemaInterno();
		Cliente cliente = new Cliente();
		
		ev.setNome("João");
		ev.setSalario(1500.0);
		
		gerente.setNome("Eduardo");
		gerente.setSalario(2000.0);
		
		ControleBoneficacao controleBonus = new ControleBoneficacao();

		controleBonus.registrar(ev);
		controleBonus.registrar(gerente);
		
		System.out.println(controleBonus.getSoma());
		cliente.setSenha(1234);
		
		sistema.autenticadorDeSenha(cliente);
		
		adm.setSenha(1234);
		gerente1.setSenha(1234);
		sistema.autenticadorDeSenha(adm);
		sistema.autenticadorDeSenha(gerente1);
		
		
	}

}
