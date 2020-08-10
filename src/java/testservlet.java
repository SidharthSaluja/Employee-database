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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sidharth
 */
public class testservlet extends HttpServlet {

  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        
        String name=(String)session.getAttribute("obj");
         request.getRequestDispatcher("index.jsp").include(request, response);
        session.invalidate();
        out.print("YOU HAVE SUCCESSFULLY LOGGED OUT");
       
    }

    }

    

