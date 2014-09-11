//////////////////////////////
//Tony Nikolov
//09/10/14
//hw02
//Arithmetic Program
//
//  define a class
public class Arithmetic {
    
//  add main method
  public static void main(String[ ] args)   {
      //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;

    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;

    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    
    double taxPercent=0.06;
     
     //total cost of socks=3*2.58=7.74
     double aTotalSockCost$=(int)((nSocks*sockCost$)*100);   
     double totalSockCost$=aTotalSockCost$/100;
     //sales tax of the total cost of socks
     double aTotalTaxSockCost$=(int)((nSocks*sockCost$*taxPercent)*100);
     double totalTaxSockCost$=aTotalTaxSockCost$/100;
     
     //total cost of glass=6*2.29=13.74
     double aTotalGlassCost$=(int)((nGlasses*glassCost$)*100);
     double totalGlassCost$=aTotalGlassCost$/100;
     //sales tax of the total cost of glass
     double aTotalTaxGlassCost$=(int)((nGlasses*glassCost$*taxPercent)*100);
     double totalTaxGlassCost$=aTotalTaxGlassCost$/100;

     //total cost of envelopes=1*3.25=3.25
     double aTotalEnvelopeCost$=(int)((nEnvelopes*envelopeCost$)*100);
     double totalEnvelopeCost$=aTotalEnvelopeCost$/100;
     //sales tax of the total cost of envelopes
     double aTotalTaxEnvelopeCost$=(int)((nEnvelopes*envelopeCost$*taxPercent)*100);
     double totalTaxEnvelopeCost$=aTotalTaxEnvelopeCost$/100;
     
     //total cost of purchases without tax
     double totalCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
     //total sales tax
     double aTotalTax$=(int)((totalTaxSockCost$+totalTaxGlassCost$+totalTaxEnvelopeCost$)*100);
     double totalTax$=(aTotalTax$)/100;
     //total cost of purchases with tax
     double aTotalCostAfterTax$=(int)((totalCostBeforeTax$+totalTax$)*100);
     double totalCostAfterTax$=(aTotalCostAfterTax$)/100;
    
    //print of all sock data
    System.out.println("Socks");
    System.out.println("Sock Pairs Quantity:"+nSocks);
    System.out.println("Cost Per Pair of Socks:"+sockCost$);
    System.out.println("Cost of Socks Bought:"+totalSockCost$);
    System.out.println("Total Sock Sales Tax:"+totalTaxSockCost$);
    
    System.out.println("");
    
    System.out.println("Glasses");
    System.out.println("Glasses Quantity:"+nGlasses);
    System.out.println("Cost Per Glass:"+glassCost$);
    System.out.println("Cost of Glasses Bought:"+totalGlassCost$);
    System.out.println("Total Glasses Sales Tax:"+totalTaxGlassCost$);
    
    System.out.println("");
    
    System.out.println("Envelopes");
    System.out.println("Envelope Quantity:"+nEnvelopes);
    System.out.println("Cost Per Envelope:"+envelopeCost$);
    System.out.println("Cost of Envelopes Bought:"+totalEnvelopeCost$);
    System.out.println("Total Envelope Sales Tax:"+totalTaxEnvelopeCost$);
    
    System.out.println("");
    
    System.out.println("Total Cost Before Tax:"+totalCostBeforeTax$);
    System.out.println("Total Sales Tax:"+totalTax$);
    System.out.println("Cost After Tax:"+totalCostAfterTax$);
  } //end of main method
} //end of class