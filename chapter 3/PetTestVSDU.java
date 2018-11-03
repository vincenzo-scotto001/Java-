//Vincenzo Scotto Di Uccio Chapter 3 problem 10 feb 9 2016
import java.util.Scanner;
public class PetTestVSDU
{
   public static void main(String[] args)
   {
      
      String name;
      String type;
      int age;
      Pet1 pet;
      /*changed variables and declared them*/
      /*deleted redundent decleration of Scanner objects, you only have to declare it once.*/
      
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Name of pet: ");
      name = keyboard.nextLine();
      
      
      System.out.println("Type of pet: ");
      type = keyboard.nextLine();
      
      
      System.out.println("Age of pet: ");
      age = keyboard.nextInt();
      
      /*creating a Pet1 object*/
      
      pet = new Pet1(name, type, age);
      
      /*send in arguements*/
      
      
      
      
      System.out.println("Name: " + pet.getName());
      System.out.println("Type: " + pet.getType());
      System.out.println("Age: " + pet.getAge());
      }
}