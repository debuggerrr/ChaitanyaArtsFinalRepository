<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>License Management Software</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="css/_all-skins.min.css">
<!-- iCheck -->
<link rel="stylesheet" href="css/blue.css">
<!-- Morris chart -->
<link rel="stylesheet" href="css/morris.css">
<!-- jvectormap -->
<link rel="stylesheet" href="css/jquery-jvectormap-1.2.2.css">
<!-- Date Picker -->
<link rel="stylesheet" href="css/datepicker3.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="css/daterangepicker-bs3.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="css/bootstrap3-wysihtml5.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<header class="main-header"> <nav
			class="navbar navbar-static-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a href="index.jsp" class="navbar-brand"><b>Chaitanyaa</b> Arts</a>
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar-collapse">
					<i class="fa fa-bars"></i>
				</button>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Event <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="create_event.jsp">Create Event</a></li>
							<li class="divider"></li>
							<li><a href="editevents.jsp">View/Edit Event</a></li>

						</ul></li>
					<li><a href="bills.jsp">Bills</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Reports <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="general_report.jsp">General Report</a></li>
							<li class="divider"></li>
							<li><a href="financial_report.jsp">Financial Report</a></li>
							<li class="divider"></li>
							<li><a href="sales_report.jsp">Sales Report</a></li>
							<li class="divider"></li>
							<li><a href="dd_report.jsp">DD Report</a></li>
						</ul></li>
					<li><a href="expenses.jsp">Expenses</a></li>
					<li class="active"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Manage Users <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="adduser.jsp">Add User</a></li>
							<li class="divider"></li>
							<li><a href="viewusers.jsp">View / Edit User</a></li>
						</ul></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<!--<li><a href="#">Link</a></li> -->
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Welcome Mugdha <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="editinfo.jsp">Edit Info</a></li>
							<li class="divider"></li>
							<li><a href="changepassword.jsp">Change Password</a></li>
							<li class="divider"></li>
							<li><a href="#">Logout</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid --> </nav> </header>
		<!-- Left side column. contains the logo and sidebar -->


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
			<h1>
				Update User <small></small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li>Manage Users</li>
				<li class="active">Update User</li>
			</ol>
			</section>

			<!-- Main content -->
			<div>
			<s:form action="UpdateUserRoleByAdmin" theme="simple" validate="true">
					
			<s:iterator value="selectUserList">
	
				<section class="content"> <!-- Small boxes (Stat box) -->

				
					<div class="row">
						<div class="contetpanel">
	
							<div>
								<div class="crevtbl">
									<div class="crevtblRow">
										<div class="crevtblCell">Name</div>
										<div class="crevtblCell1">:</div>
										<div class="crevtblCell2">
											<s:textfield name="updateuser.fullName" value="%{fullName}"
												size="40" /><s:fielderror fieldName="updateuser.fullName"/>
										</div>
									</div>
									<div class="crevtblRow">
										<div class="crevtblCell">Address</div>
										<div class="crevtblCell1">:</div>
										<div class="crevtblCell2">
											<s:textfield name="updateuser.userAddress"
												value="%{userAddress}" size="40" /><s:fielderror fieldName="updateuser.userAddress"/>
										</div>
									</div>
									 	<div class="crevtblRow">
									<div class="crevtblCell">Username</div>
									<div class="crevtblCell1">:</div>
									<div class="crevtblCell2">
										<s:textfield name="updateuser.userName"
											value="%{userName}" size="40"/><s:fielderror fieldName="updateuser.userName"/>
									</div>
								</div> 
									<div class="crevtblRow">
										<div class="crevtblCell">Password</div>
										<div class="crevtblCell1">:</div>
										<div class="crevtblCell2">
											<s:textfield name="updateuser.passWord" value="%{passWord}"
												size="40" /><s:fielderror fieldName="updateuser.passWord"/>
										</div>
									</div>

									<div class="crevtblRow">
										<div class="crevtblCell">Contact</div>
										<div class="crevtblCell1">:</div>
										<div class="crevtblCell2">
											<s:textfield name="updateuser.userContact"
												value="%{userContact}" size="40" /><s:fielderror fieldName="updateuser.userContact"/>
										</div>
									</div>
									<div class="crevtblRow">
										<div class="crevtblCell">Email</div>
										<div class="crevtblCell1">:</div>
										<div class="crevtblCell2">
											<s:textfield name="updateuser.userEmail" value="%{userEmail}"
												size="40" /><s:fielderror fieldName="updateuser.userEmail"/>
										</div>
									</div>
									<div class="crevtblRow">
										<div class="crevtblCell">Date of Birth (YYYY-MM-DD)</div>
										<div class="crevtblCell1">:</div>
										<div class="crevtblCell2">
											<s:textfield name="updateuser.userBirthDate"
												value="%{userBirthDate}" size="40" /><s:fielderror fieldName="updateuser.userBirthDate"/>
										</div>
									</div>

									<div class="crevtblRow">
										<div class="crevtblCell">Role</div>
										<div class="crevtblCell1">:</div>
										<div class="crevtblCell2">
											<select name="updateuser.userRole" class="adduserlistbox1">
												<option>Admin</option>
												<option>User</option>
											</select>
										</div>
									</div>


									<div class="crevtblRow">
										<div class="crevtblCell"></div>
										<div class="crevtblCell1"></div>
										<div class="crevtblCell2">
											<input type="submit" class="btn btn-primary" value="Update"/>
											&nbsp; &nbsp;
											  <a href="viewusers.jsp"  class="btn btn-primary">Cancel</a>
										</div>
									</div>
							
								</div>
							
							</div>
						
						</div>
			
					</div>

				</section>
			</s:iterator>
					</s:form>
					
			<section class="col-lg-5 connectedSortable"> </section>
		</div>

		</section>
	</div>
	<footer class="main-footer">
	<div class="pull-right hidden-xs">
		<b>Version</b> 2.3.0
	</div>
	<strong>Copyright &copy; 2016-2017 <a
		href="http://mservices.in" target="_blank">MServices Solutions
			Pvt. Ltd.</a>.
	</strong> All rights reserved. </footer>


	<aside class="control-sidebar control-sidebar-dark">

	<ul class="nav nav-tabs nav-justified control-sidebar-tabs">
		<li><a href="#control-sidebar-home-tab" data-toggle="tab"><i
				class="fa fa-home"></i></a></li>
		<li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i
				class="fa fa-gears"></i></a></li>
	</ul>

	<div class="tab-content">

		<div class="tab-pane" id="control-sidebar-home-tab">
			<h3 class="control-sidebar-heading">Recent Activity</h3>
			<ul class="control-sidebar-menu">
				<li><a href="javascript::;"> <i
						class="menu-icon fa fa-birthday-cake bg-red"></i>
						<div class="menu-info">
							<h4 class="control-sidebar-subheading">Langdon's Birthday</h4>
							<p>Will be 23 on April 24th</p>
						</div>
				</a></li>
				<li><a href="javascript::;"> <i
						class="menu-icon fa fa-user bg-yellow"></i>
						<div class="menu-info">
							<h4 class="control-sidebar-subheading">Frodo Updated His
								Profile</h4>
							<p>New phone +1(800)555-1234</p>
						</div>
				</a></li>
				<li><a href="javascript::;"> <i
						class="menu-icon fa fa-envelope-o bg-light-blue"></i>
						<div class="menu-info">
							<h4 class="control-sidebar-subheading">Nora Joined Mailing
								List</h4>
							<p>nora@example.com</p>
						</div>
				</a></li>
				<li><a href="javascript::;"> <i
						class="menu-icon fa fa-file-code-o bg-green"></i>
						<div class="menu-info">
							<h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>
							<p>Execution time 5 seconds</p>
						</div>
				</a></li>
			</ul>

			<h3 class="control-sidebar-heading">Tasks Progress</h3>
			<ul class="control-sidebar-menu">
				<li><a href="javascript::;">
						<h4 class="control-sidebar-subheading">
							Custom Template Design <span
								class="label label-danger pull-right">70%</span>
						</h4>
						<div class="progress progress-xxs">
							<div class="progress-bar progress-bar-danger" style="width: 70%"></div>
						</div>
				</a></li>
				<li><a href="javascript::;">
						<h4 class="control-sidebar-subheading">
							Update Resume <span class="label label-success pull-right">95%</span>
						</h4>
						<div class="progress progress-xxs">
							<div class="progress-bar progress-bar-success" style="width: 95%"></div>
						</div>
				</a></li>
				<li><a href="javascript::;">
						<h4 class="control-sidebar-subheading">
							Laravel Integration <span class="label label-warning pull-right">50%</span>
						</h4>
						<div class="progress progress-xxs">
							<div class="progress-bar progress-bar-warning" style="width: 50%"></div>
						</div>
				</a></li>
				<li><a href="javascript::;">
						<h4 class="control-sidebar-subheading">
							Back End Framework <span class="label label-primary pull-right">68%</span>
						</h4>
						<div class="progress progress-xxs">
							<div class="progress-bar progress-bar-primary" style="width: 68%"></div>
						</div>
				</a></li>
			</ul>

		</div>
		<!-- Stats tab content -->
		<div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab
			Content</div>
		<!-- Settings tab content -->
		<div class="tab-pane" id="control-sidebar-settings-tab">
			<form method="post">
				<h3 class="control-sidebar-heading">General Settings</h3>
				<div class="form-group">
					<label class="control-sidebar-subheading"> Report panel
						usage <input type="checkbox" class="pull-right" checked>
					</label>
					<p>Some information about this general settings option</p>
				</div>
				<!-- /.form-group -->

				<div class="form-group">
					<label class="control-sidebar-subheading"> Allow mail
						redirect <input type="checkbox" class="pull-right" checked>
					</label>
					<p>Other sets of options are available</p>
				</div>
				<!-- /.form-group -->

				<div class="form-group">
					<label class="control-sidebar-subheading"> Expose author
						name in posts <input type="checkbox" class="pull-right" checked>
					</label>
					<p>Allow the user to show his name in blog posts</p>
				</div>
				<!-- /.form-group -->

				<h3 class="control-sidebar-heading">Chat Settings</h3>

				<div class="form-group">
					<label class="control-sidebar-subheading"> Show me as
						online <input type="checkbox" class="pull-right" checked>
					</label>
				</div>
				<!-- /.form-group -->

				<div class="form-group">
					<label class="control-sidebar-subheading"> Turn off
						notifications <input type="checkbox" class="pull-right">
					</label>
				</div>
				<!-- /.form-group -->

				<div class="form-group">
					<label class="control-sidebar-subheading"> Delete chat
						history <a href="javascript::;" class="text-red pull-right"><i
							class="fa fa-trash-o"></i></a>
					</label>
				</div>
				<!-- /.form-group -->
			</form>
		</div>
		<!-- /.tab-pane -->
	</div>
	</aside>
	<!-- /.control-sidebar -->

	<div class="control-sidebar-bg"></div>
	</div>
	<!-- ./wrapper -->

	<!-- jQuery 2.1.4 -->
	<script src="js/jQuery-2.1.4.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
		$.widget.bridge('uibutton', $.ui.button);
	</script>
	<!-- Bootstrap 3.3.5 -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Morris.js charts -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
	<script src="js/morris.min.js"></script>
	<!-- Sparkline -->
	<script src="js/jquery.sparkline.min.js"></script>
	<!-- jvectormap -->
	<script src="js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="js/jquery-jvectormap-world-mill-en.js"></script>
	<!-- jQuery Knob Chart -->
	<script src="js/jquery.knob.js"></script>
	<!-- daterangepicker -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
	<script src="js/daterangepicker.js"></script>
	<!-- datepicker -->
	<script src="js/bootstrap-datepicker.js"></script>
	<!-- Bootstrap WYSIHTML5 -->
	<script src="js/bootstrap3-wysihtml5.all.min.js"></script>
	<!-- Slimscroll -->
	<script src="js/jquery.slimscroll.min.js"></script>
	<!-- FastClick -->
	<script src="js/fastclick.min.js"></script>
	<!-- AdminLTE App -->
	<script src="js/app.min.js"></script>
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script src="js/dashboard.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="js/demo.js"></script>

</body>
</html>