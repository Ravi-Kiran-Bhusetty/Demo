package datasnumberscurrencies;

import java.util.Currency;

public class CurrencyEx {

	public static void main(String[] args) {
		  	Currency c1 = Currency.getInstance("AUD"); //Australian Dollar 
	        Currency c2 = Currency.getInstance("INR");  //Japan Yen 
	        Currency c3 = Currency.getInstance("USD");  //Japan Yen 
	  
	        // Use of getCurrencyCode() method 
	        String cCode1 = c1.getCurrencyCode(); 
	        String cCode2 = c2.getCurrencyCode(); 
	        System.out.println("Australian Dollar code : " + cCode1); 
	        System.out.println("Indian Rupee code : " + cCode2); 
	        System.out.println(""); 
	  
	        // Use of getDefaultFractionDigits() method 
	        int D1 = c1.getDefaultFractionDigits(); 
	        System.out.println("AUD Fraction digits : " + D1); 
	  
	        int D2 = c2.getDefaultFractionDigits(); 
	        System.out.println("Indian fraction digits : " + D2); 
	        System.out.println(""); 
	  
	        // Use of getDisplayName() method 
	        System.out.println("AUD Display : "+c1.getDisplayName()); 
	        System.out.println("INR Display : "+c2.getSymbol()); 
	        System.out.println(""); 
	  
	        // Use of getSymbol() method 
	        System.out.println("India Symbol : "+c2.getSymbol()); 
	        System.out.println("USD Symbol : "+c3.getSymbol()); 
	}

}
