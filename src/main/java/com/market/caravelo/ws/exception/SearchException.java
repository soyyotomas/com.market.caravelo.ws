package com.market.caravelo.ws.exception;

import org.apache.log4j.Logger;

public class SearchException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5999154639393882847L;
	private final static Logger objLog = Logger.getLogger(SearchException.class);


	public SearchException() {
		super();
	}

	public SearchException(String mensaje) {
		super(mensaje);
	}

	public SearchException(Throwable causa) {
		super(causa);
	}
	
	public SearchException(String mensaje, NoClassDefFoundError causa) {
		super(mensaje,causa);
	}

}
