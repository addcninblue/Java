/**
* SumofTens -___-
* Addison Chan
*/

public class HelloWorld {
  public static void main (String args[]) {
    
    int number = 112045; //insert number here
    int numberbackup = number;
    int count = 1;
    
    while(number > 9) {
      number = number / 10;
      count = count + 1;
      //determine number of digits
    }
    
    int countbackup = count;
    
    while (countbackup > 0) {
    	int some = numberbackup % 10;
    	numberbackup = numberbackup / 10;
        int exponent = count-countbackup;
      	int exit = (int) Math.pow(10, exponent);
      	System.out.print(" + " + exit*some);
      	countbackup = countbackup - 1;
	}
  }
}
