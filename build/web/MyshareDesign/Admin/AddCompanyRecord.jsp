<%@include file="AdminHeader.jsp" %>
<s:form theme="simple" action="AddCompanyRecord">
    <div class="formlayout">
        <h2>Add Company Daily Record</h2>
        <p><span>Company Issue Name : </span><s:select name="companyissuename" list="%{companytablerec}" listKey="companyissuename" listValue="companyissuename" style=" margin: 20px auto;padding: 10px;"/></p>
              <s:textfield name="recordid" id="AddCompanyRecord_recordid" placeholder="Record Id" cssClass="required"/>
              <s:textfield placeholder="Date" name="date" cssClass="required" id="inputField"/></p>
              <s:textfield placeholder="Opening Price" name="openingprice" id="AddCompanyRecord_openingprice" cssClass="required number"/>
              <s:textfield name="closingprice" placeholder="Closing Price" id="AddCompanyRecord_closingprice" cssClass="required number"/></p>
              <s:textfield placeholder="Change" name="crchange" id="AddCompanyRecord_crchange" cssClass="required number"/></p>
              <s:textfield placeholder="Growth" name="growth" id="AddCompanyRecord_growth" cssClass="required number"/></p>
              <input type="submit" name="btnadd" value="Add"/>
        
         </div>
</s:form>

              <%@include file="AdminFooter.jsp" %>
