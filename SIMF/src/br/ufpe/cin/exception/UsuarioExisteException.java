package br.ufpe.cin.exception;

public class UsuarioExisteException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Usu�rio j� cadastrado. Informe outro nome de usu�rio.";
	}
}
