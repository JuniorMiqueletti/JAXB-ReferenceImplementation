package com.juniormiqueletti.exception;

public class JAXBParseException extends RuntimeException {

	private static final long serialVersionUID = 6393766329537712711L;

	public JAXBParseException(Throwable exception) {
		super(exception);
	}

}
