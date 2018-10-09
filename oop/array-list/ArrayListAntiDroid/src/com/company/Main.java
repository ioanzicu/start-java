package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Deck deck = new Deck("Deutsch");

    public static void main(String[] args) {

        boolean quit = false;
        openDeck();
        printActions();

        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nClose the deck...");
                    quit = true;
                    break;
                case 1:
                    deck.printTranslations();
                    break;
                case 2:
                    addNewTranslation();
                    break;
                case 3:
                    updateTranslation();
                    break;
                case 4:
                    removeTranslation();
                    break;
                case 5:
                    queryTranslation();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    // Add
    public static void addNewTranslation() {
        System.out.println("New translation. Enter foreign word/expression: ");
        String foreignWord = scanner.nextLine();
        System.out.println("Enter translation: ");
        String translation = scanner.nextLine();
        Translation newTranslation = Translation.createTranslation(foreignWord, translation);
        if(deck.addTranslation(newTranslation)) {
            System.out.println("New translation was added: foreign = " + foreignWord + ", translation = " + translation);
        } else {
            System.out.println("Cannot add, " + foreignWord + " already on file");
        }
    }

    // Modify
    private static void updateTranslation() {
        System.out.println("Enter existing foreign word/expression");
        String foreignWord = scanner.nextLine();
        Translation existingTranslationRecord = deck.queryTranslation(foreignWord);
        if(existingTranslationRecord == null) {
            System.out.println("Translation not found.");
            return;
        }
        System.out.println("Enter new foreign word/expression: ");
        String newForeignWord = scanner.nextLine();
        System.out.println("Enter new translation: ");
        String translation = scanner.nextLine();
        Translation newTranslation = Translation.createTranslation(newForeignWord, translation);
        if(deck.updateTranslation(existingTranslationRecord, newTranslation)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record");
        }
    }

    // Remove
    private static void removeTranslation() {
        System.out.println("Enter existing foreign word");
        String foreignWord = scanner.nextLine();
        Translation existingTranslationRecord = deck.queryTranslation(foreignWord);
        if (existingTranslationRecord == null) {
            System.out.println("Translation not found.");
            return;
        }
        if(deck.removeTranslation(existingTranslationRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    // Query
    private static void queryTranslation() {
        System.out.println("Enter existing foreign word");
        String foreignWord = scanner.nextLine();
        Translation existingTranslationRecord = deck.queryTranslation(foreignWord);
        if (existingTranslationRecord == null) {
            System.out.println("Translation not found.");
            return;
        }
        System.out.println("Foreign: " + existingTranslationRecord.getForeignWord() + " Transaltion is: " + existingTranslationRecord.getTranslationWord());
    }

    // Open Deck
    private static void openDeck() { System.out.println("Open the Deck..."); }

    // Show
    private static void printActions() {
        System.out.printf("\nAvailable actions:\npres");
        System.out.printf("0 - to shutdown\n" +
                "1 - to print transaltions\n" +
                "2 - to add a new translation\n" +
                "3 - to update existing translation\n" +
                "4 - to remove an existing translation\n" +
                "5 - query if an existing translation exists\n" +
                "6 - to print a list of available actions.");
        System.out.printf("Choose your action:  ");
    }
}
