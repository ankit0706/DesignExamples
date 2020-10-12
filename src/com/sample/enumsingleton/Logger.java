package com.sample.enumsingleton;
/**
 * A thread safe singleton using enum
 * It is protected against Reflections and Serialization
 * The most recommended way of implementing Singletons
 * Though using spring beans too, one can get singleton
 * implementation
 * @author AANU
 *
 */
public enum Logger {
	INSTANCE;
	
	public void log(String message) {
		System.out.println("Message is: " + message);
	}
}
