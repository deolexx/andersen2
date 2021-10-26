package com.example.myapp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "testServlet", value = "/test-servlet")
public class TestServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Surprise!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<img src=\"images/dex.jpg\">");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + message + "</h2>");
        out.println("<h3>" + message + "</h3>");
        out.println("<h4>" + message + "</h4>");
        out.println("<h5>" + message + "</h5>");
        out.println("<h6>" + message + "</h6>");

        out.println("<img src=\"images/flame.gif\">");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}