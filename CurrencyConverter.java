public class CurrencyConverter {

    public static void main(String[] args) {

    	double cadvalue, usdvalue, eurvalue, usd, eur;
    		
    		cadvalue = 5;
    		usdvalue = 0.75;
    		eurvalue = 0.68;

    		usd = cadvalue * usdvalue;
    		eur = cadvalue * eurvalue;

		System.out.println("\nThe initial value is " + cadvalue);
        System.out.println("\n" + cadvalue + " CAD is equal to " + usd + "USD");
        System.out.println("\n" + cadvalue + " CAD is equal to " + eur + "EURO");
    }

}