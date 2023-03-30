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

        }

    } 
}
