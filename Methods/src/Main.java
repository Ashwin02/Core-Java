public class Main {

    public static void main(String[] args){

        double cm = calcFeetAndInchesToCentiMeters(6);
        System.out.println("Total cm "+ cm);

    }

   public static double calcFeetAndInchesToCentiMeters(double feet, double inches){

      //  1 inch = 2.54 cm and 1 foot = 12 inches

        if(feet >= 0 && inches >= 0 && inches <= 12){
            double cm, totalInches;
            totalInches = (feet * 12) + inches;
            cm = totalInches * 2.54;
            return cm;
        }
        else{
            return -1;
        }
   }

   public static double calcFeetAndInchesToCentiMeters(int inches){

       if(inches >= 0){
        double footInInches = (inches / 12);
           System.out.println("footInInches " + footInInches);
        return calcFeetAndInchesToCentiMeters(footInInches, inches);
       }
       else{
           return -1;
       }
   }



}
