<%@include file="AdminHeader.jsp" %>
<s:form theme="simple" action="CompanyExchangeRegistration" id="CompanyExchangeRegistration">
    <%--<s:label value="COMPANY REGISTERED WITH EXCHANGE"></s:label>--%>
    <div class="formlayout">
        <h2>COMPANY REGISTERED WITH EXCHANGE</h2>
        Company Name : <s:select name="mycompanyname" list="%{companytablerec}" listKey="tinnumber" listValue="companyname" style=" margin: 20px auto;padding: 5px;"/><br>
        Exchange Name : <s:checkboxlist  name="myexchangename" list="%{exchange}"  listKey="exname" listValue="exname"/>
        <s:textfield id="inputField" name="registerdate" placeholder="Registered Date" cssClass="required" style="margin-top:20px"/>
        <s:textfield name="ipoprice" placeholder="IPO Price" cssClass="required number"/></p>
        <input type="submit" name="btnadd" value="Add"/>
                
    </div>
</s:form>
exchangename:<s:property value="myexchangename"/>

              <%@include file="AdminFooter.jsp" %>
