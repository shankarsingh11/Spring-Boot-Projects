package com.boot.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="itemInfo")
public class ItemsInfo {
	
	@Value("${item.dosa.price}")
	public float dosaPrice;
	@Value("${item.idli.price}")
	public float idlyPrice;
	@Value("${item.vada.price}")
	public float vadaPrice;
	
	public float getDosaPrice() {
		return dosaPrice;
	}

	public float getIdlyPrice() {
		return idlyPrice;
	}

	public float getVadaPrice() {
		return vadaPrice;
	}

	@Override
	public String toString() {
		return "ItemsInfo [dosaPrice=" + dosaPrice + ", idlyPrice=" + idlyPrice + ", vadaPrice=" + vadaPrice + "]";
	}

	
	
}
