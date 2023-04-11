import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class shuttleApp {
    // big shuttles
    static shuttle red = new shuttle("Red", 2);
    static shuttle green = new shuttle("Green", 2);
    static shuttle orange = new shuttle("Orange", 2);

    // small shuttles
    static shuttle blue = new shuttle("Blue", 1);
    static shuttle yellow = new shuttle("Yellow", 1);
    static shuttle purple = new shuttle("Purple", 1);

    static Queue<shuttle> queue = new PriorityQueue<shuttle>();

    static int waitTime = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Quinnipiac Shuttle Helper app! \nAre you a student or a driver? \n Type '1' for student services \n Type '2' for driver services");
        int user = input.nextInt();

        if (user == 1) {
            System.out.println("\nWelcome to Shuttle Helper for students \nPlease enter your student ID number: ");
            float id = input.nextFloat();
            System.out.println("Student Verified \nHave you been waiting for the shuttle for longer than 10 minutes? \nEnter '1' for YES and '2' for NO.");
            int waitTime = input.nextInt();

            if (waitTime == 1) {
                System.out.println("This has been reported. \nDrivers have been alerted and a shuttle is on the way.");

            } else if (waitTime == 2) {
                System.out.println("How long have you been waiting? \nEnter the number of minutes: 0 - 9");
                int minutes = input.nextInt();
                int wait = 10 - minutes;
                if (minutes < 10) {
                    System.out.println("Please wait " + wait + " more minutes \nIf there is no shuttle please report this again.");
                } else if (minutes > 10) {
                    System.out.println("This has been reported.\nA shuttle is on its way.");
                }

            } else {
                System.out.println("Please enter '1' or '2'");

            }
        } else if (user == 2) {
            System.out.println("\nWhat shuttle are you driving? \n1.Red \n2.Green \n3.Orange \n4.Blue \n5.Yellow \n6.Purple");
            System.out.println("\t(please type the color)");
            input.nextLine(); // clear input buffer
            String driverinpt = input.nextLine();

            if (driverinpt.equalsIgnoreCase("Red")) {
                randomBig(green, orange, blue, yellow, purple);
                queue.add(red);
            } else if (driverinpt.equalsIgnoreCase("Green")) {
                randomBig(red, orange, blue, yellow, purple);
                queue.add(green);
            } else if (driverinpt.equalsIgnoreCase("Orange")) {
                randomBig(green, red, blue, yellow, purple);
                queue.add(orange);
            } else if (driverinpt.equalsIgnoreCase("Blue")) {
                randomSmall(red, green, orange);
                queue.add(blue);
            } else if (driverinpt.equalsIgnoreCase("Yellow")) {
                randomSmall(red, green, orange);
                queue.add(yellow);
            } else if (driverinpt.equalsIgnoreCase("Purple")) {
                randomSmall(red, green, orange);
                queue.add(purple);
            }

            System.out.println("\nHow long have you been driving?\n\t(type in hours)");
            int hours = input.nextInt();
            if (hours > 2) {
                // add random time to the top queued shuttle if it isnt the shuttle just added
                if (!driverinpt.equalsIgnoreCase(queue.peek().getName())) {
                    queue.peek().time = (int) (Math.random() * 31); // generate a time for the top shuttle on how much longer they have
                }

                System.out.println("\nAdded to the queue. \nThe following buses are in the queue right now");
                System.out.println("--------------------------------------------------------");
                System.out.println("|                   Shuttle Queue                       |");
                System.out.println("--------------------------------------------------------");
                
                // using Iterator to iterate through a queue so it prints prettier
                Iterator<shuttle> itr = queue.iterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                System.out.println("--------------------------------------------------------");
                
                //only says to wait until break if theres other in the queue
                if (!driverinpt.equalsIgnoreCase(queue.peek().getName())) {
                    //adding times together to know how long to wait
                    Iterator<shuttle> itr2 = queue.iterator();
                    while (itr2.hasNext()) {
                        waitTime += itr2.next().time;
                    }
                    System.out.println("|        Please wait " + (waitTime - 30) + " minutes until your break        |");
                    System.out.println("--------------------------------------------------------");
                } else {
                    System.out.println("|                 Enjoy your break                     |");
                    System.out.println("--------------------------------------------------------");
                }
            } else {
                System.out.println("Please continue your shift for " + (2 - hours) + " more hour(s)");
            }


           

        } else {
            System.out.println("Please enter '1' or '2'");
        }
    }

    // randomized shuttle adder function
    public static void randomBig(shuttle one, shuttle two, shuttle three, shuttle four, shuttle five) {
        int randomNumBig = (int) (Math.random() * 3); // generate a random number between 0 and 2
        if (randomNumBig == 0) {
            if (!queue.contains(one)) {
                queue.add(one);
            }
        } else if (randomNumBig == 1) {
            if (!queue.contains(two)) {
                queue.add(two);
            }
        }

        // add one small shuttle to the queue
        int randomNumSmall = (int) (Math.random() * 4); // generate a random number between 0 and 3
        if (randomNumSmall == 0) {
            if (!queue.contains(three)) {
                queue.add(three);
            }
        } else if (randomNumSmall == 1) {
            if (!queue.contains(four)) {
                queue.add(four);
            }
        } else if (randomNumSmall == 2) {
            if (!queue.contains(five)) {
                queue.add(five);
            }
        }
    }

    public static void randomSmall(shuttle one, shuttle two, shuttle three) {
        int numBigShuttlesAdded = 0;
        while (numBigShuttlesAdded < 2) {
            int randomNum = (int) (Math.random() * 4); // generate a random number between 0 and 3
            if (randomNum == 0) {
                if (!queue.contains(one)) {
                    queue.add(one);
                }
                numBigShuttlesAdded++;
            } else if (randomNum == 1) {
                if (!queue.contains(two)) {
                    queue.add(two);
                }
                numBigShuttlesAdded++;
            } else if (randomNum == 2) {
                if (!queue.contains(three)) {
                    queue.add(three);
                }
                numBigShuttlesAdded++;
            }
        }
    }
}
