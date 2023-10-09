/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questionone;

/**
 *
 * @author Tim Dladla
 */
public class QuestionOne {

    /**
     * @param args the command line arguments
     */
    //Declare 2D Arrays. These are Global arrays
    public static String[] cameraNames = {"CANON", "SONY", "NIKON"};
    public static int[] mirrorlessPrices = {10500, 9500, 12000};
    public static int[] dslrPrices = {8500, 7200, 8000};

    public static void main(String[] args) {
        // TODO code application logic here

        //Display report
        System.out.println("---------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("---------------------------------------------");
        System.out.println("\t MIRRORLESS \t DSLR");

        for (int i = 0; i < 3; i++) {
            System.out.println(cameraNames[i] + "\t R" + mirrorlessPrices[i] + "\t\tR" + dslrPrices[i]);
        }

        //Display results
        System.out.println("---------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 3; i++) {

            int difference = mirrorlessPrices[i] - dslrPrices[i];

            if (difference >= 2500) {
                System.out.println(cameraNames[i] + "\t R" + difference + "***");
            } 
            else {
                System.out.println(cameraNames[i] + "\t R" + difference);
            }
        }
        System.out.println("");
        //Display the camera with the highest difference
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + displayHighestDifference());

    }

    public static String displayHighestDifference() {

        String name = "";
        
        for (int i = 0; i < 3; i++) {

            int difference = mirrorlessPrices[i] - dslrPrices[i];
            int max = 0;
            
            if (difference > max) {
                max = difference;
                name = cameraNames[i];
            } 
            
        }
        return name;
    }

}
