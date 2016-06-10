<%@taglib prefix="s" uri="/struts-tags" %>
<%--<div id="scroll">
      <a title="Scroll to the top" class="top" href="#"><img src="<%=application.getContextPath()%>/MyshareDesign/images/top.png" alt="top" /></a>
</div>--%>
    <footer>
      
      <p>Copyright<a> @<b>MoneyControlGuide</b> Team</a></p>
    </footer>

  <!-- javascript at the bottom for fast page loading -->
 <%-- <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/jquery.js"></script>--%>
  <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/jquery.easing-sooper.js"></script>
  <script type="text/javascript" src="<%=application.getContextPath()%>/MyshareDesign/js/jquery.sooperfish.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
      $('.top').click(function() {$('html, body').animate({scrollTop:0}, 'fast'); return false;});
    });
  </script>
    </body>
</html>