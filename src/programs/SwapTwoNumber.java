package programs;
//How to swap two numbers without using a third variable
public class SwapTwoNumber {

   public void swapTwoNumber(int a, int b){
       b = b+a;
       a = b-a;
       b = b-a;
       System.out.println("a is "+ a);
       System.out.println("b is "+ b);
   }
}
