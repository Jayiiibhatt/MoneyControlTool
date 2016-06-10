<%@include file="AdminHeader.jsp" %>

        <link href="<%=application.getContextPath()%>/MyshareDesign/css/demo_page.css" rel="stylesheet" type="text/css" />
        <link href="<%=application.getContextPath()%>/MyshareDesign/css/demo_table.css" rel="stylesheet" type="text/css" />
        <link href="<%=application.getContextPath()%>/MyshareDesign/css/demo_table_jui.css" rel="stylesheet" type="text/css" />    
        <link href="<%=application.getContextPath()%>/MyshareDesign/css/jquery-ui-1.10.4.custom.min.css" rel="stylesheet" type="text/css">
                          
        <script src="<%=application.getContextPath()%>/MyshareDesign/js/jquery-1.9.1.js"></script>
        <script src="<%=application.getContextPath()%>/MyshareDesign/js/jquery-ui-1.10.4.custom.min.js"></script>
        <script src="<%=application.getContextPath()%>/MyshareDesign/js/jquery.dataTables.min.js"></script>
        <script src="<%=application.getContextPath()%>/MyshareDesign/js/jquery.dataTables.editable.js"></script>
        <script src="<%=application.getContextPath()%>/MyshareDesign/js/jquery.jeditable.js"></script>
        <script src="<%=application.getContextPath()%>/MyshareDesign/js/jquery.validate.js"></script>
           
        <style type="text/css">
            .gradeX{
                font-weight: bold;
                color:whitesmoke;
            }
            .clear{
                margin:0px;
                margin-left: 10px;
                width:14px;
            }
            .datatable_container{
                max-width: 1230px;
                min-width: 1230px;
                margin: 25px auto;
            }
            .button{
                padding:2px;
                margin-bottom: 5px;
                border:none;
                background-color: #FF6600;
                color:#FFF;
                font-size:14px;
                font-family: Cambria, "Hoefler Text", "Liberation Serif", Times, "Times New Roman", serif;
                cursor: pointer;
            }
            .mycolor{
                z-index: 9999999;
            }
            .datatable_container{
                z-index: -1;
            }
        </style>
                
        <script type="text/javascript"> 
     
        $(document).ready(function () {
            oTable = $("#course").dataTable({
                "bPaginate": true,
                "sPaginationType": "full_numbers",
                "bJQueryUI": true,
                "aLengthMenu": [[2, 5, 10, -1], [2, 5, 10, "All"]],
                "iDisplayLength": 5
            });
                   
            $(document).bind('resize', function () {
                oTable.fnAdjustColumnSizing();
            });
        });
        </script>
        
        <script type="text/javascript">
            function updatedialog(x){  
                alert(123);
                $( "#dialog-confirm" ).dialog({                   
                    resizable: false,
                    height: 140,
                    dialogClass: "mycolor",
                    modal: true,
                    show: {                       
                        effect: "blind",
                        duration: 1000
                    },
                    hide: {
                        effect: "explode",
                        duration: 1000
                    },
                    buttons:
                    {                      
                        "Activate User": function() {
                            $( this ).dialog( "close" );                               
                                location.href="updateRecordAction.action?user_id="+x;
                            },
                        Cancel: function() {
                            $( this ).dialog( "close" );
                            }
                    }
                });
                $( "#dialog-confirm" ).dialog( "open" );
            }
            
            function deletedialog(x){ 
                alert(x);
                $( "#dialog-confirm" ).dialog({                   
                    resizable: false,
                    height: 140,
                    dialogClass: "mycolor",
                    modal: true,
                    show: {                       
                        effect: "blind",
                        duration: 1000
                    },
                    hide: {
                        effect: "explode",
                        duration: 1000
                    },
                    buttons:
                    {                      
                        "Delete data": function() {
                            $( this ).dialog( "close" );                               
                                location.href="deleteRecordAction.action?user_id="+x;
                            },
                        Cancel: function() {
                            $( this ).dialog( "close" );
                            }
                    }
                });
                $( "#dialog-confirm" ).dialog( "open" );
            }
            
            function deactivateupdatedialog(x){  
                alert(x);
                $( "#dialog-confirm" ).dialog({                   
                    resizable: false,
                    height: 140,
                    dialogClass: "mycolor",
                    modal: true,
                    show: {                       
                        effect: "blind",
                        duration: 1000
                    },
                    hide: {
                        effect: "explode",
                        duration: 1000
                    },
                    buttons:
                    {                      
                        "Deactivate User": function() {
                            $( this ).dialog( "close" );                               
                                location.href="deactivateupdateRecordAction.action?user_id="+x;
                            },
                        Cancel: function() {
                            $( this ).dialog( "close" );
                            }
                    }
                });
                $( "#dialog-confirm" ).dialog( "open" );
            }
            
            
        </script>
        
  
<div id="dialog-confirm" title="Are you sure?"></div>
<div class="datatable_container" style="min-width: 800px; max-width: 800px; margin: -15px 98px">            
        <div id="dt_example">
        <div id="container">                
        <div id="demo_jui">
          <div style="text-align:center;"><h2 style="color: red"><b>Allow User</b></h2></div>                   
                <table id="course" class="display">
                    <thead>
                        <tr>
                            <th>Username</th>
                            <th>Full Name</th>
                            <th>Address</th>
                            <th>Date of birth</th>
                            <th>Gender</th>
                            <th>Type</th>
                            <th>Phone Number</th>
                            <th>Allow</th>
                            <th>Delete</th>
                            <th>Allow</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="%{uservalue}">
                            <tr>
                                <td><s:property value="username"/></td>
                                <td><s:property value="fname"/><br><s:property value="mname"/><br><s:property value="lname"/></td>
                                <td> <s:property value="street"/><br><s:property value="city"/>-<s:property value="pin_no"/><br><s:property value="dist"/><br><s:property value="state"/><br><s:property value="country"/>                               </td>
                                <td><s:property value="date_of_birth"/></td>
                                <td><s:property value="gen"/></td>
                                <td><s:property value="type"/></td>
                                <td><s:property value="phno"/></td>
                                <td><s:property value="allow"/></td>
                                <td><input type="submit" id="deletebutton" onclick="deletedialog(<s:property value="user_id" />)" name="btndelete" value="Delete"></td>
                                <s:if test="allow==0">
                                <td><input type="submit" id="updatebutton" onclick="updatedialog(<s:property value="user_id" />)"  name="btnallow" value="Activate"></td>
                                </s:if>
                                    <s:else>
                                    <td><input type="submit" id="updatebutton" onclick="deactivateupdatedialog(<s:property value="user_id" />)"  name="btnallow" value="Deactivate"></td>
                                </s:else>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
               
        </div>                        
        </div>
        </div>
        </div>
<%@include file="AdminFooter.jsp" %>