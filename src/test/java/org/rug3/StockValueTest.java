package org.rug3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockValueTest {

    // kwota - cena za 1 jednostkę przez ilosc akcji
    @Test
    public void testMultiplicationStock(){
        int numberOfShares = 1000;
        double unitPrice = 2.5;

        StockValue stockValue = new StockValue();
        double result = stockValue.assetTotalValue(numberOfShares, unitPrice);
        assertEquals(2500, result, 10);
    }
        

}