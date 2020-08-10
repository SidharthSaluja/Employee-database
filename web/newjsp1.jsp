<%-- 
    Document   : newjsp1
    Created on : Jul 7, 2019, 9:52:08 AM
    Author     : Sidharth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             
     <form  action="AddServlet" method="post">
               <table>
               <tr>
                       <td>Id</td><td><input type="number" name="id"/> </td>  
                       
                   </tr>
                   
                   
                    <tr>
                       <td>Employee_first_name</td><td><input type="text" name="employee_firstname"/> </td>  
                       
                   </tr>
                   
                    <tr>
                       <td>Employee_last_name</td><td><input type="text" name="employee_lastname"/> </td>  
                       
                   </tr>
                   
                    <tr>
                       <td>Is_active</td><td><input type="text" name="is_active"/> </td>  
                       
                   </tr>
                   
                    <tr>
                       <td>Employee_email</td><td><input type="text" name="employee_email"/> </td>  
                       
                   </tr>
                   
                   
                  
                   
                    <tr>
                       <td><input type="submit" value="Add Employee">
                    </td>  
                       
                   </tr> 
            </table>
         
         <a href="newjsp.jsp">GO BACK TO DASHBOARD</a>
    </body>
</html>
