<%@include file="RegistrationHeader.jsp" %>

<s:form action="Registration" method="post" theme="simple" >
          <div class="formlayout">
              <h2>User Registration Here</h2>
              
                <s:textfield placeholder="User Name" name="username" id="Registration_user_name" /></p>
                <s:textfield placeholder="First Name" name="fname" id="Registration_fname" /></p>
                <s:textfield placeholder="Middle Name" name="mname" id="Registration_mname" /></p>
                <s:textfield placeholder="Last Name" name="lname" id="Registration_lname" /></p>
                <s:textfield placeholder="Password" type="password" name="password" id="password" /></p>
                <s:textfield placeholder="Conform Password" type="password" name="repassword" id="repassword" /></p>
                <s:textfield placeholder="Phone Number" name="phno" id="Registration_phno" /></p>
                <s:textfield placeholder="Country" name="country" id="Registration_country"/></p>
                <s:textfield placeholder="State" name="state" id="Registration_state" /></p>
                <s:textfield placeholder="District" name="dist" id="Registration_dist" /></p>
                <s:textfield placeholder="City" name="city" id="Registration_city" /></p>
                <s:textfield placeholder="Street" name="street" id="Registration_steet" /></p>
                <s:textfield placeholder="Pincode" name="pin_no" id="Registration_pin_no" /></p>
                <p><span>Gender :</span><s:radio name="gen" id="Registration_genMale" list="{'Male','Female'}" style=" margin: 20px;padding: 20px;"/></p>  
                <s:textfield placeholder="Birth Date" name="date_of_birth" id="inputField"/></p>
              
              <div id="mydiv">
              <p>
                <span>Type :</span>
                <s:radio name="type" list="{'Admin','Shareholder','Assistant'}" style=" margin: 20px;padding: 20px;"/>
              </p>
              </div>
                 <input type="submit" name="btnlog" id="submit1" value="Submit"/>
          </div>
        </s:form>    
    
        <s:property value="msg"/>
              <%@include file="RegistrationFooter.jsp" %>
            
            
     