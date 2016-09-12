package com.example.controller;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Money;

@RestController
@RequestMapping("/money")
@Api(name = "Money", description = "Money Controller")
public class MoneyController {

	@RequestMapping("/{pidm}/zfisofa")
	@ApiMethod(path = "/{pidm}/zfisofa", description = "Get Current ZFISOFA Balance")
	public Money getZfisofaBalanceByPidm(
			@ApiPathParam(name = "pidm", description = "PIDM")
			@PathVariable String pidm) {
		Money money = new Money();
		money.setAmount(500.00);
		
		return money;
	}
}
