<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
         <meta name="description" content="website description" />
    <meta name="keywords" content="website keywords, website keywords" />
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    
    
    
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
.formlayout input[type="password"],
.formlayout input[type="email"],
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
  
    
     
    
     <link rel="stylesheet" type="text/css" href="<s:url value="/MyshareDesign/css/Login.css" />"/>
  <!-- modernizr enables HTML5 elements and feature detects -->
    <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/modernizr-1.5.min.js"></script>
  
    <!--for validation-->
          <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/jquery_latest.js"></script>
           
   <script  type="text/javascript"  src="<%=application.getContextPath()%>/MyshareDesign/js/jquery_validate.js"></script>

        <style type="text/css">

                                    label.error { float:left; color: red; padding-left: .5em; vertical-align: middle; }

        </style>
        <script>
           $(document).ready(function(){
                $("#login").validate();
            });
        </script>
        
        <script>
            $(document).ready(function(){
                $("#ForgetPassword").validate(
                {
                    rules:
                       {
                             email:{ required:true, email:true  }
                           
                            
                },
                    messages:{
                             email:{ required:"Email address is required", email:"Please enter valid email address"}
                            
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
           
             <li><a href="Registration1">SignUp</a></li>
           
             
          </ul>
        </div>
      </nav>
    </header>
