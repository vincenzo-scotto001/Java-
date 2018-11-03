// Vincenzo Scotto Di Uccio chapter 3 problem 7 feb 9 2016
public class WidgetVSDU
{
        private int widgetRequest;
        private int days;
        private final int WIDGETPH;
        private final int SHIFT;
                
        public WidgetVSDU(int req)
        {
                widgetRequest = req;
                WIDGETPH = 10;
                SHIFT = 8;
                
        }
                  
        public void setWidgetrequest(int req)
        {
                widgetRequest = req;
        }
        
        public int getWidgetrequest()
        {
                return widgetRequest;
        }       
        public int getDays()
        {
                return days;
        }
        
        public void days()
        {
                days = (widgetRequest / (WIDGETPH)/(SHIFT*2));
        }
        
       
}