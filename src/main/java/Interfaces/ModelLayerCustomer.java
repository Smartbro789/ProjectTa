package Interfaces;

import HashTable.Table;
import Model.Customer;

public interface ModelLayerCustomer {

    Table<Integer, Customer> selectAll();

    Customer selectOne(int id);

    int insert(Customer customer);

    int update(Customer customer);

    int delete(int id);
}
