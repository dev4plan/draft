package ru.web.webproject;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "mainServlet", value = "/main.jsp")
public class MainPage extends HttpServlet {
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        // You can define your initial parameter in web.xml file.
        String initialParameter = config.getInitParameter("initialParameter");
        // Do some stuff with initial parameters
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String authType = request.getAuthType();
        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.println("<html><body>");
        out.println("<h1>" + "getStatus" + response.getStatus() + "</h1>");
        out.println("<h1>" + "getBufferSize" + response.getBufferSize() + "</h1>");
        out.println("<h1>" + "getContentType" + response.getContentType() + "</h1>");
        out.println("<h1>" + "getTrailerFields" + response.getTrailerFields().get() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
