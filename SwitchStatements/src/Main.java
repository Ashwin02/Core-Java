public class Main {

    public static void main(String[] args){

//        char switchValue = 'F';
//
//        switch(switchValue){
//
//            case 'A':
//                System.out.println("The value is "+ switchValue);
//                break;
//
//            case 'B':
//                System.out.println("The value is "+ switchValue);
//                break;
//
//            case 'C': case 'D': case 'E':
//                System.out.println("The value is "+ switchValue);
//                break;
//
//            default:
//                System.out.println("Value not found");
//
//        }
//
//        for(int i=2; i<9; i++){
//            calculateInterest(1000,i);
//            System.out.println("10,000 at "+ i+"% interest "+String.format("%.2f",calculateInterest(10000,i)));
//        }
//
//        System.out.println("*********************");
//
//        for(int i=8; i>=2; i--){
//            calculateInterest(1000,i);
//            System.out.println("10,000 at "+ i+"% interest "+String.format("%.2f",calculateInterest(10000,i)));
//        }

//        int isPrimeNumber = 0;
//
//        for(int i=10; i <= 50; i++){
//
//            if(isPrime(i)){
//                System.out.println(i + " is a prime number");
//                isPrimeNumber++;
//                System.out.println(isPrimeNumber);
//                if(isPrimeNumber == 3) break;
//            }
//        }

        int num = 5;
        int finishNum = 20;
        int count = 0;

        while(num <= finishNum){
            if(!isEven(num)){
                num++;
                continue;
            }
            System.out.println("Even number "+num);
            num++;
            count++;
            if(count == 5) break;
        }

        System.out.println("Total num of even num found "+count);


    }

    public static boolean isEven(int n){

        if(n % 2 == 0){
            return true;
        }

        return false;
    }

//    public static double calculateInterest(double amount, double interestRate){
//        return(amount*(interestRate/100));
//    }
//
//    public static boolean isPrime(int n){
//
//        if(n == 1){
//            return false;
//        }
//
//        for(int i=2; i <= n/2; i++){
//            if(n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
}
