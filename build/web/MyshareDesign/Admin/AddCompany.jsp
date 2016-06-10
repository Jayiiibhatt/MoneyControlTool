<%@include file="AdminHeader.jsp" %>



    <s:form theme="simple" action="AddCompany" id="AddCompany">
    <%--<s:label value="ADD COMPANY" style=" margin-left: 466px;"></s:label>
 <div class="form_settings">
 <p><span>Tin_Number</span><s:textfield name="tinnumber" id="tinnumber" cssClass="required number"/></p>
 <p><span>Company_Name</span><s:textfield name="companyname" id="AddCompany_companyname" cssClass="required" /></p>
 <p><span>Nominal_Value_Of_Share</span><s:textfield name="nominalvalue" id="AddCompany_nominalvalue" cssClass="required number"/></p>
 <p><span>Net_Asset</span><s:textfield name="netasset" id="AddCompany_netasset" cssClass="required number"/></p>
 <p><span>Net_Sale</span><s:textfield name="netsale" iAddCompany_netsaled="" cssClass="required number"/></p>
 <p><span>Net_Profit</span><s:textfield name="netprofit" id="AddCompany_netprofit" cssClass="required number"/></p>
 <p><span>Company_Issue_Name</span><s:textfield name="companyissuename" id="AddCompany_companyissuename" cssClass="required"/></p>
              
              <div class="submit">
              <p><s:submit name="btnadd" value="Add" style="width: 97px;margin-left: 412px; margin-left: 0px;"/></p>
               </div>
</div> --%>
    
 <div class="formlayout">
    <h2>Add Company Details</h2>
    
    <s:textfield name="tinnumber" id="tinnumber" placeholder="Tin Number" cssClass="required number"/>
    <s:textfield name="companyname" id="AddCompany_companyname" placeholder="Company Name" cssClass="required" />
    <s:textfield name="nominalvalue" id="AddCompany_nominalvalue" placeholder="Nominal Value Of Share" cssClass="required number"/>
    <s:textfield name="netasset" id="AddCompany_netasset" placeholder="Net Asset" cssClass="required number"/>
    <s:textfield name="netsale" id="AddCompany_netsale" placeholder="Net Sale" cssClass="required number"/>
    <s:textfield name="netprofit" id="AddCompany_netprofit" placeholder="Net Profit" cssClass="required number"/>
    <s:textfield name="companyissuename" id="AddCompany_companyissuename" placeholder="Company Issue Name" cssClass="required"/>
    <input type="submit" name="btnadd" value="Add"/>
</div>
    </s:form>
              <%@include file="AdminFooter.jsp" %>
