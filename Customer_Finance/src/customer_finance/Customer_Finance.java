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
public class Customer_Finance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Customer c = new Customer();
        Finance_Period f= new Finance_Period();
        f.calculateRepayment();
        f.displayInterest();
    }
    
    
}
