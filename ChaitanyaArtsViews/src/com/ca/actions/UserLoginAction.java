package com.ca.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.ca.database.Database;
import com.ca.pojo.AddUserByAdmin;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport implements SessionAware
{
	AddUserByAdmin login;
	private SessionMap<String,Object> sessionMap;  
	List<AddUserByAdmin> ownList;
	
	public UserLoginAction() {
		// TODO Auto-generated constructor stub
	}
	
	public AddUserByAdmin getLogin() {
		return login;
	}


	public void setLogin(AddUserByAdmin login) {
		this.login = login;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}


	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public List<AddUserByAdmin> getOwnList() {
		return ownList;
	}

	public void setOwnList(List<AddUserByAdmin> ownList) {
		this.ownList = ownList;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try{
		Database database = new Database();
		Connection con = database.Get_Connection();
		PreparedStatement ps = con
				.prepareStatement("SELECT * FROM EMPLOYEE_INFO WHERE USERNAME=? AND PASSWORD=? ");
		ps.setString(1,login.getUserName());
		ps.setString(2,login.getPassWord());
		ResultSet rs = ps.executeQuery();
		PreparedStatement ps1 = con
				.prepareStatement("SELECT EMPLOYEE_NAME,PASSWORD,ADDRESS,CONTACT_NO,EMAIL,ROLE,date_format(DOB,'%d/%m/%Y') as dateAsBirth from employee_info where USERNAME=?");
		ps1.setString(1,login.getUserName());
		ResultSet rs1 = ps1.executeQuery();
		ownList=new ArrayList<AddUserByAdmin>();
		while(rs1.next())
		{
			ownList.add(new AddUserByAdmin(rs1.getString("EMPLOYEE_NAME"),rs1.getString("PASSWORD"),rs1.getString("ADDRESS"),rs1.getString("CONTACT_NO"),rs1.getString("EMAIL"),rs1.getString("dateAsBirth"),rs1.getString("ROLE")));
		}
		System.out.println("Data Collected ...");
	
	
		if (rs.next()) {
			sessionMap.put("login","true");  
		    sessionMap.put("name",login.getUserName());//username has been set in session of logged in user here.
		    sessionMap.put("role",rs.getString("ROLE"));//Role is set of logged in user.
		    System.out.println("Logged in..");
		    
			return "success";
		} else {
			return "error";
		}	
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
		if(login.getUserName().isEmpty())
		{
			addFieldError("login.userName", "Please Enter Your Username..");
		}
		if(login.getPassWord().isEmpty())
		{
			addFieldError("login.passWord","Please Enter Your Password..");
		}
	}


	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap)map;
	}
	
	@SkipValidation
	public String logout(){  
	    if(sessionMap!=null){  
	        sessionMap.invalidate();  
	        sessionMap.remove("login");
	        sessionMap.clear();
	        System.out.println("Logged out");
	       return "success";
	       
	     }
	    return "success";


}
}
