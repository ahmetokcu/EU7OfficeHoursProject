package com.cybertek.javaReviews.PracticeDay1;

public abstract class Light {

    protected String location;  // why did I make it protected? : Only inheriting classes should be able to reach the field

    public abstract void giveLight();
}