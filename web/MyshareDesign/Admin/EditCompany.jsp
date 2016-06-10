<%@include file="AdminHeader.jsp" %>
<s:form theme="simple" action="EditCompanyForm" id="AddCompany">
    
 <div class="formlayout">
     <h2>Edit Company Details</h2>
    <s:textfield name="tinnumber" placeholder="Tin Number" id="tinnumber" cssClass="required number"/></p>
    <s:textfield placeholder="Company Name" name="companyname" id="AddCompany_companyname" cssClass="required" /></p>
    <s:textfield placeholder="Nominal Value Of Share" name="nominalvalue" id="AddCompany_nominalvalue" cssClass="required number"/></p>
    <s:textfield placeholder="Net Asset" name="netasset" id="AddCompany_netasset" cssClass="required number"/></p>
    <s:textfield placeholder="Net Sale" name="netsale" iAddCompany_netsaled="" cssClass="required number"/></p>
    <s:textfield placeholder="Net Profit" name="netprofit" id="AddCompany_netprofit" cssClass="required number"/></p>
    <s:textfield placeholder="Company Issue Name" name="companyissuename" id="AddCompany_companyissuename" cssClass="required"/></p>
    <input type="submit" name="btnadd" value="Edit"/>
               
          </div>
</s:form>

              <%@include file="AdminFooter.jsp" %>
