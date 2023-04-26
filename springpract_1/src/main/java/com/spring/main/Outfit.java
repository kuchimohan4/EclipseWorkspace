package com.spring.main;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
//Use appropriate annotation for scope

@Component("out")
@Scope("prototype")
public class Outfit implements OutfitDesigner {

	private double totalIncome;
	private double designerSalary;
	private double prizeMoney;

	public double getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(double prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	// use appropriate annotation
	@Value("#{${outfitExpenses.map}}")
	private Map<String, Double> outfitExpenses;

	// use appropriate annotation
	@Value("${percentage}")
	private double percentage;

	public double getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}

	public double getDesignerSalary() {
		return designerSalary;
	}

	public void setDesignerSalary(double designerSalary) {
		this.designerSalary = designerSalary;
	}

	public Map<String, Double> getOutfitExpenses() {
		return outfitExpenses;
	}

	public void setOutfitExpenses(Map<String, Double> outfitExpenses) {
		this.outfitExpenses = outfitExpenses;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void calculatePrizeMoney(double netProfit) {
		this.prizeMoney = netProfit * this.percentage / 100;

	}
}
