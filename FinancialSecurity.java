package com.vanguard.webservice.restApi.domain;

import java.util.ArrayList;
import java.util.List;

public class FinancialSecurity {
	private String securityId;
	private String accountPositionId;
	private CostBasisMethod costBasisMethod;
	private List<UnrealizedTaxLots> unrealizedTaxLots;
	private String securityIdType;
	
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	
	public FinancialSecurity securityId(String securityId) {
		this.securityId = securityId;
		return this;
	}
	public String getAccountPositionId() {
		return accountPositionId;
	}	
	public void setAccountPositionId(String accountPositionId) {
		this.accountPositionId = accountPositionId;
	}
	
	public FinancialSecurity accountPositionId(String accountPositionId) {
		this.accountPositionId = accountPositionId;
		return this;
	}
	
	public CostBasisMethod getCostBasisMethod() {
		return costBasisMethod;
	}
	public void setCostBasisMethod(CostBasisMethod costBasisMethod) {
		this.costBasisMethod = costBasisMethod;
	}
	
	public FinancialSecurity costBasisMethod(CostBasisMethod costBasisMethod) {
		this.costBasisMethod = costBasisMethod;
		return this;
	}
	
	public List<UnrealizedTaxLots> getUnrealizedTaxLots() {
		return unrealizedTaxLots;
	}
	public void setUnrealizedTaxLots(List<UnrealizedTaxLots> unrealizedTaxLots) {
		this.unrealizedTaxLots = unrealizedTaxLots;
	}
	
	public FinancialSecurity addUnrealizedTaxLot(UnrealizedTaxLots unrealizedTaxLot) {
		if (unrealizedTaxLots == null) {
			unrealizedTaxLots = new ArrayList<>();
		}
		
		unrealizedTaxLots.add( unrealizedTaxLot);
		return this;
	}
	
	public FinancialSecurity unrealizedTaxLots(List<UnrealizedTaxLots> unrealizedTaxLots) {
		this.unrealizedTaxLots = unrealizedTaxLots;
		return this;
	}
	
	public String getSecurityIdType() {
		return securityIdType;
	}
	public void setSecurityIdType(String securityIdType) {
		this.securityIdType = securityIdType;
	}
	public FinancialSecurity securityIdType(String securityIdType) {
		this.securityIdType = securityIdType;
		return this;
	}
	
	
}
