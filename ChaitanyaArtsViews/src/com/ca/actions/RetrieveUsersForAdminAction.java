package com.ca.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ca.database.Database;
import com.ca.pojo.AddUserByAdmin;

import com.opensymphony.xwork2.ActionSupport;

public class RetrieveUsersForAdminAction extends ActionSupport {
	AddUserByAdmin fetchuser;
	List<AddUserByAdmin> adduserList;

	public List<AddUserByAdmin> getAdduserList() {
		return adduserList;
	}

	public void setAdduserList(List<AddUserByAdmin> adduserList) {
		this.adduserList = adduserList;
	}

	public RetrieveUsersForAdminAction() {
		// TODO Auto-generated constructor stub
	}

	public AddUserByAdmin getFetchuser() {
		return fetchuser;
	}

	public void setFetchuser(AddUserByAdmin fetchuser) {
		this.fetchuser = fetchuser;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			Database database = new Database();
			Connection con = database.Get_Connection();
			PreparedStatement ps = con
					.prepareStatement("SELECT EMPLOYEE_NAME,USERNAME,PASSWORD,ADDRESS,CONTACT_NO,EMAIL,ROLE,date_format(DOB,'%d/%m/%Y') as dateOfBirth from employee_info");

			ResultSet rs = ps.executeQuery();
			adduserList = new ArrayList<AddUserByAdmin>();
			while (rs.next()) {
				adduserList.add(new AddUserByAdmin(rs.getString("EMPLOYEE_NAME"),
						rs.getString("USERNAME"), rs.getString("PASSWORD"), rs
								.getString("ADDRESS"), rs
								.getString("CONTACT_NO"),
						rs.getString("EMAIL"), rs.getString("ROLE"), rs
								.getString("dateOfBirth")));
				System.out.println( rs.getString("dateOfBirth")+" "+rs.getString("USERNAME"));
			}
			System.out.println("Data Collected na baa !!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
}
