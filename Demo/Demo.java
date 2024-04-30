class Demo {
    public static void main(String[] args){
    System.out.println("If-Else loop");
    System.out.println("On Monday it is not raining");
    goingToMarket(false);
    System.out.println("On Tuesday it is raining.");
    goingToMarket(true);
}

public static void goingToMarket(boolean raining){
    System.out.println("I am going to market.");
    if(raining){
        System.out.println("Carry an umbrella");
    }
    System.out.println("Buy fruits and veggies");
    System.out.println("Return Home.");
}
}