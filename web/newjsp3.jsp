<%-- 
    Document   : newjsp3
    Created on : Jul 7, 2019, 5:22:25 PM
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
        <%
            String choose=request.getParameter("Choose");
            
         if(choose=="HEAD")
         {  request.getRequestDispatcher("index.jsp").include(request, response);}
         
else
         {
           request.getRequestDispatcher("newjsp4.jsp").include(request, response);}
            
            %>
    </body>
</html>
