// Vincenzo Scotto Di Uccio Chapter 3 problem 3 feb. 9th 2016



class personData
{
   private String Name;
   private String Address;
   private int Age;
   private int Ph;
   
   public personData()
   {
      Name = " ";
      Address = " ";
      Age = 0;
      Ph = 0;
   }
   public personData(String name, String Addr, int a, int no)
   
   {
      Name = name;
      Address = Addr;
      Age = a;
      Ph = no;
   }
   
   public void setName(String name)
   {
      name =Name;
   }
   public void setAddress(String addr)
   {
      Address = addr;
   }
   public void setAge(int age)
   {
      Age =age;
   }
   public void setPhone(int no)
   {
      Ph = no;
   }
   public String getName()
   {
      return Name;
   }
   public int getAge()
   {
      return Age;
   }
   public int getPhone()
   {
      return Ph;
   }
   public String getAddress()
   {
      return Address;
   }
 
}