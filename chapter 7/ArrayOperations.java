// Vincenzo Scotto Di Uccio Chapter 7 problem 11 March 31st 2016

public class ArrayOperations{

    public static int getTotal(int[] n)
    {
        int total=0;
        for(int i=0;i<n.length;i++)
        total+=n[i];
        return total;
    }
      public static double getTotal(double[] n)
    {
        double total=0.0;
        for(int i=0;i<n.length;i++)
        total+=n[i];
        return total;
    }
    public static int getAverage(int[] n)
    {
        return getTotal(n)/(n.length-1);
    }
     public static double getAverage(double[] n)
    {
        return getTotal(n)/(n.length-1);
    }
    public static int getHighest(int[] n)
    {
        int max=0;
        for(int i=0;i<n.length;i++)
        if(max<n[i])
        max=n[i];
        return max;
    }
    public static double getHighest(double[] n)
    {
        double max=0;
        for(int i=0;i<n.length;i++)
        if(max<n[i])
        max=n[i];
        return max;
    }
        public static int getLowest(int[] n)
    {
        int min=9999999;
        for(int i=0;i<n.length;i++)
        if(min>n[i])
        min=n[i];
        return min;
    }
    public static double getLowest(double[] n)
    {
        double min=99999;
        for(int i=0;i<n.length;i++)
        if(min>n[i])
        min=n[i];
        return min;
    }
     public static void main(String []args){
        System.out.println("Testing class");
        int n[]={1,2,3,4,5,6,7,8,9,0};
        double a[]={1.0,2.0,3.0,4.0,5.0,6.0};
        System.out.println("Total "+ArrayOperations.getTotal(n));
        System.out.println("Total "+ArrayOperations.getTotal(a));
        System.out.println("Avg "+ArrayOperations.getAverage(n));
        System.out.println("Avg "+ArrayOperations.getAverage(a));
        System.out.println("Max "+ArrayOperations.getHighest(n));
        System.out.println("Max "+ArrayOperations.getHighest(a));
        System.out.println("Min "+ArrayOperations.getLowest(n));
        System.out.println("Min "+ArrayOperations.getLowest(a));
      
     }
}