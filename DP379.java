/*
/r/dailyprogrammer challenge #379: Progressive Taxation
Michael Roefs
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

class ProgressiveTaxation {
    /* 
    * Expect inputs as 4 lines, using 13 as a final line indicator 
    * threshold1 percent1
    * threshold2 percent2
    * threshold3 percent3
    *      13    percent4
    */
    public static void main(String[] args) {
        File input = new File("input.txt");
        ArrayList<Integer> thresholds = new ArrayList<Integer>();
        ArrayList<Integer> percents = new ArrayList<Integer>();
        int income = 0;
        try {
            Scanner scanner = new Scanner(input);
            boolean flip = true; 
            while(scanner.hasNextLine()){
               if(flip){
                    thresholds.add(scanner.nextInt());
                    flip = !flip;
               }else{
                    percents.add(scanner.nextInt());
                    flip = !flip;
               }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Enter income: ");
            Scanner sc2 = new Scanner(System.in);
            income = sc2.nextInt();
            sc2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(thresholds);
        System.out.println(percents);
        System.out.println(income);
    }

    
}
