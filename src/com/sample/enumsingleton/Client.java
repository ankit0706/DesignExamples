package com.sample.enumsingleton;

public class Client {
	public static void main(String[] args) {
		Logger logger = Logger.INSTANCE;
		logger.log("Hola Mundo");
	}
}
