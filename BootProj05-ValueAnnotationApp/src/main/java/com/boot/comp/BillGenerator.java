package com.boot.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerator {
	
	@Value("#{itemInfo.dosaPrice+itemInfo.idlyPrice+itemInfo.vadaPrice}") // SpringExpressionLanguage(SPEL)
	private float billAmount;
	@Value("A2B")
	private String Hotel;
	
	@Autowired
	private ItemsInfo itemInfo;

	@Override
	public String toString() {
		return "BillGenerator [billAmount=" + billAmount + ", Hotel=" + Hotel + ", itemInfo=" + itemInfo + "]";
	}

	
	

}
