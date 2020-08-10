<%-- 
    Document   : newjsp5
    Created on : Jul 7, 2019, 5:38:09 PM
    Author     : Sidharth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
           <%
            
            
     
        String name=request.getParameter("username");
        String password=request.getParameter("password");
        
        
        response.setContentType("text/html");
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/proj","root","root");
            PreparedStatement ps=con.prepareStatement
                    ("select count(*) as islogin from proj.employee1 where username='"+name+"'"+" and password='"+password+"'");
            ResultSet rs=ps.executeQuery();
            String check="value";
            
            while (rs.next()) {
                check=rs.getString("islogin");
            }
                
             if(check.equalsIgnoreCase("0"))
                {
                    out.print("NOT LOGGED IN");
                    
                                   }
             
             else{
              
                    out.print("Hello "+name);
                    
                  out.print("<a href='testservlet'>     LOGOUT</a>");  
            
                    
       
                    session.setAttribute("obj",name);    
             }
        } 
        catch(Exception e)
        {
        System.out.println(e.getMessage());
        
        }
            
        %>
    </body>
</html>
