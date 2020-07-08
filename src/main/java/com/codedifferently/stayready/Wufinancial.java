package com.codedifferently.stayready;

public class Wufinancial {
   public Double money = 0.0;


    public Double dollarToEuro(Double money) //Converts a dollar to Euro
    {
        final Double rate = 0.94;  
        
        return money *rate;
    }

    public Double euroToDollar(Double cash) //Converts a euro to a Dollar
    {
        final Double rate = 0.94; 
        return cash/rate;
    }

    public Double euroToPound(Double cash) //Converts a euro to a pound
    {
        final Double rate = 0.82;
        Double conversion =euroToDollar(cash);

        return conversion *rate;
    }

    public Double PoundToDollar(Double cash)
    {
        final Double rate = 0.82;
        return cash/rate;
    }
    public Double poundToRupee(Double cash) //Converts a pound to a rupee
    {
        final Double rate = 68.32;
        Double conversion = PoundToDollar(cash);
        return conversion * rate ;
    }
    public Double rupeeToDollar(Double cash)
    {
        final Double rate =68.32;
        return cash/rate;
    }
    public Double rupeetoCanadianDollar(Double cash) //Converts a rupee to a canadian dollar
    {
        final Double rate = 1.32;
        Double conversion = rupeeToDollar(cash);
        return conversion *rate;
    }
    public Double CanadianDollartoDollar(Double cash)
    {
        final Double rate = 1.32;
        return cash/rate;
    }
    public Double canadianDollartoSingaporeDollar(Double cash) //canadian dollar to a Singapore dollar
    {
        final Double rate = 1.43;
        Double conversion = CanadianDollartoDollar(cash);
        
        return conversion *rate; 
    }
    public Double singaporeDollarToDollar(Double cash)
    {
        final Double rate = 1.43;
        return cash/rate;
    }
    public Double singaporeDollarToFranc(Double cash) //Singapore dollar to Franc
    {
        final Double rate = 1.01;
        Double conversion = singaporeDollarToDollar(cash);
        return conversion * rate;
    }
    public Double FrancToDollar(Double cash)
    {
        final Double rate = 1.01;
        return cash/rate;
    }
    public Double franctoRinggit(Double cash) //Franc to Ringgit 
    {
        final Double rate = 4.47; 
        Double conversion = FrancToDollar(cash);
        return conversion *rate;
    }

    public Double ringgittoDollar(Double cash)
    {
        final Double rate = 4.47;
        return cash/rate;
    }
    public Double ringgitToYen(Double cash) //Ringgit To Yen
    {
        final Double rate =115.84;
        Double conversion = ringgittoDollar(cash);
        return conversion * rate;
    }
    public Double yenToDollar(Double cash)
    {
        final Double rate = 115.84;
        return cash/rate;
    }

    public Double yenToYuanRenmibi(Double cash) //Yen to Yuan Renmibi
    {
        final Double rate = 6.92;
        Double conversion =yenToDollar(cash);
        return conversion *rate;
    }


}