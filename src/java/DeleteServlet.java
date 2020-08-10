
import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/DeleteServlet")  
public class DeleteServlet extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        response.setContentType("text/html");
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        EmpDBHandler.delete(id);  
        response.sendRedirect("ViewServlet");  
    }  
}  