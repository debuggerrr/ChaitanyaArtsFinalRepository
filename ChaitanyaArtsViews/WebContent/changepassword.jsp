<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>License Management Software</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/loginpage.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
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

      <header class="main-header">
  <nav class="navbar navbar-static-top">
    <div class="container-fluid">
    <div class="navbar-header">
      <a href="index.jsp" class="navbar-brand"><b>Chaitanyaa</b> Arts</a>
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
        <i class="fa fa-bars"></i>
      </button>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="navbar-collapse">
      <ul class="nav navbar-nav">
        <li><a href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Event <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="create_event.jsp">Create Event</a></li>
			<li class="divider"></li>
            <li><a href="editevents.jsp">View/Edit Event</a></li>
			 
          </ul>
        </li>
		<li><a href="bills.html">Bills</a></li>
        <li class="dropdown">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">Reports <span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="general_report.jsp">General Report</a></li>
					<li class="divider"></li>
					<li><a href="financial_report.jsp">Financial Report</a></li>
					<li class="divider"></li>
					<li><a href="sales_report.jsp">Sales Report</a></li>
					<li class="divider"></li>
					<li><a href="dd_report.jsp">DD Report</a></li>
				</ul>
		</li>
		<li><a href="expenses.html">Expenses</a></li>
		<li class="dropdown">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">Manage Users <span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="adduser.jsp">Add User</a></li>
					<li class="divider"></li>
					 <li><a href="viewusers.jsp">View / Edit User</a></li>
				</ul>
		</li>
      </ul>
      <!--<form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" id="navbar-search-input" placeholder="Search">
        </div>
      </form> -->
      <ul class="nav navbar-nav navbar-right">
        <!--<li><a href="#">Link</a></li> -->
        <li class="active">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Welcome Mugdha <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="editinfo.jsp">Edit Info</a></li>
			<li class="divider"></li>
			<li><a href="changepassword.jsp">Change Password</a></li>
			<li class="divider"></li>
            <li><a href="#">Logout</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>
</header>
      <!-- Left side column. contains the logo and sidebar -->
      

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper" style="background:#eaf3f3;">
       
        
         
         
		  	<div class="container-fluid">
    <div class="row">
     
      <div class="loginpg_headingtext">
       Change Password
      
    </div>
	
	<div class="loginbar">
		<div><input name="username" type="text" class="username_textbox" id="username" placeholder="Username Here"></div>
		<div><input name="current password" type="password" class="password_textbox" id="current password" placeholder="Your Current Password Here"></div>
		<div><input name="new password" type="password" class="password_textbox" id="new password" placeholder="Your New Password Here"></div>
		<div><input name="confirm password" type="password" class="password_textbox" id="confirm password" placeholder="Retype Your New Password Here"></div>
		
		<div style="margin-top:10px;"><button type="button" class="btn btn-warning">Update</button><button type="button" class="btn btn-warning">Cancel</button></div>
		<div style="height:30px;">&nbsp;</div>
	</div>
   
    
   </div> 
   </div>
           
                
                
                    
                  
      </div><!-- /.content-wrapper -->
      

     
    </div><!-- ./wrapper -->

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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <script src="js/morris.min.js"></script>
    <!-- Sparkline -->
    <script src="js/jquery.sparkline.min.js"></script>
    <!-- jvectormap -->
    <script src="js/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="js/jquery-jvectormap-world-mill-en.js"></script>
    <!-- jQuery Knob Chart -->
    <script src="js/jquery.knob.js"></script>
    <!-- daterangepicker -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
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