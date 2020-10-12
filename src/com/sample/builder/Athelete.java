package com.sample.builder;

import com.sample.builder.Drink.DrinkBuilder;

public class Athelete {

	public static void main(String[] args) {
		DrinkBuilder drinkBuilder = new DrinkBuilder();
		drinkBuilder.setCalcium(0.065);
		drinkBuilder.setCarbsStarch(1.36);
		drinkBuilder.setIron(0.0775);
		drinkBuilder.setMonoFat(0.25);
		drinkBuilder.setProtein(1.67);
		drinkBuilder.setVitaminA(2.26);
		Drink drink = drinkBuilder.build();
		System.out.println(drink.toString());
	}

}
