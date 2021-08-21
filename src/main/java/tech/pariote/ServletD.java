package tech.pariote;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletD extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException,
            java.io.IOException{
        resp.getWriter().println("ninhao,get");
        resp.getWriter().println("<h1>hhhh</h1>");
    }

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException,
            java.io.IOException{
        resp.getWriter().println(""+req.getParameter("username"));
    }
}
