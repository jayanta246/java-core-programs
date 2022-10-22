package programs;

public class Armstrong {
    public void checkArmstrong(int number){
        int originalNumber = number;
        int reminder;
        double result=0;
        while(number!=0){
            reminder = number%10;
            result = result + Math.pow(reminder, 3);
            number = number/10;
        }

        if(originalNumber == result){
            System.out.println(originalNumber + " Armstrong");
        }
        else
        {
            System.out.println(originalNumber + " Not a Armstrong number");
        }
    }
}

/*
An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits
An Armstrong number is equal to the sum of the cubes of its digits
153 = 1^3 + 5^3 + 3^3
 */
