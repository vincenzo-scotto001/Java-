// Vincenzo Scotto Di Uccio chapter 6 problem 3 march 8th 2016
public class Room_Dimension 
    {

        private double length;
        private double width;

        public Room_Dimension(double length, double width) 
        {
            this.length = length;
            this.width = width;
        }

        public double getLength() 
        {
            return length;
        }

        public double getWidth() 
        {
            return width;
        }

        public Room_Dimension(Room_Dimension roomDimensions)
        {

        }

        public double getArea() 
        {
            return length * width;
        }

        public String toString() 
        {
            return "Dimensions of room: (length = " + length + ", width = " + width + ")";
        }

    }

 