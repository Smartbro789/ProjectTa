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
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet(urlPatterns = {"/more"})
public class More extends HttpServlet {

    RoomProcessorInterface rooms = new RoomProcessor();
    ModelLayerRoom modelRoom = new RoomModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, ArrayList<Room>> types = rooms.roomsMap(modelRoom.selectAll());

        String type = req.getParameter("type");
        ArrayList<Room> rooms = types.get(type);
        req.setAttribute("rooms", rooms);
        getServletContext().getRequestDispatcher("/more.jsp").forward(req, resp);
    }
}