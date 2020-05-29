package Controller;

import Interfaces.ModelLayerCustomer;
import Repository.CustomerModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/deleteCustomer"})
public class DeleteCustomer extends HttpServlet {

    ModelLayerCustomer customers = new CustomerModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        customers.delete(id);
        resp.sendRedirect(req.getContextPath() + "/mainPage");
    }
}
