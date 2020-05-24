package Interfaces;

import Model.Customer;

import java.util.ArrayList;

public interface ModelLayerCustomer {

    ArrayList<Customer> selectAll();

    Customer selectOne(int id);

    int insert(Customer customer);

    int update(Customer customer);

    int delete(int id);
}
