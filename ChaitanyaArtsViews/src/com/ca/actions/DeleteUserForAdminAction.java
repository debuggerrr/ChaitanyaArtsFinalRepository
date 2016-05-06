package com.ca.actions;

import java.sql.Connection;

import com.ca.database.Database;
import com.ca.pojo.AddUserByAdmin;
import java.sql.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteUserForAdminAction extends ActionSupport {
	AddUserByAdmin deluser;

	public DeleteUserForAdminAction() {
		// TODO Auto-generated constructor stub
	}

	public AddUserByAdmin getDeluser() {
		return deluser;
	}

	public void setDeluser(AddUserByAdmin deluser) {
		this.deluser = deluser;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			Database database = new Database();
			Connection con = database.Get_Connection();
			PreparedStatement ps = con
					.prepareStatement("DELETE FROM EMPLOYEE_INFO WHERE USERNAME=?");
			ps.setString(1,deluser.getUserName());
			int i=ps.executeUpdate();
			if(i>0)
			{System.out.println("Deleted na baaa..!!");
				return "success";
			}
			else
			{return "error";}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

}
