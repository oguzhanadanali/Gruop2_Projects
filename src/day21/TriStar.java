package day21;

public class TriStar {
    public static void main(String[] args) {
        final int numberOfStars=7;



/*        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        for (int i = 0; i < numberOfStars; i++) {
            for (int j = 0; j < numberOfStars; j++) {
                if(j>i){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }//Maliyeti: O(nxn)




    }
}
