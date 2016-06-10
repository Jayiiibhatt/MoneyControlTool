<%@include file="AssistantHeader.jsp" %>
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
            .datatable_container
            {
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
            oTable = $("#cmpny").dataTable({
                "bPaginate": true,
                "sPaginationType": "full_numbers",
                "bJQueryUI": true,
                "aLengthMenu": [[2, 5, 10, -1], [2, 5, 10, "All"]],
                "iDisplayLength": 2
            });
                   
            $(document).bind('resize', function () {
                oTable.fnAdjustColumnSizing();
            });
        });
        </script>
        
        <script type="text/javascript">
            function deletedialog(x){               
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
                                location.href="deletecompny.action?tinnumber="+x;//here we can write any name of tinnumber 
                                                                                  //but we have to make setter and getter
                                                                                  //in action class
                            },
                        Cancel: function() {
                            $( this ).dialog( "close" );
                            }
                    }
                });
                $( "#dialog-confirm" ).dialog( "open" );
            }
        </script>
        
         <script type="text/javascript">
             
            function editdialog(x){
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
                        "Edit data": function() {
                            $( this ).dialog( "close" );                               
                                location.href="EditCompany.action?tinnumber="+x;//here we can write any name of tinnumber 
                                                                                  //but we have to make setter and getter
                                                                                  //in action class
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
             <div style="text-align:center;"><h2 style="color: red"><b>Company Details</b></h2></div>          
                <table id="cmpny" class="display">
                    <thead>
                        <tr>
                            <th>Tin Number</th>
                            <th>Company Name</th>
                            <th>Company Issue Name</th>
                            <th>Nominal Value</th>
                            <th>Net Sale</th>
                            <th>Net Asset</th>
                            <th>Net Profit</th>
                             
                        
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="%{companyprofile}">
                                                        
                            <tr> 
                                <td><s:property value="tinnumber" /></td>
                                <td><s:property value="companyname" /></td>
                                <td><s:property value="companyissuename" /></td>
                                <td><s:property value="nominalvalue" /> </td>                                
                                <td><s:property value="netsale" /></td>
                                <td><s:property value="netasset" /></td>
                                <td><s:property value="netprofit" /></td>
                                
                            </tr>
                                                                                                                                            
                        </s:iterator>
                    </tbody>
                </table>
               
        </div>                        
        </div>
        </div>
        </div>
<%@include file="AssistantFooter.jsp" %>