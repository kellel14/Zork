


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        int roomNum = 0, roomsVisited = 0;
        String direction;
        boolean secretRoom = false, cont = true;


        do {
            switch (roomNum) {
                //start game

                case 0:
                    System.out.println("DO YOU DARE ENTER MY HAUNTED HOUSE TO STEAL MY GOLD!?1?\n " +
                            "Type: (y/n)");
                    direction = userInput.nextLine();
                    if (direction.equalsIgnoreCase("y")) {
                        roomNum = 1;
                    } else if (direction.equalsIgnoreCase("n")) {
                        System.out.println("Wise choice.");
                        roomNum = 9;
                        roomsVisited++;

                    }
                    break;
                //user has now enetered the foyer. proceeds to 1 room
                case 1:
                    System.out.println("A DEAD SCORPION WELCOMES YOU INSIDE!!!\n You have now entered my FOYER!");
                    System.out.println("You are allowed to continue to rooms: \n north2 \n Type: 'n2'");
                    direction = userInput.nextLine();
                    //user inputs continue or exit
                    if (direction.equalsIgnoreCase("n2")) {
                        roomNum = 2;
                        roomsVisited++;
                    } else if (direction.equalsIgnoreCase("n")) {
                        System.out.println("Don't Come Back!!");
                        roomNum = 9;
                        roomsVisited++;
                    }
                    break;
                //user has not entered from room. proceed options: library, kitchen, foyer
                case 2:
                    System.out.println("You have now entered the front room...");
                    System.out.println("Do you see the piano over in the corner?\n" +
                            "DON'T TOUCH IT!!!");
                    System.out.println("To continue, your next room options are:\nType: w3, e4, s1");
                    direction = userInput.nextLine();
                    if (direction.equalsIgnoreCase("w3")) {
                        roomNum = 3;
                        roomsVisited++;
                    } else if (direction.equalsIgnoreCase("e4")) {
                        roomNum = 4;
                        roomsVisited++;
                    } else if (direction.equalsIgnoreCase("s1")) {
                        roomNum = 1;
                        roomsVisited++;
                    }
                    break;

                case 3:
                    System.out.println("Welcome to the Library");
                    System.out.println("What do you see? Dust and cobb webs?\n" + "No those are spider webs and" +
                            " " + "the dust are crumbs after they have eaten and they are always hungry!");
                    System.out.println("Now your next room optios are:\n Type: n5, e2");
                    direction = userInput.nextLine();
                    if (direction.equalsIgnoreCase("n5")) {
                        roomNum = 5;
                        roomsVisited++;
                    } else if (direction.equalsIgnoreCase("e2")) {
                        roomNum = 2;
                        roomsVisited++;
                    }
                    break;
                case 4:
                    System.out.println("This is the kitchen...where my wife passed.\n I never went back to the kitchen," +
                            " " + "then all these darn bats moved in!!!!!");
                    System.out.println("Even I don't like bats and I'm a ghost! Let's move to the nex room.\n Type: n7, w2");
                    direction = userInput.nextLine();
                    if (direction.equalsIgnoreCase("n7")) {
                        roomNum = 7;
                        roomsVisited++;
                    } else if (direction.equalsIgnoreCase("w2")) {
                        roomNum = 2;
                        roomsVisited++;
                    }
                    break;

                case 5:
                    System.out.println("Dining Room");
                    System.out.println("Hey while you're in here clean up, that dusty box, it's filthy!!" +
                    "I don't know why my wife has not cleaned it.");
                    direction = userInput.nextLine();
                    if (direction.equalsIgnoreCase("s3")) {
                        roomNum = 3;
                        roomsVisited++;
                        System.out.println("I'll see you real soon.");
                    }
                    break;
                case 6:
                    System.out.println("Welcome to my 'This is not a vault room'...room");
                    System.out.println("Now you are getting to close to my GOLD!! MY three walking skeletons will capture you!");
                    System.out.println("Escape options: e7, cont");
                    int i = rand.nextInt(10);
                    //random generates numbers 1-10. e8 is cont to have a random chance at finding room.

                    if (secretRoom == true) {
                        System.out.println("You can escape now or continue to try to find the gold.\n Type: e7, search (to look for the secret room)");
                        direction = userInput.nextLine();
                        if (direction.equalsIgnoreCase("e7")) {
                            roomNum = 7;
                            roomsVisited++;
                            System.out.println("You are leaving the vault.");
                        } else if (direction.equalsIgnoreCase("search")) {
                            roomNum = 8;
                            roomsVisited++;
                        }
                        //the user finds the secret room with gold

                    }
                    else if (i == 7) {
                        System.out.println("A light flickers exposing the secret room.");
                        System.out.println("Gosh darn, I knew I should have replaced that bulb before I died!!!\n Type: e7  ");
                        secretRoom = true;
                        direction = userInput.nextLine();
                        if (direction.equalsIgnoreCase("e7")) {
                            roomNum = 7;
                            roomsVisited++;
                        } else if (direction.equalsIgnoreCase("cont")) {
                            roomNum = 8;
                            roomsVisited++;
                        }
                        //user does not find room with gold
                    }
                    else {
                        direction = userInput.nextLine();
                        if (direction.equalsIgnoreCase("e7")) {
                            roomNum = 7;
                            roomsVisited++;
                            System.out.println("You are leaving the vault.");
                        }

                    }



                    break;
                case 7:
                    System.out.println("Well well it looks like you have stumbled into my parlor...oh no my treasure chest" + " "
                            + "was left open with all of my valuables.");
                    System.out.println("Ha! Nothing was there. Now leave my house at once!\n" +
                            "Type: w6, s4");
                    direction = userInput.nextLine();
                    if (direction.equalsIgnoreCase("w6")) {
                        roomNum = 6;
                        roomsVisited++;
                    } else if (direction.equalsIgnoreCase("s4")) {
                        roomNum = 4;
                        roomsVisited++;
                    }
                    break;
                case 8:
//                    System.out.println("");
                    System.out.println("Now that you have taken as much gold as you can, escape, but beware a ghost" +
                            " " + "might follow.");
                    System.out.println("Escape!\n Type: w6 or stay take more gold.");
                    direction = userInput.next();
                    System.out.println("You thief!! I will feed you to my spiders!!");
                    if (direction.equalsIgnoreCase("w6")) {
                        roomNum = 6;
                        roomsVisited++;
//                        System.out.println("");
                    } else {
                        System.out.println("Stay too long and the ghost will get you!" + "\n Type: e9");
                        roomNum = 9;
                        roomsVisited++;
                    }
                    break;

                case 9:
                    System.out.println("The Myster machine is at the end of the driveway, the gang is waiting for you.");

                    int a = rand.nextInt(6);
                    if (a == 2) {
                        System.out.println("Great job! After all your hard work your cut is 5% of the loot.");
                        System.out.println("Later, you recall there was a portal gun in the secret room...\n" +
                                "the portal gun is the bag with loot with your 5%... ");
                    }
                    else {
                        System.out.println("Great job if you got the loop! After all your hard work your cut is 5% of the loot.");
                    }
                    System.out.println("Game End.");
                System.out.println("You visited " + roomsVisited + "\trooms.");
                cont = false;
            }


        }while (cont);
    }
}

