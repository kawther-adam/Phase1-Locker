package Locker;

import java.util.Scanner;





public class WelcomeClass {

    public static void main(String[] args) {
        int change=0, choice=0;
        Scanner sc =new Scanner(System.in);

        System.out.println("\t**********************\n");
        System.out.println("Welcome to Lockers Ltd");
        System.out.println("\nDeveloper: Kawther W\n");
        System.out.println("Please see below options");


        while(true)
        {
            System.out.println("Please choose one of the following options :");
            System.out.println("1. List Current Files");
            System.out.println("2. Menu Options");
            System.out.println("3. Close Application");
            try{
                change = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Null Exception occurred");
            }

            switch(change)
            {
                case 1: //List function feature to list all files in ascending order.
                    MenuOptions.listFiles();
                    break;
                case 2:

                    System.out.println("Please choose one of the following options :");
                    System.out.println("1. Add a File");
                    System.out.println("2. Delete a File");
                    System.out.println("3. Search for a File");
                    try{
                        choice = sc.nextInt();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Null Exception occurred");
                    }
                    switch(choice)
                    {
                        case 1:
                            //Creation of a file takes place
                            System.out.println("Name file to be created: ");
                            String fileCreate = sc.next();

                            // Calling the function to create the file
                            MenuOptions.createFile(fileCreate);
                            break;

                        case 2:
                            //deletion of a file takes place
                            System.out.print("Name the file to be deleted: ");
                            String fileDelete = sc.next();

                            // Calling the function to delete the file
                            MenuOptions.deleteFile(fileDelete);
                            break;
                        case 3:
                            //Search for a file takes place
                            System.out.println("Input the name of a file to be searched: ");
                            String fileSearch = sc.next();

                            // Calling the function to search the file
                            MenuOptions.searchFile(fileSearch);
                            break;

                        default:
                            //In the case of unprecedented input execute this
                            System.out.println("\n Invalid Input, Please try again\n");
                            break;
                    }

                    break;
                case 3:

                    //Exiting the application
                    sc.close();
                    System.out.println("\n Thank You Good bye...");
                    System.exit(1);
                    break;

                default:
                    //In the case of unprecedented input execute this
                    System.out.println("\n\n Wrong! Invalid Input, Please Pick Options  1-3\n");
                    break;

            }
        }

    }

}
