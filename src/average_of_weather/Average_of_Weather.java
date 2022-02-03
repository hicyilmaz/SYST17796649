package average_of_weather;

import java.util.ArrayList;

public class Average_of_Weather {

    public static void main(String[] args) {

        int total = 0;
        double calcAverage;
        //Create an array for the valid degrees
        // Create the arrayList for the unvalid degrees
        int degrees[] = new int[14];
        ArrayList<Integer> extreme_Degrees = new ArrayList<>();

        //Random values between -100 and +100
        System.out.println("All degrees in the week");
        for (int i = 0; i<14; i++) {

            degrees[i] = ((int) (Math.random() * 200 +(- 100)));
            System.out.printf("%d degree: %d \n", (i+1), degrees[i]);
            if (degrees[i] <= 50 && degrees[i] >= -50) {
                total += degrees[i];
            } else {
              extreme_Degrees.add(degrees[i]);
            }
            
        }
        
        //Calculate average_Degree and show
         System.out.printf("The AVERAGE DEGREE  is %.2f in the the week ", (calcAverage=(double)(total)/degrees.length));
        
         // Show the extreme_Degrees
         System.out.println("\nNOTE:The Degrees shown below  are not included in the average!!!");
         for(int e:extreme_Degrees){
         System.out.print(e+" ");
         }
    }

}
