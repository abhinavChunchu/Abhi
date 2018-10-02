package com.vanguard.webservice.restApi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UnrealizedTaxLots {
	private String taxLotId;
	private boolean covered;
	private BigDecimal quantity;
	private BigDecimal averageCostPerShare;
	private LotTerm term;
	private LocalDate tradeDateTime;
	private TradeType tradeType;
	private LotType type;
	private BigDecimal gainOrLossAmount = null;
	
	protected UnrealizedTaxLots() {
		
	}
	public String getTaxLotId() {
		return taxLotId;
	}
	public void setTaxLotId(String taxLotId) {
		this.taxLotId = taxLotId;
	}
	
	public UnrealizedTaxLots taxLotId(String taxLotId) {
		this.taxLotId = taxLotId;
		return this;
	}
	public boolean isCovered() {
		return covered;
	}
	public void setCovered(boolean covered) {
		this.covered = covered;
	}
	public UnrealizedTaxLots covered(Boolean covered) {
		this.covered = covered;
		return this;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	public UnrealizedTaxLots quantity(BigDecimal quantity) {
		this.quantity = quantity;
		return this;
	}
	public BigDecimal getAverageCostPerShare() {
		return averageCostPerShare;
	}
	public void setAverageCostPerShare(BigDecimal averageCostPerShare) {
		this.averageCostPerShare = averageCostPerShare;
	}
	
	public UnrealizedTaxLots averageCostPerShare(BigDecimal averageCostPerShare) {
		this.averageCostPerShare = averageCostPerShare;
		return this;
	}
	public LotTerm getTerm() {
		return term;
	}
	public void setTerm(LotTerm term) {
		this.term = term;
	}
	public UnrealizedTaxLots term(LotTerm term) {
		this.term = term;
		return this;
	}
	public LocalDate getTradeDateTime() {
		return tradeDateTime;
	}
	public void setTradeDateTime(LocalDate tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}
	public UnrealizedTaxLots tradeDateTime(LocalDate tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
		return this;
	}
	public TradeType getTradeType() {
		return tradeType;
	}
	public void setTradeType(TradeType tradeType) {
		this.tradeType = tradeType;
	}
	public UnrealizedTaxLots tradeType(TradeType tradeType) {
		this.tradeType = tradeType;
		return this;
	}
	public LotType getType() {
		return type;
	}
	public void setType(LotType type) {
		this.type = type;
	}
	public UnrealizedTaxLots type(LotType type) {
		this.type = type;
		return this;
	}
	public BigDecimal getGainOrLossAmount() {
		return gainOrLossAmount;
	}
	public void setGainOrLossAmount(BigDecimal gainOrLossAmount) {
		this.gainOrLossAmount = gainOrLossAmount;
	}
	
	public UnrealizedTaxLots gainOrLossAmount(BigDecimal gainOrLossAmount) {
		this.gainOrLossAmount = gainOrLossAmount;
		return this;
	}
	
	

}
