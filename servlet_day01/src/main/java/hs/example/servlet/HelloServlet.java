package hs.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        PrintWriter writer = resp.getWriter();
//        writer.println("你好");
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("hello");


//        PrintWriter writer = resp.getWriter();
//        writer.println("hello");
//        System.out.println("helllll");
        resp.sendRedirect("/s1/welcome.jsp");
//        resp.sendRedirect("/s1/pics/1.jpg");
//        resp.sendRedirect("/s1/1.jpg");
//        resp.sendRedirect("1.jpg");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
    }
}

//public class HelloServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter writer = resp.getWriter();
//        writer.println("hello");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       // super.doPost(req, resp);
//    }
//}
