 import java.util.Scanner; 
    public class Carpet_Calculator 
    {
        public static void main(String[] args) 
        {
            // Create a Scanner object for keyboard input.
            Scanner keyboard = new Scanner(System.in);

            // Display information about program. 
            System.out.println("This program will display the carpet cost of a room.");

            // Get the length of the room.
            System.out.print("Enter the length of room: ");
            double length = keyboard.nextDouble();

            // Get the width of the room.
            System.out.print("Enter the width of room: ");
            double width = keyboard.nextDouble();

            // Get the cost of price per square feet of the desired carpeting.
            System.out.print("Enter the price per square feet for the desired carpeting: ");
            double carpetCost = keyboard.nextDouble();

            //Close keyboard
            keyboard.close();

            // Create Room_Dimension and Room_Carpet objects.
            Room_Dimension dimensions = new Room_Dimension(length, width);
            Room_Carpet roomCarpet = new Room_Carpet(dimensions, carpetCost);

            // Print the object calling the toString
            System.out.println(roomCarpet);
        }
    }