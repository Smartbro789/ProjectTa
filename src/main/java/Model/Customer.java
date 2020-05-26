package Model;

import java.util.Date;

public class Customer {
//big dick - big balls
    private int customerId;
    private String customerName;
    private int customerRoom;
    private Date customerArrDate;
    private Date customerDepDate;

    public Customer(int customerId, String customerName, int customerRoom, Date customerArrDate, Date customerDepDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerRoom = customerRoom;
        this.customerArrDate = customerArrDate;
        this.customerDepDate = customerDepDate;
    }

    public Customer(String customerName, int customerRoom, Date customerArrDate, Date customerDepDate) {
        this.customerName = customerName;
        this.customerRoom = customerRoom;
        this.customerArrDate = customerArrDate;
        this.customerDepDate = customerDepDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerRoom() {
        return customerRoom;
    }

    public Date getCustomerArrDate() {
        return customerArrDate;
    }

    public Date getCustomerDepDate() {
        return customerDepDate;
    }
}
