/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Order.MasterOrderCatalog;
import Business.Product.ProductCatalog;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private ProductCatalog productCatalog;
    private MasterOrderCatalog masterOrderCatalog;
    private boolean approved;
    private String alert;

    public UserAccount() {
        workQueue = new WorkQueue();
        productCatalog = new ProductCatalog();
        masterOrderCatalog = new MasterOrderCatalog();
        approved = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }
    
    

    @Override
    public String toString() {
        return username;
    }

}
