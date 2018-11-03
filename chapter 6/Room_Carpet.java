   public class Room_Carpet 
    {
        private Room_Dimension roomDimensions;
        private double carpetCost;

        public Room_Carpet(Room_Dimension roomDimensions, double carpetCost) 
        {
            this.roomDimensions = roomDimensions;
            this.carpetCost = carpetCost;
        }

        public Room_Carpet(Room_Carpet roomCarpet)
        {

        }

        public double getTotalCost() 
        {
            return carpetCost * roomDimensions.getArea();
        }

        public Room_Dimension getSize()
        {
            return roomDimensions;
        }

        public double getCarpetCost()
        {
            return carpetCost;
        }

        public String toString() 
        {
            return "" + roomDimensions + ", Carpet cost per square feet = $" + carpetCost + ", " + "Total cost = $" + getTotalCost() + "";
        }

    }
