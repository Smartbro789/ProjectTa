package Controller;

import Interfaces.ModelLayerRoom;
import Interfaces.RoomProcessorInterface;
import Model.Room;
import Repository.RoomModel;
import Service.RoomProcessor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/editRoom"})
public class EditRoom extends HttpServlet {

    RoomProcessorInterface model = new RoomProcessor();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("room", model.selectOne(id));
        getServletContext().getRequestDispatcher("/editRoom.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        int number = Integer.parseInt(req.getParameter("number"));
        boolean status = Boolean.parseBoolean(req.getParameter("status"));
        String type = req.getParameter("type");
        int price = Integer.parseInt(req.getParameter("price"));
        String description = req.getParameter("desc");
        model.editRoom(id, number, status, type, price, description);
        resp.sendRedirect(req.getContextPath() + "/rooms");
    }
}

