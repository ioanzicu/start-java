package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> messagesList = new ArrayList<String>();
    ;

    public static void main(String[] args) {

        boolean quit = false;
        int choise = 0;
        printOptions();

        while (!quit) {

            choise = inputValidator();
            scanner.nextLine();

            switch (choise) {
                case 0:
                    sayGoodbuy();
                    quit = true;
                    break;
                case 1:
                    printOptions();
                    break;
                case 2:
                    printMessagesList();
                    break;
                case 3:
                    addMessage();
                    break;
                case 4:
                    queryMessage();
                    break;
                case 5:
                    modifyMessage();
                    break;
                case 6:
                    removeMessage();
                    break;
                default:
                    invalidOption(choise);
                    break;
            }
        }
    }

    // Options
    private static void printOptions() {
        System.out.println("Enter option: ");
        System.out.println(" 0 - Quit" +
                "\n 1 - Print all options" +
                "\n 2 - Print all messages" +
                "\n 3 - Add new message" +
                "\n 4 - Query message" +
                "\n 5 - Modify message" +
                "\n 6 - Remove message");
    }

    // Add
    private static void addMessage() {

        System.out.println("Enter new message: ");
        String message = scanner.nextLine();
        messagesList.add(message);
        System.out.println("New message: " + message + " was added.");

    }

    // Query
    private static void queryMessage() {

        String searchElement = scanner.nextLine();
        int position = findMessage(searchElement);

        if(position < 0)
            System.out.println("Cannot find message");
        else
            System.out.println("Message was found: " + messagesList.get(position));
    }

    // Modify
    private static void modifyMessage() {

        System.out.println("Enter current message");
        String currentMessage = scanner.nextLine();
        int position = findMessage(currentMessage);

        System.out.println("Enter new message");
        String newMessage = scanner.nextLine();

        if(position < 0)
            System.out.println("Cannot find message");
        else {
            messagesList.set(position, newMessage);
            System.out.println("Old message: " + currentMessage + ". New message: " + newMessage);
        }
    }

    // Remove
    private static void removeMessage() {

        String searchElement = scanner.nextLine();
        int position = findMessage(searchElement);

        if(position < 0) {
            System.out.println("Cannot find message");
        } else {
            System.out.println("Message was deleted: " + messagesList.remove(position));
        }
    }

    // Find
    private static int findMessage(String searchElement) {
        return messagesList.indexOf(searchElement);
    }

    // Print
    private static void printMessagesList() {

        System.out.println("You have " + getMessagesList().size() + " item(s) in your messages list.");

        for (int i = 0; i < getMessagesList().size(); i++) {
            System.out.println((i + 1) + ". " + getMessagesList().get(i));
        }
    }

    // Get
    private static ArrayList<String> getMessagesList() {
        return messagesList;
    }

    // Goodbuy
    private static void sayGoodbuy() {
        System.out.println("Goodbuy!!!...");
    }

    // Invalid option
    private static void invalidOption(int option) {
        System.out.println("Option " + option + " is invalid. Try again...");
    }

    // Integer Input Validator
    private static int inputValidator() {

        boolean isAnInt = scanner.hasNextInt();

        while (!isAnInt) {
            System.out.println("Invalid Number");
            scanner.nextLine();
            isAnInt = scanner.hasNextInt();
        }

        int number = scanner.nextInt();

        return number;
    }
}
