/**
* Addison Chan
*/

public class SumofTens {
  public static void main (String args[]) {
    
    int number = 0; //insert number here
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
      	System.out.print(exit*some);
      	if (countbackup > 1){
      	    System.out.print(" + ");
      	}
      	countbackup = countbackup - 1;
	}
	System.out.println();
  }
}
