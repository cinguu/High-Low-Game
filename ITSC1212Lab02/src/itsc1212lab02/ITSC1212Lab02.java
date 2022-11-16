package itsc1212lab02;

/**
 *
 * @author Cindy Nguyen
 * ITSC1212-101 & 102, Fall 2022 
 * @version 1
 * @since 2022-09-07
 * Lab 02 - Variables & Mathematical Expressions
 */
public class ITSC1212Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Part A 
//        short x = 0;
//        short y = 2000;
//        int z = 100000;
//        //System.out.println(x + y + z);
//        //It has to be an interger because a short wouldn't be able to contain all the data.
//        char a = 'a';
//        char b = 'b';
//        System.out.println(a + b);
//        // The value printed is 195. This is because each char is assciated with a numerical value in the Unicode. 
//        //a has a Unicode value of 97 and b is 98, thus 195.
//        boolean boo = true;
//        System.out.println(x < z);
//        System.out.println(y > z);
//        System.out.println(z < a);
//        
       //Part B
//       int ex = (int) 4.9;
//       System.out.println(ex);
//       // It printed out 4 for both 4.1 and 4.9 because it was casted as an int. Also, java doesn't round.
//       double x = 8.8;
//       double y = 2.2;
//       
//       System.out.println(x / 7);
//       System.out.println(x/ (int) y);
//       // y becomes 2
//       System.out.println((int) x / y);
//       // x becomes 8
//       System.out.println((int) (x/ y));
//       // the result of x/y becomes an int
//        double cost = 10.10;
//        double paid = 12.33;
//        double change = paid - cost;
//        System.out.println("The change owed is: " + change );
//        System.out.println((double)((int)(change * 100)) / (100));
//     
       //Part C
//       int totalDays = 49;
//       int weeks = totalDays / 7;
//       int remainderDays = totalDays % 7;
//       System.out.println(totalDays + " days is " + weeks + " weeks and " + remainderDays + " days.");
//       // Using a varible less that 7 will only give days, while a multiple of 7 will give weeks strictly.
       int totalDays = 11112;
       int years = totalDays / 365;
       int weeks = (totalDays % 365)/7;
       int remainderDays = (totalDays % 365) % 7;
       System.out.println(totalDays + " days is " + years + " years "+ weeks + " weeks and " + remainderDays + " days.");
               
    }
    
}
