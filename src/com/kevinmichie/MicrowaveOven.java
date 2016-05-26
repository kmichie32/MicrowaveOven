package com.kevinmichie;

public class MicrowaveOven {
    int power;
    int CookingTime;

    public int getCookingTime() {
        return CookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.CookingTime = cookingTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public MicrowaveOven(){
        power = 10;
        CookingTime = 0;
    }

    public void start(){
        System.out.println("Cooking for "+
        getCookingTime()+" seconds at power level "+
        getPower());
    }

    public static void main(String[] args) {
	    MicrowaveOven microwaveOven = new MicrowaveOven();
        microwaveOven.setCookingTime(30);
        microwaveOven.setPower(5);
        microwaveOven.start();
        System.out.println("Expected: Cooking for 30 seconds at power level 5");
    }
}
