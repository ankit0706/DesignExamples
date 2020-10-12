package com.sample.builder;
/**
 * Immutable class
 * @author AANU
 *
 */
public class Drink {
	//all properties are optional
	private double fat_trans;
	private double fat_mono;
	private double fat_poly;
	private double carbs_starch;
	private double carbs_sugar;
	private double carbs_fibre;
	private double protein;
	private double calcium;
	private double magnesium;
	private double iron;
	private double vitaminA;
	private double vitaminC;
	
	//private constructor
	private Drink(DrinkBuilder builder) {
		this.fat_trans = builder.fat_trans;
		this.fat_mono = builder.fat_mono;
		this.fat_poly = builder.fat_poly;
		this.carbs_sugar = builder.carbs_sugar;
		this.carbs_starch = builder.carbs_starch;
		this.carbs_fibre = builder.carbs_fibre;
		this.protein = builder.protein;
		this.calcium = builder.calcium;
		this.magnesium = builder.magnesium;
		this.iron = builder.iron;
		this.vitaminA = builder.vitaminA;
		this.vitaminC = builder.vitaminC;
	}
	
	public static class DrinkBuilder{
		//builder also has all these fields but initialized to default
		private double fat_trans = 0.0;
		private double fat_mono = 0.0;
		private double fat_poly = 0.0;
		private double carbs_starch = 0.0;
		private double carbs_sugar = 0.0;
		private double carbs_fibre = 0.0;
		private double protein = 0.0;
		private double calcium = 0.0;
		private double magnesium = 0.0;
		private double iron = 0.0;
		private double vitaminA = 0.0;
		private double vitaminC = 0.0;
		//setter methods are public
		public void setTransFat(double value) {
			this.fat_trans = value;
		}
		
		public void setMonoFat(double value) {
			this.fat_mono = value;
		}
		
		public void setPolyFat(double value) {
			this.fat_poly = value;
		}
		
		public void setCarbsStarch(double value) {
			this.carbs_starch = value;
		}
		
		public void setCarbsSugar(double value) {
			this.carbs_sugar = value;
		}
		
		public void setCarbsFibre(double value) {
			this.carbs_fibre = value;
		}
		
		public void setProtein(double value) {
			this.protein = value;
		}
		
		public void setCalcium(double value) {
			this.calcium = value;
		}
		
		public void setMagnesium(double value) {
			this.magnesium = value;
		}
		
		public void setIron(double value) {
			this.iron = value;
		}
		
		public void setVitaminA(double value) {
			this.vitaminA = value;
		}
		
		public void setVitaminC(double value) {
			this.vitaminC = value;
		}
		
		public Drink build() {
			return new Drink(this);
		}
	}

	@Override
	public String toString() {
		return "Drink [fat_trans=" + fat_trans + ", fat_mono=" + fat_mono + ", fat_poly=" + fat_poly + ", carbs_starch="
				+ carbs_starch + ", carbs_sugar=" + carbs_sugar + ", carbs_fibre=" + carbs_fibre + ", protein="
				+ protein + ", calcium=" + calcium + ", magnesium=" + magnesium + ", iron=" + iron + ", vitaminA="
				+ vitaminA + ", vitaminC=" + vitaminC + "]";
	}
	
	
}
