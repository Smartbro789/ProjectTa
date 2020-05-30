package Controller;

import Interfaces.RoomProcessorInterface;
import Service.RoomProcessor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/deleteRoom"})
public class DeleteRoom extends HttpServlet {

    RoomProcessorInterface model = new RoomProcessor();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        model.delete(id);
        resp.sendRedirect(req.getContextPath() + "/rooms");
    }
}
