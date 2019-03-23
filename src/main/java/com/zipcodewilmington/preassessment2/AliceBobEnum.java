package com.zipcodewilmington.preassessment2;

public enum  AliceBobEnum {

    ALICE("Hey, my name is ALICE!"),
    BOB("Hey, my name is BOB!");

    private  String catchPhrase;

    AliceBobEnum(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase() {
        return this.catchPhrase;
    }

    public boolean isBob() {
        return this.equals(BOB);
    }

    public boolean isAlice() {
        return this.equals(ALICE);
    }
}
