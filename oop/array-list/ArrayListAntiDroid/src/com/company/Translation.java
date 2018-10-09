package com.company;

public class Translation {

    private String foreignWord;
    private String translationWord;

    public Translation(String foreignWord, String translationWord) {
        this.foreignWord = foreignWord;
        this.translationWord = translationWord;
    }

    public String getForeignWord() {
        return foreignWord;
    }

    public String getTranslationWord() {
        return translationWord;
    }

    public static Translation createTranslation(String foreignWord, String translationWord) {
        return new Translation(foreignWord, translationWord);
    }
}
