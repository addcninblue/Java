/**
* DigitSum -___-
*/

public class DigitSum {
  public static void main (String args[]) {
    
    int number = 112345; //insert number here
    int count = 1;
    
    /**while(number > 9) {
      number = number / 10;
      count = count + 1;
    }*/
    while (number > 0) {
    	count = count + number % 10;
    	number = number / 10;
	}
    
     System.out.println("The total is " + count);
  }
}
