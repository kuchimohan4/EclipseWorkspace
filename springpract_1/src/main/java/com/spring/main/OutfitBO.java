package com.spring.main;

import org.springframework.stereotype.Component;

//use appropriate annotation to make this class as component class
@Component
public class OutfitBO {

	public double calculateNetProfit(Outfit outfitObj){
		double netProfit = 0;
		double te = 0.0;
		for (Double expense : outfitObj.getOutfitExpenses().values()) {
			te += expense;
		}
		netProfit = outfitObj.getTotalIncome() - (outfitObj.getDesignerSalary() + te);
		return netProfit;
	}
}
