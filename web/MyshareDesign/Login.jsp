<%@include file="LoginHeader.jsp" %>

     <div class="formlayout">
         <s:form action="login" theme="simple"> 
          <h2>Login Form</h2>
          <input type="text" name="uname" placeholder="User Name" />
          <input type="password" name="pass" placeholder="Password" />
          <input type="submit" name="btnlog" value="Login"/>
         </s:form>
         <s:property value="msg"/>
      </div>
      
  <%@include file="LoginFooter.jsp" %>