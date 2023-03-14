package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Customer {
	 private String id;
	 private String name;
	    private String address;
	    private String phone;
	    private String accountId;
	    private boolean active;
		public Customer(String name, String id,String address, String phone, String accountId, boolean active) {
			super();
			this.name = name;
			this.id=id;
			this.address = address;
			this.phone = phone;
			this.accountId = accountId;
			this.active= active;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAccountId() {
			return accountId;
		}
		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public String getId() {
			// TODO Auto-generated method stub
			return id;
		}
		public Object getActive() {
			return active;
		}
	    
}