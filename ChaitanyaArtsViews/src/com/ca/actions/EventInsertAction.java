package com.ca.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ca.database.Database;
import com.ca.pojo.Event;
import com.opensymphony.xwork2.ActionSupport;

public class EventInsertAction extends ActionSupport {

	private String eventId;
	private String licenseId;
	private String licenserequired[];

	Event event;
	String name;

	public EventInsertAction() {
		// TODO Auto-generated constructor stub
	}

	public String[] getLicenserequired() {
		return licenserequired;
	}

	public void setLicenserequired(String[] licenserequired) {
		this.licenserequired = licenserequired;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public String execute() throws Exception {

		String uniqueID = UUID.randomUUID().toString();
		String eventUni = uniqueID.substring(0, 4);
		eventId = event.getEventName().substring(0,3) + eventUni;
		
		System.out.println(eventId);
		try {
			Database database = new Database();
			Connection con = database.Get_Connection();
			System.out.println("Driver Loaded");
			PreparedStatement st = con
					.prepareStatement("insert into event(EVENT_ID,EVENT_NAME,COMPANY_NAME,CONTACT_PERSON,CONTACT_NO,EMAIL_ID,EVENT_VENUE,FROM_DATE,TO_DATE,EVENT_TIME,COMMISSION)"
							+ "values(?,?,?,?,?,?,?,?,?,?,?)");
			st.setString(1, eventId);
			st.setString(2, event.getEventName());
			st.setString(3, event.getCompanyName());
			st.setString(4, event.getContactPerson());
			st.setString(5, event.getContactNumber());
			st.setString(6, event.getEmailId());
			st.setString(7, event.getEventVenue());
			st.setString(8, event.getFromDate());
			st.setString(9, event.getToDate());
			st.setString(10, event.getEventTime());
			st.setString(11, event.getEventCom());
			st.executeUpdate();
			System.out.println("success");
			for (int i = 0; i < licenserequired.length; i++) {
				String checkboxUni=UUID.randomUUID().toString();
				licenseId = licenserequired[i].substring(0, 2) + event.getEventName().substring(0, 3)
						+ checkboxUni.substring(0,3);
				System.out.println(licenseId);
				PreparedStatement st1 = con
						.prepareStatement("insert into license(LICENSE_ID,LICENSE_NAME,EVENT_ID,EVENT_NAME)"
								+ "values(?,?,?,?)");
				st1.setString(1, licenseId);
				st1.setString(2, licenserequired[i]);
				st1.setString(3, eventId);
				st1.setString(4, event.getEventName());
				st1.executeUpdate();
			}
			System.out.println("Licenses Inserted..");
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
		if (event.getEventName().isEmpty()) {
			System.out.println("Event Name");
			addFieldError("event.eventName", "Please Enter Event Name ..");
		}
		if (event.getCompanyName().isEmpty()) {
			addFieldError("event.companyName", "Please Enter Company Name.. ");
		}
	
		if (event.getContactNumber().isEmpty()) {
			addFieldError("event.contactNumber",
					"Please Enter Contact Number..");
		} else {
			String expression = "^\\+?[0-9\\-]+\\*?$";
			CharSequence inputStr = event.getContactNumber();
			Pattern pattern = Pattern.compile(expression,
					Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(inputStr);
			if (!matcher.matches())
				addFieldError("event.contactNumber", "Invalid Contact Number..");

		}

		if (event.getContactPerson().isEmpty()) {
			addFieldError("event.contactPerson",
					"Please Enter Contact Person Name..");
		}

		if (event.getEmailId().isEmpty()) {
			addFieldError("event.emailId", "Please Enter Email ID..");
		} else {
			String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			CharSequence inputStr = event.getEmailId();
			Pattern pattern = Pattern.compile(expression,
					Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(inputStr);
			if (!matcher.matches())
				addFieldError("event.emailId", "Invalid Email Address..");
		}
		if(event.getEventCom().isEmpty())
		{
			addFieldError("event.eventCom", "Please Enter Commission..Even If There Is No Commission Given then Please Enter value as 0 ");
		}

		if (event.getEventVenue().isEmpty()) {
			addFieldError("event.eventVenue", "Please Enter Event Venue..");
		}

		if (event.getFromDate().isEmpty()) {
			addFieldError("event.fromDate", "Please Enter Date..");
		}

		if (event.getToDate().isEmpty()) {
			addFieldError("event.toDate", "Please Enter To Date..");
		}

		if (event.getEventTime().isEmpty()) {
			addFieldError("event.eventTime", "Please Enter Event Time..");
		}
		

	}

}
