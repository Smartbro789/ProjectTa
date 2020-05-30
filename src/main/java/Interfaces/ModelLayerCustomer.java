package Interfaces;

import HashTable.Table;
import Model.Customer;

import java.util.ArrayList;

public interface ModelLayerCustomer {

    Table<Integer, Customer> selectAll();

    public ArrayList<Customer> selectAllList();

    Customer selectOne(int id);

    int insert(Customer customer);

    int update(Customer customer);

    int delete(int id);
}
