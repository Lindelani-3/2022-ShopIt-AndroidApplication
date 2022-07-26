package com.developerdiindy.shopit.logic.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingListTest {

    ShoppingList myShoppingList;

    @BeforeEach
    public void setup(){
        myShoppingList = new ShoppingList("No Name");
    }

    @Test
    public void getID() {
        myShoppingList.setID(001);
        assertEquals(001, myShoppingList.getID());
    }

    @Test
    public void setID() {
    }

    @Test
    public void getName() {
    }

    @org.junit.jupiter.api.Test
    public void setName() {
    }
}