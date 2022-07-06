package entidade;

public interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean verificarSenha(int senha);

}

//UMA INTERFACE, NÃO PODEMOS UTILIZAR HERANÇA MULTIPLA, POIS NAO EXISTE NO JAVA, ENTÃO UTILIZAREMOS UMA INTERFACE.
//INTERFACES NÃO POSSUEM NADA CONCRETO, ENTÃO TUDO TEM QUE SER ABSTRATO
