import HashTable.Table;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/math")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Table<String, Integer> map = new Table<>();
        map.add("this", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);
    }
}
