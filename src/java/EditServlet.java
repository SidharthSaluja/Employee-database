
import java.io.IOException;
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException,IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Employee</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        Emp e=EmpDBHandler.getEmployeeById(id);  
          
        out.print("<form action='EditServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
        out.print("<tr><td>Employee_firstname:</td><td><input type='text' name='name' value='"+e.getFirstName()+"'/></td></tr>");  
        out.print("<tr><td>employee_lastname:</td><td><input type='text' name='employee_lastname' value='"+e.getLastName()+"'/> </td></tr>");  
        out.print("<tr><td>is_active:</td><td><input type='number' name='is_active'' value='"+e.getIsActive()+"'/></td></tr>");  
        out.print("<tr><td>employee_email:</td><td<input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");
       
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
}  