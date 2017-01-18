package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        try (PrintWriter pw = new PrintWriter(response.getOutputStream())) {
            if (a == null || a.isEmpty()) {
                pw.println("param \"a\" empty");
                return;
            }
            if (b == null || b.isEmpty()) {
                pw.println("param \"b\" empty");
                return;
            }
            int ai = Integer.valueOf(a);
            int bi = Integer.valueOf(b);
            pw.println("Sum: " + ai + " + " + bi + " = " + (ai + bi));
        }
    }
}
