/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_finance;
import javax.swing.*;
/**
 *
 * @author ngazani
 */
public class Customer {
    
    
      //Main objective is to determine monthly Payments
    
    
    private String customerName=JOptionPane.showInputDialog(null,"Enter Customer Name"); ;
    private int contactNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter Customers Contact Number"));

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {    
        this.productPrice = productPrice;
    }

    public int getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }
   


   private int productPrice=Integer.parseInt(JOptionPane.showInputDialog("Enter Cost of Product"));;
   private int monthNum=Integer.parseInt(JOptionPane.showInputDialog("Enter duration of repayment from 1-12 months"));
   public double repaymentAmmount;
    
    public void  calculateRepayment() 
    {
    repaymentAmmount = getProductPrice()/getMonthNum();
    } 
}




