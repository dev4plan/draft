package ru.web.webproject;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class UserRegistration extends HttpServlet {
    private String message;

    @Override
    public void init() {
        message = "World Hi !";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>" + " " + message + " ;)" + "</h1>");
            out.println("<dev>" + "Your Name:" + " " + "<br>");
            out.println("<dev>" + "Second Name:" + " " + "<br>");
            out.println("Age:" + " " + "<br>");
            out.println("Email:" + " " + "<br>");
            out.println("Address:" + " " + "</dev>");
            out.println("</body></html>");
        } catch (IOException e) {
            log.error(e.getMessage(), e.getCause());
        }
    }

    @Override
    public void destroy() {
    }
}