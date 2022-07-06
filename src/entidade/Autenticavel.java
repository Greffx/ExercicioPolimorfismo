package entidade;

public interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean verificarSenha(int senha);

}

//UMA INTERFACE, N�O PODEMOS UTILIZAR HERAN�A MULTIPLA, POIS NAO EXISTE NO JAVA, ENT�O UTILIZAREMOS UMA INTERFACE.
//INTERFACES N�O POSSUEM NADA CONCRETO, ENT�O TUDO TEM QUE SER ABSTRATO
