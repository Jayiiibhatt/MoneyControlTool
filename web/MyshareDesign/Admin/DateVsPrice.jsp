<%@include file="AdminHeader.jsp" %>

    <div class="formlayout">
        <h2>Date Vs Price Chart</h2>
        <s:form theme="simple" action="admindashboard" >
            <img src="<s:property value="graphurl"/>" WIDTH="500" HEIGHT="500" BORDER="0" USEMAP="#chart"/>
        </s:form>
    </div>


<%@include file="AdminFooter.jsp" %>
