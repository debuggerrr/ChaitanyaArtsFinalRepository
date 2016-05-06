package com.ca.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ca.database.Database;
import com.ca.pojo.AddUserByAdmin;
import com.opensymphony.xwork2.ActionSupport;

public class OwnProfileViewAction extends ActionSupport
{
	AddUserByAdmin ownuser;
	
	public OwnProfileViewAction() {
		// TODO Auto-generated constructor stub
	}

	public AddUserByAdmin getOwnuser() {
		return ownuser;
	}

	public void setOwnuser(AddUserByAdmin ownuser) {
		this.ownuser = ownuser;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try
		{
			Database database = new Database();
			Connection con = database.Get_Connection();
			PreparedStatement ps = con
					.prepareStatement("SELECT EMPLOYEE_NAME,PASSWORD,ADDRESS,CONTACT_NO,EMAIL,ROLE,date_format(DOB,'%d/%m/%Y') as dateAsBirth from employee_info where USERNAME=?");
		/*	ps.setString(1,selectuser.getUserName());
			String usernameForData=selectuser.getUserName();
			ResultSet rs = ps.executeQuery();
			selectUserList=new ArrayList<AddUserByAdmin>();
			while(rs.next())
			{
				selectUserList.add(new AddUserByAdmin(rs.getString("EMPLOYEE_NAME"),rs.getString("PASSWORD"),rs.getString("ADDRESS"),rs.getString("CONTACT_NO"),rs.getString("EMAIL"),rs.getString("dateAsBirth"),rs.getString("ROLE")));
			}
			System.out.println("success");
		*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "success";
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}
	

}
