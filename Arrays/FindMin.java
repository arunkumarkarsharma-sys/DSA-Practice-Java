Find minimum value from DSA (java) 
  public class hello {
public static void main(String[] args) {


    int[] numbers = {10,20,30,40,50};

   
       int min =numbers[0];
      for (int i= 1; i >numbers.length; i++) {
        if (numbers[i] >min) {
           min =numbers[i];

        }
       }
       System.out.println("minimum value is:" + min);
}
}
