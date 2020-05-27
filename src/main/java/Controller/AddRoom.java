package Controller;

import Interfaces.RoomProcessorInterface;
import Service.RoomProcessor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/addRoom"})
public class AddRoom extends HttpServlet {

    RoomProcessorInterface model = new RoomProcessor();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/addRoom.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int roomNumber = Integer.parseInt(req.getParameter("number"));
        String roomType = req.getParameter("type");
        int price = Integer.parseInt(req.getParameter("price"));
        String description = req.getParameter("desc");
        model.addRoom(roomNumber, roomType, price, description);
        resp.sendRedirect(req.getContextPath() + "/rooms.jsp");
    }
}
