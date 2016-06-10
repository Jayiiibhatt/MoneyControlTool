<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
         <meta name="description" content="website description" />
    <meta name="keywords" content="website keywords, website keywords" />
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    
    <%--Date picker --%>
    
    <link rel="stylesheet" type="text/css" media="all" href="<s:url value="/MyshareDesign/calendar/jsDatePick_ltr.min.css" />"/>
    
    
    
    <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/calendar/jsDatePick.min.1.3.js"></script>
    <script type="text/javascript">
	window.onload = function(){
		new JsDatePick({
			useMode:2,
			target:"inputField",
			dateFormat:"%d-%M-%Y"
			/*selectedDate:{				This is an example of what the full configuration offers.
				day:5,						For full documentation about these settings please see the full version of the code.
				month:9,
				year:2006
			},
			yearsRange:[1978,2020],
			limitToToday:false,
			cellColorScheme:"beige",
			dateFormat:"%m-%d-%Y",
			imgPath:"img/",
			weekStartDay:1*/
		});
	};
    </script>
    
    
    
    <%--end datepicker --%>
    
    
    <%--my design menu --%>
<style type="text/css">
.formlayout{
    max-width: 500px;
    margin: 20px auto;
    padding: 50px;
    background: #F7F7F7;
}
.formlayout h2{
    background: #008B8B;
    padding: 20px;     
    text-align: center;
    color: #fff;
}

.formlayout input[type="text"],
.formlayout input[type="email"],
.formlayout input[type="password"],
.formlayout textarea
{
    width: 100%;
    background: #fff;
    margin-bottom: 4%; 
    border: 1px solid #ccc;
    padding: 3%;
    color: #355;    
}

.formlayout input[type="text"]:focus,
.formlayout input[type="email"]:focus,
.formlayout input[type="password"]:focus,
.formlayout textarea:focus,
.formlayout select:focus
{ 
    padding: 3%;
    border: 1px solid #43D1AF;
}

.formlayout input[type="submit"],
.formlayout input[type="button"]{
   
    width: 100%;
    padding: 3%;
    background: #008B8B;
    border-bottom: 2px solid #000;
    color: #fff;
}
.formlayout input[type="submit"]:hover
{
    background: #3EBC99;
}
</style>
  
  
  
<%-- end my menu --%>
  
  
  
    
    
     <link rel="stylesheet" type="text/css" href="<s:url value="/MyshareDesign/css/style.css" />"/>
  <!-- modernizr enables HTML5 elements and feature detects -->
  
  <%--<script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/modernizr-1.5.min.js"></script>--%>
    <script src="<%=application.getContextPath()%>/MyshareDesign/js/jquery-1.9.1.js"></script>
        <!--for dynamic control-->
         <script language="javascript">
             $(document).ready(function() {
    $("#Registration_typeAdmin").click(function(e){ //on add input button click
                          alert("hello");
                          
                          $("#mydiv").append('<input type="text" placeholder="Acess Rights" name="admin.accessright" /><br>');
                          
                          
          
    }); 
    
    $("#Registration_typeShareholder").click(function(e){ //on add input button click
                          alert("hello");
                          
                          $("#mydiv").append('<input type="text" placeholder="DMAT Acc-Num" name="shareholder.dmat" /><br>'); 
                          
                          
          
    });
    
    $("#Registration_typeAssistant").click(function(e){ //on add input button click
                          alert("hello");
                          
                          $("#mydiv").append('<input type="text" placeholder="Joining Date" name="assistant.joining_date" /><br>');
          
    }); 
});
          </script>
          
          <!--for validation-->
          <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/jquery_latest.js"></script>
           
          <script  type="text/javascript"  src="<%=application.getContextPath()%>/MyshareDesign/js/jquery_validate.js"></script>

        <style type="text/css">

                                    label.error { float:left; color: red; padding-left: .5em; vertical-align: middle; }

        </style>
        <script>
            $(document).ready(function(){
                $("#Registration").validate(
                {
                    rules:
                       {
                            username: "required",
                            fname:"required",
                            mname: "required",
                            lname:"required",
                            country:"required",
                            state:"required",
                            dist:"required",
                            city:"required",
                            gen:"required",
                            type:"required",
                            street:"required",
                            date_of_birth:"required",
                            password:"required",
                            repassword: {equalTo: "#password"
                            },
                           // email:{ required:true, email:true  },
                           // age :{ required:true,number:true, range: [18, 55]},
                            phno:{required:true,number:true,maxlength:10,minlength:10},
                            pin_no:{required:true,number:true,maxlength:10,minlength:3}
                           // url:{required:true,url:true}
                            
                            
                },
                    messages:{
                            username: "User name is required",
                            fname: "Name field is required",
                            mname: "Name field is required",
                            lname: "Name field is required",
                            country:"Country name is required",
                            state:" State name is required",
                            dist:" District name is required",
                            city:"City name is required",
                            gen:"selection is required",
                            type:"selection is required",
                            street:"Street name is required",
                            date_of_birth:"Birth Date is required",
                            password:"Password field is required",
                            repassword:"Please enter the same value again",
                          //email:{ required:"Email address is required", email:"Please enter valid email address"},
                          //age:{ required:"Age is required", range:"please enter a value between 18 and 55", number:"Please enter only number value"},
                            phno:{ number:"Please enter only number value",minlength:"please enter a 10 digit number",maxlength:"please enter a 10 digit number" },
                            pin_no:{ number:"Please enter only number value",minlength:"pincode lenght should be 6 digit",maxlength:"price lenght should be less than 6" }
                           // url:{ required:"URL is required", url:"Please enter valid url" }
                             
               }
                });
            });
        </script>
       
    </head>
    <body>
        
         <div id="main">
    <header>
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="<%=application.getContextPath()%>/MyshareDesign/index.jsp">MoneyControlGuide<span class="logo_colour"></span></a></h1>
          <h2>Always Satiesfy You.</h2>
        </div>
      </div>
      <nav>
        <div id="menu_container">
          <ul class="sf-menu" id="nav">
            <li><a href="HomeViewer">Home</a></li>
           <li><a href="aboutus">AboutUs</a></li>
            <li><a href="contactus">ContactUs</a> </li>
            <li><a href="login1">SignIn</a></li>
             
           
             
          </ul>
        </div>
      </nav>
    </header>
