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

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        //out.println("dex.jpg");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}