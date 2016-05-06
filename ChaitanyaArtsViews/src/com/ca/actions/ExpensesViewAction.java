package com.ca.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ca.database.Database;
import com.ca.pojo.Expenses;
import com.opensymphony.xwork2.ActionSupport;

public class ExpensesViewAction extends ActionSupport {
	Expenses expenses;
	List<Expenses> expenseList;

	public ExpensesViewAction() {
		// TODO Auto-generated constructor stub
	}

	public Expenses getExpenses() {
		return expenses;
	}

	public void setExpenses(Expenses expenses) {
		this.expenses = expenses;
	}

	public List<Expenses> getExpenseList() {
		return expenseList;
	}

	public void setExpenseList(List<Expenses> expenseList) {
		this.expenseList = expenseList;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			Database database = new Database();
			Connection con = database.Get_Connection();
						System.out.println("Driver Loaded");

			PreparedStatement ps = con
					.prepareStatement("SELECT PARTICULAR,AMOUNT,date_format(EXPENSE_DATE,'%d/%m/%Y') as expenseDayDate FROM EXPENSES");
			ResultSet rs = ps.executeQuery();
			expenseList = new ArrayList<Expenses>();
			while (rs.next()) {
				expenseList.add(new Expenses(rs.getString("PARTICULAR"), rs
						.getString("AMOUNT"), rs.getString("expenseDayDate")));
				System.out.println(rs.getString("expenseDayDate") + " "
						+ rs.getString("PARTICULAR"));
			}

			System.out.println("Data Collected ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

}
