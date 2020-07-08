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
        wufinancial.money = 10.0;
        Double cash = wufinancial.money;
        //When 
        Double actual = wufinancial.dollarToEuro(cash);
        Double expected = 9.4;
        //Then
        Assert.assertEquals(expected, actual, 0.001);
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
         Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void euroToPoundTest()
    {
         //Given 
         Wufinancial wufinancial = new Wufinancial();
         wufinancial.money = 94.0;
         Double cash = wufinancial.money;
         Double delta = 0.001;
         //When 
         Double actual = wufinancial.euroToPound(cash);
         Double expected = 82.0;
         //Then
         Assert.assertEquals(expected, actual, delta);
        
    }
    @Test
    public void poundToDollar()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money = 82.0;
          Double cash = wufinancial.money;
          Double delta = 0.001;
          //When 
          Double actual = wufinancial.PoundToDollar(cash);
          Double expected = 100.0;
          //Then
          Assert.assertEquals(expected, actual, delta);

    }
@Test
    public void poundToRupeeTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 82.0;
        Double cash = wufinancial.money;
        Double delta = 0.001;
        //When 
        Double actual = wufinancial.poundToRupee(cash);
        Double expected = 6832.0;
        //Then
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void rupetoCanadianDollarTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 6832.0;
        Double cash = wufinancial.money;
        Double delta = 0.001;
        //When 
        Double actual = wufinancial.rupeetoCanadianDollar(cash);
        Double expected = 132.0;
        //Then
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void rupueeToDollarTest()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money =6832.0;
          Double cash = wufinancial.money;
          Double delta = 0.001;
          //When 
          Double actual = wufinancial.rupeeToDollar(cash);
          Double expected = 100.0;
          //Then
          Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void canadianDollartoSinaporeDollarTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 132.0;
        Double cash = wufinancial.money;
        Double delta = 0.001;
        //When 
        Double actual = wufinancial.canadianDollartoSingaporeDollar(cash);
        Double expected = 143.0;
        //Then
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void candianDollartoDollarTest()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money = 132.0;
          Double cash = wufinancial.money;
          Double delta = 0.001;
          //When 
          Double actual = wufinancial.CanadianDollartoDollar(cash);
          Double expected = 100.0;
          //Then
          Assert.assertEquals(expected, actual, delta);
        
    }
    @Test 
    public void SingaporeDollarsToDollarsTest()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money = 143.0;
          Double cash = wufinancial.money;
          Double delta = 0.001;
          //When 
          Double actual = wufinancial.singaporeDollarToDollar(cash);
          Double expected = 100.0;
          //Then
          Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void SignaporeDollarstoFrancTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 143.0;
        Double cash = wufinancial.money;
        Double delta = 0.001;
        //When 
        Double actual = wufinancial.singaporeDollarToFranc(cash);
        Double expected = 101.0;
        //Then
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void fracToDollarTest()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money = 101.0;
          Double cash = wufinancial.money;
          Double delta = 0.001;
          //When 
          Double actual = wufinancial.FrancToDollar(cash);
          Double expected = 100.0;
          //Then
          Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void franctoRinggitTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 101.0;
        Double cash = wufinancial.money;
        Double delta = 0.001;
        //When 
        Double actual = wufinancial.franctoRinggit(cash);
        Double expected = 447.0;
        //Then
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void ringittToDollarsTest()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money = 447.0;
          Double cash = wufinancial.money;
          Double delta = 0.001;
          //When 
          Double actual = wufinancial.ringgittoDollar(cash);
          Double expected = 100.0;
          //Then
          Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void ringgitToYenTest()
    {
        //Given 
        Wufinancial wufinancial = new Wufinancial();
        wufinancial.money = 447.0;
        Double cash = wufinancial.money;
        Double delta = 0.001;
        //When 
        Double actual = wufinancial.ringgitToYen(cash);
        Double expected = 11584.0;
        //Then
        Assert.assertEquals(expected, actual, delta);

    }
    @Test 
    public void YenToDollarsTest()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money = 11584.00;
          Double cash = wufinancial.money;
          Double delta = 0.001;
          //When 
          Double actual = wufinancial.yenToDollar(cash);
          Double expected = 100.0;
          //Then
          Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void yenToYuanRenmibiTest()
    {
          //Given 
          Wufinancial wufinancial = new Wufinancial();
          wufinancial.money = 11584.0;
          Double cash = wufinancial.money;
          Double delta = 0.001;
          //When 
          Double actual = wufinancial.yenToYuanRenmibi(cash);
          Double expected = 692.0;
          //Then
          Assert.assertEquals(expected, actual, delta);
    }

}