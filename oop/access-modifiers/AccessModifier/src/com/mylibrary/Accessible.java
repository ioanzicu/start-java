package com.mylibrary;

interface Accessible { // private just in this package
    int SOME_CONSTANT = 100; // public
    public void methodA();
    void methodB(); // public
    boolean methodC(); // public
}
