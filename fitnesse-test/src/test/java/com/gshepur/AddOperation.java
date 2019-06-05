package com.gshepur;

public class AddOperation {

    private int numberA;

    private int numberB;

    private int result;

    public AddOperation(){

    }
    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public int result(){
        return numberA + numberB;
    }
}
