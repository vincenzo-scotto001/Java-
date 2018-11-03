public class PetDemo

{
   public static void main(String[] args)
   {
      Pet stuff  = new Pet();
      stuff.setName("Vincenzo");
      stuff.setAnimal("Dog");
      stuff.setAge(21);
      
      System.out.println("Name: "+ stuff.getName());
      System.out.println("Animal: "+ stuff.getAnimal());
      System.out.println("Age: "+ stuff.getAge());
   }
}