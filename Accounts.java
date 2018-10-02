package com.vanguard.webservice.restApi.domain;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
	private String accountId;
	private String accountType;
	private List<FinancialSecurity> financialSecurity;
	
	protected Accounts() {
		
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public Accounts accountId(String accountId) {
		this.accountId= accountId;
		return this;
	}
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Accounts accountType(String accountType) {
		this.accountType = accountType;
		return this;
	}
	public List<FinancialSecurity> getFinancialSecurity() {
		return financialSecurity;
	}
	public void setFinancialSecurity(List<FinancialSecurity> financialSecurity) {
		this.financialSecurity = financialSecurity;
	}
	
	public Accounts addFinacialSecurity(FinancialSecurity financialSecurities) {
		if(financialSecurity == null) {
			financialSecurity = new ArrayList<>();
		}
		financialSecurity.add(financialSecurities);
		return this;
	}
	
	public Accounts financialSecurity(List<FinancialSecurity> financialSecurity) {
		this.financialSecurity = financialSecurity;
		return this;
	}
	

}
