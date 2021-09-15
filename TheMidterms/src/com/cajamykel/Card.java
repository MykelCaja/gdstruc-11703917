package com.cajamykel;

import java.util.Objects;

public class Card {
    private int number;
    private String color;

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.number && Objects.equals(color, card.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, color);
    }

    //Constructor:
    public Card(int number, String color) {
        this.number = number;
        this.color = color;
    }

    //Getters and Setters:
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
