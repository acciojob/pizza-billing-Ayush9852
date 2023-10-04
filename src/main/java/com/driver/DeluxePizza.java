package com.driver;

public class DeluxePizza extends Pizza {
    private String bill;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
}
