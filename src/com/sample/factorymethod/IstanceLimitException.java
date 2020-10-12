package com.sample.factorymethod;

/**
 * Our custom exception will be an unchecked exception
 * so we will extend from the RuntimeException class. It 
 * implements the serializable interface so a serial version UID
 * is provided. This class extends from java.lang.Exception which
 * is the class to extend for creating custom checked exceptions
 * @author AANU
 *
 */
public class IstanceLimitException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7561403363654302475L;

	public IstanceLimitException(String message) {
		super(message);
	}
}
