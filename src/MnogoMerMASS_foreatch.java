
public class MnogoMerMASS_foreatch {

    public static void main(String[] args)
    {
        int[][] mass = new int[5][4];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                mass[i][j] = j;
            }
        }

        for (int[] x: mass){
            for (int y: x){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
