package com.test.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


//@Document(collection = "payment", indexName = "hello")
@Document(indexName = "payment", type = "payment", shards = 1)
public class Payment {

	@Id
	public long id;

	public Date date;
	public String due_Date;
	public Customer customerId;
	public String payable;
	public String paid;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDue_Date() {
		return due_Date;
	}

	public void setDue_Date(String due_Date) {
		this.due_Date = due_Date;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public String getPayable() {
		return payable;
	}

	public void setPayable(String payable) {
		this.payable = payable;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", date=" + date + ", due_Date=" + due_Date + ", customerId=" + customerId
				+ ", payable=" + payable + ", paid=" + paid + "]";
	}

}
