package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Premium {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer premiumId;
	private String premiumStatus;
	private Double amount;
	private String date;
	private Integer containId;
	private Integer policyId;

	public Integer getPremiumId() {
		return premiumId;
	}

	public void setPremiumId(Integer premiumId) {
		this.premiumId = premiumId;
	}

	public String getPremiumStatus() {
		return premiumStatus;
	}

	public void setPremiumStatus(String premiumStatus) {
		this.premiumStatus = premiumStatus;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getContainId() {
		return containId;
	}

	public void setContainId(Integer containId) {
		this.containId = containId;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "Premium [premiumId=" + premiumId + ", premiumStatus=" + premiumStatus + ", amount=" + amount + ", date="
				+ date + ", containId=" + containId + ", policyId=" + policyId + "]";
	}

}
