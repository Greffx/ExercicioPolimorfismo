package aplicacao;

import entidade.EditorDeVideo;
import entidade.Funcionario;
import entidade.Gerente;

public class Programa {

	public static void main(String[] args) {
		
		Funcionario editor = new EditorDeVideo();
		Gerente gerente = new Gerente();
		
		editor.setCpf("016.605.232.12");
		editor.setNome("Eduardo");
		editor.setSalario(2000);
		
		System.out.println(editor.getCpf());
		System.out.println(editor.getNome());
		System.out.println(editor.getSalario());
		System.out.println(editor.getBonusSalario());
	
		gerente.setNome("João");
		gerente.setCpf("017.504.231.14");
		gerente.setSalario(4000);
		gerente.setSenha(2522);
		
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getNome());
		System.out.println(gerente.getSalario());
		//System.out.println(gerente.verificarSenha(gerente.getSenha()));
		

		
		System.out.println(gerente.getBonusSalario());
	}

}
