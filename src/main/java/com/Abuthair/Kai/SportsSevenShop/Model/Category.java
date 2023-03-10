package com.Abuthair.Kai.SportsSevenShop.Model;

/**
 * @author abuthair on 10/03/23.
 * 11:12 pm
 * @project SportsSevenShop
 */
public enum Category {
    CRICKET("Cricket"),

    FOOTBALL("FootBall"),

    SWIMMING("Swimming"),

    TENNIS("Tennis"),

    BATMINTON("Batmintom");
    private String type;

    Category(String type) {
        this.type = type;
    }
}
