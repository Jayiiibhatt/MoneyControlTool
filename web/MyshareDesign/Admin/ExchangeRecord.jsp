<%@include file="AdminHeader.jsp" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:form theme="simple" action="exchangerecord">
 <div class="formlayout">
     <h2>Add Exchange Daily Records</h2>
            <s:textfield name="exchangerecid" placeholder="Exchange Record Id" cssClass="required number"/>
            <p><span>Exchange Name : </span><s:select name="exchangename" list="%{exchange}" listValue="exname" listKey="exname" style=" margin: 20px auto;padding: 10px;"/></p>
            <s:textfield name="date" placeholder="Date" cssClass="required" id="inputField"/>
            <s:textfield name="openingindex" placeholder="Opening Index" id="exchangerecord_openingindex" cssClass="required number"/>
            <s:textfield name="closingindex" placeholder="Closing Index" id="exchangerecord_closingindex" cssClass="required number" />
            <s:textfield name="mychange" placeholder="Change" id="exchangerecord_mychange" cssClass="required number"/>
          
             <input type="submit" name="btnadd" value="Add"/>
           
          </div>
               
</s:form>
            
<%@include file="AdminFooter.jsp" %>
