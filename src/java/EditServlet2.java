import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

@WebServlet("/EditServlet2")  
public class EditServlet2 extends HttpServlet {  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
           
            
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);    
        response.setContentType("text/html");
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
          
        int status=EmpDBHandler.update(e);  
        if(status>0){  
            response.sendRedirect("ViewServlet");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  
