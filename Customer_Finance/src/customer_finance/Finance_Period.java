/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_finance;

import javax.swing.JOptionPane;

/**
 *
 * @author ngazani
 */
public class Finance_Period extends Customer {
  //Main Objective is to Determine if the customer Pays interest
    
    private double interest,incAmmount;
    private String Message = "N/A";

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    public double getIncAmmount() {
        return incAmmount;
    }

    public void setIncAmmount(double incAmmount) {
        this.incAmmount = incAmmount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    
    @Override
    public void  calculateRepayment()
    {
    super.calculateRepayment();
    incAmmount = +(getProductPrice()*25/100);
    
    if(getMonthNum()>=3){
        
    interest = getProductPrice()+ incAmmount;
        JOptionPane.showMessageDialog(null,"Name: "+getCustomerName()+"\n"+ 
        "Contact Number: 0"+getContactNumber()+"\n"
        + "Cost of product: R"+getProductPrice()+"\n"
        + "Payment Duration: "+getMonthNum()+"\n"
        + "Monthly Payment: R"+ repaymentAmmount+"\n"
        + "Total due: R"+interest);
    }
    
    else{JOptionPane.showMessageDialog(null,"Name: "+getCustomerName()+"\n"+ 
        "Contact Number: 0"+getContactNumber()+"\n"
        + "Cost of product: R"+getProductPrice()+"\n"
        + "Payment Duration: "+getMonthNum()+"\n"
        + "Monthly Payment: R"+ repaymentAmmount+"\n"
        + "Total due: R"+getProductPrice());}
    }
    
    public void displayInterest()
    {
        

        
        //System.out.println(interest);
        //System.out.println(repaymentAmmount);
    }
    }

