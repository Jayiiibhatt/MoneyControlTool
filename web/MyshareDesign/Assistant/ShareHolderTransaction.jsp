<%@include file="AssistantHeader.jsp"%>
<s:form theme="simple" action="ShareHolderTransaction">
    <div class="formlayout">
        <h2>Insert Shareholder Transactions Details</h2>
        Shareholder AccNo. : <s:select name="dmataccountnumber" list="%{dmataccount}" listKey="dmat" listValue="dmat" style=" margin: 20px auto;padding: 10px;"/><br>
        Company Name : <s:select name="companyname" list="%{compname}" listKey="tinnumber" listValue="companyname" style=" margin: 20px auto;padding: 10px;"/><br>
        Transaction Mode : <s:radio name="transactionmode" list="{'Purchase','Selling'}" style=" margin: 20px;padding: 20px;"/>
        <s:textfield placeholder="Date" name="date" id="inputField"/>
        <s:textfield placeholder="Number of Issue" name="numberofissue"/>
        <s:textfield placeholder="Current Value of Issue" name="currentvalue"/>
        <s:textfield placeholder="Net Value" name="netvalue"/>
        <input type="submit" name="btnsub" value="Submit"/>
    </div>
</s:form>
<%@include file="AssistantFooter.jsp" %> 
   