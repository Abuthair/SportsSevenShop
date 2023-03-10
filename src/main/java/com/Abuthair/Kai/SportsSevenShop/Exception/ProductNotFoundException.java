package com.Abuthair.Kai.SportsSevenShop.Exception;


/**
 * @author abuthair on 10/03/23.
 * 11:34 pm
 * @project SportsSevenShop
 */

public class ProductNotFoundException extends   RuntimeException{
    public ProductNotFoundException() {
    }

    public ProductNotFoundException(String message) {
        super(message);
    }
}
