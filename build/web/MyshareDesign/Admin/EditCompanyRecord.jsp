<%@include file="AdminHeader.jsp" %>
<s:form theme="simple" action="EditCompanyRecord">
   
 <div class="formlayout">
     <h2>Edit Company Daily Record</h2>
              Company Issue Name : <s:select name="companyissuename" list="%{companytablerec}" listKey="tinnumber" listValue="companyissuename" style=" margin: 20px auto;padding: 10px;"/>
              <s:textfield placeholder="Record Id" name="recordid" id="AddCompanyRecord_recordid" cssClass="required"/>
              <s:textfield placeholder="Date" name="date" id="inputField"/>
              <s:textfield placeholder="Opening Price" name="openingprice" id="AddCompanyRecord_openingprice" cssClass="required number"/>
              <s:textfield placeholder="Closing Price" name="closingprice" id="AddCompanyRecord_closingprice" cssClass="required number"/>
              <s:textfield placeholder="Change" name="crchange" id="AddCompanyRecord_crchange" cssClass="required number"/>
              <s:textfield placeholder="Growth" name="growth" id="AddCompanyRecord_growth" cssClass="required number"/>
              
               
              <input type="submit" name="btnadd" value="Add"/>
               
          </div>
</s:form>

              <%@include file="AdminFooter.jsp" %>
