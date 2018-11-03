// Vincenzo Scotto Di Uccio Chapter 9 problem 8

public class Customer extends Person 
{

   private int customerNumber; // The Customers Number
   private String eMail; // The Customers E-Maill

   public Customer()
   {
   }

   public Customer (String n, int pn,String ad, int cn, String em)
   {
      super(n, pn,ad);
      customerNumber = cn;
      eMail = em;
   }

   public int getCustomerNumber() 
   {
      return customerNumber;
   }

   public String geteMail() 
   {
      return eMail;
   }

   public void setCustomerNumber(int customerNumber) 
   {
      this.customerNumber = customerNumber;
   }

   public void seteMail(String eMail) 
   {
      this.eMail = eMail;
   }

}