import java.util.Scanner; 

public class shuttleApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  

        //big shuttles
        shuttle Red = new shuttle("Red" , 2);
        shuttle Green = new shuttle("Green" , 2);
        shuttle Orange = new shuttle("Orange" , 2);

        //small shuttles
        shuttle Blue = new shuttle("Blue", 1);
        shuttle Yellow = new shuttle("Yellow", 1);
        shuttle Purple = new shuttle("Purple", 1);

        System.out.println("Welcome to the Quinnipiac Shuttle Helper app! \nAre you a student or a driver? \n Type '1' for student services \n Type '2' for driver services");
        int user = input.nextInt();

            if(user == 1) {
                System.out.println("Welcome to Shuttle Helper for students \nPlease enter your student ID number: ");
                float id = input.nextFloat();
                System.out.println("Student Verified \nHave you been waiting for the shuttle for longer than 10 minutes? \nEnter '1' for YES and '2' for NO.");
                int waitTime = input.nextInt();
                
                if(waitTime == 1) {
                    System.out.println("This has been reported. \nDrivers have been alerted and a shuttle is on the way.");
    
                } else if (waitTime == 2) {
                    System.out.println("How long have you been waiting? \nEnter the number of minutes: 0 - 9");
                    int minutes = input.nextInt();
                    int wait = 10-minutes;
                    if (minutes<10) {
                        System.out.println("Please wait " + wait + " more minutes \nIf there is no shuttle please report this again.");
                    } else if (minutes>10){
                        System.out.println("This has been reported.\nA shuttle is on its way.");
                    } 
                    
                } else {
                    System.out.println("Please enter '1' or '2'");
                   
                }
            } else if (user == 2) {
    
            } else {
                System.out.println("Please enter '1' or '2'");
            }
    
        
    } 
}
