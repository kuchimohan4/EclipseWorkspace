package com.spring.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//use appropriate annotation to make this class as component class
@Component("os")
public class OutfitService {

	private OutfitBO outfitBO;

//use appropriate annotation 
	@Autowired
	public OutfitService(OutfitBO outfitBO) {
		super();
		this.outfitBO = outfitBO;
	}

	public OutfitBO getOutfitBO() {
		return outfitBO;
	}

	public void setOutfitBO(OutfitBO outfitBO) {
		this.outfitBO = outfitBO;
	}

	public void calculateNetProfit(Outfit outfitObj) throws NoProfitException {

		double netProfit = outfitBO.calculateNetProfit(outfitObj);
		outfitObj.calculatePrizeMoney(netProfit);
		if (netProfit <= 0) {
			throw new NoProfitException("No Profit to calculate the prize money");
		}
	}
}