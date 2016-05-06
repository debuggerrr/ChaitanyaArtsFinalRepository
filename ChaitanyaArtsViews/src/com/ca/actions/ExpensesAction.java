package com.ca.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ca.database.Database;
import com.ca.pojo.Expenses;
import com.opensymphony.xwork2.ActionSupport;

public class ExpensesAction extends ActionSupport {
	Expenses expenses;

	public ExpensesAction() {
		// TODO Auto-generated constructor stub
	}

	public Expenses getExpenses() {
		return expenses;
	}

	public void setExpenses(Expenses expenses) {
		this.expenses = expenses;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			Database database = new Database();
			Connection con = database.Get_Connection();
			System.out.println("Driver Loaded");
			PreparedStatement st = con
					.prepareStatement("insert into expenses(EXPENSE_DATE,PARTICULAR,AMOUNT)"
							+ "values(?,?,?)");
			st.setString(1, expenses.getExpenseDate());
			st.setString(2, expenses.getExpenseParticular());
			st.setString(3, expenses.getExpenseAmount());
			st.executeUpdate();
			System.out.println("success");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return "success";
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
		if(expenses.getExpenseParticular().isEmpty())
		{
			addFieldError("expenses.expenseParticular", "PLease Enter Particular");
		}
		if(expenses.getExpenseDate().isEmpty())
		{
			addFieldError("expenses.expenseDate", "Please Enter Expenses Date");
		}
		if(expenses.getExpenseAmount().isEmpty())
		{
			addFieldError("expenses.expenseAmount", "Please Enter Expenses Amount");
		}
		else {
			String expression = "^\\+?[0-9\\-]+\\*?$";
			CharSequence inputStr = expenses.getExpenseAmount();
			Pattern pattern = Pattern.compile(expression,
					Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(inputStr);
			if (!matcher.matches())
				addFieldError("expenses.expenseAmount", "Invalid Expenses Amount..");

		}

	}

}
