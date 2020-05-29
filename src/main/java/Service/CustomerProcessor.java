package Service;

import Interfaces.CustomerProcessorInterface;
import Interfaces.ModelLayerCustomer;
import Model.Customer;
import Repository.CustomerModel;

import java.util.Date;

public class CustomerProcessor implements CustomerProcessorInterface {

    ModelLayerCustomer model = new CustomerModel();

    @Override
    public void addCustomer(String name, int room, Date depDate){
        Customer customer = new Customer(name, room, new Date(), depDate);
        model.insert(customer);
    }
}
