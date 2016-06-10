<%@include file="AdminHeader.jsp" %>
<s:form theme="simple" action="AddExchange" method="post">
   
 <div class="formlayout">
     <h2>Add Exchange Details</h2>
        <p><span></span><s:textfield placeholder="Exchange Name" name="exname" id="AddExchange_exname" cssClass="required"/></p>
        <p><span></span><s:textfield placeholder="Country" name="country" id="AddExchange_country" cssClass="required"/></p>
        <p><span></span><s:textfield placeholder="City" name="city" id="AddExchange_city" cssClass="required"/></p>
        <p><span></span><s:textfield placeholder="State" name="state" id="AddExchange_state" cssClass="required"/></p>
        <p><span></span><s:textfield placeholder="Street" name="street" id="AddExchange_street" cssClass="required"/></p>
        <p><span></span><s:textfield placeholder="District" name="district" id="AddExchange_district" cssClass="required"/></p>
        <p><span></span><s:textfield placeholder="Pin Number" name="pinno" id="AddExchange_pinno" cssClass="required number"/></P>
        <p><input type="submit" name="btnadd" value="Add"/></p>
               
 </div>
</s:form>

<%@include file="AdminFooter.jsp" %>
