package com.codedifferently;

import com.codedifferently.stayready.Wufinancial;

import org.junit.Assert;
import org.junit.Test;



public class WufinancialTest {

    @Test
    public void dollarToEuro()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 5.0;
        Double cash = wufinancial.money;
        //When 
        Double actual = wufinancial.dollarToEuro(cash);
        Double expected = 4.7;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void euroToDollarTest()
    {
         //Given 
         Wufinancial wufinancial = new Wufinancial();
         wufinancial.money = 94.0;
         Double cash = wufinancial.money;
         //When 
         Double actual = wufinancial.euroToDollar(cash);
         Double expected = 100.0;
         //Then
         Assert.assertEquals(expected, actual);
    }
    @Test
    public void euroToPoundTest()
    {
         //Given 
         Wufinancial wufinancial = new Wufinancial();
         wufinancial.money = 94.0;
         Double cash = wufinancial.money;
         //When 
         Double actual = wufinancial.euroToPound(cash);
         Double expected = 82.0;
         //Then
         Assert.assertEquals(expected, actual);
        
    }
@Test
    public void poundToRupeeTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 82.0;
        Double cash = wufinancial.money;
        //When 
        Double actual = wufinancial.poundToRupee(cash);
        Double expected = 6832.0;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void rupetoCanadianDollarTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 6832.0;
        Double cash = wufinancial.money;
        //When 
        Double actual = wufinancial.rupeetoCanadianDollar(cash);
        Double expected = 132.0;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void canadianDollartoSinaporeDollarTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 132.0;
        Double cash = wufinancial.money;
        //When 
        Double actual = wufinancial.euroToDollar(cash);
        Double expected = 143.0;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void SignaporeDollarstoFrancTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 143.0;
        Double cash = wufinancial.money;
        //When 
        Double actual = wufinancial.euroToDollar(cash);
        Double expected = 101.0;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void franctoRinggitTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 101.0;
        Double cash = wufinancial.money;
        //When 
        Double actual = wufinancial.euroToDollar(cash);
        Double expected = 447.0;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void ringgitToYenTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 447.0;
        Double cash = wufinancial.money;
        //When 
        Double actual = wufinancial.euroToDollar(cash);
        Double expected = 11584.0;
        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void yenToYuanRenmibiTest()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money = 11584.0;
          Double cash = wufinancial.money;
          //When 
          Double actual = wufinancial.euroToDollar(cash);
          Double expected = 692.0;
          //Then
          Assert.assertEquals(expected, actual);
    }
    
}