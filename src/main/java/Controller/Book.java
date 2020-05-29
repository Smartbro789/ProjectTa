package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = {"/book"})
public class Book extends HttpServlet {
    int number;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        number = Integer.parseInt(req.getParameter("number"));

        getServletContext().getRequestDispatcher("/book.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String longDate = req.getParameter("date");
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(longDate);
            System.out.println(longDate + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
