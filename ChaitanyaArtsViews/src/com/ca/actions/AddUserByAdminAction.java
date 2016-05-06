package com.ca.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ca.database.Database;
import com.ca.pojo.AddUserByAdmin;
import com.opensymphony.xwork2.ActionSupport;

public class AddUserByAdminAction extends ActionSupport {
	AddUserByAdmin adduser;

	public AddUserByAdminAction() {
		// TODO Auto-generated constructor stub
	}

	public AddUserByAdmin getAdduser() {
		return adduser;
	}

	public void setAdduser(AddUserByAdmin adduser) {
		this.adduser = adduser;
	}

	@Override
	public String execute() throws Exception {
		String uniqueID = UUID.randomUUID().toString();
		String uniQueEmp=uniqueID.substring(0, 5);
		// TODO Auto-generated method stub
		try {
			Database database = new Database();
			Connection con = database.Get_Connection();
			System.out.println("Driver Loaded");
			PreparedStatement st = con
					.prepareStatement("insert into employee_info(EMPLOYEE_ID,EMPLOYEE_NAME,ADDRESS,CONTACT_NO,EMAIL,DOB,ROLE,USERNAME,PASSWORD)"
							+ "values(?,?,?,?,?,?,?,?,?)");
			st.setString(1, uniQueEmp);
			st.setString(2, adduser.getFullName());
			st.setString(3, adduser.getUserAddress());
			st.setString(4, adduser.getUserContact());
			st.setString(5, adduser.getUserEmail());
			st.setString(6, adduser.getUserBirthDate());
			st.setString(7, adduser.getUserRole());
			st.setString(8,adduser.getUserName());
			st.setString(9, adduser.getPassWord());
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
		
		if (adduser.getFullName().isEmpty()) {
			addFieldError("adduser.fullName", "Please Enter Name Of The User..");
		}
		if(adduser.getPassWord().isEmpty())
		{
			addFieldError("adduser.passWord", "Please Enter Password..");
		}

		if (adduser.getUserAddress().isEmpty()) {
			addFieldError("adduser.userAddress", "Please Enter Address..");
		}

		if (adduser.getUserBirthDate().isEmpty()) {
			addFieldError("adduser.userBirthDate", "Please Enter Birth Date..");
		}

		if (adduser.getUserName().isEmpty()) {
			addFieldError("adduser.userName", "Please Enter Username..");
		}
		String temp_user = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/licensemanagement", "root",
					"siddheshkk");
			System.out.println("Step 1");
			Statement st12 = con.createStatement();
			ResultSet rs12 = st12
					.executeQuery("SELECT USERNAME FROM EMPLOYEE_INFO");
			while (rs12.next()) {

				temp_user = rs12.getString("USERNAME");
				System.out.println("step2");
				if (adduser.getUserName().equals(temp_user)) {
					addFieldError("adduser.userName",
							"This Username is already taken .Try Different one !");
					System.out.println("DOne.....");
				}

			}
			st12.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


		if (adduser.getUserContact().isEmpty()) {
			addFieldError("adduser.userContact",
					"Please Enter Contact Number..");
		} else {
			String expression = "^\\+?[0-9\\-]+\\*?$";
			CharSequence inputStr = adduser.getUserContact();
			Pattern pattern = Pattern.compile(expression,
					Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(inputStr);
			if (!matcher.matches())
				addFieldError("adduser.userContact", "Invalid Contact Number..");
		}

		if (adduser.getUserEmail().isEmpty()) {
			addFieldError("adduser.userEmail", "Please Enter Email ID..");
		} else {
			String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			CharSequence inputStr = adduser.getUserEmail();
			Pattern pattern = Pattern.compile(expression,
					Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(inputStr);
			if (!matcher.matches())
				addFieldError("adduser.userEmail", "Invalid Email Address..");
		}
	}

}
