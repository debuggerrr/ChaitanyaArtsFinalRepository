package com.ca.pojo;

public class Expenses {
	private String expenseDate;
	private String expenseParticular;
	private String expenseAmount;

	public Expenses() {
		// TODO Auto-generated constructor stub
	}

	public Expenses(String expenseDate, String expenseParticular,
			String expenseAmount) {
		// TODO Auto-generated constructor stub
		this.expenseDate = expenseDate;
		this.expenseParticular = expenseParticular;
		this.expenseAmount = expenseAmount;

	}

	public String getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(String expenseDate) {
		this.expenseDate = expenseDate;
	}

	public String getExpenseParticular() {
		return expenseParticular;
	}

	public void setExpenseParticular(String expenseParticular) {
		this.expenseParticular = expenseParticular;
	}

	public String getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(String expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

}
