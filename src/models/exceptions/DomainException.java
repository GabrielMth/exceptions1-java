package models.exceptions;
// pode ser uma (subclasse) extensão da RuntimeException (não obriga a tratar) ou da Exception


public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L; // declarando versão de uma classe serializable(que é a exception)
	
	public DomainException(String msg) {
		super(msg);
	}

}
