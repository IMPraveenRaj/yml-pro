package com.springheaven.yml.dto.model;

import lombok.Data;

@Data
public class Person {
	private Address billingAddress;
	private Address livingAddress;
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getLivingAddress() {
		return livingAddress;
	}
	public void setLivingAddress(Address livingAddress) {
		this.livingAddress = livingAddress;
	}
	

}
