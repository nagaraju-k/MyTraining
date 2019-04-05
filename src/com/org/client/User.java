package com.org.client;

import com.org.Calculater;

public class User {

	public static void main(String[] args) {
		Calculater cal = new Calculater();
		int result = cal.add(5, 7);
		System.out.println("add result: "+ result);
	}

}
