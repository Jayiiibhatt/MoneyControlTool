<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
  <title>Shareholder panel</title>
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
  
  
  
  
  
  
  
  
  
  <!--This script for dynamic field><-->
  
  <script src="<%=application.getContextPath()%>/MyshareDesign/js/jquery-1.9.1.js"></script>
        
         <script language="javascript">
            
    $(document).ready(function()
    {
                                 
            
    $("#SourceOfFinance_typeBank").click(function(e)
    { //on add input button click
                          alert("hello");
                          
      $("#mydiv").append('<tr><td>Branch Code:</td><td><input type="text" name="b1.branchcode" /></td></tr><br>');
                                               
          
    }); 
    
    $("#SourceOfFinance_typeFinancialInstitute").click(function(e)
    { //on add input button click
                          alert("hello");
                          
      $("#mydiv").append('<tr><td>Financial Institute:</td><td><input type="text" name="financeialinstitute.financeid" /></td></tr><br>');
                                               
          
    }); 
    
});
          </script>

      
  <!--this is for validation-->
  
   <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/jquery_latest.js"></script>
           
   <script  type="text/javascript"  src="<%=application.getContextPath()%>/MyshareDesign/js/jquery_validate.js"></script>

        <style type="text/css">

                                    label.error { float:left; color: red; padding-left: .5em; vertical-align: middle; }

        </style>
        <script>
           $(document).ready(function(){
                $("#AddExchange").validate();
            });
        </script>
        
         <script>
           $(document).ready(function(){
                $("#AddCompany").validate();
            });
        </script>
         <script>
           $(document).ready(function(){
                $("#AddCompanyRecord").validate();
            });
        </script>
         <script>
           $(document).ready(function(){
                $("#exchangerecord").validate();
            });
        </script>
         <script>
           $(document).ready(function(){
                $("#SourceOfFinance").validate();
            });
        </script>
        
  
   <!--this is for design-->
   
  <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/MyshareDesign/css/style.css"/>
  
  <!-- modernizr enables HTML5 elements and feature detects -->
  
 <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/modernizr-1.5.min.js"></script> 
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
          <div style="margin: 22px 0 0 1100px; font-size: 20px;color: #FFFFFF"><s:a href="logout">logout</s:a></div>
      </div>
           <nav>
        <div id="menu_container">
          <ul class="sf-menu" id="nav">
            <li><a href="HomeShareholder">Home</a></li>
            
            <li><a href="#">Transaction</a>
              <ul>
                <li><s:a href="ownviewshareholdertransaction">View Transaction Details</s:a></li>
              </ul>
            </li>
            <li><a href="#">Company Portfolio</a>
              <ul>
                <li><s:a href="shareholderviewcompany">View Company Details</s:a></li>
                <li><s:a href="shareholderviewcompanyrecord">View Company Daily Record</s:a> </li>
                <li><s:a href="shareholderviewfinancesource">View Source Of Finance</s:a></li>
              </ul>
            </li>
            <li><a href="">Exchange Portfolio</a>
             <ul>
                <li><a href="shareholderexchange">View Exchange</a></li>
                <li><s:a href="shareholderviewexchangerecord">View Exchange Record</s:a></li>
             </ul>
            </li>
            <li><s:a href="#">View Graph</s:a> 
                <ul>
                    
                    <li><s:a href="shareholdercompanyprofit">CompanyProfit</s:a></li>
                    <li><s:a href="shareholderfinanceinter">FinanceVsProfit</s:a></li>
                    <li><s:a href="shareholderborrowamt">CompanyBorrow</s:a></li>
                </ul>
             </li>
      </nav>
  </header>
   