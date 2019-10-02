package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BasicServlet", urlPatterns = "/main_servlet")
public class MainServlet extends HttpServlet {
    private transient ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Main servlet</h1>/n");
        resp.getWriter().println("<ul>");
        resp.getWriter().println("<li>cart</li>");
        resp.getWriter().println("<li>product</li>");
        resp.getWriter().println("</ul>");

    }

    @Override
    public void destroy() {
    }

}
