import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class shuttleApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //big shuttles
        shuttle red = new shuttle("Red" , 2);
        shuttle green = new shuttle("Green" , 2);
        shuttle orange = new shuttle("Orange" , 2);

        //small shuttles
        shuttle blue = new shuttle("Blue", 1);
        shuttle yellow = new shuttle("Yellow", 1);
        shuttle purple = new shuttle("Purple", 1);

        System.out.println("Welcome to the Quinnipiac Shuttle Helper app! \n Are you a student or a driver? \n Type '1' for student services \n Type '2' for driver services");
        int user = input.nextInt();

        if(user == 1) {
            System.out.println("Welcome to Shuttle Helper for students \n Please enter your student ID number: ");
            float id = input.nextFloat();
            System.out.println("Student Verified \n Have you been waiting for the shuttle for longer than 10 minutes?");
            String waitTime = input.nextLine();

            if(waitTime.equals("yes")) {

            } else if (waitTime.equals("no")) {

            } else {
                System.out.println("Please enter 'yes' or 'no'");
                waitTime = input.nextLine();
            }
        } else if (user == 2) {
            Queue<shuttle> queue = new PriorityQueue<shuttle>();
            System.out.println("What shuttle are you riding? \n Red \n Green \n Orange \n Blue \n Yellow \nPurple");
            String driverinpt = input.nextLine();
            
            if (driverinpt.equalsIgnoreCase("Red")) {
                queue.add(red);
                queue.add(green);
                queue.add(blue);
            } else if (driverinpt.equalsIgnoreCase("Green")) {
                queue.add(green);
                queue.add(red);
                queue.add(blue);
            } else if (driverinpt.equalsIgnoreCase("Orange")) {
                queue.add(orange);
                queue.add(green);
                queue.add(purple);
            } else if (driverinpt.equalsIgnoreCase("Blue")) {
                queue.add(blue);
                queue.add(yellow);
                queue.add(red);
            } else if (driverinpt.equalsIgnoreCase("Yellow")) {
                queue.add(yellow);
                queue.add(blue);
                queue.add(green);
            } else if (driverinpt.equalsIgnoreCase("Purple")) {
                queue.add(purple);
                queue.add(red);
                queue.add(yellow);
            }


        
        }

    } 
}
