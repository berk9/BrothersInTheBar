import java.util.Scanner;

public class BrothersInTheBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            String[] strNumbers = sc.nextLine().split(", ");

            int rounds = 0;

            int [] glasses = new int [strNumbers.length];

            for (int i = 0; i < strNumbers.length; i++) {
                glasses[i] = Integer.parseInt(strNumbers[i]);
            }

            while (IfContainsConsecutive(glasses)) {
                glasses = brothersInTheBar(glasses);
                rounds++;
            }

            System.out.printf("The maximum number of rounds the brothers can drink: %d",rounds);


        }catch (IllegalArgumentException e){
            System.out.println("Invalid input!");
        }

    }

    private static boolean IfContainsConsecutive(int[] glasses){

        boolean containsConsecutive = false;

        for (int i = 0; i < glasses.length; i++) {
            if (i + 2 < glasses.length && glasses[i] == glasses[i+1] &&
                    glasses[i+1]== glasses[i+2]){
                containsConsecutive = true;
            }
            if (containsConsecutive){
                break;
            }
        }

        return containsConsecutive;
    }

    private static int[] brothersInTheBar(int[] glasses){

        int start = 0;
        int end = 0;
        int shots = 0;

        int [] tempGlasses = new int[glasses.length - 3];

        for (int i = 0; i < glasses.length; i++) {
            if (i + 2 < glasses.length && glasses[i] == glasses[i+1] &&
                    glasses[i+1]== glasses[i+2]) {
                        start = i;
                        end = i + 2;
                        break;
                    }
                }

        for (int i = 0; i < start ; i++) {

            tempGlasses[i] = glasses[i];
            shots++;
        }

        for (int i = end + 1; i < glasses.length; i++) {

            tempGlasses[shots] = glasses[i];
            shots++;
        }

        return tempGlasses;

    }

}
