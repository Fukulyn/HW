package Me;

public class Mid1_411630451 {
    public static void main(String[] args) {
    //411630451;
        
    long totalMilliseconds = System.currentTimeMillis();

    long totalSeconds = totalMilliseconds / 1000;

    long currentSecond = totalSeconds % 60;

    long totalMinutes = totalSeconds / 60;

    long currentMinute = totalMinutes % 60;

    long totalHours = totalMinutes / 60;

    long currentHour = totalHours % 24;
    
    long totaldays = totalHours/24; 
    
    long currentdays = totaldays % 365;
    
    long totalyears = totaldays / 365; 
    
    System.out.printf("Current time is %3d years %3d days %3d hours %3d minutes %3d seconds",totalyears,currentdays,currentHour,currentMinute,currentSecond);
    }
    
}

