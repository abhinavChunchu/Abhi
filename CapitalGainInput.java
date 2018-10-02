package com.vanguard.webservice.restApi.domain;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.vanguard.webservice.restApi.validators.NotNullNested;

import java.io.Serializable;

public class CapitalGainInput {
	@NotNull
	private String clientUid;
	private List<Accounts> accounts;
	private List<ProposedTransaction> proposedTransaction;
	
	public CapitalGainInput() {
		}

	public String getClientUid() {
		return clientUid;
	}
	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
	}
	public CapitalGainInput clientUid(String clientUid) {
		this.clientUid = clientUid;
		return this;
	}
	public List<Accounts> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}
	
	public CapitalGainInput addAccounts(Accounts account) {
		if(accounts == null) {
			accounts = new ArrayList<>();
		}
		accounts.add(account);
		return this;
	}
	
	public CapitalGainInput accounts(List<Accounts> accounts) {
		this.accounts = accounts;
		return this;
	}
	
	public List<ProposedTransaction> getProposedTransaction() {
		return proposedTransaction;
	}
	public void setProposedTransaction(List<ProposedTransaction> proposedTransaction) {
		this.proposedTransaction = proposedTransaction;
	}
	
	public CapitalGainInput proposedTransaction(List<ProposedTransaction> proposedTransaction) {
		this.proposedTransaction= proposedTransaction;
		return this;
	} 
	
	public CapitalGainInput addProposedTransaction(ProposedTransaction proposedTransactions) {
		if(proposedTransaction == null) {
			proposedTransaction = new ArrayList<>();
		}
		proposedTransaction.add(proposedTransactions);
		return this;
	}
	
	
	

}
