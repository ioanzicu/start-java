package com.company;

import java.util.ArrayList;

public class Deck {
    private String deckName;
    private ArrayList<Translation> myTranslation;

    public Deck(String deckName) {
        this.deckName = deckName;
        this.myTranslation = new ArrayList<Translation>();
    }

    // Store
    public boolean addTranslation(Translation translation) {
        if(findTranslation(translation.getForeignWord()) >= 0) {
            System.out.println("Translation is already on file");
            return false;
        }

        myTranslation.add(translation);
        return true;
    }

    // Modify
    public boolean updateTranslation(Translation oldTranslation, Translation newTranslation) {
        int foundPosition = findTranslation(oldTranslation);
        if(foundPosition <0) {
            System.out.println(oldTranslation.getForeignWord() + ", was not found.");
            return false;
        } else if(findTranslation(newTranslation.getTranslationWord()) != -1) {
            System.out.println("Translation with foreign word: " + newTranslation.getTranslationWord() +
                    " already exists. Update was not successful.");
            return false;
        }

        this.myTranslation.set(foundPosition, newTranslation);
        System.out.println(oldTranslation.getForeignWord() + ", was replaced with + " + newTranslation.getForeignWord());
        return true;
    }

    // Remove
    public boolean removeTranslation(Translation translation) {
        int foundPosition = findTranslation(translation);
        if(foundPosition <0) {
            System.out.println(translation.getForeignWord() + ", was not found.");
            return false;
        }

        this.myTranslation.remove(foundPosition);
        System.out.println(translation.getForeignWord() + ", was deleted");
        return true;
    }


    // Find
    private int findTranslation(Translation translation) {
        return this.myTranslation.indexOf(translation);
    }

    private int findTranslation(String originalTranslation) {
        for(int i=0; i<this.myTranslation.size(); i++) {
            Translation translation = this.myTranslation.get(i);
            if(translation.getForeignWord().equals(originalTranslation)) {
                return i;
            }
        }
        return -1;
    }

    // Query
    public String queryTranslation(Translation translation) {
        if(findTranslation(translation) >=0) {
            return translation.getForeignWord();
        }
        return null;
    }

    public Translation queryTranslation(String translation) {
        int position = findTranslation(translation);
        if(position >=0) {
            return this.myTranslation.get(position);
        }

        return null;
    }

    // Print
    public void printTranslations() {
        System.out.println("Translations List");
        for(int i=0; i<this.myTranslation.size(); i++) {
            System.out.println((i+1) + ". " +
                    this.myTranslation.get(i).getForeignWord() + " -> " +
                    this.myTranslation.get(i).getTranslationWord());
        }
    }
}
