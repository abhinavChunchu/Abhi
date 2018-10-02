package com.vanguard.webservice.restApi.domain;

import java.math.BigDecimal;

public class ProposedTransaction {
	private String securityId;
	private BigDecimal sellQuantity;
	private BigDecimal amountSold;
	
	
	protected ProposedTransaction() {
			
	}
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public ProposedTransaction securityId(String securityId) {
		this.securityId = securityId;
		return this;
	}
	public BigDecimal getSellQuantity() {
		return sellQuantity;
	}
	public void setSellQuantity(BigDecimal sellQuantity) {
		this.sellQuantity = sellQuantity;
	}
	public ProposedTransaction sellQuantity(BigDecimal sellQuantity) {
		this.sellQuantity = sellQuantity;
		return this;
	}
	public BigDecimal getAmountSold() {
		return amountSold;
	}
	public void setAmountSold(BigDecimal amountSold) {
		this.amountSold = amountSold;
	}
	
	public ProposedTransaction amountSold(BigDecimal amountSold) {
		this.amountSold = amountSold;
		return this;
	}
	
	

}
