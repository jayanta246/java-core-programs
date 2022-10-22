package programs;

public class PrimeNumber {

    public void checkPrime(int number){
        boolean flag =false;
        if(number == 0 || number == 1){
            System.out.println(number + "Not a Prime Number");
        }

        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(number + " is not a prime number");
        }else {
            System.out.println(number + " is aprime number");
        }
    }
}

/*
prime number is number which is only divisible by 1 and itself.
ex- 2,3,5,7 etc
0,1 is not a prime number

for loop will run upto n/2 because any number not divisible more then its half

 */