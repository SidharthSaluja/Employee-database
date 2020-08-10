/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sidharth
 */
public class AddServlet extends HttpServlet {

   

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        PrintWriter out=response.getWriter();  
        response.setContentType("text/html");
              
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);    
         String firstname=request.getParameter("name");  
        String lastname=request.getParameter("sname");  
        int isactive=Integer.parseInt(request.getParameter("ids"));  
        String email=request.getParameter("email");  
          
        Emp e=new Emp();  
        
          e.setId(id);
        e.setFirstName(firstname);  
        e.setLastName(lastname);  
        e.setIsActive(isactive);  
        e.setEmail(email);  
          
        int status=EmpDBHandler.AddEmp(e);  
        if(status>0){  request.getRequestDispatcher("newjsp1.jsp").include(request, response);  
            out.print("Record saved successfully!");  
            
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();
        
    }
    
}