<%@include file="LoginHeader.jsp" %>



     <div class="sidebar">
         <s:form action="ForgetPassword" theme="simple" id="ForgetPassword"> 
             <h3 style="margin-top: 85px;">Forgot Password</h3>
             <p><span>Enter Email</span><s:textfield name="email" id="ForgetPassword_email" cssClass="required email"/></p>
             <p><s:submit style="width:59px" name="btnlog" value="Submit"/></p>
         </s:form>
        </div>
     <%@include file="LoginFooter.jsp" %>