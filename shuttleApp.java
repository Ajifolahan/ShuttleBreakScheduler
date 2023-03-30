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
            Queue<shuttle> queue = new PriorityQueue<shuttle>();
        System.out.println("What shuttle are you driving? \n1.Red \n2.Green \n3.Orange \n4.Blue \n5.Yellow \n6.Purple");
        input.nextLine(); // clear input buffer
        String driverinpt = input.nextLine();
            
            if (driverinpt.equalsIgnoreCase("Red")) {
                queue.add(red);
                    int randomNumBig = (int) (Math.random() * 2); // generate a random number between 0 and 1
                            if (randomNumBig == 0) {
                                queue.add(green);
                            } else if (randomNumBig == 1) {
                                queue.add(orange);
                            } 

                        // add one small shuttle to the queue
                        int randomNumSmall = (int) (Math.random() * 3); // generate a random number between 0 and 2
                        if (randomNumSmall== 0) {
                            queue.add(blue);
                        } else if (randomNumSmall == 1) {
                            queue.add(yellow);
                        } else if (randomNumSmall == 2) {
                            queue.add(purple);
                        }
            } else if (driverinpt.equalsIgnoreCase("Green")) {
                queue.add(green);
                        int randomNumBig = (int) (Math.random() * 2); // generate a random number between 0 and 1
                        if (randomNumBig == 0) {
                            queue.add(red);
                        } else if (randomNumBig == 1) {
                            queue.add(orange);
                        } 

                    // add one small shuttle to the queue
                    int randomNumSmall = (int) (Math.random() * 3); // generate a random number between 0 and 2
                    if (randomNumSmall== 0) {
                        queue.add(blue);
                    } else if (randomNumSmall == 1) {
                        queue.add(yellow);
                    } else if (randomNumSmall == 2) {
                        queue.add(purple);
                    }
            } else if (driverinpt.equalsIgnoreCase("Orange")) {
                queue.add(orange);
                        int randomNumBig = (int) (Math.random() * 2); // generate a random number between 0 and 1
                        if (randomNumBig == 0) {
                            queue.add(green);
                        } else if (randomNumBig == 1) {
                            queue.add(red);
                        } 

                    // add one small shuttle to the queue
                    int randomNumSmall = (int) (Math.random() * 3); // generate a random number between 0 and 2
                    if (randomNumSmall== 0) {
                        queue.add(blue);
                    } else if (randomNumSmall == 1) {
                        queue.add(yellow);
                    } else if (randomNumSmall == 2) {
                        queue.add(purple);
                    }
            } else if (driverinpt.equalsIgnoreCase("Blue")) {
                queue.add(blue);
                        int numBigShuttlesAdded = 0;
                        while (numBigShuttlesAdded < 2) {
                            int randomNum = (int) (Math.random() * 3); // generate a random number between 0 and 2
                            if (randomNum == 0) {
                                queue.add(red);
                                numBigShuttlesAdded++;
                            } else if (randomNum == 1) {
                                queue.add(green);
                                numBigShuttlesAdded++;
                            } else if (randomNum == 2) {
                                queue.add(orange);
                                numBigShuttlesAdded++;
                            }
                        }
            } else if (driverinpt.equalsIgnoreCase("Yellow")) {
                queue.add(yellow);
                int numBigShuttlesAdded = 0;
                while (numBigShuttlesAdded < 2) {
                    int randomNum = (int) (Math.random() * 3); // generate a random number between 0 and 2
                    if (randomNum == 0) {
                        queue.add(red);
                        numBigShuttlesAdded++;
                    } else if (randomNum == 1) {
                        queue.add(green);
                        numBigShuttlesAdded++;
                    } else if (randomNum == 2) {
                        queue.add(orange);
                        numBigShuttlesAdded++;
                    }
                }
            } else if (driverinpt.equalsIgnoreCase("Purple")) {
                queue.add(purple);
                int numBigShuttlesAdded = 0;
                while (numBigShuttlesAdded < 2) {
                    int randomNum = (int) (Math.random() * 3); // generate a random number between 0 and 2
                    if (randomNum == 0) {
                        queue.add(red);
                        numBigShuttlesAdded++;
                    } else if (randomNum == 1) {
                        queue.add(green);
                        numBigShuttlesAdded++;
                    } else if (randomNum == 2) {
                        queue.add(orange);
                        numBigShuttlesAdded++;
                    }
                }
            }
            System.out.println("The following buses are in the queue right now");
            System.out.println(queue);
        
        }
    else {
        System.out.println("Please enter '1' or '2'");
    }
    } 
}
