package com.sist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by sist on 2016-02-29.
 */
@WebServlet(urlPatterns = "/now")
public class NowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = euc-kr");
        Date now = new Date();

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head><title>현재 시간 </title></head>");
        printWriter.println("<body>");
        printWriter.println("서블릿 생성 현재 시간: ");
        printWriter.println(now.toString());
        printWriter.println("</body>");
        printWriter.println("</html>");
        printWriter.close();
    }
}
