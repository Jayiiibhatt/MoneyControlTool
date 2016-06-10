<%@include file="AdminHeader.jsp" %>
<s:form theme="simple" action="SourceOfFinance">
    
 <div class="formlayout">
     <h2>Add Company Source Of Finance</h2>
            Company Name : <s:select name="compname" list="%{Company}" style=" margin: 20px auto;padding: 10px;text-align: center;"/>
            <s:textfield placeholder="Source of Finance Name" name="sfname" id="SourceOfFinance_sfname" cssClass="required"/></p>
            <s:textfield placeholder="Country" name="country" id="SourceOfFinance_country" cssClass="required"/></p>
            <s:textfield placeholder="City" name="city" id="SourceOfFinance_city" cssClass="required"/></p>
            <s:textfield placeholder="State" name="state" id="SourceOfFinance_state" cssClass="required"/></p>
            <s:textfield placeholder="Street" name="street" id="SourceOfFinance_street" cssClass="required"/></p>
            <s:textfield placeholder="District" name="district"  id="SourceOfFinance_district" cssClass="required"/></p>
            <s:textfield placeholder="Pin Number" name="pinnumber" id="SourceOfFinance_pinnumber" cssClass="required number"/></p>
            <s:textfield placeholder="Date" name="date" id="inputField"/></p>
            <s:textfield placeholder="Interest Rate" name="interestrate" id="SourceOfFinance_interestrate" cssClass="required number"/></p>
            <s:textfield placeholder="Borrow Amount" name="borrowamount" id="SourceOfFinance_borrowamount" cssClass="required number"/></p>
            <s:textfield placeholder="Duration" name="duration" id="SourceOfFinance_duration" cssClass="required number"/></p> 
            <div id="mydiv"> <p><span>Type : </span><s:radio name="type" list="{'Bank','FinancialInstitute'}" style=" margin: 20px;padding: 20px;"/></p> </div>
            <input type="submit" name="btnadd" value="Add"/>
          </div>
</s:form>

              <%@include file="AdminFooter.jsp" %>
