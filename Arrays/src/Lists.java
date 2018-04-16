import java.util.Scanner;

public class Lists {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myArray = new int[21];
//       // int[] myArray; // {5,3,1,2};
//
////        myArray[5] = 20;
//
//        for(int i=0; i < myArray.length; i++){
//            myArray[i] = i*10;
//        }
//
//        printArray(myArray);
//
//
//
//    }
//
//    public static void printArray(int[] array){
//
//        for(int i=0; i < array.length; i++){
//            System.out.println("Printing " + i + " " + array[i]);
//        }
//
//    }


//        int[] myIntegers = getIntegers(3);
//
//        for (int i = 0; i < myIntegers.length; i++){
//            System.out.println("Element " + i + " entered value was " + myIntegers[i]);
//        }
//
//        double avg = getAverage(myIntegers);
//        System.out.println("Average is " + avg);

        int[] myIntegers = getIntegers(5);

        printArray(myIntegers);


    }

    // Exercise

    private static int[] getIntegers(int number){

        System.out.println("Enter " + number + " integer value. \r");

        int[] values = new int[number];

        for(int i=0; i<values.length; i++){

            values[i] = scanner.nextInt();
        }

        return values;

    }

    private static void printArray(int[] array){

        for (int i=0; i<array.length; i++){
            System.out.println("Printing array index " + i + " value " + array[i]);
        }

    }

    private static int[] sortIntegers(int[] array){



    }



//    public static int[] getIntegers(int number){
//
//        System.out.println("Enter " + number + " integer value. \r");
//
//        int[] values = new int[number];
//
//        for (int i=0; i < values.length; i++){
//
//            values[i] = scanner.nextInt();
//        }
//
//        return values;
//
//    }
//
//    public static double getAverage(int[] array){
//
//        double sum = 0;
//        double average = 0;
//
//        for(int i=0; i < array.length; i++){
//
//            sum += array[i];
//
//        }
//
//        average = sum / array.length;
//
//        return average;
//    }

}
