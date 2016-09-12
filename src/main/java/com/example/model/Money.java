package com.example.model;

import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

@ApiObject(name = "Money", description = "Zfisofa Balance")
public class Money {
	@ApiObjectField(name = "Amount", description = "ZFISOFA Amount")
	double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
