package org.apache.jsp.MyshareDesign.Assistant;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShareHolderTransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/MyshareDesign/Assistant/AssistantHeader.jsp");
    _jspx_dependants.add("/MyshareDesign/Assistant/AssistantFooter.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_radio_name_list_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_a_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_name_listValue_listKey_list_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_textfield_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_radio_name_list_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_a_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_name_listValue_listKey_list_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_textfield_name_nobody.release();
    _jspx_tagPool_s_radio_name_list_nobody.release();
    _jspx_tagPool_s_form_theme_action.release();
    _jspx_tagPool_s_a_href.release();
    _jspx_tagPool_s_submit_value_name_nobody.release();
    _jspx_tagPool_s_select_name_listValue_listKey_list_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  <title>AssistantPanel</title>\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("  \n");
      out.write("  ");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".formlayout{\n");
      out.write("    max-width: 500px;\n");
      out.write("    margin: 20px auto;\n");
      out.write("    padding: 50px;\n");
      out.write("    background: #F7F7F7;\n");
      out.write("}\n");
      out.write(".formlayout h2{\n");
      out.write("    background: #008B8B;\n");
      out.write("    padding: 20px;     \n");
      out.write("    text-align: center;\n");
      out.write("    color: #fff;  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".formlayout input[type=\"text\"],\n");
      out.write(".formlayout input[type=\"email\"],\n");
      out.write(".formlayout textarea\n");
      out.write("{\n");
      out.write("    width: 100%;\n");
      out.write("    background: #fff;\n");
      out.write("    margin-bottom: 4%; \n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    padding: 3%;\n");
      out.write("    color: #355;    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".formlayout input[type=\"text\"]:focus,\n");
      out.write(".formlayout input[type=\"email\"]:focus,\n");
      out.write(".formlayout textarea:focus,\n");
      out.write(".formlayout select:focus\n");
      out.write("{ \n");
      out.write("    padding: 3%;\n");
      out.write("    border: 1px solid #43D1AF;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".formlayout input[type=\"submit\"],\n");
      out.write(".formlayout input[type=\"button\"]{\n");
      out.write("   \n");
      out.write("    width: 100%;\n");
      out.write("    padding: 3%;\n");
      out.write("    background: #008B8B;\n");
      out.write("    border-bottom: 2px solid #000;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write(".formlayout input[type=\"submit\"]:hover\n");
      out.write("{\n");
      out.write("    background: #3EBC99;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <!--This script for dynamic field><-->\n");
      out.write("  \n");
      out.write("  <script src=\"");
      out.print(application.getContextPath());
      out.write("/MyshareDesign/js/jquery-1.9.1.js\"></script>\n");
      out.write("        \n");
      out.write("         <script language=\"javascript\">\n");
      out.write("            \n");
      out.write("    $(document).ready(function()\n");
      out.write("    {\n");
      out.write("                                 \n");
      out.write("            \n");
      out.write("    $(\"#SourceOfFinance_typeBank\").click(function(e)\n");
      out.write("    { //on add input button click\n");
      out.write("                          alert(\"hello\");\n");
      out.write("                          \n");
      out.write("      $(\"#mydiv\").append('<tr><td>Branch Code:</td><td><input type=\"text\" name=\"b1.branchcode\" /></td></tr><br>');\n");
      out.write("                                               \n");
      out.write("          \n");
      out.write("    }); \n");
      out.write("    \n");
      out.write("    $(\"#SourceOfFinance_typeFinancialInstitute\").click(function(e)\n");
      out.write("    { //on add input button click\n");
      out.write("                          alert(\"hello\");\n");
      out.write("                          \n");
      out.write("      $(\"#mydiv\").append('<tr><td>Financial Institute:</td><td><input type=\"text\" name=\"financeialinstitute.financeid\" /></td></tr><br>');\n");
      out.write("                                               \n");
      out.write("          \n");
      out.write("    }); \n");
      out.write("    \n");
      out.write("});\n");
      out.write("          </script>\n");
      out.write("\n");
      out.write("      \n");
      out.write("  <!--this is for validation-->\n");
      out.write("  \n");
      out.write("   <script type=\"text/javascript\" src=\"");
      out.print(application.getContextPath());
      out.write("/MyshareDesign/js/jquery_latest.js\"></script>\n");
      out.write("           \n");
      out.write("   <script  type=\"text/javascript\"  src=\"");
      out.print(application.getContextPath());
      out.write("/MyshareDesign/js/jquery_validate.js\"></script>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("                                    label.error { float:left; color: red; padding-left: .5em; vertical-align: middle; }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("           $(document).ready(function(){\n");
      out.write("                $(\"#AddExchange\").validate();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("         <script>\n");
      out.write("           $(document).ready(function(){\n");
      out.write("                $(\"#AddCompany\").validate();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("         <script>\n");
      out.write("           $(document).ready(function(){\n");
      out.write("                $(\"#AddCompanyRecord\").validate();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("         <script>\n");
      out.write("           $(document).ready(function(){\n");
      out.write("                $(\"#exchangerecord\").validate();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("         <script>\n");
      out.write("           $(document).ready(function(){\n");
      out.write("                $(\"#SourceOfFinance\").validate();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("   <!--this is for design-->\n");
      out.write("   \n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(application.getContextPath());
      out.write("/MyshareDesign/css/style.css\"/>\n");
      out.write("  \n");
      out.write("  <!-- modernizr enables HTML5 elements and feature detects -->\n");
      out.write("  \n");
      out.write(" <script type=\"text/javascript\" src=\"");
      out.print(application.getContextPath());
      out.write("/MyshareDesign/js/modernizr-1.5.min.js\"></script> \n");
      out.write("   </head>\n");
      out.write("    \n");
      out.write("   <body>\n");
      out.write("        \n");
      out.write("         <div id=\"main\">\n");
      out.write("    <header>\n");
      out.write("      <div id=\"logo\">\n");
      out.write("        <div id=\"logo_text\">\n");
      out.write("          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\n");
      out.write("          <h1><a href=\"");
      out.print(application.getContextPath());
      out.write("/MyshareDesign/index.jsp\">MoneyControlGuide<span class=\"logo_colour\"></span></a></h1>\n");
      out.write("          <h2>Simple. Contemporary. Website Template.</h2>\n");
      out.write("        </div>\n");
      out.write("          <div style=\"margin: 22px 0 0 1100px; font-size: 20px;color: #FFFFFF\">");
      if (_jspx_meth_s_a_0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("           <nav>\n");
      out.write("        <div id=\"menu_container\">\n");
      out.write("          <ul class=\"sf-menu\" id=\"nav\">\n");
      out.write("            <li><a href=\"HomeAdmin\">Home</a></li>\n");
      out.write("            <li><a href=\"#\">Company</a>\n");
      out.write("              <ul>\n");
      out.write("                \n");
      out.write("                <li>");
      if (_jspx_meth_s_a_1(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("                <li>");
      if (_jspx_meth_s_a_2(_jspx_page_context))
        return;
      out.write(" </li>\n");
      out.write("                <li>");
      if (_jspx_meth_s_a_3(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("                <li>");
      if (_jspx_meth_s_a_4(_jspx_page_context))
        return;
      out.write(" </li>\n");
      out.write("                 \n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("             <li><a href=\"#\">Share Holder</a>\n");
      out.write("              <ul>\n");
      out.write("                \n");
      out.write("                <li>");
      if (_jspx_meth_s_a_5(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("                <li>");
      if (_jspx_meth_s_a_6(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("           \n");
      out.write("                <li>");
      if (_jspx_meth_s_a_7(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          \n");
      out.write("            <li><a href=\"Registration\">User</a>\n");
      out.write("             <ul>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <li><a href=\"#\">Share Holder</a>\n");
      out.write("                 <ul>\n");
      out.write("                   \n");
      out.write("                    <li><a href=\"#\">View</a></li>\n");
      out.write("                  \n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"allowuser.action\">Allow User</a>\n");
      out.write("                </li>\n");
      out.write("             </ul>\n");
      out.write("            </li>\n");
      out.write("              <li><a href=\"\">Exchange</a>\n");
      out.write("             <ul>\n");
      out.write("                \n");
      out.write("                <li><a href=\"addexchangerecord.action\">Add Exchange Record</a></li>\n");
      out.write("                <li><a href=\"#\">Maintain Record</a> </li>\n");
      out.write("                 <li><a href=\"exchange\">View Exchange</a></li>\n");
      out.write("                 <li>");
      if (_jspx_meth_s_a_8(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("             </ul>\n");
      out.write("            </li>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("      </nav>\n");
      out.write("  </header>\n");
      out.write("   ");
      out.write('\n');
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("    <footer>\n");
      out.write("      \n");
      out.write("      <p>Copyright<a> @<b>MoneyControlGuide</b> Team</a></p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("  <!-- javascript at the bottom for fast page loading -->\n");
      out.write(" ");
      out.write("\n");
      out.write("  <script type=\"text/javascript\" src=\"");
      out.print(application.getContextPath());
      out.write("/MyshareDesign/js/jquery.easing-sooper.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"");
      out.print(application.getContextPath());
      out.write("/MyshareDesign/js/jquery.sooperfish.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      $('ul.sf-menu').sooperfish();\n");
      out.write("      $('.top').click(function() {$('html, body').animate({scrollTop:0}, 'fast'); return false;});\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write(" \n");
      out.write("   ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_a_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_0.setPageContext(_jspx_page_context);
    _jspx_th_s_a_0.setParent(null);
    _jspx_th_s_a_0.setHref("logout");
    int _jspx_eval_s_a_0 = _jspx_th_s_a_0.doStartTag();
    if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_0.doInitBody();
      }
      do {
        out.write("logout");
        int evalDoAfterBody = _jspx_th_s_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_0);
    return false;
  }

  private boolean _jspx_meth_s_a_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_1.setPageContext(_jspx_page_context);
    _jspx_th_s_a_1.setParent(null);
    _jspx_th_s_a_1.setHref("viewcompany");
    int _jspx_eval_s_a_1 = _jspx_th_s_a_1.doStartTag();
    if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_1.doInitBody();
      }
      do {
        out.write("View Record");
        int evalDoAfterBody = _jspx_th_s_a_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_1);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_1);
    return false;
  }

  private boolean _jspx_meth_s_a_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_2.setPageContext(_jspx_page_context);
    _jspx_th_s_a_2.setParent(null);
    _jspx_th_s_a_2.setHref("addcompanyrecord");
    int _jspx_eval_s_a_2 = _jspx_th_s_a_2.doStartTag();
    if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_2.doInitBody();
      }
      do {
        out.write("Add Company Record");
        int evalDoAfterBody = _jspx_th_s_a_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_2);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_2);
    return false;
  }

  private boolean _jspx_meth_s_a_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_3.setPageContext(_jspx_page_context);
    _jspx_th_s_a_3.setParent(null);
    _jspx_th_s_a_3.setHref("viewcompanyrecord");
    int _jspx_eval_s_a_3 = _jspx_th_s_a_3.doStartTag();
    if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_3.doInitBody();
      }
      do {
        out.write("View Company Record");
        int evalDoAfterBody = _jspx_th_s_a_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_3);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_3);
    return false;
  }

  private boolean _jspx_meth_s_a_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_4 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_4.setPageContext(_jspx_page_context);
    _jspx_th_s_a_4.setParent(null);
    _jspx_th_s_a_4.setHref("#");
    int _jspx_eval_s_a_4 = _jspx_th_s_a_4.doStartTag();
    if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_4.doInitBody();
      }
      do {
        out.write("Company Registered With Exchange");
        int evalDoAfterBody = _jspx_th_s_a_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_4);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_4);
    return false;
  }

  private boolean _jspx_meth_s_a_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_5 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_5.setPageContext(_jspx_page_context);
    _jspx_th_s_a_5.setParent(null);
    _jspx_th_s_a_5.setHref("shareholdertransaction");
    int _jspx_eval_s_a_5 = _jspx_th_s_a_5.doStartTag();
    if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_5.doInitBody();
      }
      do {
        out.write("Share Holder Transaction");
        int evalDoAfterBody = _jspx_th_s_a_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_5);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_5);
    return false;
  }

  private boolean _jspx_meth_s_a_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_6 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_6.setPageContext(_jspx_page_context);
    _jspx_th_s_a_6.setParent(null);
    _jspx_th_s_a_6.setHref("#");
    int _jspx_eval_s_a_6 = _jspx_th_s_a_6.doStartTag();
    if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_6.doInitBody();
      }
      do {
        out.write("Private Firm");
        int evalDoAfterBody = _jspx_th_s_a_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_6);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_6);
    return false;
  }

  private boolean _jspx_meth_s_a_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_7 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_7.setPageContext(_jspx_page_context);
    _jspx_th_s_a_7.setParent(null);
    _jspx_th_s_a_7.setHref("viewsourceoffinance");
    int _jspx_eval_s_a_7 = _jspx_th_s_a_7.doStartTag();
    if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_7.doInitBody();
      }
      do {
        out.write("View Source Of Finance");
        int evalDoAfterBody = _jspx_th_s_a_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_7);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_7);
    return false;
  }

  private boolean _jspx_meth_s_a_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_a_8 = (org.apache.struts2.views.jsp.ui.AnchorTag) _jspx_tagPool_s_a_href.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_a_8.setPageContext(_jspx_page_context);
    _jspx_th_s_a_8.setParent(null);
    _jspx_th_s_a_8.setHref("viewexchangerecord");
    int _jspx_eval_s_a_8 = _jspx_th_s_a_8.doStartTag();
    if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_a_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_a_8.doInitBody();
      }
      do {
        out.write("View Exchange Record");
        int evalDoAfterBody = _jspx_th_s_a_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_a_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_a_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_8);
      return true;
    }
    _jspx_tagPool_s_a_href.reuse(_jspx_th_s_a_8);
    return false;
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setTheme("simple");
    _jspx_th_s_form_0.setAction("ShareHolderTransaction");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    <div class=\"form_settings\">\n");
        out.write("        <p><span>  Share Holder Acc_No</span>");
        if (_jspx_meth_s_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("        <span>     Company Name</span>");
        if (_jspx_meth_s_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</P>\n");
        out.write("        <p><span>   Transaction Mode</span>");
        if (_jspx_meth_s_radio_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("        <p><span>   Date</span>");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("       <p><span>   Number of Issue</span>");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("    <p><span>   Current Value of Issue</span>");
        if (_jspx_meth_s_textfield_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("    <p><span>   Net Value</span>");
        if (_jspx_meth_s_textfield_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("    ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    </div>\n");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_0 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_name_listValue_listKey_list_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_0.setPageContext(_jspx_page_context);
    _jspx_th_s_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_select_0.setName("dmataccountnumber");
    _jspx_th_s_select_0.setList("%{dmataccount}");
    _jspx_th_s_select_0.setListKey("dmat");
    _jspx_th_s_select_0.setListValue("dmat");
    int _jspx_eval_s_select_0 = _jspx_th_s_select_0.doStartTag();
    if (_jspx_th_s_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_name_listValue_listKey_list_nobody.reuse(_jspx_th_s_select_0);
      return true;
    }
    _jspx_tagPool_s_select_name_listValue_listKey_list_nobody.reuse(_jspx_th_s_select_0);
    return false;
  }

  private boolean _jspx_meth_s_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_1 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_name_listValue_listKey_list_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_1.setPageContext(_jspx_page_context);
    _jspx_th_s_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_select_1.setName("companyname");
    _jspx_th_s_select_1.setList("%{compname}");
    _jspx_th_s_select_1.setListKey("tinnumber");
    _jspx_th_s_select_1.setListValue("companyname");
    int _jspx_eval_s_select_1 = _jspx_th_s_select_1.doStartTag();
    if (_jspx_th_s_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_name_listValue_listKey_list_nobody.reuse(_jspx_th_s_select_1);
      return true;
    }
    _jspx_tagPool_s_select_name_listValue_listKey_list_nobody.reuse(_jspx_th_s_select_1);
    return false;
  }

  private boolean _jspx_meth_s_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_s_radio_0 = (org.apache.struts2.views.jsp.ui.RadioTag) _jspx_tagPool_s_radio_name_list_nobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    _jspx_th_s_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_s_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_radio_0.setName("transactionmode");
    _jspx_th_s_radio_0.setList("{'Purchase','Selling'}");
    int _jspx_eval_s_radio_0 = _jspx_th_s_radio_0.doStartTag();
    if (_jspx_th_s_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_radio_name_list_nobody.reuse(_jspx_th_s_radio_0);
      return true;
    }
    _jspx_tagPool_s_radio_name_list_nobody.reuse(_jspx_th_s_radio_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setName("date");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_1.setName("numberofissue");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_2.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_2.setName("currentvalue");
    int _jspx_eval_s_textfield_2 = _jspx_th_s_textfield_2.doStartTag();
    if (_jspx_th_s_textfield_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_2);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_2);
    return false;
  }

  private boolean _jspx_meth_s_textfield_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_3.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_3.setName("netvalue");
    int _jspx_eval_s_textfield_3 = _jspx_th_s_textfield_3.doStartTag();
    if (_jspx_th_s_textfield_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_3);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_3);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_name_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setName("btnsub");
    _jspx_th_s_submit_0.setValue("Submit");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_name_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_name_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }
}
